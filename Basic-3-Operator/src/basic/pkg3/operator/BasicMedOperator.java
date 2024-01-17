/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic.pkg3.operator;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class BasicMedOperator {
    private void equal() {
        Scanner scan = new Scanner(System.in);
        String a, b, c;

        System.out.println("Buah favorite monyet adalah?");
        System.out.print("Jawab : ");
        a = scan.nextLine();
        if ("Pisang".equals(a) || a.equals("pisang")) { // "equals" is same like '==', but its using for String
            System.out.println("Benar");
        } else {
            System.out.println("Salah");
            return;
        }

        System.out.println("\nmobil rodanya berapa?");
        System.out.print("Jawab : ");
        b = scan.nextLine();
        if ("4".equals(b) || "empat".equals(b) || "Empat".equals(b)) {
            System.out.println("Benar");
        } else {
            System.out.println("Salah");
            return;
        }
        
        System.out.println("\nMakanan favorite kelinci adalah?");
        System.out.print("Jawab : ");
        c = scan.nextLine();
        if (c.equals("Wortel") || c.equals("wortel")) {
            System.out.println("Benar");
        } else {
            System.out.println("Salah");
        }
    }
    
    private static int tambah(int a, int b) {
        return a + b;
    }
    
    private static int bagi(int a, int b) {
        return a / b;
    }
    
    private static int kurang(int a, int b) {
        return a - b;
    }
    
    private void count() {
        Scanner scan = new Scanner(System.in);
        int a, b;

        do {
            System.out.print("\nMasukkan angka ke-1 : ");
            a = scan.nextInt();

            System.out.print("Masukkan angka ke-2 (tidak boleh sama dengan angka pertama) : ");
            b = scan.nextInt();
            if (a == b) {   // Operator '==' is using for int, Double, etc.
                System.out.println("Angka kedua tidak boleh sama dengan angka pertama.");
            }
        } while (a == b);
        
        int x = bagi(a, b);
        int y = kurang(a, b);
        int z = tambah(a, b);
        System.out.println("Hasil Tambah "+ a + " + " + b +" = " + z);
        System.out.println("Hasil kurang "+ a + " - " + b +" = " + y);
        System.out.println("Hasil bagi "+ a + " / " + b + "  = " + x);
    }
    
    public static void main (String[] args) {
        BasicMedOperator obj = new BasicMedOperator();
        
        obj.equal();
        obj.count();
        
        System.exit(0);
    }
}
