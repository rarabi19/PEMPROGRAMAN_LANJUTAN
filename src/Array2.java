public class Array2 {
        public static void main(String[] args) {
            int[] angka= new int[5];

            int angkaMulai = 6;
            for (int i = 0; i < 5; i++) {
                angka[i] = angkaMulai + i;
            }

            System.out.print("Angka dalam satu baris: ");
            for (int i = 0; i < 5; i++) {
                System.out.print(angka[i] + " ");
        }
    }

}
