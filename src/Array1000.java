public class Array1000 {
    public static void main(String[] args) {
        int baris = 4;
        int kolom = 4;

        int[][] arrayMultiDimensi = new int[baris][kolom];

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                if (i == j) {
                    arrayMultiDimensi[i][j] = 1;
                } else {
                    arrayMultiDimensi[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(arrayMultiDimensi[i][j] + " ");
            }
            System.out.println();
        }
    }
}
