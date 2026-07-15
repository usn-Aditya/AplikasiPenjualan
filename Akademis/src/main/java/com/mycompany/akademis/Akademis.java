/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.akademis;

/**
 *
 * @author ASUS
 */
import Akademis.MataKuliah;
public class Akademis {


    public static void main(String[] args) {

        Mahasiswa mhs = new Mahasiswa(
                "2410010191",
                "Aditya",
                3.85,
                4
        );

        MataKuliah mk = new MataKuliah(
                "IF101",
                "Pemrograman Java"
        );

        System.out.println("=== DATA MAHASISWA ===");
        mhs.tampilData();

        System.out.println();

        System.out.println("=== DATA MATA KULIAH ===");
        mk.tampilData();
    }
}