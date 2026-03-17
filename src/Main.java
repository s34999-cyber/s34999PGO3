public class Main {
    public static void main(String[] args){
        Book oxfordDict = new Book ("Oxford Dictionary","Oxford University Press", 21730, true);
        Book italyCooking = new Book("Cooking With Nonna","Sofia Cagnoni", 310, false);
        Book somethingGood = new Book ("Something Good","Robert Munsch", 32, false);
        oxfordDict.printInfo();
        italyCooking.printInfo();
        somethingGood.printInfo();
        oxfordDict.borrow();
        somethingGood.returnBook();
        italyCooking.borrow();
    }



}