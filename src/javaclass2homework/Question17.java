package javaclass2homework;

/*
Write a Java Program using below steps.
17.1 Declare your city as instance variables.
17.2 Declare your country as static variables.
17.3 Declare one instance method and call static variable in print statement
17.4 Declare static method and call instance variable in print Statement.
17.5 Call both user defined methods into main method.
 */
public class Question17 {
    String City = "Milkyway";
    static String Country = "Chocolatination";
    public void demo(){
        System.out.println(Country);
    }
    public static void x(){
        Question17 t = new Question17();
        System.out.println(t.City);
    }
    public static void main(String[] args) {
        x();
        Question17 t = new Question17();
        t.demo();
    }
}
