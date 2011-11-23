package com.jboss.blog.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jboss.blog.dao.PostDAO;
import com.jboss.blog.model.Post;

@Controller
@RequestMapping
public class PostController {
	@Inject
	private PostDAO postDAO;
	
	@RequestMapping("/create")
	public String create() {
		final Post post = new Post();
		post.setBody("test");
		post.setTitle("title");
		postDAO.create(post);
		return "post/created";
	}
	
	@RequestMapping("/list")
	public ModelAndView list() {
		final ModelAndView modelAndView = new ModelAndView("post/list");
		modelAndView.addObject("posts", postDAO.list());
		return modelAndView;
	}
}
