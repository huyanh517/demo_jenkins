package com.example.demo_jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoJenkinsApplication {

	private static String MSG = "Hello";

	public static void main(String[] args) {
		SpringApplication.run(DemoJenkinsApplication.class, args);
		System.out.println(MSG);
	}

	public String getMSG() {
		return MSG;
	}
}
