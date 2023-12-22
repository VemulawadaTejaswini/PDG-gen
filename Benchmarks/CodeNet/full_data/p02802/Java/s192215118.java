
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

        final long acceptedCount = IntStream.range(0, n)
                .mapToObj(i -> array[i])
                .filter(Boolean::booleanValue)
                .count();

        System.out.println(acceptedCount + " " + wrongAnswerCount);
    }
}
