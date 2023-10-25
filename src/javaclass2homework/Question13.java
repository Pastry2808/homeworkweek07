package javaclass2homework;

/*
Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5
Expected Output:
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
public class Question13 {
    public static void area(float w, float h){
        System.out.println("Area of 5.6 * 8.5 = " + (w*h));
    }
    public void perimeter(float w, float h){
        System.out.println("Perimeter of 2 * (5.6 + 8.5) = " + (2 * (w + h)));
    }

    public static void main(String[] args) {
        System.out.println("Expected Output:");
        area(5.6f,8.5f);
        Question13 t = new Question13();
        t.perimeter(5.6f, 8.5f);
    }
}
