public class BangunDatar {
    double panjang;
    double lebar;
    double sisi;
    double tinggi;
    double alas;
    int sisi1;
    int sisi2;
    int sisi3;

    BangunDatar(double panjang, double lebar, double sisi, double tinggi, double alas, int sisi1, int sisi2, int sisi3) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.sisi = sisi;
        this.tinggi = tinggi;
        this.alas = alas;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    double luas(double panjang, double lebar) {
        return (panjang * lebar);
    }

    double luas(double sisi) {
        return (sisi * sisi);
    }

    int luas(int alas, int tinggi) {
        return (alas * tinggi) / 2;
    }

    double kll(double panjang, double lebar) {
        return (panjang + lebar) * 2;
    }

    double kll(double sisi) {
        return (sisi * 4);
    }

    int kll(int sisi1, int sisi2, int sisi3) {
        return (sisi1 + sisi2 + sisi3);
    }

    public static void main(String[] args) {
        BangunDatar komponen = new BangunDatar(50,30,40,20,15,25,28,30);

        System.out.println("Luas Persegi Panjang       : " + komponen.luas(50,30));
        System.out.println("Luas Persegi               : " + komponen.luas(40));
        System.out.println("Luas Segitiga              : " + komponen.luas(15,20));
        System.out.println("Keliling Persegi Panjang   : " + komponen.kll(50,30));
        System.out.println("Keliling Persegi           : " + komponen.kll(40));
        System.out.println("Keliling Segitiga          : " + komponen.kll(25,28,30));
    }
}