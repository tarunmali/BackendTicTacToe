package com.example.TicTacToeBackend.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/simple")
@RequestMapping(value="/game", method= RequestMethod.GET)
//@RequestMapping(value="/greet")
public class GameController {
    @GetMapping
    public String greet() {
        return "Hello, World!";
    }
}