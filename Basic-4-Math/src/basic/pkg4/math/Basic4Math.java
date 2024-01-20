/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basic.pkg4.math;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Basic4Math {

    /**
     * @param args the command line arguments
     */
    private void undec() {
        Scanner scan = new Scanner(System.in);
        double a, b;
        System.out.print("Masukkan angka ke-1 : ");
        a = scan.nextDouble();

        System.out.print("Masukkan angka ke-2 : ");
        b = scan.nextDouble();

        double z = (Math.max(a, b));
        System.out.println("Nilai tertinggi = " + z);
    }

    private void matharray() {
        Scanner scan = new Scanner(System.in);
        int a;
        System.out.print("Masukkan panjang array : ");
        a = scan.nextInt();

        int[] b = new int[a + 1];
        for (int i = 1; i <= a; i++) {
            System.out.print("Masukkan angka ke-" + i + " : ");
            b[i] = scan.nextInt();
        }

        System.out.println("\nIsi Array : ");
        for (int i = 1; i <= a; i++) {
            System.out.println("Index ke-" + i + " : " + b[i]);
        }

        int max = b[1];
        for (int i = 2; i <= a; i++) {
            if (b[i] > max) {
                max = b[i];
            }
        }
        System.out.print("\n\nNilai tertinggi = " + max + "\n\n");
    }

    private static int pangkat(int a) {
        return (int) (Math.sqrt(a));
    }

    private void kuadrat() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan panjang array : ");
        int a = scan.nextInt();
        int[] b = new int[a + 1];

        for (int i = 1; i <= a; i++) {
            System.out.print("Masukkan nilai ke-" + i + " : ");
            b[i] = scan.nextInt();
        }

        System.out.println("\nIsi Array : ");
        for (int i = 1; i <= a; i++) {
            System.out.println("Index ke-" + i + " : " + b[i]);
        }

        int sqre = b[1];
        for (int i = 1; i <= a; i++) {
            sqre = pangkat(b[i]);
            System.out.println("Hasil : " + sqre);
        }
    }

    public static void main(String[] args) {
        Basic4Math obj = new Basic4Math();
        Scanner scan = new Scanner(System.in);
        boolean i = true;

        System.out.println("===== Declare =====");
        System.out.println(Math.max(10, 20));   // use to find highest value
        System.out.println(Math.min(10, 20));   // use to find lowest value
        System.out.println(Math.sqrt(49));      // use to find the square (return value of the square)
        System.out.println(Math.abs(-5.5));     // use to change negative value to positif value
        System.out.println(Math.random());      // return random number

        int randomNum = (int) (Math.random() * 100); // will random 0 to 100
        System.out.println(randomNum);

        System.out.println("\n\n===== Nilai tertinggi ======");
        obj.undec();

        System.out.println("\n\n===== Comb Array =====");
        obj.matharray();

        System.out.println("\n\n====== Mencari hasil Kuadrat ======");
        System.out.print("Inputkan angka : ");
        int a = scan.nextInt();
        int z = pangkat(a);
        System.out.print(a + " nilai kuadrat dari : " + z + "\n\n");

        System.out.println("\n\n====== Comb Array ======");
        obj.kuadrat();

    }
}
