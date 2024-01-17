/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basic.pkg3.operator;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Basic3Operator {

    /**
     * @param args the command line arguments
     */
    private static int tambah(int a, int b) {
        return a + b;   // Symbol named is "Addition"
    }

    private static String kata(String a, String b) {
        return a + " " + b;
    }

    private void pembagian() {
        Scanner scan = new Scanner(System.in);
        double a, b;
        System.out.print("Masukkan angka yang ke-1 : ");
        a = scan.nextDouble();
        System.out.print("Masukkan angka yang ke-2 : ");
        b = scan.nextDouble();

        double z = a / b;   // Symbol names is"Division"
        System.out.println("hasil : " + z);
    }
    
    private void pengurangan() {
        Scanner scan = new Scanner(System.in);
        double a, b;
        System.out.print("Masukkan angka yang ke-1 : ");
        a = scan.nextDouble();
        System.out.print("Masukkan angka yang ke-2 : ");
        b = scan.nextDouble();
        
        double z = a - b;   // Symbol named is "Subtraction"
        System.out.println("hasil : " + z);
    }
    
    private void presentase() {
        Scanner scan = new Scanner(System.in);
        double a;
        System.out.print("Masukkan angka : ");
        a = scan.nextDouble();

        double z = a / 100;   // symbol named is "Modulus"
        System.out.println("hasil : " + z);
    }
    
    private void perkalian() {
        Scanner scan = new Scanner(System.in);
        double a, b;
        System.out.print("Masukkan angka yang ke-1 : ");
        a = scan.nextDouble();
        System.out.print("Masukkan angka yang ke-2 : ");
        b = scan.nextDouble();

        double z = a * b;   // symbol named is "Multiplication"
        System.out.println("hasil : " + z);
    }
    
    private void ascending() {
        Scanner scan = new Scanner(System.in);
        int a, b;
        System.out.print("Masukkan angka yang ke-1 : ");
        a = scan.nextInt();
        System.out.print("Masukkan angka yang ke-2 : ");
        b = scan.nextInt();
        
        if (a < b) {
            System.out.println("Berhitung maju : ");
            
            for (int i = a; i<=b; i++){ // Symbol names is "Increment"
                System.out.print(i + ", ");
            }
        } else {
            System.out.println("Angka yang ke-1 harus lebih kecil dari angka yang ke-2");
        }
    }
    
    private void descending() {
        Scanner scan = new Scanner(System.in);
        int a, b;
        System.out.print("Masukkan angka yang ke-1 : ");
        a = scan.nextInt();
        System.out.print("Masukkan angka yang ke-2 : ");
        b = scan.nextInt();
        
        if (a > b) {
            System.out.println("Berhitung mundur : ");
            
            for (int i = a; i>=b; i--) { // Symbol named is "Decrement"
                System.out.println(a + ", ");
            }
        } else {
            System.out.println("Angka yang ke-1 harus lebih besar dari angka yang ke-2");
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Basic3Operator obj = new Basic3Operator();
        Scanner scaner = new Scanner(System.in);

        int a = 9;
        int b = 15;
        int jumlah = tambah(a, b);
        // Using decalration early
        
        System.out.println("===== Penjumlahan =====");
        try {
            System.out.print("Masukkan angka ke-1 : ");
            int c = scaner.nextInt();
            System.out.print("Masukkan angka ke-2 : ");
            int d = scaner.nextInt();

            int jml = tambah(c, d);
            System.out.println("Penjumlahan 2 (Input User) = " + jml); // grouping
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        System.out.println("Penjumlahan 1 (Declare system) = " + jumlah); // decalre

        scaner.nextLine();
        String word1 = "Ayo bermain";
        String word2 = "sepak bola";
        // String in declare early
        System.out.print("\n\nMasukkan kata ke-1 : ");
        String words = scaner.nextLine();
        System.out.print("Masukkan kata ke-2 : ");
        String wordss = scaner.nextLine();

        String plus = kata(words, wordss);
        System.out.println(plus);

        System.out.println(word1 + " " + word2);
        
        System.out.println("\n\n===== Pengurangan =====");
        obj.pengurangan();

        System.out.println("\n\n===== Pembagian =====");
        obj.pembagian();
        
        System.out.println("\n\n===== Presentase =====");
        obj.presentase();
        
        System.out.println("\n\n===== Perkalian ======");
        obj.perkalian();
        
        System.out.println("\n\n===== Berhitung ascending =====");
        obj.ascending();
        
        System.out.println("\n\n===== Berhitung Descending ======");
        obj.descending();
        
        System.exit(0);
    }

}
