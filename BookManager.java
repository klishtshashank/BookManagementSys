package bookMSy;
import java.util.*;

class BookManager {

    private List<Book> books = new ArrayList<>();

    private int nextBookId = 1; 

    // Method to create a new book record

    public void createBook(String bookName, int isbn) {
        Book newBook = new Book(nextBookId, bookName, isbn);
        books.add(newBook);
        nextBookId++;
    } 

    // Method to retrieve a book by ID

    public Book getBookById(int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                return book;
            }
        }
        return null;
    }

    // Method to update a book's information

    public void updateBook(int bookId, String newBookName, int newisbn) {
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                book.setBookName(newBookName);
            book.setISBN(newisbn);
                 break;
        }
                      
            }
        }
    

    // Method to delete a book record

    public void deleteBook(int bookId) {
        books.removeIf(book -> book.getBookId() == bookId);
    }
}

