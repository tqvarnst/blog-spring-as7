package com.jboss.blog.controller;


import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doNothing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.jboss.blog.dao.PostDAO;
import com.jboss.blog.model.Post;

@RunWith(MockitoJUnitRunner.class)
public class SampleControllerTest {
	@InjectMocks
	private PostController controller = new PostController();
	
	@Mock
	private PostDAO postDAO;
	
	@Test
	public void get() {
		doNothing().when(postDAO).create(any(Post.class));
		final String view = controller.create();
		assertEquals("post/created", view);
	}
}
