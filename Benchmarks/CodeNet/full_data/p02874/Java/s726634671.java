
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final List<Pair> pairs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            pairs.add(new Pair(scanner.nextInt(), scanner.nextInt()));
        }

        pairs.sort((o1, o2) -> o2.b - o1.b);

        final List<Pair> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            final int former = pairs.get(i).a;
            final int latter = pairs.get(i).b;

            boolean flag = false;
            for (final Pair pair : result) {
                if (pair.a <= former && pair.a < latter || latter <= pair.b && latter > pair.a) {
                    pair.a = Math.max(pair.a, former);
                    pair.b = Math.min(pair.b, latter);
                    flag = true;
                    break;
                }
            }
            if (flag) {
                continue;
            }

            result.add(new Pair(former, latter));
            if (result.size() >= 3) {
                break;
            }
        }

        if (result.size() >= 3) {
            int max = 0;
            for (final Pair pair : pairs) {
                max = Math.max(max, pair.b - pair.a + 1);
            }

            System.out.println(max);
            return;
        }

        if (result.size() == 1) {
            int max = 0;
            int index = 0;

            for (int i = 0; i < n; i++) {
                final int former = pairs.get(i).a;
                final int latter = pairs.get(i).b;

                if (latter - former + 1 > max) {
                    max = latter - former + 1;
                    index = i;
                }
            }

            int former = 0;
            int latter = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                if (i == index) {
                    continue;
                }

                former = Math.max(former, pairs.get(i).a);
                latter = Math.min(latter, pairs.get(i).b);
            }

            System.out.println(max + latter - former + 1);
            return;
        }

        final Pair pair1 = result.get(0);
        final Pair pair2 = result.get(1);
        int max = 0;
        for (final Pair pair : pairs) {
            max = Math.max(max, pair.b - pair.a + 1);
        }
        System.out.println(Math.max(pair1.b + pair2.b - pair1.a - pair2.a + 2, max));
    }

    static class Pair {
        int a;
        int b;

        Pair(final int a, final int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public String toString() {
            return a + " " + b;
        }
    }
}
