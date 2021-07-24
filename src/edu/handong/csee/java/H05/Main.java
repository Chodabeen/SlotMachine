package edu.handong.csee.java.H05;
import java.util.Scanner;
import java.util.Random;

class Main {
    public static void main(String[] args) {
        Main stepH = new Main();
        stepH.h01();
    }

    void h01() {
      Scanner s = new Scanner(System.in);
      Random r = new Random();
      int coins;
      int[] number = new int[3];
      int dummy;
      int count = 0;
      int overlap;
      int i;

      System.out.print("Enter number of coins > ");
      coins = s.nextInt();

      for(i = coins; i > 0; i--){
        overlap = 0;
        count++;
        coins--;
        System.out.print("Start " + count + "th game!!! (Enter any number) > ");
        dummy = s.nextInt();
        number[0] = r.nextInt(9) + 1;
        number[1] = r.nextInt(9) + 1;
        number[2] = r.nextInt(9) + 1;
        System.out.print("Result of game : " + number[0] + " " + number[1] + " " + number[2] + " ---> ");

        if(number[0] == number[1] && number[1] == number[2]){
          overlap = 1;
          System.out.println("match 3 numbers! got four more coins");
          i += 4;
          coins += 4;
        }
        else if((number[0] == number[1] || number[0] == number[2] || number[2] == number[1]) && overlap != 1){
          System.out.println("match 2 numbers! got two more coins");
          i += 2;
          coins += 2;
        }
        else  
          System.out.println("Failed...");

        System.out.println("There are " + coins + " coins remaining." + "\n");
      }

      System.out.println("Game over!");
      

    }
}