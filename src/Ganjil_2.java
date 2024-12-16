public class Ganjil_2 {
    public static void main(String[] args) {
        String [] ganjil = new String[100];

        for (int i = 0; i < 100; i++){
            int bilangan = i + 1;

            if (bilangan % 2 != 0) {
                ganjil[i] = "ganjil ," ;
                System.out.print(ganjil[i]);
            } else {
                ganjil[i] = String.valueOf(bilangan);
                System.out.print(ganjil[i] + ", ");
            }
        }
    }
}
