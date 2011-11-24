package com.jboss.blog.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jboss.blog.domain.Blog;
import com.jboss.blog.domain.BlogPost;

@Repository
public class BlogDAOImpl implements BlogDAO {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Blog> getBlogs() {
		return entityManager.createQuery("select b from " + Blog.class.getSimpleName() 
													+ " b", Blog.class).getResultList();
	}

	@Override
	public Blog getBlog(long id) {
		return entityManager.find(Blog.class, id);
	}

	@Override
	public void addBlog(Blog blog) {
		entityManager.persist(blog);
	}
}
