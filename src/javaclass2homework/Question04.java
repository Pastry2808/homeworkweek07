package javaclass2homework;

/*
Write a Java programme using the following steps.
4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the
print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Question04 {
    static String a = "I LOVE JAVA";
    int b = 143;
    static int c = 341;
    String d = "I LOVE CODEBUSTER";
    public void demo() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
    public static void love(){
        System.out.println(a);
        Question04 t = new Question04();
        System.out.println(t.b);
        System.out.println(c);
        System.out.println(t.d);
    }

    public static void main(String[] args) {
        Question04 t = new Question04();
        t.demo();
        love();
    }
}
