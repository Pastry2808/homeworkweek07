package javaclass2homework;

/*
Write a Java program that takes three numbers as input to calculate and print the
average of the numbers.
 */
public class Question12 {
    public static void average(double a, double b, double c){
        System.out.println("Average of the numbers is " + ((a+b+c)/3));
    }

    public static void main(String[] args) {
        average(39,44,69);
    }
}
