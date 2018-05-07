package edu.ahut;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@MapperScan("edu.ahut.mapper")
public class WengxiaofengApplication {
	public static void main(String[] args) {
		SpringApplication.run(WengxiaofengApplication.class, args);
	}
	@RequestMapping(value = "/",produces = "text/plain;charset=UTF-8")
	String index(){
		return "Hello Spring Boot!";
	}

}
