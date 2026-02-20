package Pertemuan9;
class Mobil{
    String merk;
    String warna;
    int tahun;
    int kecepatan;

    public void percepat(){
        System.out.println("Kecepatan: " + kecepatan);
    }
    public void tampilkanInfo(){
        System.out.println("Merk     : " + merk);
        System.out.println("Warna    : " + warna);
        System.out.println("Tahun    : " + tahun);
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
    }
}
public class ObjekDanClass {
    public static void main(String[] args) {
        Mobil obj = new Mobil();
        obj.merk = "BMW";
        obj.warna = "Hitam";
        obj.tahun = 2025;
        obj.kecepatan = 1000;
        
        System.out.println("Informasi Mobil");
        obj.tampilkanInfo();
    }   
}
/*
Nama: Ummu Kultsum
NIM: D1041241089
Tanggal: 20/02/2026
*/