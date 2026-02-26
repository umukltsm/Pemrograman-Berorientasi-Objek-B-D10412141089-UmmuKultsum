package Pertemuan8;

public class LatihanKombinasiLoop {
    public static void main(String[] args) {
        System.out.println("=== PENCARIAN KOORDINAT [2,3] ===");
        boolean found = false;

        for (int outer = 1; outer <= 3; outer++){
            for (int inner = 1; inner <= 5; inner++){
                System.out.println("Cek: [" + outer + "," + inner + "]");

                if (outer == 2 && inner ==3){
                System.out.println("✓ Koordinat ditemukan!");
                found = true;
                break;
                }
            }
            if(found){
                break;
            }
        }
        System.out.println("Pencarian selesai.");
    }
}
/*
Nama: Ummu Kultsum
NIM: D1041214089
Tanggal: 26/02/2026
*/
