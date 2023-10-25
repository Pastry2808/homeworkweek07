package javaclass2homework;

/*
Write a Java programme using the following steps.
3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the
print statement.
3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Question03 {
    String name = "Khushbu";
    static int a = 2808;
    public void demo(){
        System.out.println(name);
        System.out.println(a);
    }
    public static void code(){
        Question03 t = new Question03();
        System.out.println(t.name);
        System.out.println(a);
    }

    public static void main(String[] args) {
        Question03 t = new Question03();
        t.demo();
        code();
    }
}
