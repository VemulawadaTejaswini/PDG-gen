
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    private static Scanner sc;
    public static void main(String[] args) {
        Main instance = new Main();
        sc = instance.new Scanner();
        instance.solve();
    }

    private void solve() {
        try {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            if (N == 2) {
                System.out.println(Math.max(A[0], A[1]));
                return;
            }
            int max = 0;
            for (int i = 0; i < N; i++) {
                int[] tmp = new int[N-1];
                int[] prev = Arrays.copyOfRange(A, 0, i);
                int[] next = Arrays.copyOfRange(A, i+1, N);
                System.arraycopy(prev, 0, tmp, 0, prev.length);
                System.arraycopy(next, 0, tmp, prev.length, next.length);

                int hoge = gcd(tmp);
                if (hoge > max) max = hoge;
            }
            System.out.println(max);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private int gcd(int a, int b) {
        if (a < b) return gcd(b, a);
        if (b == 0) return a;
        return gcd(b, a%b);
    }

    private int gcd(int[] param) {
        final int len = param.length;
        int g = gcd(param[0], param[1]);
        for (int i = 1; i < len - 1; i++) {
            g = gcd(g, param[i+1]);
        }
        return g;
    }

    private class Scanner {
        String[] s;
        int i;
        BufferedReader br;
        String regex = " ";

        public Scanner() {
            s = new String[0];
            i = 0;
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        @Override
        protected void finalize() throws Throwable {
            try {
                super.finalize();
            } finally {
                destruction();
            }
        }

        private void destruction() throws IOException {
            if (br != null) br.close();
        }

        public String next() throws IOException {
            if (i < s.length) return s[i++];
            String st = br.readLine();
            while (st == "") st = br.readLine();
            s = st.split(regex, 0);
            i = 0;
            return s[i++];
        }

        public int nextInt() throws NumberFormatException, IOException {
            return Integer.parseInt(next());
        }

        public Long nextLong() throws NumberFormatException, IOException {
            return Long.parseLong(next());
        }

        public Double nextDouble() throws NumberFormatException, IOException {
            return Double.parseDouble(next());
        }
    }
}