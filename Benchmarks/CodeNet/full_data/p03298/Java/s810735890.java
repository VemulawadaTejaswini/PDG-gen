import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

class C {

    static class Pair {
        final int bits;
        final String s;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return bits == pair.bits &&
                    Objects.equals(s, pair.s);
        }

        @Override
        public int hashCode() {

            return Objects.hash(bits, s);
        }

        public Pair(int bits, String s) {

            this.bits = bits;
            this.s = s;
        }
    }

    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final char[] S = sc.next().toCharArray();
        final HashMap<Pair, Integer> map = new HashMap<>();
        for (int i = 0; i < 1 << N; i++) {
            final StringBuilder sb = new StringBuilder();
            for (int j = 0; j < N; j++)
                if ((i & 1 << j) > 0)
                    sb.append(S[j]);
            for (int j = N - 1; j >= 0; j--)
                if ((i & 1 << j) == 0)
                    sb.append(S[j]);
            final Pair p = new Pair(Integer.bitCount(i), sb.toString());
            map.put(p, map.getOrDefault(p, 0) + 1);
        }
        long ans = 0;
        for (int i = 0; i < 1 << N; i++) {
            final StringBuilder sb = new StringBuilder();
            for (int j = N - 1; j >= 0; j--)
                if ((i & 1 << j) == 0)
                    sb.append(S[j + N]);
            for (int j = 0; j < N; j++)
                if ((i & 1 << j) > 0)
                    sb.append(S[j + N]);
            final Pair p = new Pair(N - Integer.bitCount(i), sb.toString());
            ans += map.getOrDefault(p, 0);
        }
        System.out.println(ans);
    }
}
public class Main {
    public static void main(String...args) {
        C.main();
    }
}
