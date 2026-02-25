public class LatihanRestoran {
    public static void main(String[] args) {
        int menuCode = 1;
        int quantity = 2;
        int price;
        String menuName;
        System.out.println("=== MENU RESTORAN ===");
        System.out.println("Kode menu: " + menuCode);
        System.out.println("Jumlah: " + quantity);
        System.out.println();
        System.out.println("Pesanan Anda:");
        
        switch (menuCode) {
            case 1:
                menuName = "Nasi Goreng";
                price = 15000;
                break;
            case 2:
                menuName = "Mie Ayam";
                price = 12000;
                break;
            case 3:
                menuName = "Bakso";
                price = 10000;
                break;
            case 4:
                menuName = "Soto Ayam";
                price = 13000;
                break;
            case 5:
                menuName = "Es Teh";
                price = 3000;
                break;
            default:
                throw new AssertionError();
        }
        System.out.println("Nama Menu: Nasi Goreng");
        System.out.println("Harga Satuan: Rp " + price);
        System.out.println("Jumlah: " + quantity);
        System.out.println("---");
        System.out.println("Total bayar: Rp " + (price * quantity));
    }
}
/*
Nama: Ummu Kultsum
NIM: D1041214089
Tanggal: 25/02/2026
*/