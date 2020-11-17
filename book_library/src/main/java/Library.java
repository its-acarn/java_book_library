import java.util.ArrayList;

public class Library {

    private ArrayList<Book> library;

    public Library() {
        this.library = new ArrayList<>();
    }

    public int countBooks(){
        return this.library.size();
    }

}
