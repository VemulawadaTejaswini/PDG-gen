import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner();
        PrintWriter out = new PrintWriter(System.out);
        int a = sc.nextInt(), b = sc.nextInt();
        int sockets = 1;
        int ans = 0;
        while (sockets < b) {
            sockets += a - 1;
            ans++;
        }
        out.println(ans);
        out.flush();
        out.close();
    }

    static class Scanner {
        BufferedReader br;
        StringTokenizer st;

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

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        Integer[] nextIntegerArray(int n) throws IOException {
            Integer[] ans = new Integer[n];
            for (int i = 0; i < n; i++)
                ans[i] = nextInt();
            return ans;
        }

        double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        int[] nextIntArray(int n) throws IOException {
            int[] ans = new int[n];
            for (int i = 0; i < n; i++)
                ans[i] = nextInt() - 1;
            return ans;
        }

    }


}