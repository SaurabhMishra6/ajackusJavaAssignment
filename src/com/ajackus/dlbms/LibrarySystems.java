package com.ajackus.dlbms;
import java.util.*;


//main class for run the program and interaction with user
public class LibrarySystems {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        LibraryManager manager = new LibraryManager();

        while(true){
            System.out.println("\nWelcome to Digital Library Book Management System");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book by ID or Title");
            System.out.println("4. Update Book Details");
            System.out.println("5. Delete Book");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                    System.out.print("Enter Book ID: ");
                    String bookId = sc.nextLine();

                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    System.out.print("Enter Genre: ");
                    String genre = sc.nextLine();

                    System.out.print("Enter Availability Status (Available/Checked Out): ");
                    String status = sc.nextLine();

                    manager.addBook(bookId, title, author, genre, status);
                    break;

                case 2:
                    manager.viewBooks();
                    break;

                case 3:
                    System.out.print("Enter Book ID or Title: ");
                    String searchQuery = sc.nextLine();
                    manager.searchBook(searchQuery);
                    break;

                case 4:
                    System.out.print("Enter Book ID to update: ");
                    String updateId = sc.nextLine();

                    System.out.print("Enter New title: ");
                    String newTitle = sc.nextLine();

                    System.out.print("Enter New Author: ");
                    String newAuthor = sc.nextLine();

                    System.out.print("Enter New Genre: ");
                    String newGenre = sc.nextLine();

                    System.out.print("Enter New Availability Status (Available/Checked Out): ");
                    String newStatus = sc.nextLine();

                    manager.updateBook(updateId, newTitle, newAuthor, newGenre, newStatus);
                    break;

                case 5:
                    System.out.print("Enter Book ID to Delete");
                    String deleteId = sc.nextLine();
                    manager.deleteBook(deleteId);
                    break;

                case 6:
                    System.out.println("Exiting system..");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
