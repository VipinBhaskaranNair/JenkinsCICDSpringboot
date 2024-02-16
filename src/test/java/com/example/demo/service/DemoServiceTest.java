package com.example.demo.service;




import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoServiceTest {
	
	@Mock
	DemoService demoService;
	
	@Test
	public void testService() {
		when(demoService.getMessage()).thenReturn("Podda");
		String message = demoService.getMessage();
		Assert.assertEquals(message, "Hello World");
	}
	

}
