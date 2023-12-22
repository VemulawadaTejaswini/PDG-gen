
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
            long sev = (long) Math.pow(10, 9) + 7;
            long n,k;
            n = sc.nextLong();
            k = sc.nextLong();
            for (int i = 1; i <= k; i++) {
                // (n-k+1)C(i) * (k-1)C(i-1)
                double tmp = 1;
                for (int j = 0; j < i; j++) {
                    tmp *= (double)(n-k+1-j) / (i-j);
                    tmp %= sev;
                }
                for (int j = 0; j < i-1; j++) {
                    tmp *= (k-1-j) / (i-1-j);
                    tmp %= sev;
                }
                System.out.println((long) tmp);
            }



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