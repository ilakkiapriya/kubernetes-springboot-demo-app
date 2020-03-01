package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class TrackerApp {

   @RequestMapping("/health")
   @ResponseBody
   String home() {
      return "Tracker App is running good!";
   }
	public static void main(String[] args) {
		SpringApplication.run(TrackerApp.class, args);
	}

}
