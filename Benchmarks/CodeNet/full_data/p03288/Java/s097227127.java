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
        int R = nextInt();
        if (R < 1200) {
            pw.print("ABC");
        } else if (R < 2800) {
            pw.print("ARC");
        } else {
            pw.print("AGC");
        }
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