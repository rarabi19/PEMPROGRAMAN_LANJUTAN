import java.util.Scanner;

public class ArrayBookingHotel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] slipPembayaran = new String[4][2];

        // Menyimpan pertanyaan dalam array
        String[] pertanyaan = {"Tanggal Booking: ", "Tipe Kamar: ", "Tanggal Kamar Berhasil Booking: ", "Total Harga: "};

        // Meminta input dari pengguna dan menyimpannya dalam array
        for (int a = 0; a < pertanyaan.length; a++) {
            System.out.print(pertanyaan[a]);
            slipPembayaran[a][0] = pertanyaan[a];
            slipPembayaran[a][1] = input.nextLine();
        }

        // Menampilkan slip pembayaran dalam bentuk tabel
        System.out.println("\n===== Slip Pembayaran Booking Hotel =====");
        for (int i = 0; i < slipPembayaran.length; i++) { // Mengubah variabel dari 'a' menjadi 'i'
            for (int b = 0; b < slipPembayaran[i].length; b++) {
                System.out.printf("%-30s", slipPembayaran[i][b]); // Menambahkan format untuk rata kiri
            }
            System.out.println();
        }
    }
}
