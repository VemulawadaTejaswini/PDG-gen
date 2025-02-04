
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner();
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        int[] cnt = new int[n];
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt() - 1;
            cnt[a[i]]++;
        }
        long ans = 0;
        for (int x : cnt)
            ans += 1l * x * (x - 1) / 2;
        for (int x : a) {
            ans -= 1l * cnt[x] * (cnt[x] - 1) / 2;
            cnt[x]--;
            ans += 1l * cnt[x] * (cnt[x] - 1) / 2;
            out.println(ans);
            ans -= 1l * cnt[x] * (cnt[x] - 1) / 2;
            cnt[x]++;
            ans += 1l * cnt[x] * (cnt[x] - 1) / 2;
        }
        out.flush();
        out.close();
    }


    static class Scanner {
        BufferedReader br;
        StringTokenizer st;

        boolean ready() throws IOException {
            return br.ready();
        }

        double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        Scanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        int nextChar() throws IOException {
            return next().charAt(0);
        }

        int[] nextIntArray(int n) throws IOException {
            int[] ans = new int[n];
            for (int i = 0; i < n; i++)
                ans[i] = nextInt();
            return ans;
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }

    }
}
