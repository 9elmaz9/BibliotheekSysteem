package LibrarySystem;

public class LibraryService  implements DataService{
    private DataService dataService;

    public LibraryService(DataService dataService) {
        this.dataService = dataService;
    }

    @Override
    public Book searchBook(String title) {
        return null;
    }

    @Override
    public boolean borrowBook(Book book) {
        return false;
    }

    @Override
    public boolean returnBook(Book book) {
        return false;
    }

    @Override
    public boolean addUser(User user) {
        return false;
    }

    @Override
    public boolean removeUser(User user) {
        return false;
    }

    @Override
    public boolean addBook(Book book) {
        return false;
    }

    @Override
    public boolean removeBook(Book book) {
        return false;
    }
}
