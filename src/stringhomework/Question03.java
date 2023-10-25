/*
Write a java program which replace a “I love java” to “we love java”
Expected output: We love java
 */
package stringhomework;

public class Question03 {
    static String a = "I love Java";

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(a.replace("I", "We"));
    }
}
