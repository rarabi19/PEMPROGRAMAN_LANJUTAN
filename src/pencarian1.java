import java.util.Scanner;

public class pencarian1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input nilai-nilai array
        int[] arr = new int[10];
        System.out.println("Masukkan angka dari 1-10:");

        for (int i = 0; i < 10; i++) {
            int nilai = scanner.nextInt();
            if (nilai < 1 || nilai > 10) {
                System.out.println("Nilai harus antara 1-10.");
                i--;
            } else {
                arr[i] = nilai;
            }
        }
        int angkaDicari = 8;
        int posisi = -1;
        for (int i = 0; i < 10; i++) {
            if (arr[i] == angkaDicari) {
                posisi = i;
                break;
            }
        }
        if (posisi != -1) {
            System.out.println("Angka " + angkaDicari + " ditemukan dalam array pada indeks ke-" + posisi);
        } else {
            System.out.println("Angka " + angkaDicari + " tidak ditemukan dalam array.");
        }
    }
}
