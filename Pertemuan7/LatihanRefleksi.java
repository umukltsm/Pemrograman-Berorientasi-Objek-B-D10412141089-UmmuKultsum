package Pertemuan7;

public class LatihanRefleksi {
    public static void main(String[] args) {
        //menggunakan while
        System.out.println("=== MENGGUNAKAN WHILE ==="); 
        int counter = 1;

        while (counter <= 5) {
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println("\n");

        //menggunakan do-while
        System.out.println("=== MENGGUNAKAN DO-WHILE ===");
        int counter2 = 1;
        do {
            System.out.print(counter2 + " ");
            counter2++;
        } while (counter2 <= 5);
        System.out.println("\n");

        //menggunakan for
        System.out.println("=== MENGGUNAKAN FOR ===");
        
        for(int i=1; i<=5; i++){
            System.out.print(i + " ");
        }
    }
}
/*
Dari ketiga jenis loop, loop for menurut saya paling mudah dipahami untuk kasus menampilkan angka 1-5 ini. Karena pada loop for, semua bagian perulangan (inisialisasi, kondisi, dan increment) ditulis dalam satu struktur. Dengan demikian, kita dapat langsung melihat dari nilai awal hingga nilai akhir perulangan, sehingga kode lebih ringkas dan mudah dibaca dibandingkan dengan while apa lagi do-while.

Nama: Ummu Kultsum
NIM: D1041214089
Tanggal: 25/02/2026
*/
