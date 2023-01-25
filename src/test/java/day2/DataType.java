package day2;

import java.util.Scanner;

import static java.lang.System.in;

public class DataType {

    public static void main(String[] args) {
// Variable declaration
    int age;


//if the number is more than  ten digits add l at the end of number in long.
    long aadhar=1234455555666666l;
    float pin=1233;
//    have to add f at the end for float if it is a decimal value
  float pincode=1245.678f;
  double code=1213421432.6774578575;
  char ch='x';
  Boolean SS= true;




        Scanner sc= new Scanner(in);

        System.out.println("Enter the age");

        age=sc.nextInt();
        System.out.println("The age is "+age);//Concatination

        System.out.println(pincode);




    }
}
