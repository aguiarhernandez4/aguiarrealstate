package com.aguiarrealstate.first_spring_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class CasasController {
    @GetMapping("/casas")
    public String lista() {
        return "casas";
    }
}