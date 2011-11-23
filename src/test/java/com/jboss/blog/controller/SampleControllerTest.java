package com.jboss.blog.controller;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SampleControllerTest {
	private PostController controller = new PostController();
	
	@Test
	public void get() {
		final String view = controller.create();
		assertEquals("post/created", view);
	}
}
