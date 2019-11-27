package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAutoConfiguration(exclude= {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class LaFnacApplication {

	public static void main(String[] args) {
		SpringApplication.run(LaFnacApplication.class, args);
	}

}
