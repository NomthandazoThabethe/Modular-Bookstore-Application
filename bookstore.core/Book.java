package bookstore.core;

public class Book {
    private String title;
    private Author author;
    private double price;

    public Book(String title, Author author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Book(String title, price){
        this(title, Author.UNKNOWN, price);
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPrice(double price) {
        if (price >= 0.0) {
            this.price = price;
        } else {
            // Handle invalid price - you might throw an exception here
        }
    }

    @Override
    public String toString() {
        return "Book: " + title + " (ISBN: " + isbn + "), by " + author;
    }
}
