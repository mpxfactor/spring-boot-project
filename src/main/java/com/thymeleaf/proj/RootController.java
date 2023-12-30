package com.thymeleaf.proj;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Controller
@RequestMapping("/")
public class RootController {

    @GetMapping
    public String index(Model model) {
        List<Student> studentsList = List.of(new Student(1, "Punith"), new Student(2, "Lokesh"),
                new Student(3, "John"));

        model.addAttribute("title", "Thymeleaf title from controller");
        model.addAttribute("students", studentsList);
        return "index";
    }
}

@Data
@AllArgsConstructor
class Student {
    private int id;
    private String name;
}