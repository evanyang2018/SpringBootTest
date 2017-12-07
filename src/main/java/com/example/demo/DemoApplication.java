package com.example.demo;

import com.example.demo.Test3.TestSetting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Evan Yang
 */

@RestController
@SpringBootApplication
public class DemoApplication {
	@Autowired
	private TestSetting testSetting;

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(DemoApplication.class);
//		SpringApplication.run(DemoApplication.class, args);
		springApplication.run(args);
	}


	@RequestMapping("/")
	public String index(){
		return  "Hello Spring Boot!"+"A:"+testSetting.getA()+"  B:"+testSetting.getB();
	}
}
