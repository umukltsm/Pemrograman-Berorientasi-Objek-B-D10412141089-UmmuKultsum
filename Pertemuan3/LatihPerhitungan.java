public class LatihPerhitungan {
    public static void main(String[] args) {
        //Tipe data bilangan bulat
        int saldoAwal = 1000000;
        int setoran = 500000;
        int penarikan = 1500000;

        System.out.println("=== SIMULASI TRANSAKSI  BANK ===");
        System.out.println("Saldo awal             :" + saldoAwal);

        //menambahkan setoran ke saldo
        saldoAwal  += setoran;
        System.out.println("Setoran                :" + setoran);
        System.out.println("Saldo Setelah Setor    :" + saldoAwal);

        //mengurangi saldo dengan penarikan
        saldoAwal -= penarikan;
        System.out.println("Penarikan              :" + penarikan);
        System.out.println("Saldo Akhir            :" + saldoAwal);
    }
    }
/*
Nama: Ummu Kultsum
NIM: D1041241089
Tanggal: 13/02/2026
 */

