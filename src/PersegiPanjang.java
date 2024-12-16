public class PersegiPanjang {
    int Panjang;
    int Lebar;

    public PersegiPanjang (int Panjang, int Lebar) {
        this.Panjang = Panjang;
        this.Lebar = Lebar;
    }
    public int keliling() {

        return (2 * (Panjang + Lebar));
    }
    public int luas() {

        return (Panjang * Lebar);
    }
    public void HasilOperasi() {
        System.out.println(" ");
        System.out.println("***Operasi Hitung Persegi Panjang***");
        System.out.println("Diketahui :");
        System.out.println("Panjang  : " + this.Panjang + " Cm");
        System.out.println("Lebar    : " + this.Lebar + " Cm");
        System.out.println(" ");

        System.out.println("Dit      : Keliling & Luas ? ");
        System.out.println(" ");

        System.out.println("Jawab    :");
        System.out.println("Rumus --> K = (2P + 2L)");
        System.out.println("            = 2(8) + 2(6)");
        System.out.println("            = " + keliling() + " Cm");
        System.out.println("Jadi, Keliling Persegi Panjang Adalah " + keliling() + " Cm");

        System.out.println(" ");
        System.out.println("Rumus --> L = P X L ");
        System.out.println("            = 8 X 6 ");
        System.out.println("            = " + luas() + " Cm");
        System.out.println("Jadi, Luas Persegi Panjang Adalah " + luas() + " Cm");
    }

    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang(8,4);
        pp.HasilOperasi();
    }
}
