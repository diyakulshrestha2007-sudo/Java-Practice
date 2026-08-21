 public class Book {

    String title;
    String author;
    double price;

   
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        price = 0.0;
    }

   
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

   
    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println();
    }

    public static void main(String[] args) {

        
        Book book1 = new Book();

        
        Book book2 = new Book("The Alchemist", "Paulo Coelho");

        
        Book book3 = new Book("Harry Potter", "J.K. Rowling", 599.0);

       
        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();
    }
}
