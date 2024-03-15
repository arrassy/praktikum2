import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    ArrayList<Book> bookList = new ArrayList<>();
    ArrayList<Student> userStudent = new ArrayList<>();

    public static void main(String[] args) {
        Main main = new Main();
        main.menu();
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to the Library System");
            System.out.println("1. Login as Admin");
            System.out.println("2. Login as Student");
            System.out.println("3. Exit");
            System.out.print("Choose Option (1-3): ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    menuAdmin();
                    break;
                case 2:
                    menuStudent();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public void menuAdmin() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nAdmin Dashboard");
            System.out.println("1. Add Student");
            System.out.println("2. Display Student List");
            System.out.println("3. Back to Main Menu");
            System.out.print("Choose Option (1-3): ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayStudent();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public void menuStudent() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nStudent Dashboard");
            System.out.println("1. Display Books");
            System.out.println("2. Borrow a Book");
            System.out.println("3. List Borrowed Books");
            System.out.println("4. Back to Main Menu");
            System.out.print("Choose Option (1-4): ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    displayBooks();
                    break;
                case 2:
                    borrowBook();
                    break;
                case 3:
                    listBorrowedBooks();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name: ");
        String name = scanner.nextLine();
        System.out.println("Enter student NIM: ");
        String nim = scanner.nextLine();
        System.out.println("Enter student faculty: ");
        String faculty = scanner.nextLine();
        System.out.println("Enter student program study: ");
        String programStudy = scanner.nextLine();

        if (nim.length() != 15) {
            System.out.println("Invalid NIM length. NIM must be 15 characters long.");
            return;
        }

        Student student = new Student();
        student.nim = nim;
        student.nama = name;
        student.fakultas = faculty;
        student.programStudi = programStudy;

        userStudent.add(student);

        System.out.println("Student added successfully.");
    }

    public void displayStudent() {
        for (Student student : userStudent) {
            System.out.println("NIM: " + student.nim + ", Name: " + student.nama + ", Faculty: " + student.fakultas +
                    ", Program Study: " + student.programStudi);
        }
    }
    public void displayBooks() {
        System.out.println("Displaying available books...");
    }

    public void borrowBook() {
        System.out.println("Borrowing a book...");
    }

    public void listBorrowedBooks() {
        System.out.println("Listing borrowed books...");
    }
}

class Book {
    int id_buku;
    String judul;
    String author;
    int stok;
}

class Student {
    String nim;
    String nama;
    String fakultas;
    String programStudi;
}
