package bookstore.ui;
import bookstore.core.model.Author;
import bookstore.core.model.Book;
import java.util.Scanner;

public class BookstoreUi {
    private Scanner scanner = new Scanner(System.in);
    private void start(){
        displayMainMenu();
    }

    private void displayMainMenu() {
        System.out.println("\nBookstore Menu:");
        System.out.println("1. Add a Book");
        // ... (More options in the future) ...
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void main(String[] args) {
        BookstoreUi ui = new BookstoreUi();
        ui.displayMainMenu();
    }

    private void AddBook(){
        System.out.println("Enter book name: ");
        String title = scanner.nextLine();
        System.out.println("Enter the author of the book: ");
        String author = scanner.nextLine();
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        Author author = new Author();
        Book newBook = new Book(title, price);
    }

}