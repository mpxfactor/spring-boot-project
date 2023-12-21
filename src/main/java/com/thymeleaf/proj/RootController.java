package com.thymeleaf.proj;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class RootController {

    @GetMapping
    public String index(Model model) {
        model.addAttribute("title", "Thymeleaf title from controller");
        model.addAttribute("scientists", List.of("Albert Einstein", "Newton", "Hawking", "Punith"));
        return "index";
    }
}
