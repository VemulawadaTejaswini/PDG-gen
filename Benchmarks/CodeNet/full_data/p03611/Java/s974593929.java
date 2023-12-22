
import java.io.*;
import java.util.StringTokenizer;

public class Main {

    void solve() {
        int N = in.nextInt();
        int[] check = new int[100001];
        int result = 1;
        for (int i = 0; i < N; i++) {
            int temp = in.nextInt();
            check[temp]++;
            check[temp - 1]++;
            check[temp + 1]++;
        }
        for(int i = 0;i < check.length; i++) {
            result = Math.max(result, check[i]);
        }
        out.println(result);
    }


    FastScanner in;
    PrintWriter out;

    void run() {
        in = new FastScanner();
        out = new PrintWriter(System.out);
        solve();
        out.close();
    }

    public class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastScanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public String nextToken() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextToken());
        }

        public long nextLong() {
            return Long.parseLong(nextToken());
        }

        public double nextDouble() {
            return Double.parseDouble(nextToken());
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }

}