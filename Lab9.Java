import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextLong()) {
            long x = scanner.nextLong();
            long y = scanner.nextLong();

            System.out.println(getMinSteps(x, y));
        }

        scanner.close();
    }

    public static int getMinSteps(long x, long y) {
        long target = y - x;

        if (target == 0) {
            return 0;
        }

        int steps = 1;
        while (true) {
            long maxDistance;
            
            if (steps % 2 == 0) {
                long half = steps / 2;
                maxDistance = half * (half + 1);
            } else {
                long half = steps / 2;
                maxDistance = half * (half + 1) + (half + 1);
            }

            if (maxDistance >= target) {
                return steps;
            }
            
            steps++;
        }
    }
}
