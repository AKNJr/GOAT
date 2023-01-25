package day2;

import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.System.in;


public class Operators1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(in);

        System.out.println("enter the value for a and b");



        int a,b;

a=sc.nextInt();
b=sc.nextInt();

        int sum = a + b;

        System.out.println("sum is " +sum);

    }
}
