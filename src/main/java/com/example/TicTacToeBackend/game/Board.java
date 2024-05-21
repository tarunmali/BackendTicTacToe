package com.example.TicTacToeBackend.game;

import org.springframework.stereotype.Component;

@Component
public class Board {
    private Move[][] moves;
    public void setUp(){
        this.moves=new Move[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                moves[i][j]=Move.EMPTY;
            }
        }
    }

    public int getFormattedBoard(){
        int board=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(moves[i][j]==Move.ZERO){
                    board=board*10+1;
                }
                else if(moves[i][j]==Move.CROSS){
                    board=board*10+2;
                }
                else{
                    board=board*10+0;
                }
            }
        }
        return board;
    }
}
