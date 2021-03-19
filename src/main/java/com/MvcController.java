package com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MvcController {
    @GetMapping(value = "/hi")
    public String WriteSomething(Model model){
        String text = "";
        model.addAttribute("strin", text);
        return "Hi";
    }
}
