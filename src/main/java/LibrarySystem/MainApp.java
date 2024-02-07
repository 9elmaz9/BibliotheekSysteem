package LibrarySystem;

public class MainApp {
    public static void main(String[] args) {
        DataService dataService = new DataBase();
        CustomerService customerService = new CustomerService(dataService);
        LibraryService libraryService = new LibraryService(dataService);
        System.out.println("Starting Library System Application...");

        // Use customerService and libraryService to interact with the database
        System.out.println("Adding a user through CustomerService...");
        User newUser = new User("john_doe", "password123");
        customerService.addUser(newUser);
        // Example usage:
        // 1. CustomerService operations
        Book bookToAdd = new Book("Sample Book", "Sample Author");
        customerService.addBook(bookToAdd);

        Book bookToDelete = new Book("ToDelete Book", "ToDelete Author");
        customerService.removeBook(bookToDelete);

        // 2. LibraryService operations
        User userToRegister = new User("newUser", "password");
        libraryService.addUser(userToRegister);

        User userToDelete = new User("userToDelete", "password");
        libraryService.removeUser(userToDelete);

        // Additional operations as needed...
    }

}
