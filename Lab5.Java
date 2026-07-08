import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть довжину послідовності n: ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            final int MOD = 12345;

            long zero = 1;
            long one = 1;
            long twoOnes = 0;

            for (int i = 2; i <= n; i++) {
                long nextZero = (zero + one + twoOnes) % MOD;
                long nextOne = zero;
                long nextTwoOnes = one;

                zero = nextZero;
                one = nextOne;
                twoOnes = nextTwoOnes;
            }

            long total = (zero + one + twoOnes) % MOD;

            System.out.println("Кількість шуканих послідовностей: " + total);
        }

        scanner.close();
    }
}
