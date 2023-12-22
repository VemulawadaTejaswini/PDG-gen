import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        String s = sc.next(); String t = sc.next();
        int n = s.length(); int m = t.length();
        int [][] a = new int[n + 1][2];
        int [][] b = new int[m + 1][2];
        for (int i = 1; i <= n; i++) {
            a[i][0] = a[i - 1][0];
            a[i][1] = a[i - 1][1];
            if (s.charAt(i - 1) == 'A') a[i][0]++; else a[i][1]++;
        }
        for (int i = 1; i <= m; i++) {
            b[i][0] = b[i - 1][0];
            b[i][1] = b[i - 1][1];
            if (t.charAt(i - 1) == 'A') b[i][0]++; else b[i][1]++;
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int ss = sc.nextInt(); int se = sc.nextInt();
            int ts = sc.nextInt(); int te = sc.nextInt();
            int sa = a[se][0] - a[ss - 1][0];
            int sb = a[se][1] - a[ss - 1][1];
            int ta = b[te][0] - b[ts - 1][0];
            int tb = b[te][1] - b[ts - 1][1];
            if (((sa - sb) - (ta - tb)) % 3 == 0) {
                out.println("YES");
            } else {
                out.println("NO");
            }
        }
        out.close();
    }


    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }


    }

}