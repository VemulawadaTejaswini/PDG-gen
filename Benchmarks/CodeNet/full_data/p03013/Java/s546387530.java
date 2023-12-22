
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static Scanner sc;
    public static void main(String[] args) {
        Main instance = new Main();
        sc = instance.new Scanner();
        instance.solve();
    }

    private void solve() {
        try {
            int n,m;
            int[] a;
            boolean[] b;

            n = sc.nextInt();
            m = sc.nextInt();
            a = new int[m+1];
            b = new boolean[n+1];

            long seven = 1000000007;

            long[] f = new long[n+1];
            f[0] = 0;
            f[1] = 1;
            f[2] = 2;
            for (int i = 3; i <= n; i++) {
                f[i] = (f[i-1] + f[i-2]) % seven;
            }

            for (int i = 0; i < m; i++) {
                a[i] = sc.nextInt();
                b[a[i]] = true;
            }

            long ans = 1;

            int prev = 0;

            for (int i = 0; i <= n; i++) {
                if (b[i] && i == 1) {
                    prev = 2;
                    continue;
                }
                if (i > 0) {
                    if (b[i-1] && b[i]) {
                        System.out.println(0);
                        return;
                    }
                }
                if (b[i]) {
                    ans *= f[i-1-prev];
                    ans %= seven;
                    prev = i+1;
                }
            }
            ans *= f[n-prev];
            ans %= seven;


            System.out.println(ans);


        } catch (Exception e) {
            e.printStackTrace();
        }
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