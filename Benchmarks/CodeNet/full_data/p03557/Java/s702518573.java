import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
//        InputReader in = new InputReader(new FileInputStream("/Users/KeFA/projects/competitve/src/main/java/input.txt"));
        PrintWriter out = new PrintWriter(System.out);

        while (in.ready()) {
            int n = in.nextInt();
            long[] a, b, c;
            a = new long[n];
            b = new long[n];
            c = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = in.nextLong();
            }
            for (int i = 0; i < n; i++) {
                b[i] = in.nextLong();
            }
            for (int i = 0; i < n; i++) {
                c[i] = in.nextLong();
            }

            Arrays.sort(a);
            Arrays.sort(b);
            Arrays.sort(c);
            long ans = 0;

            for (int i = 0; i < n; i++) {
                int ai = Arrays.binarySearch(a, b[i]);
                int ci = Arrays.binarySearch(c, b[i]);
                if (ai < 0) {
                    ai = -(ai + 2);
                } else {
                    ai--;
                }
                if (ci < 0) {
                    ci = -(ci + 1);
                } else {
                    ci++;
                }

                ans += (ai + 1) * (n - ci);
            }

            System.out.println(ans);
        }
        out.flush();
        out.close();
    }

    private static class InputReader {
        StringTokenizer st;
        BufferedReader br;

        public InputReader(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public double nextDouble() throws IOException {
            String x = next();
            StringBuilder sb = new StringBuilder("0");
            double res = 0, f = 1;
            boolean dec = false, neg = false;
            int start = 0;
            if (x.charAt(0) == '-') {
                neg = true;
                start++;
            }
            for (int i = start; i < x.length(); i++)
                if (x.charAt(i) == '.') {
                    res = Long.parseLong(sb.toString());
                    sb = new StringBuilder("0");
                    dec = true;
                } else {
                    sb.append(x.charAt(i));
                    if (dec)
                        f *= 10;
                }
            res += Long.parseLong(sb.toString()) / f;
            return res * (neg ? -1 : 1);
        }

        public boolean ready() throws IOException {
            return br.ready();
        }
    }
}