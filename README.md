******Digital Library Book Management System******

**Overview**

This Library Management System is a console-based Java application that allows librarians to efficiently manage books.
The system provides functionality to add, update, search, view, and delete books while maintaining their availability status.

**Features**

* Add a Book: Input Book ID, Title, Author, Genre, and Availability Status.
* View All Books: Display a list of all books with their details.
* Search Book: Find a book using its ID or Title.
* Update Book Details: Modify book details, including availability status.
* Delete a Book: Remove a book from the catalog.
* Exit System: Terminate the program.

**Constraints**

* Book ID must be unique.
* Title and Author must be non-empty strings.
* Availability Status must be either Available or Checked Out.


**Assumptions**

* The system runs in a console environment.
* Data is stored in memory (HashMap), meaning data is lost when the program exits.
* User inputs are assumed to be valid (except for availability status, which is validated).


**Future Enhancements**

* Store book data persistently using a database or file system.
* Implement a GUI-based interface for better usability.
* Add user authentication for restricted access to book management.


**Prerequisites**

* Java Development Kit (JDK) 8 or later.
* IntelliJ IDEA as the preferred IDE.
