package Pertemuan8;

public class LatihanMenuHarian {
    public static void main(String[] args) {
        System.out.println("=== MENU MAKAN 3 HARI ===");
        for (int hari = 1; hari <= 3 ; hari++) {
            System.out.println("Hari " + hari + ":");
            for (int waktuMakan = 1; waktuMakan <=2; waktuMakan++ ){
                if(hari == 1){
                    if (waktuMakan == 1){
                        System.out.println(" Pagi: Nasi Goreng");
                    } else {
                        System.out.println(" Siang: Soto Ayam");
                    }
                } else if (hari == 2){
                    if (waktuMakan == 1){
                        System.out.println(" Pagi: Bubur Ayam");
                    } else {
                        System.out.println(" Siang: Mie Goreng");
                    }
                } else {
                    if (waktuMakan == 1){
                        System.out.println(" Pagi: Roti Bakar");
                    } else {
                        System.out.println(" Siang: Nasi Uduk");
                    }
                }
            }
            System.out.println();
        }
    }
}
/*
Nama: Ummu Kultsum
NIM: D1041214089
Tanggal: 25/02/2026
*/
