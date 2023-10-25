package javaclass2homework;

/*
Write a program for a calculator with addition, subtraction, multiplication, and division
methods all with parameters and use string concatenation methods. (Note: Two static
and Two instance methods.
 */
public class Question05 {
   //no return and with parameters
    public void addition(int a,int b){
        System.out.println("Sum of a+b = "+ (a+b));
    }
    public static void subtraction(int c,int d){
        System.out.println("Difference of c and d is "+(c-d));
    }
    public void multiplication(int e, int f){
        System.out.println("Multiplication of e and f is "+(e*f));
    }
    public static void division(int g, int h){
        System.out.println("Division of g and h is "+(g/h));
    }
    public static void main(String[] args) {
        Question05 t = new Question05();
        t.addition(12,3);
        subtraction(365,333);
        t.multiplication(57,44);
        division(57,3);
    }
}


