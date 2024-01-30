/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basic.pkg11.arrays;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Basic11Arrays {

    private void Arr1x1f0() {
        Scanner scan = new Scanner(System.in);
        int b;
        System.out.print("Masukkan panjang array : ");
        b = scan.nextInt();

        int[] a = new int[b];

        for (int i = 0; i < b; i++) {   // Using "<" not "<=" because the array started from indeks 0
            System.out.print("Masukkan isi array ke - " + i + " : ");
            a[i] = scan.nextInt();

            System.out.println("Indeks ke " + i + " = " + a[i]);
        }
        
        System.out.println("\n\nIsi Array : ");
        for (int i = 0; i < b; i++) {
            System.out.println("Indeks ke " + i + " = " + a[i]);
        }
    }
    
    private void Arr1x1f1() {
        Scanner scan = new Scanner(System.in);
        int a;
        System.out.println("\n\n===== Start Indeks 1 =====");
        System.out.print("Masukkan panjang Array : ");
        a = scan.nextInt();
        
        int [] b = new int [a + 1];
        for (int i = 1; i <= a; i++) {
            System.out.print("Masukkan isi Array ke - " + i + " : ");
            b[i] = scan.nextInt();
        }
        
        for (int i = 1; i <= a; i++) {
            System.out.println("Isi Array ke " + i + " : " + b[i]);
        }
    }
    
    private void Arr1x2() {
        
    }
    
    public static void main(String[] args) {
        Basic11Arrays obj = new Basic11Arrays();
        obj.Arr1x1f0();
        obj.Arr1x1f1();
    }
    
}
