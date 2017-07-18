/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.io.*;
import java.util.*;

public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please Input A Number");
        double numOne = input.nextDouble();
        System.out.println("And Your Second Number");
        double numTwo = input.nextDouble();
        System.out.println("What Operation Would You Like To Do?\nAdd\nSub\nMulti\nDivide\n");
        String choice = input.next();

        switch (choice) {

            case "Add":
            case "add":
            case "ADD":
                System.out.println("Your Answer is " + (numOne + numTwo));
                break;

            case "Sub":
            case "sub":
            case "SUB":
                System.out.println("Your Answer is " + (numOne - numTwo));
                break;

            case "Multi":
            case "multi":
            case "MULTI":
                System.out.println("Your Answer is " + (numOne * numTwo));
                break;

            case "Divide":
            case "divide":
            case "DIVIDE":
                System.out.println("Your Answer is " + (numOne / numTwo));
                break;
        }
    }

}
