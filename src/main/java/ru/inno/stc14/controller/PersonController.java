package ru.inno.stc14.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/person")
public class PersonController {
    @RequestMapping("/list")
    public String getList(Model model) {
        return "person/list";
    }

    @RequestMapping("/get/{id}")
    public String getDetail(
            @PathVariable Long id,
            Model model) {
        return "person/detail";
    }

    @PostMapping("/add")
    public String add(@RequestParam String name, @RequestParam String birthDate,
                      Model model) {
        return "person/list";
    }

    @PostMapping("/update")
    public String update(@RequestParam String name,
                         @RequestParam String birthDate,
                         Model model) {
        return "person/list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id,
                         Model model) {
        return "person/list";
    }
}
