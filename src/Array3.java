public class Array3 {
    public static void main(String[] args) {
        int angka[][] = new int[3][3];
        int a = 1; //angka awal mulai

        for (int b = 0; b < 3; b++) { //indeks barisnya
            for (int c = 0; c < 3; c++) { //indeks kolom
                angka[b][c] = a;
                System.out.print(angka[b][c] + " ");
                a++;
            }
            System.out.println();
        }
    }
}

