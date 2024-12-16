public class BangunDatar2 {
    double panjang;
    double lebar;
    double sisi;
    double alas;
    double tinggi;
    int sisi1;
    int sisi2;
    int sisi3;

    BangunDatar2(double panjang, double lebar, double sisi, double alas, double tinggi, int sisi1, int sisi2, int sisi3){
        this.panjang = panjang;
        this.lebar = lebar;
        this.sisi = sisi;
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }
    double luas(double panjang, double lebar) {
        return (panjang * lebar);
    }
    double luas(double sisi) {
        return  (sisi * sisi);
    }
    int luas(int alas, int tinggi) {
        return (alas * tinggi)/2 ;
    }
    double keliling(double panjang, double lebar){
        return (panjang + lebar) * 2 ;
    }
    double keliling(double sisi){
        return (4 * sisi);
    }
    int keliling(int sisi1, int sisi2, int sisi3){
        return (sisi1 +sisi2 +sisi3);
    }
    public static void main(String[] args) {
        BangunDatar2 bagian = new BangunDatar2(30,15,25,20,40,25,35,10);

        System.out.println("Luas Persegi Panjang     : " + bagian.luas(30,15) );
        System.out.println("Luas Persegi             : " + bagian.luas(25));
        System.out.println("Luas Segitiga            : " + bagian.luas(20,40));
        System.out.println("Keliling Persegi Panjang : " + bagian.keliling(30,15));
        System.out.println("Keliling Persegi         : " + bagian.keliling(25));
        System.out.println( "Keliling Segitiga        : "+ bagian.keliling(25,35,10));
    }
}
