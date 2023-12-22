
import java.util.LinkedList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();

        final LinkedList<Pair> pairs = new LinkedList<>();
        if (n % 2 == 1) {
            for (int i = 1; i <= n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    if (i + j != n) {
                        pairs.add(new Pair(i, j));
                    }
                }
            }
        } else {
            for (int i = 1; i <= n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    if (i + j != n + 1) {
                        pairs.add(new Pair(i, j));
                    }
                }
            }
        }

        System.out.println(pairs.size());
        final String answer = pairs.stream()
                .map(Pair::toString)
                .collect(Collectors.joining("\n"));
        System.out.println(answer);
    }

    private static class Pair {
        final int x;
        final int y;

        Pair(final int x, final int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return x + " " + y;
        }
    }
}
