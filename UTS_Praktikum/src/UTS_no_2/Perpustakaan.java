/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_no_2;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author ACER i7
 */
public class Perpustakaan {
    private ArrayList<Buku> buku;

    public Perpustakaan() {
        this.buku = new ArrayList<>();
        // Inisialisasi beberapa buku
        buku.add(new Buku("Alaia", "Raden Chedid", "Fantasy"));
        buku.add(new Buku("Aku Tahu Kapan Kamu Mati", "Arumi E", "Horror"));
    }

    public void addBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan judul buku: ");
        String title = scanner.nextLine();
        System.out.print("Masukkan penulis buku: ");
        String author = scanner.nextLine();
        System.out.print("Masukkan genre buku: ");
        String genre = scanner.nextLine();
        
        buku.add(new Buku(title, author, genre));
        System.out.println("Buku berhasil ditambahkan.");
    }

    public void displayBooks() {
        System.out.println("\nDaftar Buku:");
        for (Buku book : buku) {
            System.out.println("Judul: " + book.getTitle() + ", Penulis: " + book.getAuthor() + ", Genre: " + book.getGenre());
        }
    }

    public void deleteBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan judul buku yang akan dihapus: ");
        String title = scanner.nextLine();

        for (Buku book : buku) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                buku.remove(buku);
                System.out.println("Buku berhasil dihapus.");
                return;
            }
        }

        System.out.println("Buku dengan judul '" + title + "' tidak ditemukan.");
    }
}
