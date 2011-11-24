package com.jboss.blog.dao;

import java.util.List;

import com.jboss.blog.domain.Blog;

public interface BlogDAO {
	List<Blog> getBlogs();
	
	Blog getBlog(long id);
	
	void addBlog(Blog blog);
}