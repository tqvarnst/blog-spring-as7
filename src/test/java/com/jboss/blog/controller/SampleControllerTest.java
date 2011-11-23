package com.jboss.blog.controller;


import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doNothing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.jboss.blog.dao.BlogDAO;


@RunWith(MockitoJUnitRunner.class)
public class SampleControllerTest {
	@InjectMocks
	private BlogController controller = new BlogController();
	
	@Mock
	private BlogDAO postDAO;
	
	@Test
	public void get() {
//		doNothing().when(postDAO).create(any(BlogPost.class));
//		final String view = controller.create();
//		assertEquals("post/created", view);
	}
}
