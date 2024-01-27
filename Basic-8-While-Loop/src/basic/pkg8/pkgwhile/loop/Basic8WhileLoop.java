/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basic.pkg8.pkgwhile.loop;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Basic8WhileLoop {

    /**
     * @param args the command line arguments
     */
    private void wloop() {
        Scanner scan = new Scanner(System.in);
        int b,z;
        String c,e;
        boolean a = true;
        while (a) {
            System.out.println("1. Pertanyaan");
            System.out.println("2. Exit");
            System.out.print("Pilih : ");
            b = scan.nextInt();
            
            scan.nextLine();
            
            if (b == 1) {
                System.out.println("Makanan kesukaan monyet adalah ?");
                c = scan.nextLine();
                if ("pisang".equalsIgnoreCase(c) && "Pisang".equalsIgnoreCase(c)) {
                    System.out.println("Jawaban anda benar");
                    if (true) {
                        System.out.println("Ingin melanjutkan ke soal berikutnya ? ");
                        System.out.println("1. Ya");
                        System.out.println("2. Tidak");
                        z = scan.nextInt();
                        
                        scan.nextLine();
                        
                        if (z == 1) {
                            System.out.println("Berapa hasil dari 4 + 4 ? ");
                            e = scan.nextLine();
                            if ("8".equals(e) && "delapan".equalsIgnoreCase(e) && "Delapan".equalsIgnoreCase(e)) {
                                System.out.println("Jawaban anda benar");
                            } else {
                                System.out.println("Jawaban anda salah");
                            }
                        }
                        
                    }
                } else {
                    System.out.println("Jawabn anda salah");
                }
            } else if (b == 2) {
                System.out.println("Terima kasih");
                a = false;
                System.exit(0);
            } else {
                System.out.println("Pilihan tidak valid, masukkan pilihan yang valid");
            }
        }
    }

    public static void main(String[] args) {
        Basic8WhileLoop obj = new Basic8WhileLoop();
        obj.wloop();
    }

}
