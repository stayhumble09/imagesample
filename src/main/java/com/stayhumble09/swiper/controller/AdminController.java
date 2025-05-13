package com.stayhumble09.swiper.controller;

import com.stayhumble09.swiper.dto.VisualDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RequestMapping("/admin")
@Controller
@Slf4j
public class AdminController {
    @GetMapping("/visual")
    public String visual(@ModelAttribute VisualDto visualDto) {
        log.info("visualDto==={}", visualDto);
        return "admin/visual";
    }
}
