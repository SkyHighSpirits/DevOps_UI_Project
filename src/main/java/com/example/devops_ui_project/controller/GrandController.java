package com.example.devops_ui_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GrandController {
    @GetMapping("/")
    public String forside() {
        return "forside";
    }
}
