import java.util.*;
import java.io.*;

public class Main {
    static int m;
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int k = sc.nextInt(); int q = sc.nextInt();
        long [] d = new long[k];
        for (int i = 0; i < k; i++) d[i] = sc.nextLong();
        for (int qq = 0; qq < q; qq++) {
            long n = sc.nextLong();
            long x = sc.nextLong();
            m = sc.nextInt();
            long [] pref = new long[k];
            pref[0] = mod(d[0]);
            for (int i = 1; i < k; i++) {
                pref[i] = pref[i - 1] + mod(d[i]);
            }
            long times = (n - 1) / k;
            long total = x + times * pref[k - 1];
            int rem = (int) (n - 1) % k - 1;
            if (rem >= 0) total += pref[rem];
            long bad = total / m - x / m;
            out.println(n - 1 - bad);
        }
        out.close();
    }

    static long mod(long input) {
        return (input % m == 0 ? m : input % m);
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