
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication23;

/**
 *
 * @author ASUS
 */
public class Casting{
    public static void main (String[] args){
        int x = 10;
        double y = x; // widening casting
        System.out.println("nilai x:" + x);
        System.out.println("nilai y:" + y);
        System.out.println();
        
        double z = 20.7;
        int w = (int) z; //Narrowing Casting
        System.out.println("Nilai z:"+ z);
        System.out.println("Nilai w:" + w);
        System.out.println();
    }
}
