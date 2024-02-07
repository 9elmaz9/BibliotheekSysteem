package LibrarySystem;

public class User  implements DataService{

    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    public Book searchBook(String title) {
        // Implementation for searching book
        return null;
    }

    public boolean borrowBook(Book book) {
        // Implementation for borrowing book
        return false;
    }

    public boolean returnBook(Book book) {
        // Implementation for returning book
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

    public boolean subscribe() {
        // Implementation for subscribing
        return false;
    }
}


