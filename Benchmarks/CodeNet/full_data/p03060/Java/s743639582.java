import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        final Integer[] values = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).toArray(Integer[]::new);
        final Integer[] costs = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).toArray(Integer[]::new);

        int max = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] > costs[i]) {
                max += values[i] - costs[i];
            }
        }

        System.out.println(max);
    }
}
