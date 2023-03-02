package com.example.devops_ui_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String forside() {
        return "forside";
    }
    @GetMapping("/opret-virksomhed")
    public String opretVirksomhed(){
        return "opret-virksomhed";
    }

    @GetMapping("/skemaside")
    public String skemaSide(){
        return "skemaside";
    }

    @GetMapping("/tipstilindkob")
    public String tipsTilIndkob(){
        return "tipstilindkob";
    }
}
