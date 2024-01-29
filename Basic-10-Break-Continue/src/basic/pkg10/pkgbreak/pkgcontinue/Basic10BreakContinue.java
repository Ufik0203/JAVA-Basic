/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basic.pkg10.pkgbreak.pkgcontinue;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Basic10BreakContinue {

    /**
     * @param args the command line arguments
     */
    
    private void cont() {
        System.out.println("\n===== Continue =====");
        Scanner scan = new Scanner(System.in);
        int a,b,c;
        
        System.out.print("Masukkan agnka awal : ");
        a = scan.nextInt();
        
        System.out.print("Masukkan angka akhir : ");
        b = scan.nextInt();
        
        for (int i = a; i <= b; i++) {
            System.out.print(i + " ");
        }
        
        System.out.print("\nMasukkan angka yang ingin di hilangkan dari deret di atas : ");
        c = scan.nextInt();
        
        for (int i = a; i <= b; i++) {
            if (i == c) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
    
    private void brks() {
        System.out.println("\n===== Break =====");
        Scanner scan = new Scanner(System.in);
        int a,b,c;
        
        System.out.print("Masukkan agnka awal : ");
        a = scan.nextInt();
        
        System.out.print("Masukkan angka akhir : ");
        b = scan.nextInt();
        
        for (int i = a; i <= b; i++) {
            System.out.print(i + " ");
        }
        
        System.out.print("\nIngin berhenti di angka mana ? : ");
        c = scan.nextInt();
        
        for (int i = a; i <= b; i++) {
            if (i == c + 1) {
                break;
            }
            System.out.print(i + " ");
        }
        
    }
    
    public static void main(String[] args) {
        Basic10BreakContinue obj = new Basic10BreakContinue();
        obj.cont();
        obj.brks();
    }
    
}
