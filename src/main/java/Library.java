import java.util.ArrayList;


public class Library {

    private ArrayList<Book> books;
    private int capacity;

    // Constructor
    public Library(int capacity){
        this.books = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int booksCount(){
        return this.books.size();
    }

    public void addBook(Book book) {
        if (this.booksCount() < this.capacity){
            this.books.add(book);
        }
    }

}
