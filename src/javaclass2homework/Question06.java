package javaclass2homework;

/*
Write a program to enter any radius value of the circle and find out the area. (Formula
of Area A=PI*r*r).
 */
public class Question06 {

    int radius = 13;
    double area = Math.PI*radius*radius;
    public void area(){
        System.out.println("Area of the Circle is "+area);
    }

    public static void main(String[] args) {
        Question06 t = new Question06();
        t.area();
    }
}
