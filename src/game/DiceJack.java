package game;

import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number in between 1 and 6");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();


        if (num1 < 1 || num2 < 1 || num3 < 1) {
            System.out.println("number should be greater than 1");
            System.exit(0);

        }
        if (num1 > 6 || num2 > 6 || num3 > 6) {
            System.out.println("number should be lower than 6");
            System.exit(0);
        }


        int roll1 = RollDice();
        int roll2 = RollDice();
        int roll3 = RollDice();
//        System.out.println(roll1);
//        System.out.println(roll2);
//        System.out.println(roll3);
        int sumOfNumber = num1 + num2 + num3;
        int sumOfDiceRoll = roll1 + roll2 + roll3;

        System.out.println("Dice sum is : " + sumOfDiceRoll);
        System.out.println(" sum of number is: " + sumOfNumber);

      if(checkWin( sumOfDiceRoll,sumOfNumber)) {
            System.out.println("cong you win");
        }else{
            System.out.println("looooser");
        }


        scan.close();



    }
    public static int RollDice() {
        double RandomNumber = Math.random() * 6;
        RandomNumber += 1;
        return (int) RandomNumber;

    }

    public static  boolean checkWin( int sumOfDiceRoll, int sumOfNumber){

        return (sumOfDiceRoll<sumOfNumber && sumOfNumber - sumOfDiceRoll < 3);
    }
}
