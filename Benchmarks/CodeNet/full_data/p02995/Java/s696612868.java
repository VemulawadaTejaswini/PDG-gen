import java.io.*;
import java.util.*;

public class Main {

    static long gcd(long a, long b) {
        if (b < a) {
            return gcd(b, a);
        }
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

    public static void main(String[] args) throws Exception {
        MyScanner scan = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));

        long a = scan.nextLong();
        long b = scan.nextLong();
        long c = scan.nextLong();
        long d = scan.nextLong();

        long botC = (a - 1) / c;
        long topC = (b) / c;
        long allC = topC - botC;

        long botD = (a - 1) / d;
        long topD = (b) / d;
        long allD = topD - botD;

        long gcd = gcd(c, d);
        long botCD = (a - 1) / ((c / gcd) * (d / gcd) * gcd);
        long topCD = (b) / ((c / gcd) * (d / gcd) * gcd);
        long allCD = topCD - botCD;

        long output = (b - a + 1) - allC - allD + allCD;

        out.println(output);
        out.close();
    }


    //-----------PrintWriter for faster output---------------------------------
    public static PrintWriter out;

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
    //--------------------------------------------------------

}