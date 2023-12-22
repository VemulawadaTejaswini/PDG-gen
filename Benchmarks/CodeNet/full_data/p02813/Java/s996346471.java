import java.util.*;
import java.io.*;
public class Main {
    static InputStreamReader r;
    static int N;
    public static void main(String[] args) throws Exception {
        r = new InputStreamReader(System.in);
        N = nextInt();
        int Po = calc();
        int Qo = calc();
        System.out.println(Math.abs(Po-Qo));
    }

    public static int calc() throws Exception {
        int res = 1;
        boolean used[] = new boolean[N+1];
        int order = 1;
        for (int i = N; i > 0; i--) {
            int digit = nextInt();
            int rank = 0;
            for (int j = 1; j <= N; j++) {
                if (digit == j) {
                    used[j] = true;
                    break;
                } else if (used[j]) {
                    continue;
                } else {
                    rank++;
                }
            }
            res += fact(i-1) * (rank);
        }
        return res;
    }

    public static int fact(int i) {
        return i == 0 ? 1 : i * fact(i-1);
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
}
