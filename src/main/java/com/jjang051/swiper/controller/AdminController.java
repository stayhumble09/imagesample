package com.jjang051.swiper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RequestMapping("/admin")
@Controller
public class AdminController {
    @GetMapping("/visual")
    public String visual() {
        return "admin/visual";
    }
}
