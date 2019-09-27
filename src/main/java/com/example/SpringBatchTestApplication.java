package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class SpringBatchTestApplication {

	private static ApplicationContext applicationContext;
	
	public static void main(String[] args) {
		applicationContext = SpringApplication.run(SpringBatchTestApplication.class, args);
		//checkBeansPresence("userRepo", "dog", "rose", "exampleBean", "springBootComponentScanApp");
	}

    private static void checkBeansPresence(String... beans) {
        for (String beanName : beans) {
            System.out.println("Is " + beanName + " in ApplicationContext: " + 
              applicationContext.containsBean(beanName));
        }
    }
}
