/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basic.pkg7.pkgswitch.pkgcase;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Basic7SwitchCase {

    /**
     * @param args the command line arguments
     */
    
    private void cased() {
        Scanner scan = new Scanner(System.in);
        int a;
        System.out.println("Daftar hari : ");
        System.out.println("1. Hari Senin");
        System.out.println("2. Hari Selasa");
        System.out.println("3. Hari Rabu");
        System.out.print("Masukkan pilihan : ");
        a = scan.nextInt();
        
        switch(a) {
            case 1:
                System.out.println("Hari senin, sekarang");
                break;
            case 2:
                System.out.println("Hari Selasa, sekarang");
                break;
            case 3:
                System.out.println("Hari Rabu, sekarang");
                break;
            default:
                System.out.println("Hari tidak terdaftar");
        }
        
    }
    
    private void casedwhile() {
        Scanner scan = new Scanner(System.in);
        int a;
        System.out.print("Masukkan panjang array : ");
        a = scan.nextInt();
        int[] b = new int[a +1];
        
        for (int i = 1; i <= a; i++) {
            System.out.print("Masukkan nilai array ke " + i + " : ");
            b[i] = scan.nextInt();
        }
        
        System.out.println("Isi Array : ");
        for (int i =1; i <=  a; i++) {
            System.out.println("Index ke "+ i + " = " + b[i]);
        }
    }
    
    public static void main(String[] args) {
        Basic7SwitchCase obj = new Basic7SwitchCase();
        obj.cased();
        
        System.out.println("\n\n====== with Array ======");
        obj.casedwhile();
    }
    
}
