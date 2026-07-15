/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Akademis;

/**
 *
 * @author ASUS
 */
public class MataKuliah {
    String kodeMk;
    String namaMk;

    public MataKuliah(String kodeMk, String namaMk) {
        this.kodeMk = kodeMk;
        this.namaMk = namaMk;
    }

    public void tampilData() {
        System.out.println("Kode MK : " + kodeMk);
        System.out.println("Nama MK : " + namaMk);
    }
} 
