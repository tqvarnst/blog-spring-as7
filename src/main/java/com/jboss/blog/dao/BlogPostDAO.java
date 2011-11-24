package com.jboss.blog.dao;

import java.util.List;

import com.jboss.blog.domain.Blog;
import com.jboss.blog.domain.BlogPost;

public interface BlogPostDAO {
	void addBlogPost(BlogPost blogPost);
	
	List<BlogPost> getBlogPosts(Blog blog);

	BlogPost getBlogPost(long id);
}