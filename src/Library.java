package src;

import java.io.Reader;
import java.util.Arrays;

public class Library {
    private Book[] books;
    private int bookCount;

    public Library(int capacity) {
        this.books = new Book[capacity];
        this.bookCount = books.length;
    }

    void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (this.books[i] == null) {
                this.books[i] = book;
                this.bookCount++;
                System.out.println("Book '" + book.returnTitle() +"' added.");
                break;
            }
            if(i == books.length - 1 && this.books[i] != null) {
                System.out.println("No space for book.");
            }
        }

    }
    void printAvailableBooks() {
        System.out.println("Available Books: ");
        if (countAvailableBooks() <1){
            System.out.println("No books available.");
        }
        for (int i = 0; i < books.length; i++) {
            if (this.books[i] != null && this.books[i].isAvailable()) {
                System.out.println(this.books[i].returnTitle());
            }
        }
    }
    void findBookByTitle(String title) {
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
    int countAvailableBooks() {
        bookCount = 0;
        for (int i = 0; i < books.length; i++) {
            if (this.books[i] != null && this.books[i].isAvailable()) {
                bookCount++;
            }
        }
        return bookCount;
    }

    void borrowBook(String title, BookReader reader){
        for (int i = 0; i < books.length; i++) {
            if (this.books[i].returnTitle().equals(title)) {
                Book tempBook = this.books[i];
                if(tempBook.isAvailable()){
                    reader.increaseBorrowedCount();
                    System.out.println(reader.getFirstName()+" is borrowing: " +tempBook.returnTitle());
                }
                tempBook.borrow();
                this.books[i] = tempBook;
                break;
            }
            if(i == books.length - 1 && this.books[i].returnTitle() != title) {
                System.out.println("Book not found.");
            }
        }
    }

    void returnBookToLibrary(String title, BookReader reader){
        for (int i = 0; i < books.length; i++) {
            if (this.books[i].returnTitle().equals(title)) {
                Book tempBook = this.books[i];
                System.out.println(reader.getFirstName() + " is returning: " +tempBook.returnTitle());
                if(!tempBook.isAvailable()){
                    reader.decreaseBorrowedCount();

                }
                tempBook.returnBook();
                this.books[i] = tempBook;
                break;
            }
            if(i == books.length - 1 && this.books[i].returnTitle() != title) {
                System.out.println("Book not found.");
            }
        }
    }

}
