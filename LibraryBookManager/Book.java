public class Book {
    int bookId;
    String bookName;
    boolean isIssued;
    Book(int bookId, String bookName) {
        this.bookId = bookId;
        this.bookName = bookName;
    }
    void displayBook() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Issued: " + isIssued);
    }
}
