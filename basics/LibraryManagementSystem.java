

/**
 * Problem: Implement a Library Management System where users can borrow, return, and search for books.
 * The system should:
 * 1. Allow a user to borrow a book if it's available.
 * 2. Prevent a user from borrowing the same book twice.
 * 3. Allow a user to return a book.
 * 4. Search for books by title.
 */

class Book {
    private String title;
    private boolean isBorrowed;

    public Book(String title) {
        this.title = title;
        this.isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrowBook() {
        isBorrowed = true;
    }

    public void returnBook() {
        isBorrowed = false;
    }
}

class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(String title) {
        books.add(new Book(title));
    }

    // Borrow a book if available
    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (!book.isBorrowed()) {
                    book.borrowBook();
                    System.out.println("You have borrowed: " + title);
                    return;
                } else {
                    System.out.println("Sorry, this book is already borrowed.");
                    return;
                }
            }
        }
        System.out.println("Book not found.");
    }

    // Return a borrowed book
    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.isBorrowed()) {
                    book.returnBook();
                    System.out.println("You have returned: " + title);
                    return;
                } else {
                    System.out.println("This book was not borrowed.");
                    return;
                }
            }
        }
        System.out.println("Book not found.");
    }

    // Search for a book by title
    public void searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                String status = book.isBorrowed() ? "Borrowed" : "Available";
                System.out.println("Book found: " + title + " (Status: " + status + ")");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    // List all books in the library
    public void listBooks() {
        System.out.println("Library Books:");
        for (Book book : books) {
            String status = book.isBorrowed() ? "Borrowed" : "Available";
            System.out.println("- " + book.getTitle() + " (Status: " + status + ")");
        }
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books to the library
        library.addBook("The Alchemist");
        library.addBook("Harry Potter and the Sorcerer's Stone");
        library.addBook("To Kill a Mockingbird");

        // User interactions
        library.listBooks();

        library.borrowBook("The Alchemist");
        library.borrowBook("The Alchemist"); // Attempt to borrow again

        library.searchBook("Harry Potter and the Sorcerer's Stone");

        library.returnBook("The Alchemist");
        library.returnBook("The Alchemist"); // Attempt to return again

        library.listBooks();
    }
}

    

