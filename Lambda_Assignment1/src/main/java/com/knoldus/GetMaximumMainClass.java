package com.knoldus;
import java.util.*;

public class GetMaximumMainClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        GetMaximum_Interface getMaximum = new GetMaximum();
        int maximumOfTwoNumber = getMaximum.getMaximumOfTwoNumbers(number1, number2);
        System.out.println("Maximum of given two numbers " + number1 + " " + "and" + " " + number2 + " " + "is :" + " " + maximumOfTwoNumber);
    }
}
