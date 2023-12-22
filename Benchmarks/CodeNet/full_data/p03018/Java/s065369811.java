
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Main {
    private static Scanner sc;
    public static void main(String[] args) {
        Main instance = new Main();
        sc = instance.new Scanner();
        instance.solve();
    }

    private void solve() {
        try {
            String s = sc.next();
            int count = 0;
            StringBuilder sb = new StringBuilder(s);
            int i = 0;
            int acount = 0;
            boolean hoge = false;
            boolean huga = false;
            while (i < s.length() - 2) {
                if (s.charAt(i) == 'A' && s.charAt(i+1) == 'B' && s.charAt(i+2) == 'C') {
                    count += 1 + acount;
                    if (huga) count ++;
                    hoge = true;
                    huga = true;
                    acount = 0;
                    sb.setCharAt(i, 'B');
                    sb.setCharAt(i+1, 'C');
                    sb.setCharAt(i+2, 'A');
                    i += 3;
                    continue;
                }

                if (s.charAt(i) == 'A') {
                    acount ++;
                    hoge = false;
                    i ++;
                    continue;
                }

                if (s.charAt(i) == 'B' && s.charAt(i+1) == 'C' && hoge) {
                    i += 2;
                    count ++;
                    acount = 0;
                    continue;
                }

                hoge = false;
                huga = false;
                acount = 0;
                i++;
            }
            System.out.println(count);
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