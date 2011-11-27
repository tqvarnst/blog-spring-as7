package com.jboss.sample.blog.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.springframework.stereotype.Repository;

import com.jboss.sample.blog.domain.Blog;
import com.jboss.sample.blog.domain.BlogPost;

@Repository
public class BlogPostDAOImpl implements BlogPostDAO {
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void addBlogPost(final BlogPost blogPost) {
		entityManager.persist(blogPost);
	}

	@Override
	public List<BlogPost> getBlogPosts(final Blog blog) {
		final CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		final CriteriaQuery<BlogPost> criteria = builder.createQuery(BlogPost.class);
		criteria.where(builder.equal(criteria.from(BlogPost.class).get("blog"), blog));
		return entityManager.createQuery(criteria).getResultList();
	}
	
	@Override
	public BlogPost getBlogPost(long id) {
		return entityManager.find(BlogPost.class, id);
	}
}
