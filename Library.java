import java.util.Arrays;

public class Library {
    private Book[] books;
    private int bookCount;

    public Library(int capacity) {
        this.books = new Book[capacity];
        this.bookCount = books.length;
    }

    public void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (this.books[i] == null) {
                this.books[i] = book;
                this.bookCount++;
                System.out.println("Book added.");
                break;
            }
            if(i == books.length - 1 && this.books[i] != null) {
                System.out.println("No space for book.");
            }
        }

    }
    public void printAvailableBooks() {
        System.out.println("Available Books: ");
        for (int i = 0; i < books.length; i++) {
            if (this.books[i] != null) {
                System.out.println(this.books[i].returnTitle());
            }
        }
    }
    public void findBookByTitle(String title) {
        for (int i = 0; i < books.length; i++) {
            if(this.books[i].returnTitle().equals(title)) {
                System.out.println("Book found! Printing info.");
                this.books[i].printInfo();
                break;
            }
            if(i == books.length - 1 && this.books[i].returnTitle() != title) {
                System.out.println("Book not found.");
            }
        }
    }
    public void countAvailableBooks() {
        bookCount = 0;
        for (int i = 0; i < books.length; i++) {
            if (this.books[i] != null) {
                bookCount++;
            }
        }
        System.out.println("Number of available books: " + bookCount);
    }
}
