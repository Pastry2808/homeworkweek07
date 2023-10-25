package javaclass2homework;

/*
Write a Java programme using the following steps.
1.1 Declare two instance variables.
1.2 Declare one instance method.
1.3 Call both instance variables into the instance method inside the print statement.
1.4 Declare the Main method.
1.5 Call the above instance method into the Main method and run the programme.
 */
public class Question01 {
    String name = "Khushbu";
    String surname = "Patel";
    public void demo(){
        System.out.println(name);
        System.out.println(surname);
    }

    public static void main(String[] args) {
        Question01 t = new Question01();
        t.demo();
    }
}

