package javaclass2homework;

/*
Write a Java Program using below steps.
19.1 Declare one of your group member names as instance variable.
19.2 Declare one of your group member names as static variable.
19.3 Declare one instance method name with group name (e.g. selenium())and call both global
variables.
19.4 Declare static method name agile() and call both variable
19.5 Call both user defined methods into main method.
Note: Declare 1 local variables in all user defined method and main method and print in to statement
 */
public class Question19 {
    String name = "Nayan";
    static String name1 = "Shikha";
    public void agile(){
        String name2 = "Ripti";
        System.out.println(name);
        System.out.println(name1);
        System.out.println(name2);
    }
    public static void selenium(){
        String name3 = "Avani";
        Question19 t = new Question19();
        System.out.println(t.name);
        System.out.println(name1);
        System.out.println(name3);
    }

    public static void main(String[] args) {
        String name4 = "Kinjal";
        System.out.println(name4);
        selenium();
        Question19 t = new Question19();
        t.agile();
    }
}
