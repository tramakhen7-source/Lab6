package Excercie;
class LibraryItem {
    protected String title;
    protected String id;

    public LibraryItem(String title, String id) {
        this.title = title;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Item ID: " + id + ", Title: " + title);
    }
}

class Book extends LibraryItem {
    public Book(String title, String id) {
        super(title, id);
    }

    @Override
    public void displayInfo() {
        // _title / title is accessible here because it is protected
        System.out.println("Book Title [Protected access check - Title: " + title + "], ID: " + id);
    }
}

public class Main5 {
    public static void main(String[] args) {
        Book book = new Book("Java Programming", "B001");
        book.displayInfo();
        
        // Note: Outside classes (like Main5) cannot access book.title directly if it were strictly private,
        // but protected allows access within the same package or subclasses.
    }
}