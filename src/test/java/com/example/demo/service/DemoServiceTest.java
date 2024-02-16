package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.util.Assert;

@ExtendWith(MockitoExtension.class)
public class DemoServiceTest {
	
	@Mock
	DemoService demoService;
	
	@Test
	public void testService() {
		when(demoService.getMessage()).thenReturn("Podda");
		String message = demoService.getMessage();
		assertEquals(message, "Podda");
	}
	

}
