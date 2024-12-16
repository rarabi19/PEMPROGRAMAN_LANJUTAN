public class Array123_2 {
    public static void main(String[] args) {
        int[][] matriks = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for(int j = 0; j< 3; j++) {
                matriks[i][j] = j + 3;
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }
    }
}
