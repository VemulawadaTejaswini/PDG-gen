import java.io.*;

/**
 * Copyright © 2018 Chris. All rights reserved.
 *
 * @author Chris
 * 2018/6/23 11:55
 * @see meituan.n2018.Bturn
 */
public class Main {


    private static BufferedReader br;
    private static StreamTokenizer st;
    private static PrintWriter pw;

    private static void solve() throws IOException {
        int T = nextInt();

        while (T-- > 0) {
            boolean ans = true;

            long A = nextLong();
            long B = nextLong();
            long C = nextLong();
            long D = nextLong();

            if (A < B) {
                ans = false;
            }

            long remain = A % B;
            if (remain > C && remain < B) {
                ans = false;
            }
            if (remain + D < B) {
                ans = false;
            }

            if (D < B) {
                ans = false;
            }

            if (C < B - 1) {
                if (ans && C < B - 2 && D != B) {
                    ans = false;
                }
                if (ans && C == B - 2 && D > B) {
                    if (C % 2 != (D - B) % 2) {
                        ans = false;
                    }
                }
            }

            if (ans) {
                pw.print("Yes");
            } else {
                pw.print("No");
            }
            if (T > 0) {
                pw.println();
            }
        }
    }

    public static void main(String args[]) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StreamTokenizer(br);
        pw = new PrintWriter(new OutputStreamWriter(System.out));
        st.ordinaryChar('\''); //指定单引号、双引号和注释符号是普通字符
        st.ordinaryChar('\"');
        st.ordinaryChar('/');

        long t = System.currentTimeMillis();
        solve();
        pw.flush();
    }


    private static int nextInt() throws IOException {
        st.nextToken();
        return (int) st.nval;
    }

    private static long nextLong() throws IOException {
        st.nextToken();
        return (long) st.nval;
    }

    private static double nextDouble() throws IOException {
        st.nextToken();
        return st.nval;
    }

    private static String[] nextSS(String reg) throws IOException {
        return br.readLine().split(reg);
    }

    private static String nextLine() throws IOException {
        return br.readLine();
    }
}