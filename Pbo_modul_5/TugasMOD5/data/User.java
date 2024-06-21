package data;

import books.Book;
import books.HistoryBook;
import books.StoryBook;
import books.TextBook;

import java.util.ArrayList;
import java.util.Scanner;

public class User {
    private final Scanner scanner;
    public static ArrayList<Book> books = new ArrayList<>();

    public User() {
        scanner = new Scanner(System.in);
        // Menambahkan buku-buku awal ke dalam ArrayList
        books.add(new HistoryBook("1031", "Regulus", "Ichika", 10));
        books.add(new StoryBook("1032", "Flos", "Minori", 11));
        books.add(new TextBook("1033", "Bug", "KairikiBear", 11));
    }

    public void displayBooks() {
        System.out.println("===== List of Books =====");
        System.out.printf("%-4s %-20s %-15s %-15s %s\n", "ID", "Judul", "Author", "Kategori", "Stock");
        for (Book book : books) {
            System.out.printf("%-4s %-20s %-15s %-15s %d\n", book.getId(), book.getTitle(), book.getAuthor(), book.getCategory(), book.getStock());
        }
    }

    public void addBook() {
        System.out.print("Enter book ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter book title: ");
        String title = scanner.nextLine();

        System.out.print("Enter book author: ");
        String author = scanner.nextLine();

        System.out.print("Enter book category: ");
        String category = scanner.nextLine();

        System.out.print("Enter book stock: ");
        int stock = scanner.nextInt();
        scanner.nextLine(); // Membersihkan newline dari buffer

        // Membuat objek buku sesuai dengan kategori
        Book book;
        switch (category.toLowerCase()) {
            case "history":
                book = new HistoryBook(id, title, author, stock);
                break;
            case "story":
                book = new StoryBook(id, title, author, stock);
                break;
            case "textbook":
                book = new TextBook(id, title, author, stock);
                break;
            default:
                System.out.println("Invalid category. Book not added.");
                return; // Keluar dari metode jika kategori tidak valid
        }
        books.add(book);
        System.out.println("Book added successfully.");
    }
}
