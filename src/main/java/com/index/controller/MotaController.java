package com.index.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MotaController {

    @GetMapping
    public String index() {
        return "redirect:/index.html";
    }

    @GetMapping("nokey")
    public String indexNokey() {
        return "redirect:/mota_nokeyboard/index.html";
    }

    @GetMapping("key")
    public String indexKey() {
        return "redirect:/mota_keyboard/index.html";
    }
}
