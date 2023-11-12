/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UTS_no_1;
import java.util.Scanner;

/**
 *
 * @author ACER i7
 */
public class MainHewan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Jenis Hewan (Kucing/Anjing): ");
        String JenisHewan = scanner.nextLine();
        
        Hewan hewan;
        
        if ("Kucing".equalsIgnoreCase(JenisHewan)) {
            hewan = new Kucing();
        } else if ("Anjing".equalsIgnoreCase(JenisHewan)) {
            hewan = new Anjing();
        } else {
            System.out.println("!! JENIS HEWAN TIDAK VALID !!");
            return;
    }
        
    System.out.println("Suara hewan : ");
    hewan.bersuara();
    
    if (hewan.isMamalia()) {
        System.out.println("- Jenis Hewan Ini Adalah Mamalia -");
    } else {
        System.out.println("- Jenis Hewan Ini Bukan Mamalia -");
        }
    }
}
        