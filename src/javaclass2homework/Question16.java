package javaclass2homework;

/*
16. Write a Java Program to print as below. (All details to be stored in variable)

"+----------------------+"
"|                      |"
"| CORNER STORE         |"
"|                      |"
"| 2015-03-29 04:38PM   |"
"|                      |"
"| Gallons: 10.870      |"
"| Price/gallon: $ 2.89 |"
"|                      |"
"| Fuel total: $ 22.71  |"
"|                      |"
"+----------------------+"
 */
public class Question16 {

    public static void store(){
        String a = "Corner Store";
        String b = "2015-03-29  04:38PM";
        double c = 10.870;
        double d = 2.89;
        double e = 22.71;
        System.out.println("\"+-------------------------+\"");
        System.out.println("\"|                         |\"");
        System.out.println("\"|    "+a+"         |\"");
        System.out.println("\"|                         |\"");
        System.out.println("\"|  "+b+"    |\"");
        System.out.println("\"|                         |\"");
        System.out.println("\"|  " + "Gallons:" +  c+ "          |\"");
        System.out.println("\"|  " + "Price/gallon:  $ " + d+ "  |\"");
        System.out.println("\"|                         |\"");
        System.out.println("\"|  " + "Fuel total:  $ " + e+ "   |\"");
        System.out.println("\"|                         |\"");
        System.out.println("\"+-------------------------+\"");


    }
    public static void main(String[] args) {
        store();
    }
}
