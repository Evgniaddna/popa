import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();

            double deltaX = x2 - x1;
            double deltaY = y2 - y1;

            double vectorLength = Math.sqrt(deltaX * deltaX + deltaY * deltaY);

            System.out.printf("%.6f\n", vectorLength);
        }

        scanner.close();
    }
}
