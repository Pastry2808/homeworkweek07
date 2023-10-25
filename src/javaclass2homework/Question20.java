package javaclass2homework;

/*
Write a Java Program using below steps.
20.1 Declare your Spain as static variable.
20.2 Declare your United Kingdom as instance variable.
20.3 Declare instance method name homeCountry()and call static variable.
20.4 Declare static method name holidays() and call instance variable
20.5 Call both methods in main method.
 */
public class Question20 {
    static String x = "Spain";
    String y = "United Kingdom";
    public void homecountry(){
        System.out.println(x);
    }
    public static void holidays(){
        Question20 t = new Question20();
        System.out.println(t.y);
    }
    public static void main(String[] args) {
        Question20 t = new Question20();
        t.homecountry();
        holidays();
    }
}
