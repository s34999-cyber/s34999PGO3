package src;

public class BookReader {
    private String firstName;
    private String lastName;
    private String cardNumber;
    private int borrowedCount;

    public BookReader(String firstName, String lastName, String cardNumber, int borrowedCount){
        this.firstName = firstName;
        this.lastName = lastName;
        this.cardNumber = cardNumber;
        this.borrowedCount = borrowedCount;
    }

    void printData(){
        System.out.println("First Name: " + firstName + ", Last Name: " + lastName + ", Card Number: " + cardNumber + ", Books Borrowed: " + borrowedCount);
    }

    void increaseBorrowedCount(){
        borrowedCount++;
    }
    void decreaseBorrowedCount(){
        borrowedCount--;
    }

    String getFirstName() {
        return firstName;
    }
}
