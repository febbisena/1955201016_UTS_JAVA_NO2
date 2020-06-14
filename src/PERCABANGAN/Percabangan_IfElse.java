/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERCABANGAN;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Percabangan_IfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Berapa Usia Anda? ");
            int usia = input.nextInt();
            
        System.out.println("");
        if(usia < 17){
            System.out.println("Maaf, Anda Masih di Bawah Umur");
        }
        else {
            System.out.println("Umur Anda Sudah Memenuhi Syarat");
        }
    }
}
