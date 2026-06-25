import java.util.Scanner;
public class Sum_Of_Series {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scn.nextInt();
        int sum = 0; 
        for (int i = 1; i <= n; i++) {
            sum += i; 
        }
        System.out.println("The sum of the series from 1 to " + n + " is: " + sum);
    }
}
