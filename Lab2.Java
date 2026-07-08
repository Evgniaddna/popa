import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int p = scanner.nextInt();
            
            long lcmResult = scanner.nextLong();

            for (int i = 1; i < p; i++) {
                long nextNumber = scanner.nextLong();
                lcmResult = getLCM(lcmResult, nextNumber);
            }

            System.out.println(lcmResult);
        }

        scanner.close();
    }

    private static long getGCD(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private static long getLCM(long a, long b) {
        if (a == 0 || b == 0) return 0;
        return (a / getGCD(a, b)) * b;
    }
}
