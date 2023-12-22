
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();

        final boolean[] array = new boolean[n];
        int wrongAnswerCount = 0;
        for (int i = 0; i < m; i++) {
            final int p = scanner.nextInt() - 1;
            final String result = scanner.next();
            if (array[p]) {
                continue;
            }

            if ("WA".equals(result)) {
                wrongAnswerCount++;
            } else {
                array[p] = true;
            }
        }

        int acceptedCount = 0;
        for (final boolean b : array) {
            if (b) {
                acceptedCount++;
            }
        }

        System.out.println(acceptedCount + " " + wrongAnswerCount);
    }
}
