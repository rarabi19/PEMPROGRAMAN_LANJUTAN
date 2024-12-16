import java.util.Scanner;

public class From_Pendaftaran {
    String nama;
    String pekerjaan;
    String hobi;
    String negara;

    public From_Pendaftaran (String nama, String pekerjaan, String hobi, String negara) {
        this.nama = nama;
        this.pekerjaan = pekerjaan;
        this.hobi = hobi;
        this.negara = negara;
    }
    public void Data() {

        System.out.println(" *** Trimakasih Data Anda Sedang Kami Proses *** ");
        System.out.println("Nama      : " + this.nama);
        System.out.println("Pekerjaan : " + this.pekerjaan);
        System.out.println("Hobi      : " + this.hobi);
        System.out.println("Negara    : " + this.negara);
    }

    public static void main(String[] args) {
        From_Pendaftaran dt = new From_Pendaftaran("Haniva Azzahra Salsabila","Mahasiswa","Tiduran","Indonesia");
        dt.Data();
    }
}
