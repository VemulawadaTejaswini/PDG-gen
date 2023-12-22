
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    int N,K;
    private static Scanner sc;
    public static void main(String[] args) {
        Main instance = new Main();
        sc = instance.new Scanner();
        instance.solve();
    }

    private void solve() {
        try {
            N = sc.nextInt();
            K = sc.nextInt();
            long[] input = new long[100000];
            for (int i = 0; i < N; i++) {
                input[i] = sc.nextLong();
            }

            long min = Long.MAX_VALUE;

            for (int i = 0; i < N - K + 1; i++) {
                int left = i;
                int right = i + K - 1;
                long leftAbs = Math.abs(input[left]);
                long rightAbs = Math.abs(input[right]);
                long tmp;
                if ((input[left] > 0 && input[right] > 0) || (input[left] < 0 && input[right] < 0)) {
                    tmp = Math.max(leftAbs, rightAbs);
                }else
                    tmp = Math.min(leftAbs, rightAbs)*2 + Math.max(leftAbs, rightAbs);
                // System.out.println(String.format("%d: %d => %d",left,right, tmp));

                if (min > tmp) min = tmp;
            }

            System.out.println(min);


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