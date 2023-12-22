import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        InputReader in = new InputReader();
        PrintWriter out = new PrintWriter(System.out);
        int test_cases = 1;
        Solver s = new Solver();
        for (int i = test_cases; i >= 1; i--) {
            s.solve(1, in, out);
        }
        out.close();
    }

    static class Solver {

        public void solve(int test_number, InputReader in, PrintWriter out) throws IOException {
            int n = in.nextInt();
            long gcd = 0, mul = 1, max = -1;
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextLong();
                gcd = findGcd(gcd, a[i]);
                mul *= a[i];
                max = Math.max(max, a[i]);
            }
            Arrays.sort(a);
            if (gcd == 1) {
                out.println(findTime(a, a[n - 1]));
            } else {
                out.print(mul / gcd);
            }
        }

        private long findTime(long[] a, long x) {
            for (long i = x; i <= 1e18; i += x) {
                if (check(a, i)) return i;
            }
            return -1;
        }

        private boolean check(long[] a, long d) {
            for (int i = 0; i < a.length; i++) if (d % a[i] != 0) return false;
            return true;
        }

        private long findGcd(long a, long b) {
            while (b > 0) {
                long t = a % b;
                a = b;
                b = t;
            }
            return a;
        }

    }
    static class InputReader {
        BufferedReader br;
        StringTokenizer st;

        public InputReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
}