import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextDouble()) {
            double x1 = scanner.nextDouble();
            double y1 = scanner.nextDouble();
            double r1 = scanner.nextDouble();
            double x2 = scanner.nextDouble();
            double y2 = scanner.nextDouble();
            double r2 = scanner.nextDouble();

            double dSq = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
            
            double rSumSq = (r1 + r2) * (r1 + r2);
            double rDiffSq = (r1 - r2) * (r1 - r2);

            if (dSq == 0 && r1 == r2) {
                System.out.println(-1);
            }
            else if (dSq > rSumSq || dSq < rDiffSq) {
                System.out.println(0);
            }
            else if (dSq == rSumSq || dSq == rDiffSq) {
                System.out.println(1);
            }
            else {
                System.out.println(2);
            }
        }

        scanner.close();
    }
}
