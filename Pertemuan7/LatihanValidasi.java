package Pertemuan7;

public class LatihanValidasi {
    public static void main(String[] args) {
        int percobaan = 1;
        int nilai = -10;

        System.out.println("=== VALIDASI NILAI UJIAN ===");
        System.out.println();
        
        do { 
            System.out.println("Percobaan Input: " + nilai);
            if (nilai < 0 || nilai > 100){
                System.out.println("Error: Nilai harus antara 0-100!");
                System.out.println();
            } else{
                System.out.println("✓ Nilai valid: " + nilai);
                System.out.println();
                break;
            }
            if(percobaan == 1){
                nilai = 150;
            } else if (percobaan == 2){
                nilai = 85;
            }
            percobaan++;
        } while (percobaan <=3);
    }
}
/*
Nama: Ummu Kultsum
NIM: D1041214089
Tanggal: 25/02/2026
*/
