/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basic.pkg9.pkgfor.loop;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Basic9ForLoop {

    /**
     * @param args the command line arguments
     */
    
    private void forlp() {
        Scanner scan = new Scanner(System.in);
        int a,b;
        
        System.out.println("====== Baris Angka =====");
        System.out.print("Masukkan angka ke awal : ");
        a = scan.nextInt();
        
        System.out.print("Masukkan angka terakhir : ");
        b = scan.nextInt();
        
        System.out.print("\nDeret angka : ");
        for (int i = a; i <= b; i++) {
            System.out.print( i + ", ");
        }
    }
    
    public static void main(String[] args) {
        Basic9ForLoop obj = new Basic9ForLoop();
        
        obj.forlp();
    }
    
}
