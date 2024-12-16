public class pencarian2 {
    public static void main(String[] args) {
        int angkaDicari = 48;

        int posisi = binarySearch(angkaDicari);

        System.out.println("Menampilkan angka 1-50:");
        for (int i = 10; i <= 50; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Tampilkan hasil
        if (posisi != -1) {
            System.out.println("Angka " + angkaDicari + " ditemukan dalam array pada indeks ke-" + posisi);
        } else {
            System.out.println("Angka " + angkaDicari + " tidak ditemukan dalam array.");
        }
    }

    public static int binarySearch(int target) {
        int awal = 10;
        int akhir = 50;

        while (awal <= akhir) {
            int tengah = (awal + akhir) / 2;

            if (tengah == target) {
                return tengah - 1; 
            } else if (tengah < target) {
                awal = tengah + 1;
            } else {
                akhir = tengah - 1;
            }
        }
        return -1;
    }
}
