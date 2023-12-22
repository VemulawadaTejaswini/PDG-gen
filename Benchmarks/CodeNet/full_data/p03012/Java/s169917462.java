import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        scanner.nextLine();
        final int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        int diff = sum;
        for (int i = 0; i < numbers.length; i++) {
            int sumPart = 0;
            for (int j = 0; j <= i; j++) {
                sumPart += numbers[j];
            }
            diff = Math.min(diff, Math.abs((sum - sumPart) - sumPart));
        }

        System.out.println(diff);
    }
}