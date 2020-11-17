import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book bible;

    @Before
    public void before() {
        library = new Library(2);
        bible = new Book("Bible", "Various", "Religion");
    }

    @Test
    public void checkBookCountIsZero() {
        assertEquals(0, library.countBooks());
    }

    @Test
    public void canAddBook() {
        library.addBook(bible);
        assertEquals(1, library.countBooks());
    }
}
