package com.example.StartMVC.controllers;

import com.example.StartMVC.Service.BannerService;
import com.example.StartMVC.repository.BannerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BannerController {

  @Autowired
  BannerRepository bannerRepository;

  @Autowired
  BannerService bannerService;

    @GetMapping("/index")
    public String getBanner( Model model){


        bannerService.SetModel(model,bannerRepository );

        return "index";
    }

}
