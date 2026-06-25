import java.util.Scanner;
public class MarksCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        boolean pass = true;
        System.out.println("Marks Calculator");
        for (int i = 1; i <= 5; i++) {
            int mark;
            while (true) {
                System.out.print("Enter mark for Subject " + i + ": ");
                mark = sc.nextInt();

                if (mark >= 0 && mark <= 100) {
                    break;
                } else {
                    System.out.println("Invalid mark! Enter a value between 0 and 100.");
                }
            }
            total += mark;
            if (mark < 35) {
                pass = false;
            }
        }
        double average = total / 5.0;
        String grade;
        if (average >= 90) {
            grade = "A";
        } else if (average >= 80) {
            grade = "B";
        } else if (average >= 70) {
            grade = "C";
        } else if (average >= 60) {
            grade = "D";
        } else if (average >= 50) {
            grade = "E";
        } else {
            grade = "F";
        }
        System.out.println("RESULT");
        System.out.println("Total Marks : " + total);
        System.out.println("Average     : " + average);
        System.out.println("Grade       : " + grade);
        System.out.println("Status      : " + (pass ? "PASS" : "FAIL"));
    }
}