package javaclass2homework;

/*
10. Write a Java program that takes a number as input and prints its multiplication
table up to 10.
Test Data: Input a number: 8.
Expected Output:
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
8 x 10 = 80
 */
public class Question10 {

    /*int num = 8;
    public void table(){
        for(int i= 1; i<=10; i++)
        {
            System.out.println(num + "*" + i + "=" + (num * i));
        }
    }
    public static void main(String[] args) {
        Question10 t = new Question10();
        t.table();
    }*/
    public void table(int a) {
        for(int i= 1; i<=10; i++)
        {
            System.out.println(a + "*" + i + "=" + (a * i));
        }
    }
    public static void main(String[] args) {
        Question10 t = new Question10();
        t.table(8);
    }
}
