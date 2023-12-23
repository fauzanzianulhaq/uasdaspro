import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Transaksi {
    private int jum;
    private double totalBayar;
    private Barang[] barang;
    private int[] qty;

    public Transaksi(int jum) {
        this.jum = jum;
        this.totalBayar = 0;
        this.barang = new Barang[jum];
        this.qty = new int[jum]; // Inisialisasi array qty
    }

    public void tambahBarang(int index, Barang barang, int qty) {
        this.barang[index] = barang;
        this.qty[index] = qty; // Simpan qty di dalam array qty
        this.totalBayar += ((qty * barang.harga) - (qty * barang.harga * barang.diskon));
    }

    public void tampilkanStruk() {
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        System.out.println(" ");
        System.out.println("======================================================================");
        System.out.println("| No  | Nama Pilihan       | Harga         | Quantity | Diskon | Sub Total       |");
        System.out.println("======================================================================");
        for (int i = 0; i < jum; i++) {
            double subTotal = ((barang[i].harga) - (barang[i].harga * barang[i].diskon));
            System.out.printf("| %-3d | %-18s | %-13s | %-8d | %-6d%% | %-15s |\n", i + 1, barang[i].nama,
                    kursIndonesia.format(barang[i].harga), this.qty[i], (int) (barang[i].diskon * 100),
                    kursIndonesia.format(subTotal));
        }
        System.out.println("======================================================================");
        System.out.printf("| %-54s | %-15s |\n", "Total Bayar", kursIndonesia.format(totalBayar));
        System.out.println("======================================================================");
    }
}
