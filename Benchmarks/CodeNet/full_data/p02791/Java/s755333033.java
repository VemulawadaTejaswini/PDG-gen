import java.util.*;
import java.io.*;
public class Main {
    static InputStreamReader r;
    public static void main(String[] args) throws Exception {
        r = new InputStreamReader(System.in);
        int N = nextInt();
        int[] P = new int[N];
        for (int i = 0; i < N; i++) {
            P[i] = nextInt();
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                if (P[i] > P[j]) break;
                if (i == j) ans++;
            }
        }

        System.out.println(ans);
    }

    public static String nextString() throws Exception {
        String res = "";
        while (true) {
            int c = r.read();
            if (c == 32 || c == 10 || c == -1) {
                break;
            }
            res += (char)c;
        }
        return res;
    }

    public static int nextInt() throws Exception {
        return Integer.parseInt(nextString());
    }

    public static long nextLong() throws Exception {
        return Long.parseLong(nextString());
    }

    public static double nextDouble() throws Exception {
        return Double.parseDouble(nextString());
    }
}