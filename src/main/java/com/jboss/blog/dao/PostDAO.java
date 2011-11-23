package com.jboss.blog.dao;

import java.util.List;

import com.jboss.blog.model.Post;

public interface PostDAO {
	void create(final Post post);
	
	List<Post> list();
}