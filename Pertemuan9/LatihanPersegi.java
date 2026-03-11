package Pertemuan9;

class Persegi{
    int sisi;
    int luas;
    int keliling;

    public void hitungLuas(){
        luas = sisi * sisi;
    }
    public void hitungKeliling(){
        keliling = 4 * sisi;
    }
    public void tampilkanHasil(){
        System.out.println("=== PERSEGI ===");
        System.out.println("Sisi    : " + sisi + " cm");
        System.out.println("Luas    : " + luas + " cm²");
        System.out.println("Keliling: " + keliling + " cm");
    }
}
public class LatihanPersegi {
    public static void main(String[] args) {
        Persegi prsg = new Persegi();
        prsg.sisi = 5;
        prsg.hitungLuas();
        prsg.hitungKeliling();
        prsg.tampilkanHasil();
    }
}
/*
Nama: Ummu Kultsum
NIM: D1041214089
Tanggal: 11/03/2026
*/