package com.jboss.blog.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jboss.blog.model.Post;

@Repository
@Transactional
public class PostDAOImpl implements PostDAO {
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void create(final Post post) {
		post.setCreateDate(new Date());
		entityManager.persist(post);
	}

	@Override
	public List<Post> list() {
		return entityManager.createQuery("select p from " + Post.class.getSimpleName() + " p", Post.class).getResultList();
	}
}
