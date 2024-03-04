package bookstore.core

public class Author {
    private String firstname;
    private String lastname;
    private List<Books> books;
    public static final Author UNKNOWN = new Author("Unknown", "");


    public Author(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.books = new ArrayList<>();

    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public  String setFirstName(String firstname){
        this.firstname = firstname;
    }

    public  String setLastName(String lastname){
        this.lastname = lastname;
    }

    public List<Books> getBooks(){
        return books;
    }

    public void addBook(Book book){
        books.add(book);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}


