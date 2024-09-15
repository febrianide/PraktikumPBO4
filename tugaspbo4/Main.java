/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugaspbo4;

/**
 *
 * @author Lenovo
 */
public class Main {

    public static void main(String[] args) {
       Pekerja saya = new Pekerja("Febriani", 25, "Direktur", 30000000);
        
       System.out.println(saya.toString());
        
       saya.setNama("Alviah");
        
       System.out.println("\nData Pekerja Setelah Perubahan");
       System.out.println(saya.toString());  
    }
}
