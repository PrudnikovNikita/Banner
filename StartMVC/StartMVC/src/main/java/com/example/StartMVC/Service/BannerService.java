package com.example.StartMVC.Service;

import com.example.StartMVC.Entity.Banner;
import com.example.StartMVC.repository.BannerRepository;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;



@Service
public class BannerService {


    public void SetModel(Model model, BannerRepository bannerRepository){



        model.addAttribute("banner", bannerRepository.findById(13).get());
        model.addAttribute("banner1", bannerRepository.findById(14).get());
        model.addAttribute("banner2", bannerRepository.findById(15).get());
        model.addAttribute("banner3",bannerRepository.findById(16).get());

    }


}
