package com.example.Lotoya_Java.controller;

import com.example.Lotoya_Java.Player;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class groundController {
    private final Player player;

    public groundController(Player player) {
        this.player = player;
    }

    @RequestMapping("/ground")
    public String ground(Model model) {
        model.addAttribute("imagePath1", "/static/images/logo.jpg");
        model.addAttribute("imagePath2", "/static/images/vs.jpg");
        model.addAttribute("imagePath3", "/static/images/club.jpg");
        model.addAttribute("imagePath4", "/static/images/FA.jpg");
        model.addAttribute("imagePath5", "/static/images/mypage.jpg");
        model.addAttribute("imagePath6", "/static/images/playerteam.jpg");
        model.addAttribute("imagePath7", "/static/images/search.jpg");
        model.addAttribute("imagePath8", "/static/images/coin.jpg");
        model.addAttribute("imagePath9", "/static/images/ground.png");

        return "ground";
    }
}
