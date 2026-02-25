package Pertemuan5;

public class LatihanDiskon {
    public static void main(String[] args) {
        double totalBelanja = 750000.0;

        System.out.println("=== KALKULATOR DISKON ===");
        System.out.println("Total Belanja: Rp " + totalBelanja);
        double diskon = 0;
    
        if(totalBelanja >= 1000000){
            diskon = totalBelanja * 0.15;
            System.out.println("Diskon (15%): Rp " + diskon);
        } else if (totalBelanja >= 500000){
            diskon = totalBelanja * 0.10;
            System.out.println("Diskon (10%): Rp " + diskon);
        } else if (totalBelanja >= 100000){
            diskon = totalBelanja * 0.05;
            System.out.println("Diskon (5%): Rp " + diskon);
        } else {
            System.out.println("Tidak ada diskon");
        }
        System.out.println("Harga Akhir: Rp " + (totalBelanja - diskon));
        System.out.println("Anda Hemat: Rp " + diskon);
    }
}
/*
Nama: Ummu Kultsum
NIM: D1041214089
Tanggal: 25/02/2026
*/
