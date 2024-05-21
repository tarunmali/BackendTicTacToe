package com.example.TicTacToeBackend.controllers;


import com.example.TicTacToeBackend.game.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/game")
//@RequestMapping(value="/game", method= RequestMethod.GET)
//@RequestMapping(value="/greet")
public class GameController {

    @Autowired
    private Game game;

    @GetMapping
    public String greet() {
        return "Testing Game";
    }

    @RequestMapping(value="/register", method= RequestMethod.GET)
    public int register(){
        return game.registerNewPlayer();
    }

}