    import java.util.*;
    import java.io.*;

    public class Main {

    void solve(InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int[] arr = new int[n];
        int[] cnt = new int[n + 1];
        for (int i = 0; i < n; ++i) {
            arr[i] = in.nextInt();
            ++cnt[arr[i]];
        }

        long sum = 0;
        for (int i = 1; i <= n; ++i) {
            sum += nc2(cnt[i]);
        }

        for (int i = 0; i < n; ++i) {
            long ans = sum - nc2(cnt[arr[i]]);
            ans += nc2(cnt[arr[i]] - 1);
            out.println(ans);
        }
    }

    public long nc2(long n) {
        return (n*(n-1)) >> 1l;
    }

    

    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);
        Main solver = new Main();
        solver.solve(in, out);
        out.close();
    }

    static class InputReader {
        BufferedReader in;
        StringTokenizer st;

        public InputReader(InputStream is) {
        in = new BufferedReader(new InputStreamReader(is));
        }

        public String next() {
        try {
            while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(in.readLine());
            }
            return st.nextToken();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        }

        public int nextInt() {
        return Integer.parseInt(next());
        }

        public long nextLong() {
        return Long.parseLong(next());
        }
    }
    }
