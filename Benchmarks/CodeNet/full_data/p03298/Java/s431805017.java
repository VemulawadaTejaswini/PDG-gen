import java.io.*;
import java.util.*;

public class Main {
    FastScanner in;
    PrintWriter out;

    void solve() {
        int n = in.nextInt();
        char[] s = in.next().toCharArray();
        Random rnd = new Random(123);
        long[] magic = new long[n];
        for (int i = 0; i < n; i++) {
            magic[i] = rnd.nextLong();
        }
        long[] magic2 = new long[n + 1];
        for (int i = 0; i <= n; i++) {
            magic2[i] = rnd.nextLong();
        }
        HashMap<Long, Integer> count = new HashMap<>();
        for (int mask = 0; mask < 1 << n; mask++) {
            long hash = 0;
            int it = 0, it2 = n - 1;
            for (int i = 0; i < n; i++) {
                if (((1 << i) & mask) != 0) {
                    hash += magic[it++] * s[i];
                } else {
                    hash += magic[it2--] * s[i];
                }
            }
            hash *= magic2[Integer.bitCount(mask)];
            Integer now = count.get(hash);
            if (now == null) {
                count.put(hash, 1);
            } else {
                count.put(hash, now + 1);
            }
        }
        long result = 0;
        for (int mask = 0; mask < 1 << n; mask++) {
            long hash = 0;
            int it = 0, it2 = n - 1;
            for (int i = 0; i < n; i++) {
                if (((1 << i) & mask) != 0) {
                    hash += magic[it++] * s[s.length - 1 - i];
                } else {
                    hash += magic[it2--] * s[s.length - 1 - i];
                }
            }
            hash *= magic2[Integer.bitCount(mask)];
            Integer now = count.get(hash);
            if (now != null) {
                result += now;
            }
        }
        out.println(result);
    }

    void run() {
        try {
            in = new FastScanner(new File("Main.in"));
            out = new PrintWriter(new File("Main.out"));

            solve();

            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    void runIO() {

        in = new FastScanner(System.in);
        out = new PrintWriter(System.out);

        solve();

        out.close();
    }

    class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(File f) {
            try {
                br = new BufferedReader(new FileReader(f));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public FastScanner(InputStream f) {
            br = new BufferedReader(new InputStreamReader(f));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return null;
                st = new StringTokenizer(s);
            }
            return st.nextToken();
        }

        boolean hasMoreTokens() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return false;
                st = new StringTokenizer(s);
            }
            return true;
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
    }

    public static void main(String[] args) {
        new Main().runIO();
    }
}