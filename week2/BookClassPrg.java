// A program that creates a 'Book' class with required attributes and methods
import java.util.ArrayList;

// class 'BookClassPrg'
class BookClassPrg {
    /** 
     * main - creates Book class instance
     * @args: command line arguments 
    */
    public static void main(String[] args) {
        Book MyNewBook = new Book();

        MyNewBook.author = "Amarachi Catherine";
        MyNewBook.title = "Flexisaf Internship Program";
        MyNewBook.ISBN = "9748-0";

        //Test class methods
        System.out.println(Book.collection);

        Book.addToCollection(MyNewBook);
        System.out.println(Book.collection);

        Book.remFromCollection(MyNewBook);
        System.out.println(Book.collection);
    }
}

//class 'Book'
class Book {
    String author;
    String title;
    String ISBN;
    static ArrayList<Book> collection = new ArrayList<Book>();
    /**
     * addToCollection - Add a book to the collection in class 'Book'
     * @book: Book instance to add to collection
    */
    public static void addToCollection(Book book) {
        if (!collection.contains(book)) {
            collection.add(book);
        } else {
            System.out.println("Already in collection");
        }
    } 
    /**
     * remFromCollection - Remove a book from the collection in class 'Book'
     * @book: Book instance to remove from collection
    */
    public static void remFromCollection(Book book) {
        if (collection.contains(book)) {
            collection.remove(book);
        } else {
            System.out.println("Book doesn't exist in collection");
        }
    }
}