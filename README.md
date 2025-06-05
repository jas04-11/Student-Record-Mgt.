# Student Records Management Console Application

## Project Description

This is a Java-based console application designed to manage student records effectively. It provides essential functionalities like adding student information, searching for students by their unique ID, sorting the student list based on marks, displaying all student records, and deleting students by ID. This project demonstrates the practical application of core Java programming concepts along with fundamental data structures and algorithms (DSA), including Binary Search and Merge Sort implemented from scratch.

The primary aim of this project is to build a solid foundation in Java programming while showcasing skills in algorithm design, data handling, and user interaction via a console interface. It is ideal for beginners learning data structures and algorithms in Java and looking to implement them in a real-world style project.

---

## Features

- **Add Student:** Allows users to input student details including ID, Name, and Marks. The details are stored dynamically in a collection.
- **Search Student by ID:** Implements a binary search algorithm to quickly find and retrieve student details by their ID. This feature requires the student list to be sorted by ID before searching.
- **Sort Students by Marks:** Uses a merge sort algorithm to sort the list of students in ascending order of their marks, demonstrating an efficient divide-and-conquer sorting technique.
- **Display All Students:** Lists all the student records currently stored in the system.
- **Delete Student by ID:** Enables deletion of a student record based on the unique student ID.
- **Console Menu:** Provides a simple and interactive menu-driven interface to perform all operations.

---

## Technologies and Concepts Used

- **Java SE (Core Java):** Utilized for object-oriented programming, data structures, and console I/O operations.
- **ArrayList:** Used as the dynamic data structure to store student records.
- **Binary Search Algorithm:** Efficient searching technique applied for finding student by ID.
- **Merge Sort Algorithm:** Efficient sorting algorithm applied to order students by marks.
- **OOP Principles:** Encapsulation of student details in a `Student` class with properties and methods.
- **Exception Handling (basic):** To ensure program stability during user input.

---

## Installation and Running Instructions

1. **Clone the repository:**
   ```bash
   git clone https://github.com/yourusername/StudentRecordsManagement.git
Navigate to the project directory:
-------------------------------------
bash

cd StudentRecordsManagement
Compile the Java source code:
-----------------------------------
bash

javac StudentRecordsManager.java
Run the compiled program:
-------------------------------------
bash

java StudentRecordsManager
----------------------------------------------------------------------------------
Follow the on-screen menu to add, search, sort, display, or delete student records.

## How It Works
When you add students, their details are stored in an ArrayList<Student>.

Searching uses binary search, so the list is first sorted by student ID before searching.

Sorting by marks is done using merge sort, which splits the list recursively and merges them in order.

Displaying simply iterates over the list and prints each student’s details.

Deletion finds the student by ID and removes them from the list.

Sample Output
----------------------------------------------
Student Records Management
1. Add Student
2. Search Student by ID
3. Sort Students by Marks
4. Display All Students
5. Delete Student by ID
6. Exit
Enter your choice: 1
Enter ID: 101
Enter Name: Jasleen
Enter Marks: 88
Student added.

Enter your choice: 4
ID: 101, Name: Jasleen, Marks: 88

Enter your choice: 2
Enter student ID to search: 101
Found: ID: 101, Name: Jasleen, Marks: 88

------------------------------------------------------------------------------
## Future Enhancements
File Persistence: Add functionality to save and load student records from files.

Input Validation: Improve handling of invalid inputs.

GUI Implementation: Build a graphical user interface for better usability.

Additional Search/Sort Options: Add features like searching by name, sorting by name, or filtering based on marks range.
------------------------------------------------------------------------------------------------------------------------
About the Author
Jasleen Kaur
-------------------------------------------------------------------------------
License
This project is licensed under the MIT License - see the LICENSE file for details.

