package com.jboss.blog.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jboss.blog.model.Blog;
import com.jboss.blog.model.BlogPost;

@Repository
@Transactional
public class BlogDAOImpl implements BlogDAO {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional(readOnly = true)
	public List<Blog> getBlogs() {
		return entityManager.createQuery("select b from " + Blog.class.getSimpleName() 
													+ " b", Blog.class).getResultList();
	}

	@Override
	@Transactional(readOnly = true)
	public Blog getBlog(long id) {
		return entityManager.find(Blog.class, id);
	}

	@Override
	public void addBlog(Blog blog) {
		entityManager.persist(blog);
	}

	@Override
	public void deleteBlog(Blog blog) {
		entityManager.remove(blog);
	}

	@Override
	public void addBlogPost(BlogPost blogPost) {
		entityManager.persist(blogPost);
	}

	@Override
	@Transactional(readOnly = true)
	public List<BlogPost> getBlogPosts(Blog blog) {
		final CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		final CriteriaQuery<BlogPost> criteria = builder.createQuery(BlogPost.class);
		final Root<BlogPost> root = criteria.from(BlogPost.class);
		final Predicate condition = builder.equal(root.get("blog"), blog);
		criteria.where(condition);
		final TypedQuery<BlogPost> query = entityManager.createQuery(criteria); 
		return query.getResultList();
	}
}
