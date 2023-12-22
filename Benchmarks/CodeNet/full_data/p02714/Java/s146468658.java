
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
        char[] s = sc.next().toCharArray();
        HashSet<Integer> r = new HashSet<>(), g = new HashSet<>(), b = new HashSet<>();
        for (int i = 0; i < n; i++)
            switch (s[i]) {
                case 'R':
                    r.add(i);
                    break;
                case 'G':
                    g.add(i);
                    break;
                case 'B':
                    b.add(i);
                    break;
            }
        long ans = 0;
        for (int x : r) {
            for (int y : g) {
                ans += b.size();
                int i = Math.min(x, y), j = Math.max(x, y);
                int diff = j - i;
                if (b.contains(i - diff)) ans--;
                if (b.contains(j + diff)) ans--;
                if (diff % 2 == 0 && b.contains(i + diff / 2))
                    ans--;
            }
        }
        out.println(ans);
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
