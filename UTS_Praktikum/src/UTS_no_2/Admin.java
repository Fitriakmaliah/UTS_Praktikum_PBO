/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_no_2;
import java.util.Scanner;
/**
 *
 * @author ACER i7
 */
public class Admin extends Pengguna {
    public Admin(String username, String password) {
        super(username, password);
    }
    public void menu(Perpustakaan perpustakaan) {
        Scanner scanner = new Scanner(System.in);

        int pilih;
        do {
            System.out.println("\nMenu Admin:");
            System.out.println("1. Tambah buku");
            System.out.println("2. Lihat daftar buku");
            System.out.println("3. Hapus buku");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = scanner.nextInt();
            
            switch (pilih) {
                case 1:
                    perpustakaan.addBook();
                    break;
                case 2:
                    perpustakaan.displayBooks();
                    break;
                case 3:
                    perpustakaan.deleteBook();
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan sistem perpustakaan.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilih != 0);
    }
}
