/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modulus;

/**
 *
 * @author WINDOWS 11
 */
public class Main extends ModulusKalkulator{
    
    public static void main(String[] args) {
        Main main = new Main ();
        int [][] pairs = {
            {15, 2},
            {29, 5},
            {100, 7},
            {123, 10},
            {14, 3}  
        };
        
         System.out.println("Hasil penghitungan Modulus adalah:");
        for (int[] pair : pairs) {
            int a = pair[0];
            int b = pair[1];
            int result = main.modulus(a, b);
            System.out.println(a + " % " + b + " = " + result);
        }
        }
    }

