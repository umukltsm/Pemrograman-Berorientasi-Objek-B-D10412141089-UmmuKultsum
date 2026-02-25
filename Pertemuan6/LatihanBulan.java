public class LatihanBulan {
    public static void main(String[] args) {
        int month = 5;
        String monthName;
        System.out.println("=== KONVERSI BULAN ===");
        System.out.println("Angka Bulan: " + month);

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
                monthName = "Error! Angka bulan tidak valid (1-12)";
                break;
        }
        System.out.println("Nama Bulan: " + monthName);
    }
}
/*
Nama: Ummu Kultsum
NIM: D1041214089
Tanggal: 25/02/2026
*/
