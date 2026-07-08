import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int p = scanner.nextInt();

            if (p == 1) {
                System.out.println(2);
                scanner.close();
                return;
            }
            if (p == 2) {
                System.out.println(4);
                scanner.close();
                return;
            }

            long endsSame = 2;
            long endsDiff = 2;

            for (int n = 3; n <= p; n++) {
                long nextEndsDiff = endsSame + endsDiff;
                long nextEndsSame = endsDiff;

                endsDiff = nextEndsDiff;
                endsSame = nextEndsSame;
            }

            long totalCount = endsSame + endsDiff;
            System.out.println(totalCount);
        }

        scanner.close();
    }
}
