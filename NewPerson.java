/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.peson;

/**
 *
 * @Widayanti User
 */
public class NewPerson {
       /* memanggil atribut dan memberi nilai */
    public static void main(String[] args){
        // Membuat object 2 person
        Peson Person1 = new Peson();
        // Membuat objek person1
        Person1.nama = "Anton";
        Person1.jenis_kelamin = "laki-laki";
        Person1.umur = 22;
        System.out.println("Nama: " + Person1.nama);
        System.out.println("Jenis Kelamin: " + Person1.jenis_kelamin);
        System.out.println("Umur: " + Person1.umur);
        
        // Membuat objek person2
        Peson Peson2 = new Peson();
        /* memanggil atribut dan memberi nilai */
        Peson2.nama = "Riko";
        Peson2.jenis_kelamin = "laki-laki";
        Peson2.umur = 21;
        System.out.println("Nama: " + Peson2.nama);
        System.out.println("Jenis Kelamin: " + Peson2.jenis_kelamin);
        System.out.println("Umur: " + Peson2.umur);
    }
    
}
