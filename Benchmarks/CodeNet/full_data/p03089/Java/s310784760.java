import java.io.*;
import java.util.*;

public class Main {
    FastScanner in;
    PrintWriter out;

    int[] getans(int[] a) {
        if (a.length == 0) {
            return new int[]{};
        }
        for (int pos = a.length - 1; pos >= 0; pos--) {
            if (a[pos] == pos + 1) {
                int[] tmp = new int[a.length - 1];
                for (int i = 0; i < a.length; i++) {
                    if (i < pos) {
                        tmp[i] = a[i];
                    } else if (i > pos) {
                        tmp[i - 1] = a[i];
                    }
                }
                int[] r = getans(tmp);
                if (r == null) {
                    return null;
                }
                r = Arrays.copyOf(r, r.length + 1);
                r[r.length - 1] = pos + 1;
                return r;
            }
        }
        return null;
    }

    void solve() {
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int[] ans = getans(a);
        if (ans == null) {
            out.println(-1);
        } else {
            for (int x : ans) {
                out.println(x);
            }
        }
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