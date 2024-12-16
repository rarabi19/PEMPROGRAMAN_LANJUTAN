public class mahasiswa1 {
    String nama;
    String nim;
    String jurusan;
    String fakultas;
    String universitas;

    public mahasiswa1(String nama, String nim, String jurusan, String fakultas, String universitas) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.fakultas = fakultas;
        this.universitas = universitas;
    }
    public void tampilkanData() {
        System.out.println("Nama        :" + this.nama);
        System.out.println("Nim         :" + this.nim);
        System.out.println("Jurusan     :" + this.jurusan);
        System.out.println("Fakultas    :" + this.fakultas);
        System.out.println("Universitas :" + this.universitas);
    }

    public static void main(String[] args) {
        mahasiswa1 mahasiswa = new mahasiswa1("Haniva Azzahra Salsabila","12350123200",
                "Teknik Informatika","Sains dan Teknologi","UIN SUSKA Riau");
                mahasiswa.tampilkanData();
    }
}
