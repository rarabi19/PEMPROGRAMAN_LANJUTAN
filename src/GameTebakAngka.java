import java.util.Scanner;
import java.util.Random;

public class GameTebakAngka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int angkaTebakan = random.nextInt(20) + 1;
        int banyakPercobaan = 5;
        int percobaan = 0;
        int tebakan;

        System.out.println("*** SELAMAT DATANG DALAM PERMAINAN TEBAK ANGKA ***");
        System.out.println("*** TEBAKLAH ANGKA YANG KAMI MILIKI ANTARA 1 - 20 ***");

        while (percobaan < banyakPercobaan) {
            System.out.print("Masukkan Tebakan Anda : ");
            tebakan = scanner.nextInt();

            if (tebakan < 1 || tebakan > 20) {
                System.out.println("Masukkan Angka Antara 1 - 20 ");
                continue; // Melanjutkan loop tanpa menghitung sebagai percobaan
            }

            percobaan++;

            if (tebakan == angkaTebakan) {
                System.out.println("Selamat Anda Berhasil Menebak Angka " + angkaTebakan);
                break;
            } else {
                System.out.println("Sayang Sekali Tebakan Anda Salah. Sisa Percobaan Yang Anda Miliki : " + (banyakPercobaan - percobaan));
            }
        }

        if (percobaan == banyakPercobaan) {
            System.out.println("Maaf Kesempatan Anda Habis. Angka Yang Benar Adalah : " + angkaTebakan);
        }

        scanner.close();
    }
}
