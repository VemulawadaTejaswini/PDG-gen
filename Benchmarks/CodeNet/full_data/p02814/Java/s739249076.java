import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt(); long m = sc.nextLong();
        long [] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        Set<Integer> two = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int at = 0;
            long cur = a[i];
            while (cur % 2 == 0) {
                cur /= 2;
                at++;
            }
            two.add(at);
        }
        if (two.size() > 1) {
            out.println(0);
            out.close();
            return;
        }
        for (int i = 0; i < n; i++) a[i] = a[i] / 2;
        long lcm = a[0]; boolean bad = false;
        for (int i = 1; i < n; i++) {
            long gcd = gcd(lcm, a[i]);
            lcm = (lcm * a[i]) / gcd;
            if (lcm > m) {
                bad = true; break;
            }
        }
        if (bad) {
            out.println(0);
        } else {
            out.println(m / lcm - m / (2 * lcm));
        }
        out.close();
    }

    static long gcd(long a, long b)
    {
        if (b == 0)
            return a;
        return gcd(b, a % b);
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