package com.klef.soa.event;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EventDemoProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventDemoProjectApplication.class, args);
		System.out.println("Event running succesfully");
	}

}
