public class Pembayaran {
    private String customerName;
    private double originalPrice;
    private String paymentMethod;
    private double discountPercentage;
    private String paymentStatus;

    // Constructor
    public Pembayaran(String customerName, double originalPrice, String paymentMethod) {
        this.customerName = customerName;
        this.originalPrice = originalPrice;
        this.paymentMethod = paymentMethod;
        this.discountPercentage = getDiscountPercentage(paymentMethod);
        this.paymentStatus = "Pembayaran Berhasil dengan " + paymentMethod;
    }

    // Menghitung total setelah diskon
    public double calculateTotal() {
        return originalPrice - (originalPrice * discountPercentage / 100);
    }

    // Menampilkan detail transaksi
    public void displayDetails() {
        System.out.println("Nama Pelanggan: " + customerName);
        System.out.println("Harga Awal    : Rp " + formatCurrency(originalPrice));

        if (discountPercentage > 0) {
            System.out.println("Diskon        : " + discountPercentage + "%");
            System.out.println("Harga Akhir   : Rp " + formatCurrency(calculateTotal()));
        }

        System.out.println("Metode Bayar  : " + paymentMethod);
        System.out.println("Status        : " + paymentStatus);
        System.out.println("==============================");
    }

    // Format mata uang
    private String formatCurrency(double amount) {
        return String.format("%,.0f", amount).replace(",", ".");
    }

    // Menentukan persentase diskon berdasarkan metode pembayaran
    private double getDiscountPercentage(String method) {
        switch(method) {
            case "Voucher Diskon":
                return 15.0;
            default:
                return 0.0;
        }
    }
}
