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
        int N = nextInt();
        int K = nextInt();

        int x[] = new int[N];
        int mid = 0;
        for (int i = 0; i < N; i++) {
            x[i] = nextInt();
            if (x[i] <= 0) {
                mid = i;
            }
        }

        int min = Integer.MAX_VALUE;
        if (x[0] >= 0) {
            min = x[K - 1];
        } else if (x[mid] == 0) {
            for (int i = Math.max(0, mid - K + 1); i <= mid && (i + K - 1 < N); i++) {
                if (i == mid) {
                    if (i + K - 1 < N) {
                        min = Math.min(min, x[i + K - 1] - x[i]);
                    }
                } else {
                    min = Math.min(min, x[i + K - 1] - x[i] + Math.min(x[i + K - 1] - x[mid], x[mid] - x[i]));
                }
            }
        } else {
            for (int i = Math.max(0, mid - K + 1); i <= mid + 1 && (i + K - 1 < N); i++) {
                if (i > mid) {
                    if (i + K - 1 < N) {
                        min = Math.min(min, x[i + K - 1]);
                    }
                } else {
                    min = Math.min(min, x[i + K - 1] - x[i] + Math.min(x[i + K - 1], -x[i]));
                }
            }
        }
        pw.print(min);
    }

    public static void main(String args[]) throws IOException {
//        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
//        if (!oj) {
//            System.setIn(new FileInputStream("src/in.txt"));
//        }
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StreamTokenizer(br);
        pw = new PrintWriter(new OutputStreamWriter(System.out));
        st.ordinaryChar('\''); //指定单引号、双引号和注释符号是普通字符
        st.ordinaryChar('\"');
        st.ordinaryChar('/');

        long t = System.currentTimeMillis();
        solve();
//        if (!oj) {
//            pw.println("[" + (System.currentTimeMillis() - t) + "ms]");
//        }
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