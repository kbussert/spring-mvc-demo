package com.kbussert.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SillyController {
    
    // controller method to show initial HTML form
    @RequestMapping("/showForm")
    public String displayTheForm() {
        return "silly";
    }
}
