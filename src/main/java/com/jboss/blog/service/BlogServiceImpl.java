package com.jboss.blog.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jboss.blog.dao.BlogDAO;
import com.jboss.blog.dao.BlogPostDAO;
import com.jboss.blog.domain.Blog;
import com.jboss.blog.domain.BlogPost;

@Service
@Transactional
public class BlogServiceImpl implements BlogService {
	@Inject
	private BlogDAO blogDAO;
	
	@Inject
	private BlogPostDAO blogPostDAO;

	@Override
	@Transactional(readOnly = true)
	public List<Blog> getBlogs() {
		return blogDAO.getBlogs();
	}

	@Override
	@Transactional(readOnly = true)
	public Blog getBlog(final long id) {
		return blogDAO.getBlog(id);
	}

	@Override
	public void addBlog(final Blog blog) {
		blogDAO.addBlog(blog);
		
	}

	@Override
	public void addBlogPost(final Long blogId, final BlogPost blogPost) {
		final Blog blog = blogDAO.getBlog(blogId);
		blogPost.setBlog(blog);
		blogPostDAO.addBlogPost(blogPost);
	}
}
