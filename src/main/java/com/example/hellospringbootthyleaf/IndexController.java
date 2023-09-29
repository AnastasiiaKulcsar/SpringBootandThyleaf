package com.example.hellospringbootthyleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(Model model){

        List<Pizza> pizzas = List.of(
                    new Pizza ("Marherita,", "Cheese, Oregano; Tomata"),

                    new Pizza ("Marherita," ,"Cheese, Oregano; Tomata"));


        model.addAttribute("name","Nastia");
        model.addAttribute("pizzas", pizzas);


        return "index";

    }
}
