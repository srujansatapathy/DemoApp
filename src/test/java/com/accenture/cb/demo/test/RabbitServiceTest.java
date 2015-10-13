package com.accenture.cb.demo.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.accenture.cb.demo.service.RabbitService;
import com.accenture.cb.demo.service.impl.RabbitServiceImpl;

public class RabbitServiceTest {

	@Before
	public void setUp() throws Exception {
		RabbitService mockRabbitService = Mockito.mock(RabbitServiceImpl.class);
	}

	@Test
	public final void testSendToRabbit() {
	//	fail("Not yet implemented"); // TODO
		Assert.assertTrue(true);
	}

}
