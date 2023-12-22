
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final Integer[] n = Arrays.stream(scanner.nextLine().split(""))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);

        int max = 0;
        for (final Integer value : n) {
            max += value;
        }

        max = Math.max(max, (n.length - 1) * 9);

        for (int i = n.length - 1; i > 0; i--) {
            if (n[i] == 9) {
                continue;
            }

            if (Math.abs(n[i] - n[i - 1]) > 1) {
                n[i] = 9;
                for (int j = i - 1; j >= 0; j--) {
                    if (n[j] == 0) {
                        continue;
                    }

                    n[j]--;
                    for (int k = j + 1; k < i; k++) {
                        n[k] = 9;
                    }
                }
            }
        }

        int tmp = 0;
        for (final Integer value : n) {
            tmp += value;
        }

        System.out.println(Math.max(max, tmp));
    }
}
