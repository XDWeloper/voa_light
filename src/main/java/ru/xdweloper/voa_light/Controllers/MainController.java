package ru.xdweloper.voa_light.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("/")
public class MainController {

    @GetMapping("/login")
    public String GetPage(){
        return "redirect:/";
    }
}
