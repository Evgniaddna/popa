import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть натуральне число n: ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int count = 0;

            for (int m = 1; m <= n; m++) {
                int quotient = n / m;
                int remainder = n % m;

                if (quotient == remainder) {
                    count++;
                }
            }

            System.out.println("Кількість рівних дільників числа " + n + ": " + count);
        }

        scanner.close();
    }
}
