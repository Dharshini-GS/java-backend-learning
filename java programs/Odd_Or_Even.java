import java.util.Scanner;
public class Odd_Or_Even {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scn.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
    }
}
