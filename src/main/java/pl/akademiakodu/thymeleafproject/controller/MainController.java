package pl.akademiakodu.thymeleafproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MainController {

    @GetMapping("/")
    public String index(ModelMap modelMap){
        modelMap.addAttribute("name", "Zosia");
        return "index";
    }

    @GetMapping("/{name}")
    public String index(@PathVariable String name, ModelMap modelMap){
        modelMap.addAttribute("name", name);
        return "index";
    }


    @GetMapping("/bookadd")
    public String addbook(){
        return "bookadd";
    }

}
