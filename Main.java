public class Main {
    public static void main(String[] args) {
        Book oxfordDict = new Book ("Oxford Dictionary","Oxford University Press", 21730, true);
        Book italyCooking = new Book("Cooking With Nonna","Sofia Cagnoni", 310, false);
        Book somethingGood = new Book ("Something Good","Robert Munsch", 32, false);
        oxfordDict.printInfo();
        italyCooking.printInfo();
        somethingGood.printInfo();
        oxfordDict.borrow();
        somethingGood.returnBook();
        italyCooking.borrow();
        italyCooking.returnBook();
        Reader faust = new Reader("Faust", "Goethe", "2",2);
        Reader yiSang = new Reader("Yi", "Sang", "1",7);
        faust.increaseBorrowedCount();
        faust.printData();
        yiSang.decreaseBorrowedCount();
        yiSang.decreaseBorrowedCount();
        yiSang.printData();
        Library angela = new Library(10);
        for (int i = 0; i < 11; i++) {
            angela.addBook(italyCooking);
        }
        angela.printAvailableBooks();
        angela.findBookByTitle("Cooking With Nonna");
        angela.countAvailableBooks();
    }
}

