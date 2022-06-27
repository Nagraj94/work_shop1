package com.bridgelabz;

import java.util.Random;

public class Gambler {
    final  static int BET = 1;
    static int STAKE = 100;
    static int BETTING;
    static int UPPER_LIMIT;
    static int LOWER_LIMIT;
    static int DAY = 0;

    void uc2(){
        Random random = new Random();
        BETTING = random.nextInt(2);
        if(BETTING == 0){
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
    void uc3(){
        UPPER_LIMIT = (int) (STAKE*1.5);
        LOWER_LIMIT = (int) (STAKE*0.5);
        DAY++;
        while (STAKE < UPPER_LIMIT && STAKE > LOWER_LIMIT){
        uc2();
        }
    }
    void uc4(){
        while (DAY<=20){
            System.out.println("day " + DAY++);
            System.out.println("amount "+STAKE);
        }
    }
    public static void main(String[] args) {
        Gambler game = new Gambler();
        game.uc2();
        game.uc3();
        game.uc4();
    }
}
