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
public abstract class Pengguna {
    private String username;
    private String password;

    public Pengguna(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Username: ");
        String inputUsername = scanner.next();
        System.out.print("Password: ");
        String inputPassword = scanner.next();

        return inputUsername.equals(username) && inputPassword.equals(password);
    }
}
