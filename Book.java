package bookMSy;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

 class Book {
    private int bookId;
    private String bookName;
    private int isbn;
 

    public Book(int bookId, String bookName , int isbn) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.isbn= isbn;
    }
    
    public int getBookId()
    {
    	return bookId;
    }
    public String getBookName()
    {
    	return bookName;
    }
    public int getISBN()
    {
    	return isbn;
    }
    
    public void setBookName(String bookName) {
    	this.bookName= bookName;
    }
    public void setISBN(int isbn) {
    	this.isbn= isbn;
    }
 }