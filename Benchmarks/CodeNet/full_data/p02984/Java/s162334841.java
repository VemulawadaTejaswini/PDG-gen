import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        scanner.nextLine();
        final int[] a = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        int oddSum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if (i % 2 == 0) {
                oddSum += a[i];
            }
        }
        sum /= 2;

        int[] values = new int[a.length];
        values[0] = oddSum - sum;
        for (int i = 1; i < a.length; i++) {
            values[i] = a[i - 1] - values[i - 1];
        }

        for (int i = 0; i < values.length; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(values[i] * 2);
        }
        System.out.println();
    }
}