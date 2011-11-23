package com.jboss.blog.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jboss.blog.dao.BlogDAO;
import com.jboss.blog.model.Blog;

@Controller
@RequestMapping("/blog")
public class BlogController {
	@Inject
	private BlogDAO blogDAO;
	
	@RequestMapping("/list")
	public ModelAndView listBlogs() {
		final ModelAndView modelAndView = new ModelAndView("blog/list");
		modelAndView.addObject("blogs", blogDAO.getBlogs());
		return modelAndView;
	}
	
	@RequestMapping("/{blogId}")
	public ModelAndView listBlogPosts(final @PathVariable("blogId") long blogId) {
		final ModelAndView modelAndView = new ModelAndView("blogpost/list");
		final Blog blog = blogDAO.getBlog(blogId);
		modelAndView.addObject("blog", blog);
		modelAndView.addObject("blogPosts", blog.getPosts());
		return modelAndView;
	}
}
