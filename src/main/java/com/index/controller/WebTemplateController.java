package com.index.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class WebTemplateController {

    @GetMapping("")
    public String index() {
        return "redirect:/mota_nokeyboard/index.html";
    }
}
