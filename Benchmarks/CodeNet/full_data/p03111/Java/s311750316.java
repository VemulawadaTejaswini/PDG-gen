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
    int N, A, B, C;
    List<Integer> l = new ArrayList<>();

    private void solve() {
        try {
            N = sc.nextInt();
            A = sc.nextInt();
            B = sc.nextInt();
            C = sc.nextInt();
            for (int i = 0; i < N; i++) {
                l.add(sc.nextInt());
            }
            System.out.println(dfs(0,0,0,0));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private int dfs(int cur, int a, int b, int c) {
        if (cur == N) {
            return Math.min(Math.min(a,b), c) > 0 ? Math.abs(a- A) + Math.abs(b - B) + Math.abs(c - C)-30 : 100000000;
        }
        int r0 = dfs(cur+1, a, b, c);
        int r1 = dfs(cur+1, a+l.get(cur), b, c)+10;
        int r2 = dfs(cur+1, a, b+l.get(cur), c)+10;
        int r3 = dfs(cur+1, a, b, c+l.get(cur))+10;
        return Math.min(r0, Math.min(r1, Math.min(r2, r3)));
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