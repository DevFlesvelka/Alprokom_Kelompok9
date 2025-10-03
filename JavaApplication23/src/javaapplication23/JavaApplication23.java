/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication23;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class JavaApplication23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try(Scanner input = new Scanner (System.in)){
            
            System.out.print("Masukkan nama: ");
            String nama = input.nextLine();
            System.out.print("Masukkan NRP: ");
            Long NRP = input.nextLong();
            input.nextLine();
            System.out.print("masukkan Jurusan: ");
            String Jurusan = input.nextLine();
            double Departemens = (double) NRP / 1000000;
            int Departemen = (int) Departemens / 1;
            Long duadigit = (NRP/10000) % 100;
            Long tahun = 2000 + duadigit;
            System.out.println("DATA MAHASISWA");
            System.out.println("Nama: " + nama);
            System.out.println("NRP: " + NRP);
            System.out.println("Jurusan: " + Jurusan);
            System.out.println("Kode Departemen: " + Departemen + "HAha");
            System.out.println("Tahun Masuk: " + tahun);
       }
    
    }
}