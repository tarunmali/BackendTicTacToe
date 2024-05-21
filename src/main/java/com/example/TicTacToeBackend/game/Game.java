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
            nextPlayer=player1;
            board.setUp();
        }
        else{
            //doubt revise error handling
            throw new IllegalStateException("Registration is closed");
        }
        return id;
    }


    public int getBoard(){
        return board.getFormattedBoard();
    }

//    public String play(int playerId,int x, int y){
//        if(winner!=null) return "Game Over"+ winner.getId()+" wins";
//
//    }

}
