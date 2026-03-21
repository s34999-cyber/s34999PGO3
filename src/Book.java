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

    void borrow(){
        if(this.available){
            this.available = false;
            System.out.println("Book '"+this.title+"' borrowed.");
        }
        else {
            System.out.println("Book '"+this.title+"' is not available to borrow.");
        }
    }

    void returnBook(){
        if(!this.available){
            this.available = true;
            System.out.println("Book '"+ this.title +"' returned.");
        }
        else {
            System.out.println("Book '"+this.title+"' is already in stock.");
        }
    }
} 