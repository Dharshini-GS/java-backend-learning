import java.util.Scanner;
public class Print_series {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");       
        int n = scn.nextInt();
        System.out.print("The series is: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }   
}