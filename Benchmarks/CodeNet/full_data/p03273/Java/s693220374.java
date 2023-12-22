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
        int h = nextInt();
        int w = nextInt();
        
        char a[][] = new char[h][w];
        nextLine();
        for (int i = 0; i < h; i++) {
            a[i] = nextLine().toCharArray();
        }
        
        boolean vstH[] = new boolean[h];
        boolean vstW[] = new boolean[w];

        for (int i = 0; i < h; i++) {
            boolean flag = true;
            for (int j = 0; j < w; j++) {
                if (a[i][j] == '#') {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                vstH[i] = true;
            }
        }
        for (int i = 0; i < w; i++) {
            boolean flag = true;
            for (int j = 0; j < h; j++) {
                if (a[j][i] == '#') {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                vstW[i] = true;
            }
        }

        for (int i = 0; i < h; i++) {
            if (vstH[i]) {
                continue;
            }
            for (int j = 0; j < w; j++) {
                if (!vstW[j]) {
                    pw.print(a[i][j]);
                }
            }
            if (i < h - 1) {
                pw.println();
            }
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