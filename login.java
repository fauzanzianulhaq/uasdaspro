// import java.text.DecimalFormat;
// import java.util.Scanner;

// public class login {
//     private static double total_bayar; // Declare total_bayar as a static field
//     private static DecimalFormat kursIndonesia;

//     public static void main(String args[]) {
//         // Check login credentials
//         if (login()) {
//             // Continue with the main program if login is successful
//             runProgram();
//         } else {
//             System.out.println("Login failed. Exiting program.");
//         }
//     }

//     // Login method
//     private static boolean login() {
//         Scanner input = new Scanner(System.in);

//         System.out.println("Login Program");
//         System.out.print("Username: ");
//         String username = input.nextLine();

//         System.out.print("Password: ");
//         String password = input.nextLine();

//         // You can implement more robust authentication logic here
//         // For simplicity, we use a hardcoded username and password
//         return username.equals("fauzan") && password.equals("12345678");
//     }

//     // Main program logic
//     private static void runProgram() {
//         total_bayar = 0; // Reset total_bayar to zero for each run
//         kursIndonesia = new DecimalFormat("Rp #,##0.00");
//         kursIndonesia.setMaximumFractionDigits(0);

//         // Your existing program logic here...

//         // The rest of your existing code...

//         // Total Bayar
//         System.out.println("Total Bayar : " + kursIndonesia.format(total_bayar));
//     }
// }
import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        // Periksa kredensial login
        if (login1()) {
            // Lanjutkan dengan program utama jika login berhasil
            diamond();
        } else {
            System.out.println("Login gagal. Keluar dari program.");
        }
    }

    // Metode login
    private static boolean login1() {
        Scanner input = new Scanner(System.in);

        System.out.println("Login Program");
        System.out.print("Username: ");
        String username = input.nextLine();

        System.out.print("Id Game: ");
        String IdGame = input.nextLine();

        System.out.print("Password: ");
        String password = input.nextLine();

        // Autentikasi sederhana dengan nilai keras
        return username.equals("daspro") && password.equals("password");
    }

    // Panggil program penjualan barang utama
    private static void diamond() {
        // Panggil metode main penjualanBarang yang sudah ada
        DiamondStore.main(new String[]{});
    }
}

// public class loogin {
//     public static void main(String[] args) {
//         // Periksa kredensial login
//         if (login()) {
//             // Lanjutkan dengan program utama jika login berhasil
//             penjualanBarang();
//         } else {
//             System.out.println("Login gagal. Keluar dari program.");
//         }
//     }

//     // Metode login
//     private static boolean login() {
//         Scanner input = new Scanner(System.in);

//         System.out.println("Login Program");
//         System.out.print("Username: ");
//         String username = input.nextLine();

//         System.out.print("Password: ");
//         String password = input.nextLine();

//         // Autentikasi sederhana dengan nilai keras
//         return username.equals("admin") && password.equals("password");
//     }

//     // Panggil program penjualan barang utama
//     private static void penjualanBarang() {
//         // Panggil metode main penjualanBarang yang sudah ada
//         penjualanBarang.main(new String[]{});
//     }
// }
