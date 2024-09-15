/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspbo4;

/**
 *
 * @author Lenovo
 */
public class Pekerja extends Manusia {
    private int gaji;

    public Pekerja(String nama, int usia, String pekerjaan, int gaji) {
        super(nama, usia, pekerjaan);
        this.gaji = gaji;
    }
    public int getGaji(){
        return gaji;
    }
    public void getGaji(int gaji){
        this.gaji = gaji;
    }
    @Override
    public String toString(){
        return "Identitas Pekerja Nama Pekerja :" + getNama() +
                "\nUsia :" + usia + "\npekerjaan" + pekerjaan +
                "\nGaji :" + gaji;
    }   

    void SetNama(String alviah) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
