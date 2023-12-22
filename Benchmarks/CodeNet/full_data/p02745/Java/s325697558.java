import java.util.Scanner;

class E {
    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final char[] a = sc.next().toCharArray();
        final char[] b = sc.next().toCharArray();
        final char[] c = sc.next().toCharArray();
        final char[][][] perms = new char[][][]{
                new char[][]{a, b, c},
                new char[][]{a, c, b},
                new char[][]{b, a, c},
                new char[][]{b, c, a},
                new char[][]{c, a, b},
                new char[][]{c, b, a},
        };
        int ans = Integer.MAX_VALUE;
        for (final char[][] perm : perms) {
            ans = Math.min(ans, min(min(perm[0], perm[1]), perm[2]).length);
        }
        System.out.println(ans);
    }

    static char[] min(char[] a, char[] b) {
        for (int i = 0; i < a.length; i++) {
            boolean success = true;
            for (int j = 0; j < b.length && i + j < a.length && success; j++)
                success = a[i + j] == b[j] || a[i + j] == '?' || b[j] == '?';
            if (success) {
                final char[] cs = new char[Math.max(a.length, i + b.length)];
                for (int j = 0; j < a.length; j++)
                    cs[j] = a[j];
                for (int j = 0; j < b.length; j++)
                    if (cs[i + j] == '?' || i + j >= a.length)
                        cs[i + j] = b[j];
                return cs;
            }
        }
        return (new String(a) + new String(b)).toCharArray();
    }
}
public class Main {
    public static void main(String... args) {
        E.main();
    }
}
