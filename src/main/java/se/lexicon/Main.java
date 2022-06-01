package se.lexicon;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        {
            Scanner scan = new Scanner (System.in);
            System.out.print("First number: ");
            int num1 = scan.nextInt();
            System.out.print("Second number: ");
            int num2 = scan.nextInt();
            int sum = num1 + num2;
            int multi = num1 * num2;
            int div = num1 / num2;
            int sub = num1 - num2;

            System.out.println();
            System.out.println("Sum: "+sum);
            System.out.println("Multiplication: "+multi);
            System.out.println("Division: "+div);
            System.out.println("Subtraction: "+sub);

        }
    }
}