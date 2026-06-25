import java.util.Scanner;
public class LibraryManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] books = {
                new Book(101, "Java Basics"),
                new Book(102, "Python Programming"),
                new Book(103, "DBMS"),
                new Book(104, "Data Structures"),
                new Book(105, "Operating Systems")
        };
        Member[] members = {
                new Member(1, "Dharshini"),
                new Member(2, "Anu"),
                new Member(3, "Kavin"),
                new Member(4, "Priya"),
                new Member(5, "Rahul")
        };
        int choice;
        do {
            System.out.println("\nLIBRARY MENU");
            System.out.println("1. View Books");
            System.out.println("2. View Members");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.println("\nBooks Available:");
                    for (Book b : books) {
                        b.displayBook();
                    }
                    break;

                case 2:

                    System.out.println("\nMembers:");
                    for (Member m : members) {
                        m.displayMember();
                    }
                    break;

                case 3:

                    System.out.print("Enter Book ID to Issue: ");
                    int issueId = sc.nextInt();

                    boolean foundIssue = false;

                    for (Book b : books) {
                        if (b.bookId == issueId) {
                            foundIssue = true;

                            if (!b.isIssued) {
                                b.isIssued = true;
                                System.out.println("Book Issued Successfully");
                            } else {
                                System.out.println("Book Already Issued");
                            }
                        }
                    }

                    if (!foundIssue) {
                        System.out.println("Book Not Found");
                    }

                    break;

                case 4:

                    System.out.print("Enter Book ID to Return: ");
                    int returnId = sc.nextInt();

                    boolean foundReturn = false;

                    for (Book b : books) {
                        if (b.bookId == returnId) {
                            foundReturn = true;

                            if (b.isIssued) {
                                b.isIssued = false;
                                System.out.println("Book Returned Successfully");
                            } else {
                                System.out.println("Book Was Not Issued");
                            }
                        }
                    }

                    if (!foundReturn) {
                        System.out.println("Book Not Found");
                    }

                    break;

                case 5:
                    System.out.println("Thank You");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 5);
    }
}