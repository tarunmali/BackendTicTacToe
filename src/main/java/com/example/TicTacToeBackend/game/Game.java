package com.example.TicTacToeBackend.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class Game {
    @Autowired
    private Board board;
    private Player player1, player2,nextPlayer,winner;

    public int registerNewPlayer(){
        Random random = new Random();
        int id;
        if(player1==null){
            player1=new Player(random.nextInt(1,100),Move.ZERO);
            id=player1.getId();
        }
        else if(player2==null){
            player2=new Player(random.nextInt(1,100),Move.CROSS);
            id=player2.getId();
        }
        else{
            throw new IllegalStateException("Registration is closed");
        }
        return id;
    }

}
