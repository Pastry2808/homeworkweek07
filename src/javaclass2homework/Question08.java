package javaclass2homework;

/*
Write a program to insert any temperature value in degree Fahrenheit and convert to
degree Celsius ((F − 32) × 5/9 = 0°C).
 */
public class Question08 {
    static int F = 350;
    static int Celsius = (F-32)*5/9;
    public static void temp(){
        System.out.println("The temperature is "+ Celsius + "℃");
    }
    public static void main(String[] args) {
        temp();
    }
}
