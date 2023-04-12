package Latihan;

import java.util.HashMap;
import java.util.Scanner;

public class Mahasiswa {
    String Nama, Kelas, MatkulPraktikum;
    int Nim;

    public Mahasiswa(String nama, String kelas, String matkulPraktikum, int nim) {
        Nama = nama;
        Kelas = kelas;
        MatkulPraktikum = matkulPraktikum;
        Nim = nim;
    }

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        HashMap<String, Mahasiswa> Mhs = new HashMap<>();
        String In;
        Mahasiswa Data;

        Mhs.put("1", new Mahasiswa("Ghafur", "3C", "Struktur Data", 2021109));
        Mhs.put("2", new Mahasiswa("Dhafa", "3C", "Basis Data", 2021100));
        Mhs.put("3", new Mahasiswa("Akmal", "3C","Sistem Operasi", 2021135));

        System.out.print("Masukkan ID: ");
        In = Input.next();
        Data = Mhs.get(In);
        if (Data != null){
            System.out.println("\nData Mahasiswa\nNama\t\t\t\t\t: " + Data.Nama + "\nKelas\t\t\t\t\t: "+Data.Kelas+ "\nMata Kuliah Praktikum\t: "+ Data.MatkulPraktikum +
                    "\nNim\t\t\t\t\t\t: " + Data.Nim);

        }
    }
}
