public class Array_3x9 {
    public static void main(String[] args) {
        int[][] matriks = new int[3][9];

        for (int i = 0; i < 3; i++) {
            for (int j = 0 ; j < 9; j++) {
             matriks[i][j] = j + 1;
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }
    }
}
