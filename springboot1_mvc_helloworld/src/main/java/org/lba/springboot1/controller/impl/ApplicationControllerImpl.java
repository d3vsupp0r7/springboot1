package org.lba.springboot1.controller.impl;

import org.lba.springboot1.controller.ApplicationController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationControllerImpl implements ApplicationController{

	@GetMapping("/")
    public String home1() {
        return "/home";
    }

    @GetMapping("/home")
    public String home() {
        return "/home";
    }

}
