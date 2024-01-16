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
        return a + b;
    }

    private static String kata(String a, String b) {
        return a + " " + b;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scaner = new Scanner(System.in);

        int a = 9;
        int b = 15;
        int jumlah = tambah(a, b);
        // Using decalration early
        try {
            System.out.print("Masukkan angka : ");
            int c = scaner.nextInt();
            System.out.print("Masukkan lagi angka : ");
            int d = scaner.nextInt();

            int jml = tambah(c, d);
            System.out.println("Penjumlahan-2 = " + jml); // grouping
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        System.out.println("Penjumlahan-1 = " + jumlah); // decalre

        
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

        System.exit(0);
    }

}
