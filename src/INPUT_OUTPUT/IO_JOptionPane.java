/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INPUT_OUTPUT;

import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class IO_JOptionPane {
    public static void main(String[] args) {
    //INPUT
        String nama = JOptionPane.showInputDialog("Masukkan Nama Anda               : ");
        int thnLahir =
                Integer.parseInt(JOptionPane.showInputDialog("Masukkan Tahun Lahir Anda : "));
        int thnKini =
                Integer.parseInt(JOptionPane.showInputDialog("Masukkan Tahun Sekarang   : "));
        int usia = thnKini - thnLahir;
    //OUTPUT
        System.out.println("");
        System.out.println("Nama Anda       : " + nama);
        System.out.println("Tahun Lahir     : " + thnLahir);
        System.out.println("Tahun Sekarang  : " + thnKini);
        System.out.println("Usia Anda       : " + usia);
    }
}
