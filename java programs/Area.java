import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");    
    int length = scn.nextInt();
        System.out.print("Enter the width of the rectangle: ");
        int width = scn.nextInt();
        int area = length * width;
        System.out.println("The area of the rectangle is: " + area);
    }
}