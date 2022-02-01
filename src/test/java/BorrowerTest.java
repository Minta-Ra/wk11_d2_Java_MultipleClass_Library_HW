import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class BorrowerTest {

    private Borrower borrower;
    private Book book;

    @Before
    public void before(){
        borrower = new Borrower();
    }

    @Test
    public void borrowerHasNoBooks(){
        assertEquals(0, borrower.collectionCount());
    }

    @Test
    public void canAddBookToCollection(){
        borrower.addBookToCollection(book);
        assertEquals(1, borrower.collectionCount());
    }

}
