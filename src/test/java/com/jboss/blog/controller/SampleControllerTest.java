package com.jboss.blog.controller;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;

public class SampleControllerTest {
	private SampleController controller = new SampleController();
	
	@Test
	public void get() {
		final String view = controller.get();
		assertEquals("sample", view);
	}
}
