import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt(); int p = sc.nextInt();
        String s = sc.next();
        int [] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = s.charAt(i) - '0';
        long ret = 0;
        if (p == 2 || p == 5) {
            for (int i = 0; i < n; i++) {
                if (a[i] % p == 0) ret += (i + 1);
            }
        } else {
            Map<Long, Long> map = new HashMap<>();
            long pow = 1; long cur = 0;
            for (int i = n - 1; i >= 0; i--) {
                cur = (cur + pow * a[i]) % p;
                if (cur == 0) ret++;
                ret += map.getOrDefault(cur, 0L);
                map.put(cur, map.getOrDefault(cur, 0L) + 1);
                pow = (pow * 10) % p;
            }
        }
        out.println(ret);
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