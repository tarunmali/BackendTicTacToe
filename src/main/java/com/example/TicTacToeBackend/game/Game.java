package com.example.TicTacToeBackend.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Game {
    @Autowired
    private Board board;
    private Player player1, player2,nextPlayer,winner;

    public int registerNewPlayer(){
        return 1;
    }

}
