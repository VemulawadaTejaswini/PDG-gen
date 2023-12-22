import java.io.*;
import java.util.*;

public class Main {

    private static FastReader in = new FastReader(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    private static final long MOD = (long) 1e9 + 7;

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static void solve() {
        int n = in.nextInt();
        String s = in.next();
        StrWrapper.init(s);

        int ans = 0;
        search:
        for (int i=1; i <= s.length()/2; i++) {
            for (int j=0; j+i <= s.length(); j++) {
                String sub1 = s.substring(j, j+i);
                String sub2 = s.substring(j+i);
                if (sub2.contains(sub1)) {
                    ans = i;
                    s = s.substring(j);
                    continue search;
                }
            }
            if (ans != i)
                break;
        }

        out.println(ans);
    }

    static class StrWrapper {
        static int[][] hash;

        static void init(String str) {
            hash = new int[str.length()][str.length()+1];
            int n = str.length();
            char[] ch = str.toCharArray();
            for (int i=0; i < n; i++) {
                int temp = 0;
                for (int j=0; i+j < n; j++) {
                    temp = temp * 31 + ch[i+j];
                    hash[i][i+j+1] = temp;
                }
            }
        }

        int begin;
        int end;

        StrWrapper(int begin, int end) {
            this.begin = begin;
            this.end = end;
        }

        @Override
        public int hashCode() {
            return hash[begin][end];
        }
    }

    // https://www.geeksforgeeks.org/fast-io-in-java-in-competitive-programming/
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader(InputStream inputStream) {
            br = new BufferedReader(new
                    InputStreamReader(inputStream));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException  e) {
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

        // https://qiita.com/masakinpo/items/5f77f2a879578a85a0bb
        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }

}
