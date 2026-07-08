import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть слово: ");
        if (scanner.hasNext()) {
            String word = scanner.next().toLowerCase();
            int n = word.length();

            Map<Character, Integer> charCounts = new HashMap<>();
            for (char ch : word.toCharArray()) {
                charCounts.put(ch, charCounts.getOrDefault(ch, 0) + 1);
            }

            long numerator = getFactorial(n);

            long denominator = 1;
            for (int count : charCounts.values()) {
                denominator *= getFactorial(count);
            }

            long totalAnagrams = numerator / denominator;

            System.out.println("Кількість анаграм: " + totalAnagrams);
        }

        scanner.close();
    }

    private static long getFactorial(int num) {
        long result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
