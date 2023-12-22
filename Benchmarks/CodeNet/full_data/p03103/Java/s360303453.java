package abc121c;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

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
            int M = sc.nextInt();
            int[][] data = new int[N][];
            for (int i = 0; i < N; i++) {
                data[i] = new int[2];
                data[i][0] = sc.nextInt();
                data[i][1] = sc.nextInt();
            }
            Arrays.sort(data, (a,b) -> a[0] - b[0]);
            long sum = 0;
            int index = 0;
            while(M != 0) {
                if (M - data[index][1] < 0) {
                    sum += (long) data[index][0] * M;
                    M = 0;
                    index++;
                } else {
                    M = M - data[index][1];
                    sum += (long) data[index][0] * (long) data[index][1];
                    index++;
                }
            }
            System.out.println(sum);

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