package com.example.demo_jenkins;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoJenkinsApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void shouldGetMSG() {
		DemoJenkinsApplication demoJenkinsApplication = new DemoJenkinsApplication();
		Assertions.assertEquals("Hello", demoJenkinsApplication.getMSG());
	}
}
