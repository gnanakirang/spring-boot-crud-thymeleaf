package com.baeldung.crud.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/demo")
public class DemoController {
    @ModelAttribute("module")
    String module() {
        return "home";
    }

    @GetMapping("/")
    String index() {
        return "homeNotSignedIn";
    }

    @GetMapping("/test")
    String test() {
        return "fragments/test";
    }
}
