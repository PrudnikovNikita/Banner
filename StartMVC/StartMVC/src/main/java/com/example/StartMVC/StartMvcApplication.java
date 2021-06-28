package com.example.StartMVC;

import com.example.StartMVC.Entity.Banner;
import com.example.StartMVC.repository.BannerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class StartMvcApplication {

	@Autowired
	BannerRepository bannerRepository;

	public static void main(String[] args) {

		SpringApplication.run(StartMvcApplication.class, args);


	}




}


