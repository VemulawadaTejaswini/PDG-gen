import java.util.*;
import java.io.*;
public class Main {
    static InputStreamReader r;
    public static void main(String[] args) throws Exception {
        r = new InputStreamReader(System.in);
        long N = nextInt();
        long rdN = N / 10 * 10;
        long count = 0;
        for (long i = rdN + 1; i <= N; i++) {
            String si = "" + i;
            long i_fd = Integer.parseInt(si.substring(0, 1));
            long i_ld = Integer.parseInt(si.substring(si.length() - 1, si.length()));
            for (long j = 1; j <= i; j++) {
                String sj = "" + j;
                long j_fd = Integer.parseInt(sj.substring(0, 1));
                long j_ld = Integer.parseInt(sj.substring(sj.length() - 1, sj.length()));
                if (i_fd == j_ld && i_ld == j_fd) {
                    if (i == j) {
                        count++;
                    } else {
                        count += 2;
                    }
                }
            }
        }

        long ans = N < 10 ? count : rdN * rdN / 100 + 8 + count;
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