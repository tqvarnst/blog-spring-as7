package com.jboss.blog.dao;

import java.util.List;

import com.jboss.blog.model.Blog;
import com.jboss.blog.model.BlogPost;

public interface BlogDAO {
	List<Blog> getBlogs();
	
	Blog getBlog(long id);
	
	void addBlog(Blog blog);
	
	void deleteBlog(Blog blog);
	
	void addBlogPost(BlogPost blogPost);
	
	List<BlogPost> getBlogPosts(Blog blog);
}