import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        long i = sc.nextInt(); long o = sc.nextInt();
        long t = sc.nextInt(); long j = sc.nextInt();
        long l = sc.nextInt(); long s = sc.nextInt();
        long z = sc.nextInt();
        long ans = o * 2;
        long alone = 4 * (i / 2) + 4 * Math.min(j, l);
        if (i % 2 == 1 && (j >= 1 && l >= 1)) alone += 2;
        long min = Math.min(Math.min(i, j), l);
        long together = 6 * min + 4 * ((i - min) / 2) + 4 * (Math.min(j, l) - min);
        ans += Math.max(alone, together);
        out.println(ans / 2);
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