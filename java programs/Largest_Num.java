import java.util.Scanner;
public class Largest_Num {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the first number: ");   
        int num1 = scn.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scn.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scn.nextInt();
        int largest;
        if(num1 >= num2 && num1 >= num3){
            largest = num1;
        } else if(num2 >= num1 && num2 >= num3){
            largest = num2;
        } else{
            largest = num3;
        }
        System.out.println("The largest number among " + num1 + ", " + num2 + ", and " + num3 + " is: " + largest);
    }
}
