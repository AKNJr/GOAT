package day2;

public class Calculator {

    public static void main(String[] args) {

        Calculator c= new Calculator();//Class object
c.addnumbers(20,30);
    }

    public void addnumbers(int x,int y){
        int sum=x+y;
        System.out.println("sum "+sum);
    }
}
