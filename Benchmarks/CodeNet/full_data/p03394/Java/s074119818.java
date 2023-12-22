import java.io.*;
import java.util.*;

public class Main {
    FastScanner in;
    PrintWriter out;

    int[] solve(int n) {
        int[] res = new int[n];
        int it = 0;
        long sum = 0;
        for (int x = 2; x <= 30000; x++) {
            if (x % 2 == 0 || x % 3 == 0 || x % 5 == 0) {
                if (it == n - 1) {
//                    System.err.println("sum = " + sum % 30);
                    if ((sum + x) % 30 == 0) {
                        res[it++] = x;
                        break;
                    }
                } else {
                    if (it == n - 2) {
                        int cc = (int) ((sum + x) % 30);
                        int rem = 30 - cc;
                        if (rem % 2 == 0 || rem % 3 == 0 || rem % 5 == 0) {
                            sum += x;
                            res[it++] = x;
                        }
                    } else {
                        sum += x;
                        res[it++] = x;
                    }
                }
            }
        }
        for (int i : res) {
            if (i == 0) {
                throw new AssertionError();
            }
//            out.print(i + " ");
        }
        return res;
    }

    void solve() {
//        for (int n = 3; ;n++) {
//            System.err.println(n);
//            solve(n);
//        }
        int n = in.nextInt();
        int s = 0;
        int[] res = solve(n);
        for (int i : res) {
            if (i == 0) {
                throw new AssertionError();
            }
            out.print(i + " ");
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