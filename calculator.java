package testing;
import java.util.Scanner;

 public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
        System.out.println("Enter a value");
        double a = sc.nextDouble(); // reads user input
        System.out.println("Enter an operation");
        char operator = sc.next().charAt(0);
        System.out.println("Enter another value");
        double b = sc.nextDouble();
        solve(a, b, operator);
    }

        }

     private static void solve(double a, double b, char operator) {
         Scanner sc = new Scanner(System.in);
         int ans = 0;
         if (operator == '+' ) {
             System.out.println(a + b);
         } else if (operator =='-') {
             System.out.println(a - b);
         } else if (operator == '*') {
             System.out.println(a * b);
         } else if (operator == '/') {
             System.out.println(a / b);
     }

 }
 }
