package com.myweb.demo;

//import org.apache.logging.log4j.LogManager;
//import org.mybatis.spring.annotation.MapperScan;
//import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
//@MapperScan("com.myweb.demo.dao")
public class DemoApplication {
	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
//	private static Logger logger = LogManager.getLogger(DemoApplication.class);
	public static void main(String[] args) {
//		logger.info("Starting Spring Boot application..");
		SpringApplication.run(DemoApplication.class, args);
	}
}
