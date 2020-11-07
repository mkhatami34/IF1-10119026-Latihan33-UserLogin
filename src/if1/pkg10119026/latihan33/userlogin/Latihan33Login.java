/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119026.latihan33.userlogin;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Latihan33Login {
    private static String userName;
    private static String password;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Username = ");
        userName = scan.next();
        System.out.print("Masukkan Password = ");
        password = scan.next();
        User login = new User();
        login.pengecekanLogin(userName, password);
    }
    
}
