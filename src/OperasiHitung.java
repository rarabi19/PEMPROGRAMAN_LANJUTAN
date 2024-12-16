import java.util.Scanner;

public class OperasiHitung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operasiHitung;
        double nilaiA, nilaiB, hasil;
        System.out.println("***SELAMAT DATANG DALAM OPERASI HTUNG KAMI***");
        System.out.print("Masukkan Nilai A : ");
        nilaiA = scanner.nextDouble();

        System.out.print("Masukkan Nilai B : ");
        nilaiB = scanner.nextDouble();

        do {
            System.out.println("Jenis Operasi Hitung : ");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Keluar");
            System.out.print("Masukkan Operasi Hitung Yang Anda Inginkan : ");

            operasiHitung = scanner.nextInt();
            if (operasiHitung == 5) {
                System.out.println("Program Berakhir, Sampai Jumpa Lagi");
                break;
            }
            switch (operasiHitung) {
                case 1:
                    hasil = nilaiA + nilaiB;
                    System.out.println("Penjumlahan (A + B) = " + hasil);
                    break;
                case 2:
                    hasil = nilaiA - nilaiB;
                    System.out.println("Pengurangan (A - B) = " + hasil);
                    break;
                case 3:
                    hasil = nilaiA * nilaiB;
                    System.out.println("Perkalian (A x B) = " + hasil);
                    break; // Add break to exit the switch statement
                case 4:
                    hasil = nilaiA / nilaiB;
                    System.out.println("Pembagian (A : B) =" + hasil);
                    break;
                default:
                    System.out.println("Operasi tidak valid");
            }
        } while (true); // Add a loop condition
    }
}
