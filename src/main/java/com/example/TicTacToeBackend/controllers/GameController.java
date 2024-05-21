package com.example.TicTacToeBackend.controllers;


import com.example.TicTacToeBackend.game.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value="/display", method= RequestMethod.GET)
    public int displayBoard(){
        return game.getBoard();
    }

    @RequestMapping(value="/move", method= RequestMethod.POST)
    public String makeMove(@RequestParam("playerId") int playerId, @RequestParam("x") int x, @RequestParam("y") int y){
        return game.play(playerId,x,y);
    }


}