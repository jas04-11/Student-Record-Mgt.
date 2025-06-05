import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Marks: " + marks;
    }
}

public class StudentRecordsManager {
    static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nStudent Records Management");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student by ID");
            System.out.println("3. Sort Students by Marks");
            System.out.println("4. Display All Students");
            System.out.println("5. Delete Student by ID");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> addStudent(sc);
                case 2 -> searchStudent(sc);
                case 3 -> sortStudentsByMarks();
                case 4 -> displayAll();
                case 5 -> deleteStudent(sc);
                case 6 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 6);

        sc.close();
    }

    static void addStudent(Scanner sc) {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        students.add(new Student(id, name, marks));
        System.out.println("Student added.");
    }

    static void displayAll() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }
        for (Student s : students) {
            System.out.println(s);
        }
    }

    static void searchStudent(Scanner sc) {
        if (students.isEmpty()) {
            System.out.println("No students to search.");
            return;
        }
        // Make sure list is sorted by ID before binary search
        students.sort((a, b) -> Integer.compare(a.id, b.id));

        System.out.print("Enter student ID to search: ");
        int id = sc.nextInt();

        int index = binarySearchById(id);
        if (index == -1) {
            System.out.println("Student not found.");
        } else {
            System.out.println("Found: " + students.get(index));
        }
    }

    static int binarySearchById(int id) {
        int low = 0, high = students.size() - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midId = students.get(mid).id;
            if (midId == id) return mid;
            else if (midId < id) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    static void sortStudentsByMarks() {
        if (students.isEmpty()) {
            System.out.println("No students to sort.");
            return;
        }
        mergeSort(students, 0, students.size() - 1);
        System.out.println("Students sorted by marks.");
    }

    static void mergeSort(ArrayList<Student> arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    static void merge(ArrayList<Student> arr, int left, int mid, int right) {
        ArrayList<Student> temp = new ArrayList<>();
        int i = left, j = mid + 1;

        while (i <= mid && j <= right) {
            if (arr.get(i).marks <= arr.get(j).marks) {
                temp.add(arr.get(i++));
            } else {
                temp.add(arr.get(j++));
            }
        }

        while (i <= mid) temp.add(arr.get(i++));
        while (j <= right) temp.add(arr.get(j++));

        for (int k = left; k <= right; k++) {
            arr.set(k, temp.get(k - left));
        }
    }

    static void deleteStudent(Scanner sc) {
        if (students.isEmpty()) {
            System.out.println("No students to delete.");
            return;
        }
        System.out.print("Enter student ID to delete: ");
        int id = sc.nextInt();

        int index = -1;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).id == id) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Student not found.");
        } else {
            students.remove(index);
            System.out.println("Student deleted.");
        }
    }
}
