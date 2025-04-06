public class Main {
    public static void main(String[] args) {
        // Membuat objek transaksi
        Pembayaran siti = new Pembayaran("Siti", 3_500_000, "Kartu Kredit");
        Pembayaran ciciripi = new Pembayaran("Ciciripi", 10_000_000, "Voucher Diskon");
        Pembayaran asnawi = new Pembayaran("Asnawi", 1_200_000, "Transfer Bank");

        // Menampilkan semua transaksi
        System.out.println("=== Transaksi IKLCMart ===");
        siti.displayDetails();
        ciciripi.displayDetails();
        asnawi.displayDetails();
    }
}
