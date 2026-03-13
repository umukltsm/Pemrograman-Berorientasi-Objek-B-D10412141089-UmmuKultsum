package Pertemuan11;

class PersegiPanjang{
    int panjang;
    int lebar;
    int luas;
    int keliling;

    public PersegiPanjang(int sisi){
        this.panjang = sisi;
        this.lebar = sisi;
        this.luas = panjang * lebar;
        this.keliling = 2 * (panjang + lebar);
    }
    public PersegiPanjang(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
        this.luas = panjang * lebar;
        this.keliling = 2 * (panjang + lebar);
    }
    public void tampilkanInfo(){
        System.out.println("=== PERSEGI ===");
        System.out.println("Panjang : " + panjang + " cm");
        System.out.println("Lebar   : " + lebar + " cm");
        System.out.println("Luas    : " + luas + " cm²");
        System.out.println("Keliling: " + keliling + " cm");
        System.out.println();
    }
}

public class LatihanPersegiOverloading {
    public static void main(String[] args) {
        PersegiPanjang pj1 = new PersegiPanjang(5);
        pj1.tampilkanInfo();

        PersegiPanjang pj2 = new PersegiPanjang(8, 4);
        pj2.tampilkanInfo();
    }
}
/*
Nama: Ummu Kultsum
NIM: D1041214089
Tanggal: 13/03/2026
*/
