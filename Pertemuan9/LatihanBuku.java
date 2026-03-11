package Pertemuan9;

class Buku{
    String judul;
    String pengarang;
    int harga;

    public void tampilkanInfo(){
        System.out.println("=== INFORMASI BUKU ===");
        System.out.println("Judul    : " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Harga    : Rp " + harga);
        System.out.println();
    }
}
public class LatihanBuku {
    public static void main(String[] args) {
        Buku bk1 = new Buku();
        bk1.judul = "Pemrograman Java";
        bk1.pengarang = "Budi Raharjo";
        bk1.harga = 125000;

        Buku bk2 = new Buku();
        bk2.judul = "Algoritma dan Struktur Data";
        bk2.pengarang = "Rinaldi Munir";
        bk2.harga = 150000;

        bk1.tampilkanInfo();
        System.out.println();
        bk2.tampilkanInfo();
    }
}
/*
Nama: Ummu Kultsum
NIM: D1041214089
Tanggal: 11/03/2026
*/
