package com.Excercise1.Excercise1;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping ("/v1")
public class Controller {
    @GetMapping("/ciao")
    public String request2(@RequestParam String nome, @RequestParam String provincia){
        return "Hello "+ nome + " com'è il tempo in " + provincia;
    }
}