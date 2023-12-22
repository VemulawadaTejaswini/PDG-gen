
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String a = scanner.next();
        final String b = scanner.next();
        final String c = scanner.next();

        int min = Integer.MAX_VALUE;
        for (final int candidate : Arrays.asList(solve(a, b, c), solve(a, c, b), solve(b, a, c), solve(b, c, a), solve(c, a, b), solve(c, b, a))) {
            min = Math.min(min, candidate);
        }

        System.out.println(min);
    }

    private static int solve(final String a, final String b, final String c) {
        final int all = a.length() + b.length() + c.length();
        final boolean[] ab = new boolean[all];
        final boolean[] ac = new boolean[all];
        final boolean[] bc = new boolean[all];

        init(ab, a, b);
        init(ac, a, c);
        init(bc, b, c);

        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= a.length(); i++) {
            for (int j = 0; j <= b.length(); j++) {
                if (ab[i] && bc[j] && ac[i + j]) {
                    min = Math.min(min, i + j + c.length());
                }
            }
        }
        return min;
    }

    private static void init(final boolean[] array, final String a, final String b) {
        for (int i = 0; i < array.length; i++) {
            if (i < a.length()) {
                boolean flag = true;
                for (int j = 0; j < b.length() && i + j < a.length(); j++) {
                    if (!match(a.charAt(i + j), b.charAt(j))) {
                        flag = false;
                        break;
                    }
                }
                array[i] = flag;
            } else {
                array[i] = true;
            }
        }
    }

    private static boolean match(final char a, final char b) {
        return a == '?' || b == '?' || a == b;
    }
}
