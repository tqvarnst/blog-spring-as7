package com.jboss.sample.blog.dao;

import java.util.List;

import com.jboss.sample.blog.domain.Blog;
import com.jboss.sample.blog.domain.BlogPost;

public interface BlogPostDAO {
	void addBlogPost(BlogPost blogPost);
	
	List<BlogPost> getBlogPosts(Blog blog);

	BlogPost getBlogPost(long id);
}