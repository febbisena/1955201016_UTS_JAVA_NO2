/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INPUT_OUTPUT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author USER
 */
public class IO_BufferedReader {
    public static void main(String[] args) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String nama = null, univ = null, prodi = null;
        System.out.println("===== INPUT DATA MAHASISWA =====");

        try {
            System.out.print("Nama          : ");
            nama = input.readLine();
            System.out.print("Universitas   : ");
            univ = input.readLine();
            System.out.print("Prodi         : ");
            prodi = input.readLine();
        } catch (IOException e) {
            System.out.println("Gagal" + e);
        }

        System.out.println("");
        System.out.println("===== DATA MAHASISWA =====");
        System.out.println("Nama        : " + nama);
        System.out.println("Universitas : " + univ);
        System.out.println("Prodi       : " + prodi);
    }
}
