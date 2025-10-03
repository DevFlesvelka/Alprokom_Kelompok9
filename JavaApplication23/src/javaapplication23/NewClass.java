
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication23;

/**
 *
 * @author ASUS
 */
import javax.swing.JOptionPane;
public class NewClass {
    public static void main(String[] args) {
            String nama = JOptionPane.showInputDialog("Masukkan nama Anda:");
            String umur1= JOptionPane.showInputDialog("Umur anda jika ditambah 40");
            String umur2 = JOptionPane.showInputDialog("Umur anda jika dikurangi 10");
            int x = Integer.parseInt(umur1) - 40 ;
            JOptionPane.showMessageDialog(null,"Hallo " + nama + " umurmu adalah " + x);
    }
}
