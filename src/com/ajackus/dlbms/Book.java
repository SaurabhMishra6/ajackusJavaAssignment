package com.ajackus.dlbms;
import java.util.*;


// Book Class represents a Book entity
public class Book {
    private String bookId;
    private String title;
    private String author;
    private String genre;
    private String availabilityStatus;


    // Constructor to initialize the details of books
    public Book(String bookId, String title, String author, String genre, String availabilityStatus){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        setAvailabilityStatus(availabilityStatus);
    }


    // Getter  used to get the Details
    public String getBookId(){
        return bookId;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getGenre(){
        return genre;
    }

    public String getAvailabilityStatus(){
        return availabilityStatus;
    }


    //Setter to set or create the details of book
    public void setAvailabilityStatus(String status){
        if(status.equalsIgnoreCase("Available") || status.equalsIgnoreCase("Checked Out")){
            this.availabilityStatus = status;
        }else{
            System.out.println("Invalid availability status. Setting to 'Availble' by default.");
            this.availabilityStatus = "Available";
        }
    }


    //Method to Update the Book Details
    public void updatebook(String title, String author, String genre, String availabilityStatus){
        this.title = title;
        this.author = author;
        this.genre = genre;
        setAvailabilityStatus(availabilityStatus);
    }

    @Override
    public String toString(){
        return "Book ID: " + bookId + " || Book Title: " + title + " || Book Author: " + author +
                " || Book Genre: " + genre + " || Book Status: " + availabilityStatus;
    }
}
