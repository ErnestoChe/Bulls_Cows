package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int cor, cows, input1;
        cor = 0;
        int a = 1000;
        int b = 9999;
        int counter = 0;
        int random_input = a + (int) (Math.random()* b);
        System.out.println("Bulls & Cows v0.8(beta) by 3R1K");
        System.out.println("build #17 from 23.08.2018");
        System.out.println("num generated");
        while (cor < 4) {
            Scanner an = new Scanner(System.in);
            int answer = an.nextInt();
            input1 = random_input;
            cows = 4;
            cor = 0;
            if (answer % 10 == input1 % 10){
                cor+=1;
            }
            answer = answer / 10;
            input1 = input1 / 10;
            if (answer % 10 == input1 % 10){
                cor+=1;
            }
            answer = answer / 10;
            input1 = input1 / 10;
            if (answer % 10 == input1 % 10){
                cor+=1;
            }
            answer = answer / 10;
            input1 = input1 / 10;
            if (answer  == input1 ){
                cor+=1;
            }
            System.out.println("correct "+cor+"");
            cows = cows - cor;
            System.out.println(cows);
            counter += 1;
            System.out.println("attemt # "+counter+"");
        }
        System.out.println("You won!");
        System.out.println("Thanks for playing! work still in progress");
    }
}
