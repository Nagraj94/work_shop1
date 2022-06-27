package com.bridgelabz;

import java.util.Random;

public class Gambler {

    static int STAKE = 100;
    final  static int BET = 1;
    int betting;

    void uc2(){
        Random random = new Random();
        betting = random.nextInt(2);
        if(betting == 0){
            STAKE--;
            System.out.println("you loose 1 points ");
            System.out.println("your current point is " + STAKE);
        }
        else {
            STAKE++;
            System.out.println("you won 1 points ");
            System.out.println("your current point is " + STAKE);
        }
    }

    public static void main(String[] args) {
        Gambler game = new Gambler();
        game.uc2();
    }
}
