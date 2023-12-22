import java.util.Random;
import java.util.Scanner;

class E {
    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        int R = -1;
        int B = -1;
        final Random r = new Random();
        while (R < 0 || B < 0) {
            final int k = r.nextInt(2 * N);
            System.out.println(query1(N, k));
            if (read(sc) == 'R')
                R = k;
            else
                B = k;
        }
        while (Math.abs(R - B) > 1) {
            final int k = (R + B) / 2;
            System.out.println(query1(N, k));
            if (read(sc) == 'R')
                R = k;
            else
                B = k;
        }
        final char[] ans = new char[2 * N];
        final int K = Math.min(R, B);
        if(K == R) {
            ans[K] = 'R';
            ans[(K + N) % (2 * N)] = 'B';
        } else {
            ans[K] = 'B';
            ans[(K + N) % (2 * N)] = 'R';
        }
        for(int i = (K + N + 1) % (2 * N); i != K; i = (i + 1) % (2 * N)) {
            System.out.println(query2(N, K, i));
            ans[i] = read(sc);
        }
        for(int i = K + 1; i != (K + N) % (2 * N); i = (i + 1) % (2 * N)) {
            System.out.println(query2(N, (K + N) % (2 * N), i));
            ans[i] = read(sc);
        }
        System.out.println("! " + new String(ans));
    }

    static String query1(int N, int k) {
        final StringBuilder sb = new StringBuilder().append('?');
        for (int i = 0; i < N; i++)
            sb.append(' ').append((i + k) % (2 * N) + 1);
        return sb.toString();
    }

    static String query2(int N, int K, int idx) {
        final StringBuilder sb = new StringBuilder().append('?');
        sb.append(' ').append(idx + 1);
        for (int i = 1; i < N; i++)
            sb.append(' ').append((i + K) % (2 * N) + 1);
        return sb.toString();
    }

    static char read(Scanner sc) {
        final char c = sc.next().charAt(0);
        if(c == '-')
            throw null;
        return c;
    }
}
public class Main {
    public static void main(String... args) {
        E.main();
    }
}
