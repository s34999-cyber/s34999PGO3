package src;

public class Book {
    private String title;
    private String author;
    private int pageCount;
    private boolean available;

    public Book(String title, String author, int pageCount, boolean available){
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.available = available;
    }


    void printInfo(){
        System.out.println("Title: " + title + " Author: " + author + " Page Count: "+ pageCount + " Available?: " + available);
    }

    String returnTitle(){
        return title;
    }

    void borrow(){
        if(this.available){
            this.available = false;
        }
        else {
            System.out.println("Book '"+this.title+"' is not available to borrow.");
        }
    }

    void returnBook(){
        if(!this.available){
            this.available = true;
        }
        else {
            System.out.println("But book '"+this.title+"' is already in stock.");
        }
    }

    boolean isAvailable(){
        return this.available;
    }
}
