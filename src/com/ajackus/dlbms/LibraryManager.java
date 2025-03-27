package com.ajackus.dlbms;
import java.sql.SQLOutput;
import java.util.*;


// This LibraryManager Class handles all book operations
public class LibraryManager {
    private Map<String, Book> books = new HashMap<>(); //HashMap used for stores books with Book ID

    //Add a book to the Map Collection
    public void addBook(String bookId, String title, String auther, String genre, String availabilityStatus){
        if(books.containsKey(bookId)){
            System.out.println("Book ID must be unique. Book not added.");
        }else {
            books.put(bookId, new Book(bookId, title, auther, genre, availabilityStatus));
            System.out.println("Book added successfully.");
        }
    }

    //Show all the books in the Library
    public void viewBooks(){
        if(books.isEmpty()){
            System.out.println("No books available in the library.");
        }else {
            for(Book book : books.values()){
                System.out.println(book);
            }
        }
    }


    //Searches for a book by ID || title
    public void searchBook(String query){
        for(Book book : books.values()){
            if(book.getBookId().equalsIgnoreCase(query) || book.getTitle().equalsIgnoreCase(query)){
                System.out.println("Book Found: \n" + book);
                return;
            }
        }
        System.out.println("Book not found.");
    }


    //Update books details
    public void updateBook(String bookId, String title, String author, String genre, String availabilityStatus){
        if(books.containsKey(bookId)){
            books.get(bookId).updatebook(title, author, genre, availabilityStatus);
            System.out.println("Book updated successfully.");
        }else{
            System.out.println("Book ID not found. ");
        }
    }


    //Delete book from the collection
    public void deleteBook(String bookId){
        if(books.remove(bookId) != null){
            System.out.println("Book deleted successfully.");
        }else {
            System.out.println("Book ID not found.");
        }
    }
}
