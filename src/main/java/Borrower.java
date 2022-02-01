import java.util.ArrayList;


public class Borrower {

    private ArrayList<Book> collection;

    // Constructor
    public Borrower(){
        this.collection = new ArrayList<Book>();
    }

    public int collectionCount() {
        return this.collection.size();
    }

    public void addBookToCollection(Book book) {
        this.collection.add(book);
    }

}
