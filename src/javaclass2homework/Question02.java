package javaclass2homework;

/*
Write a Java programme using the following steps.
2.1 Declare two static variables.
2.2 Declare one static method.
2.3 Call both static variables into the static method inside the print statement.
2.4 Declare the Main method.
2.5 Call the static method into the Main method and run the programme.
 */
public class Question02 {
    static int a = 12;
    static int b = a+3;
    public static void number() {
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        number();

    }
}
