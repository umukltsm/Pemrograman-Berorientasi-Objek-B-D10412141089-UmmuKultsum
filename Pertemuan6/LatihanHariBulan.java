public class LatihanHariBulan {
    public static void main(String[] args) {
        int month = 4;
        int jumlahHari;
        String monthName;
        System.out.println("=== JUMLAH HARI DALAM BULAN ===");
        
        switch (month) {
            case 1:
                monthName = "Januari";
                break;
            case 2:
                monthName = "Februari";
                break;
            case 3:
                monthName = "Maret";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "Mei";
                break;
            case 6:
                monthName = "Juni";
                break;
            case 7:
                monthName = "Juli";
                break;
            case 8:
                monthName = "Agustus";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "Oktober";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "Desember";
                break;
            default:
                monthName = ("Error! Angka bulan tidak valid (1-12)");
                break;
        }
        System.out.println("Bulan: " + monthName + " (bulan ke-" + month + ")");
        
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                jumlahHari = 31;
                System.out.println("Jumlah hari: " + jumlahHari);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                jumlahHari = 30;
                System.out.println("Jumlah hari: " + jumlahHari);
                break;
            case 2:
                jumlahHari = 28;
                System.out.println("Jumlah hari: " + jumlahHari);
                break;
            default:
                System.out.println("Error! Angka bulan tidak valid (1-12)");
                break;
        }
    
    }
}
/*
Nama: Ummu Kultsum
NIM: D1041214089
Tanggal: 25/02/2026
*/
