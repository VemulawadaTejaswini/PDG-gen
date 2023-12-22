import java.io.*;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        String ss = sc.nextLine();
        char[] t = sc.next().toCharArray();
        int n = t.length;
        StringBuilder sb = new StringBuilder();
        sb.append(ss);
        int m = ss.length();
        while (m < n) {
            sb.append(ss);
            m += ss.length();
        }
        sb.append(sb.toString());
        sb.append(sb.toString());
        sb.append(sb.toString());
        char[] s = sb.toString().toCharArray();
        int cnt = 0, i = 0;
        int ans = 0;
        for (char c : s) {
            if (i == n) {
                cnt++;
                ans = Math.max(ans, cnt);
                i = 0;
            }
            if (c == t[i]) i++;
            else {
                cnt = 0;
                i = 0;
            }
        }
        boolean f = false;
        for (char c : s) {
            if (i == n) {
                cnt++;
                ans = Math.max(ans, cnt);
                i = 0;
            }
            if (c == t[i]) i++;
            else {
                f = true;
                break;
            }
        }
        if (!f) {
            for (char c : s) {
                if (i == n) {
                    cnt++;
                    ans = Math.max(ans, cnt);
                    i = 0;
                }
                if (c == t[i]) i++;
                else {
                    f = true;
                    break;
                }
            }
            if (!f) ans = -1;

        }
        out.println(ans);
        out.flush();
        out.close();
    }


    static class Scanner {

        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream system) {
            br = new BufferedReader(new InputStreamReader(system));
        }


        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        public char nextChar() throws IOException {
            return next().charAt(0);
        }

        public Long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public boolean ready() throws IOException {
            return br.ready();
        }


        public int[] nextIntArray(int n) throws IOException {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public long[] nextLongArray(int n) throws IOException {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }


        public Integer[] nextIntegerArray(int n) throws IOException {
            Integer[] a = new Integer[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public double[] nextDoubleArray(int n) throws IOException {
            double[] ans = new double[n];
            for (int i = 0; i < n; i++)
                ans[i] = nextDouble();
            return ans;
        }

        public short nextShort() throws IOException {
            return Short.parseShort(next());
        }

    }
}