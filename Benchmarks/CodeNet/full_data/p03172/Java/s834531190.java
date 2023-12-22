import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static final int mod = (int) (1e9 + 7);

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner();
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        if (k == 0) out.println(1);
        else {
            int[][] memo = new int[n + 1][k + 1];
            Arrays.fill(memo[n], 1);
            for (int i = n - 1; i >= 0; i--) {
                for (int rem = k; rem >= 0; rem--) {
                    memo[i][rem] = memo[i + 1][rem];
                    if (rem - a[i] - 1 >= 0) memo[i][rem] = add(memo[i][rem], -memo[i + 1][rem - a[i] - 1]);
                }
                for (int rem = 1; rem <= k; rem++)
                    memo[i][rem] = add(memo[i][rem], memo[i][rem - 1]);
            }
            out.println(add(memo[0][k], -memo[0][k - 1]));
        }
        out.flush();
        out.close();
    }

    static int add(int a, int b) {
        long c = a + b;
        if (c >= mod) c -= mod;
        if (c < 0) c += mod;
        return (int) c;
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
    }
}
