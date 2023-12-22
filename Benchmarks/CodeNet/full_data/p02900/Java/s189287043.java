import java.util.*;
import java.io.*;

public class Main {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
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

    static FastReader sc = new FastReader();
    static final double E = 0.000000001;
    static final long MOD = (long) (1e9 + 7);
    static final long MAX = (long) 1e9;

    public static void main(String[] args) throws IOException {
        long a = sc.nextLong();
        long b = sc.nextLong();
        long gcd = gcd(a, b);
        int res = 1;
        if(gcd%2 == 0)
        {
            res++;
            while(gcd%2 == 0)
            {
                gcd/=2;
            }
        }
        for (long i = 3; i*i <=gcd ; i+=2) {
            if(gcd % i == 0)
            {
                res++;
                while(gcd%i == 0)
                    gcd/=i;
            }
        }
        if(gcd > 2)
            res++;
        System.out.println(res);
    }

    static long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);

    }


}
