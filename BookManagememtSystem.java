package bookMSy;
import java.util.*;


public class BookManagememtSystem {
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
        BookManager bookManager = new BookManager();

        while (true) {
            System.out.println("1. Create Book");
            System.out.println("2. Retrieve Book");
            System.out.println("3. Update Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter book name: ");
                    String bookName = scanner.next();
                    System.out.print("Enter ISBN ");
                    int isbn= scanner.nextInt();
                                   
                  bookManager.createBook(bookName, isbn);
                    break;

                case 2:
                    System.out.print("Enter book ID: ");

                    int bookId = scanner.nextInt();

                    Book retrievedBook = bookManager.getBookById(bookId);
                   
                    if (retrievedBook != null) {
                        System.out.println("Book Name: " + retrievedBook.getBookName());
                        System.out.println("Book ISBN: " + retrievedBook.getISBN());
          
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter book ID: ");
                    int updateBookId = scanner.nextInt();
                    
                    System.out.print("Enter new book name: ");                  
                    String newBookName = scanner.next();
                    
                    System.out.print("Enter isbn ");     
                    int newISBN = scanner.nextInt();

                    bookManager.updateBook(updateBookId, newBookName, newISBN);
                    break;
                case 4:
                    System.out.print("Enter book ID to delete: ");
                    int deleteBookId = scanner.nextInt();
                    bookManager.deleteBook(deleteBookId);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
