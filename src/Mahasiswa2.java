import java.util.Scanner;

public class Mahasiswa2 {
    String nama;
    String nim;
    String jurusan;
    double tugas1;
    double tugas2;
    double UTS;
    double UAS;

    public Mahasiswa2(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    public double nilaiAkhir() {

        return ((tugas1 * 0.15) + (tugas2 * 0.15) + (UTS * 0.35) + (UAS * 0.35));
    }

    public String getIndexIPK() {
        double ipk = nilaiAkhir();
        String indexIPK = " ";

        if (ipk >= 85) {
            indexIPK = "A";
        } else if (ipk >= 75) {
            indexIPK = "B";
        } else if (ipk >= 60) {
            indexIPK = "C";
        } else if (ipk >= 50) {
            indexIPK = "D";
        } else {
            indexIPK = "E";
        }
        return indexIPK;
    }

    public double nilaiipk() {
        double ipk = nilaiAkhir();
        return (double) (ipk / 25);
    }

    public void tampilkanData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nilai Tugas 1 Yang Anda Dapatkan : ");
        tugas1 = scanner.nextDouble();

        System.out.print("Masukkan Nilai Tugas 2 Yang Anda Dapatkan : ");
        tugas2 = scanner.nextDouble();

        System.out.print("Masukkan Nilai UTS Yang Anda Dapatkan     : ");
        UTS = scanner.nextDouble();

        System.out.print("Masukkan Nilai UAS Yang Anda Dapatkan     : ");
        UAS = scanner.nextDouble();
        System.out.println(" ");

        System.out.println("====== MOHON TUNGGU SEBENTAR =====");
        System.out.println(" ");

        System.out.println("===== NILAI ANDA SEBAGAI BERIKUT : ===== ");
        System.out.println("Nama        : " + this.nama);
        System.out.println("NIM         : " + this.nim);
        System.out.println("Jurusan     : " + this.jurusan);
        System.out.println("Nilai Akhir : " + nilaiAkhir());
        System.out.println("Nilai IPK   : " + nilaiipk());
        System.out.println("Indeks IPK  : " + getIndexIPK());
        System.out.println(" ");

        if (nilaiAkhir() > 80)  {
            System.out.println("_PERTAHANKANLAH NILAI ANDA_");
        } else if (nilaiAkhir() > 70) {
            System.out.println("_BERUSAHALAH DISEMESTER MENDATANG_");
        }else {
            System.out.println("_JANGAN MENYERAH, MASIH ADA HARAPAN WALAU TAK JELAS_");
        }
    }

    public static void main(String[] args) {
        Mahasiswa2 mahasiswa = new Mahasiswa2("Haniva Azzahra Salsabila", "12350123200", "Teknik Informatika");
        mahasiswa.tampilkanData();
    }
}
