import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static int MOD = 1000 * 1000 * 1000 + 7;

    public static void main(String[] args){
        PrintWriter out = new PrintWriter(System.out);
        FastScanner sc = new FastScanner();

        int N = sc.nextInt();
        int K = sc.nextInt();
        ArrayList[] links = new ArrayList[N];
        for (int i=0;i<N;i++) {
            links[i] = new ArrayList<Integer>();
        }

        for (int i=0;i<N-1;i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            links[a].add(b);
            links[b].add(a);
        }

        long ans = solve(0, -1, K, N, K, links);

        out.println(ans);
        out.flush();
    }

    public static long solve(int now, int parent, int choiced_colors, int N, int K, ArrayList<Integer>[] links) {
        long num = 1;

        if (links[now].size() >= K) {
            return 0;
        }

        int m = 0;
        for (int i: links[now]) {
            if (i == parent) continue;

            int _choiced_colors = K;
            if (parent == -1) {
                _choiced_colors = K - m - 1;
            } else {
                _choiced_colors = K - m - 2;
            }

            long n = solve(i, now, _choiced_colors, N, K, links);

            num *= n;
            num %= MOD;
            m++;
        }

        num *= choiced_colors;
        num %= MOD;

        return num;
    }


    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String nextToken() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(nextToken());
        }

        long nextLong() {
            return Long.parseLong(nextToken());
        }

        double nextDouble() {
            return Double.parseDouble(nextToken());
        }

        int[] nextIntArray(int N) {
            int a[] = new int[N];
            for (int i=0;i<N;i++) {
                a[i] = this.nextInt();
            }

            return a;
        }

        long[] nextLongArray(int N) {
            long a[] = new long[N];
            for (int i=0;i<N;i++) {
                a[i] = this.nextLong();
            }

            return a;
        }

        double[] nextDoubleArray(int N) {
            double a[] = new double[N];
            for (int i=0;i<N;i++) {
                a[i] = this.nextDouble();
            }

            return a;
        }

        String[] nextTokenArray(int N) {
            String a[] = new String[N];
            for (int i=0;i<N;i++) {
                a[i] = this.nextToken();
            }

            return a;
        }
    }
}

