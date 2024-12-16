public class Ganjil {
    public static void main(String[]args){
        int[] angka = new int[100];
        String[] huruf = new String[100];

        for (int a = 0; a < angka.length; a++) {
            angka[a] = a + 1;

            if (angka[a] % 2 != 0) {
                huruf[a] = "Ganjil";
            } else {
                huruf[a] = String.valueOf(angka[a]);
            }
        }
            System.out.print("[");
            for (int a = 0 ; a < huruf.length; a++) {
                System.out.print(huruf[a]);
                if(a < huruf.length - 1){
                    System.out.print(", ");
                }
           }
            System.out.println("]");
    }
}