import java.io.*;
import java.util.*;

public class Main {

    static int mod = 998244353;
    static int add(int a, int b) {
        int c = a + b;
        if (c >= mod) return c - mod;
        if (c < 0) return c + mod;
        return c;
    }
    static int mult(int a, int b) {
        long c = (long) a * b % mod;
        return (int) c;
    }
    public static int pow(int a, int b) {
        int ret = 1;
        while (b != 0) {
            if (b % 2 == 1) ret = mult(ret, a);
            a = mult(a, a);
            b >>= 1;
        }
        return ret;
    }
    static int count(int n) {
        int ch = pow(2, n);
        ch = add(ch, -1);
        ch = add(ch, -n);
        ch = add(ch, -n * (n - 1) / 2);
        return ch;
    }
    static boolean coline(int a1, int a2, int b1, int b2, int c1, int c2) {
        return (b1 - a1) * (c2 - a2) == (b2 - a2) * (c1 - a1);
    }
    static int segCount(int n) {
        int ch = pow(2, n);
        ch = add(ch, -1);
        return ch;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] points = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                points[i][j] = sc.nextInt();
            }
        }
        int tot = count(n);
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int col = 0;
                for (int k = j + 1; k < n; k++) {
                    if (coline(points[i][0], points[i][1], points[j][0], points[j][1], points[k][0], points[k][1])) {
                        col++;
                    }
                }
                if (col > 0) {
                    tot = add(tot, -segCount(col));
                }
            }
        }
        System.out.println(tot);
    }

    public static class Scanner {
        StringTokenizer st;
        BufferedReader br;
        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }
        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }
        public int nextInt() throws IOException{
            return Integer.parseInt(next());
        }
    }
}