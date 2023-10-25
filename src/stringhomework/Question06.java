/*
Write a java program which replace a “I@love@java” to “we love java”
Expected output: We love java
 */
package stringhomework;
public class Question06 {
    public static void main(String[] args) {
        String a = "I@love@Java";
        String b = a.replace("I@love@", "We Love ");
        System.out.println(a);
        System.out.println(b);

    }
}
