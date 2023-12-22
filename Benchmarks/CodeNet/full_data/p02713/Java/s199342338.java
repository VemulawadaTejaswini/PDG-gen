import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    private static int MOD = 1000000007;


    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String str = br.readLine();
        int k = Integer.parseInt(str);

        long total = 0;
        for (int i = 1; i <= k; i++) {
            for (int i1 = 1; i1 <= k; i1++) {
                for (int i2 = 1; i2 <= k; i2++) {
                    San s = new San(i, i1, i2);
                    int result = s.gcd();
                    total += result;
                }
            }
        }
        System.out.println(total);
    }


    static class San {
        public int a, b, c;

        public San(int a, int b, int c) {
            int[] is = {a, b, c};
            Arrays.sort(is);
            this.a = is[0];
            this.b = is[1];
            this.c = is[2];
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            San san = (San) o;
            return a == san.a &&
                    b == san.b &&
                    c == san.c;
        }

        @Override
        public int hashCode() {
            return Objects.hash(a, b, c);
        }

        public int gcd() {
            int g = Main.gcd(a, b);
            g = Main.gcd(g, c);
            return g;
        }
    }

    public static final int gcd(final int a, final int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }
}
