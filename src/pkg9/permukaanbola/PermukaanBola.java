/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9.permukaanbola;
import java.util.Scanner;
/**
 *
 * @author Intan
 */
public class PermukaanBola {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner baru
        Scanner a = new Scanner (System.in); //berguna untuk membuat scanner pada program
        //Judul
        System.out.println("MENGHITUNG LUAS PERMUKAAN LINGKARAN"); //memberi judul pada hasil output
        System.out.println("==================================="); //berguna supaya hasil output lebih rapi
        //proses
        System.out.print("Masukkan Jari-Jari Bola : "); //berguna untuk memberi perintah kepada user memasukkan jari jari
        double r = a.nextDouble(); //menerima inputan dari keyboard variabel r
        double hasil; //membuat variabel baru yaitu "hasil"
        if(r%7==0){ //digunakan khusus variabel r yang merupakan kelipatan tujuh
            hasil = (4*22*(r*r))/7; //operasi hitung dari hasil menggunakan pi = 22/7
            System.out.println("Hasil : "+hasil); //menghasilkan hasil output terakhir
        }else{ //digunakan untuk variabel r selain kelipatan tujuh
            hasil = 4*3.14*(r*r); //operasi hitung hasil menggunakan pi = 3,14
            System.out.println("Hasil : "+hasil); //menghasilkan hasil output terakhir
        }
    }
    
}
