public class Matrix {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Tablica matrix:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int val = (i == j) ? i : 0;
                sum += (i == j) ? i : 0;
                System.out.print(val + " ");
            }
            System.out.println();
        }
        System.out.println("Suma elementów na przekątnej: " + sum);
    }
}
