/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UTS_no_2;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author ACER i7
 */
public class MainPerpustakaan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Perpustakaan perpustakaan = new Perpustakaan();

        // Buat admin dan user
        Admin admin = new Admin("Admin1", "Admin123");
        User user = new User("User","User123");

        // Pilihan login
        System.out.println("Selamat datang di Perpustakaan");
        System.out.println("1. Login sebagai Admin");
        System.out.println("2. Login sebagai User");
        System.out.print("Pilih: ");
        int pilih = scanner.nextInt();

        if (pilih == 1) {
            // Admin login
            if (admin.login()) {
                admin.menu(perpustakaan);
            } else {
                System.out.println("Login gagal. Cek kembali username dan password.");
            }
        } else if (pilih == 2) {
            // User login
            if (user.login()) {
                user.menu(perpustakaan);
            } else {
                System.out.println("Login gagal. Cek kembali username dan password.");
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }
    
}
