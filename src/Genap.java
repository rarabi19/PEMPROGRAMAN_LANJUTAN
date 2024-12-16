public class Genap {
    public static void main(String[] args) {
        int[] angka = new int[40];
        String[] huruf = new String[40];

        for (int a = 0; a < angka.length; a++) {
            angka[a] = a + 1;
        }
        for (int a = 0; a < angka.length; a++) {
            if (angka[a] % 2 == 0) {
                huruf[a] = "genap";
            } else {
                huruf[a] = String.valueOf(angka[a]);
            }
        }
        System.out.print("[");
        for (int a = 0; a < huruf.length; a++) {
            System.out.print(huruf[a]);
            if (a < huruf.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
