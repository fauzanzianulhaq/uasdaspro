import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class DiamondStore {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        int jum = 0;

        int[] kode = new int[5];
        int[] qty = new int[5];

        do {
            System.out.println("SELAMAT DATANG DI DIAMOND STORE");
            System.out.println("Daftar Belanja Diamond");
            System.out.println("1. 50 Diamond = 50.000,00");
            System.out.println("2. 100 Diamond = 85.000,00");
            System.out.println("3. 150 Diamond = 135.000,00");
            System.out.println("4. 200 Diamond = 185.000,00");
            System.out.println("5. 500 Diamond = 400.000,00");

            System.out.print("Masukan Jumlah Yang Akan DiBeli : ");
            jum = input.nextInt();
            System.out.println(" ");

            Barang[] barang = {
                    new Barang("50 Diamond", 50000, 0.1),
                    new Barang("100 Diamond", 85000, 0.05),
                    new Barang("150 Diamond", 135000, 0),
                    new Barang("200 Diamond", 185000, 0.2),
                    new Barang("500 Diamond", 400000, 0.1)
            };

            Transaksi transaksi = new Transaksi(jum);

            for (int i = 0; i < jum; i++) {
                System.out.print("Masukan Kode Barang Ke-" + (i + 1) + " : ");
                kode[i] = input.nextInt();
                System.out.print("Masukan Quantity Pembelian Ke-" + (i + 1) + " : ");
                qty[i] = input.nextInt();

                // Menambahkan barang ke transaksi
                transaksi.tambahBarang(i, barang[kode[i] - 1], qty[i]);
            }

            // ... (kode lainnya)

            transaksi.tampilkanStruk();

            // ... (kode lainnya)

            // Ask if the user wants to shop again
            System.out.print("Apakah Anda ingin berbelanja lagi? (yes/no): ");
            String response = input.next().toLowerCase();

            if (!response.equals("yes")) {
                
                System.out.println("Terima kasih telah berbelanja di Diamond Store!");
                break; // keluar dari loop
            }

        } while (true);

        input.close(); // pastikan untuk menutup scanner setelah digunakan
    }
}
