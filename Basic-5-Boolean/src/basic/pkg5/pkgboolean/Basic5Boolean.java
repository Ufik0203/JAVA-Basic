/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basic.pkg5.pkgboolean;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Basic5Boolean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("====== Decalre ======");
        int x = 10;
        int y = 5;
        System.out.println(x > 5);  // Return true, because 10 is higher then 5
        System.out.println(x > y);  // Return true, beacuse x is higher then y

        int a = 0, b = 0;
        boolean c = true;
        
        System.out.println("/n/n===== User input ======");
        while (c) { // while c, it mean while user do the coreect input (true), it will be loop
            System.out.println("1 . Inputkan angka ke-1");
            System.out.println("2 . Inputkan angka ke-2");
            System.out.println("3 . Exit");
            System.out.println("Pilih");
            int z = scan.nextInt();

            switch (z) {
                case 1:
                    System.out.print("Masukkan inputkan ke-1 : ");
                    a = scan.nextInt();
                    break;
                case 2:
                    System.out.print("Masukkan inputkan ke-2 : ");
                    b = scan.nextInt();
                    if (a > b) {
                        System.out.println(a + " Lebih besar dari " + b);
                    }
                    
                    if (a < b) {
                        System.out.println(a + " Lebih kecil dari " + b);
                    }
                    break;
                case 3:
                    System.out.println("\nTerima kasih");
                    c = false;
                    break;
                default:
                    System.out.print("Masukkan pilihan yang valid dengan angka yang sesuai");
                    break;
            }
        }
        
        System.exit(0);
    }

}
