package com.jboss.blog.controller;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jboss.blog.domain.Blog;
import com.jboss.blog.domain.BlogPost;
import com.jboss.blog.service.BlogService;

@Controller
@RequestMapping
public class BlogController {
	@Inject
	private BlogService blogService;
	
	@RequestMapping("/list")
	public ModelAndView listBlogs() {
		final List<Blog> blogs = blogService.getBlogs();
		return new ModelAndView("blog/list", "blogs", blogs);
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String displayAddBlog(final @ModelAttribute Blog blog) {
		return "blog/add";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addBlog(final @ModelAttribute Blog blog) {
		System.out.println(blog);
		blogService.addBlog(blog);
		return "redirect:/list";
	}
	
	@RequestMapping("/{blogId}")
	public ModelAndView listBlogPosts(final @PathVariable("blogId") long blogId) {
		final Blog blog = blogService.getBlog(blogId);
		return new ModelAndView("blogpost/list", "blog", blog);
	}
	
	
	@RequestMapping(value = "/{blogId}/add", method = RequestMethod.GET)
	public String displayAddBlogPost(final @PathVariable Long blogId, final @ModelAttribute BlogPost blogPost) {
		final Blog blog = blogService.getBlog(blogId);
		blogPost.setBlog(blog);
		return "blogpost/add";
	}
	
	@RequestMapping(value = "/{blogId}/add", method = RequestMethod.POST)
	public String addBlogPost(final @PathVariable Long blogId, final @ModelAttribute BlogPost blogPost) {
		blogPost.setTimestamp(new Date());
		blogService.addBlogPost(blogId, blogPost);
		return "redirect:/" + blogId;
	}
}
