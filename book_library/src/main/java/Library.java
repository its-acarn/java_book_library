import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> library;

    public Library(int capacity) {
        this.capacity = capacity;
        this.library = new ArrayList<>();
    }

    public int countBooks(){
        return this.library.size();
    }

    public void addBook(Book book) {
        if(this.capacity > countBooks())
            this.library.add(book);
    }
}
