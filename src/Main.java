package src;

public class Main {
    public static void main(String[] args) {
        Book oxfordDict = new Book ("Oxford Dictionary","Oxford University Press", 21730, true);
        Book italyCooking = new Book("Cooking With Nonna","Sofia Cagnoni", 310, false);
        Book somethingGood = new Book ("Something Good","Robert Munsch", 32, false);
        BookReader faust = new BookReader("Faust", "Goethe", "2",2);
        BookReader yiSang = new BookReader("Yi", "Sang", "1",7);
        Library angelasLibrary = new Library(13);
        angelasLibrary.addBook(oxfordDict);
        angelasLibrary.addBook(italyCooking);
        angelasLibrary.addBook(somethingGood);
        angelasLibrary.printAvailableBooks();
        angelasLibrary.borrowBook("Something Good", faust);
        angelasLibrary.borrowBook("Oxford Dictionary", yiSang);
        angelasLibrary.printAvailableBooks();
        angelasLibrary.returnBookToLibrary("Something Good", yiSang);
        angelasLibrary.returnBookToLibrary("Something Good", yiSang);
        angelasLibrary.printAvailableBooks();

    }
}

