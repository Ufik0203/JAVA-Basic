/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basic.pkg6.pkgif.pkgelse;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Basic6IFElse {

    /**
     * @param args the command line arguments
     */
    
    private void cek() {
        Scanner scan = new Scanner(System.in);
        int a,b;
        b = 18;
        
        System.out.print("Masukkan umur : ");
        a = scan.nextInt();
        
        if (a > b) {
            System.out.println("Anda di izinkan untuk membuat SIM");
        } else if (a < b) {
            System.out.println("Maaf umur anda belum cukup untuk membuat SIM dan tidak boleh berkendara");
        } else {
            System.out.println("Anda di izinkan untuk membuat SIM");
        }
    }
    
    
    public static void main(String[] args) {
        Basic6IFElse obj = new Basic6IFElse();
        Scanner scan = new Scanner(System.in);
        int a,b;
        
        System.out.println("===== Declare on main =====");
        System.out.print("Masukkan angka ke-1 : ");
        a = scan.nextInt();
        
        System.out.print("Masukkan angka ke-2 : ");
        b = scan.nextInt();
        
        if (a > b) {
            System.out.println( a + " Lebih besar dari " + b);
        } else if (a < b) {
            System.out.println( a + " Lebih kecil dari " + b);
        } else {
            System.out.println( a + " dan " + b +" adalah angka yang sama");
        }
        
        System.out.println("\n\n===== OOP =====");
        obj.cek();
    }
}
