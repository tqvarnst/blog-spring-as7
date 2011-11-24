package com.jboss.blog.service;

import java.util.List;

import com.jboss.blog.domain.Blog;
import com.jboss.blog.domain.BlogPost;

public interface BlogService {
	List<Blog> getBlogs();
	
	Blog getBlog(long id);
	
	void addBlog(Blog blog);
	
	void addBlogPost(Long blogId, BlogPost blogPost);
}
