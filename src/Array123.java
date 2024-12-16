public class Array123 {
    public static void main(String[] args) {

        int baris = 3;
        int kolom = 3;

        int[][] arrayMultiDimensi = new int[baris][kolom];

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                if (j == 0) {
                    arrayMultiDimensi[i][j] = 1;
                } else if (j == 1) {
                    arrayMultiDimensi[i][j] = 2;
                } else {
                    arrayMultiDimensi[i][j] = 3;
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