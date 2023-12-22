import java.util.Scanner;

class C {
    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int Q = sc.nextInt();
        final char[] s = sc.next().toCharArray();
        final char[] t = new char[Q];
        final char[] d = new char[Q];
        for (int i = 0; i < Q; i++) {
            t[i] = sc.next().charAt(0);
            d[i] = sc.next().charAt(0);
        }
        final int l = left(N, Q, s, t, d);
        final int r = right(N, Q, s, t, d);
        System.out.println(r - l - 1);
    }

    static int left(final int N, final int Q, final char[] s, final char[] t, final char[] d) {
        int lo = 0;
        int hi = N;
        while (hi - lo > 1) {
            final int x = (hi + lo) / 2;
            if (check(x, N, Q, s, t, d) < 0)
                lo = x;
            else
                hi = x;
        }
        return (hi + lo) / 2;
    }

    static int right(final int N, final int Q, final char[] s, final char[] t, final char[] d) {
        int lo = 1;
        int hi = N + 1;
        while (hi - lo > 1) {
            final int x = (hi + lo + 1) / 2;
            if (check(x, N, Q, s, t, d) > 0)
                hi = x;
            else
                lo = x;
        }
        return (hi + lo + 1) / 2;
    }

    static int check(int idx, final int N, final int Q, final char[] s, final char[] t, final char[] d) {
        for (int i = 0; i < Q; i++)
            if (s[idx - 1] == t[i]) {
                if (d[i] == 'L')
                    idx--;
                else
                    idx++;
                if (idx < 1)
                    return -1;
                else if (idx > N)
                    return 1;
            }
        return 0;
    }
}
public class Main {
    public static void main(String...args) {
        C.main();
    }
}
