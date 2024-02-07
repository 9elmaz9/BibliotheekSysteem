package LibrarySystem;

public class Book {
        private String title;
        private String author;
        private boolean availability;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
            this.availability = true; // Initially, the book is available
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public boolean isAvailable() {
            return availability;
        }

        public void setAvailable(boolean availability) {
            this.availability = availability;
        }
}
