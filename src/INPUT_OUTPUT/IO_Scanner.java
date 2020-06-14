/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INPUT_OUTPUT;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class IO_Scanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //INPUT
        Scanner inputID = new Scanner(System.in);
            System.out.println("======= FORM IDENTITAS MAHASISWA =======");
            System.out.print("Nama      : ");
            String nama = inputID.nextLine();
            
            System.out.print("NIM       : ");
            int nim = inputID.nextInt();
            
        //OUTPUT
        System.out.println("");
        System.out.println("======= IDENTITAS MAHASISWA =======");
        System.out.println("Nama      : " + nama);
        System.out.println("NIM       : " + nim);
        System.out.println("");
        System.out.println("TERIMA KASIH. INPUT DATA BERHASIL!");
    }
    
}
