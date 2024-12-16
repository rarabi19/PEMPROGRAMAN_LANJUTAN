public class Array111 {
    public static void main(String[] args) {
        int[][] matriks = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0 ; j < 4; j++) {
                if (i==j) {
                    matriks[i][j] = 1;
                }else {
                    matriks[i][j] = 0;
                }
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }
    }
}