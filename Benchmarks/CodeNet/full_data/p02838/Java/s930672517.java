import java.io.*;
import java.math.BigInteger;
import java.util.*;

@SuppressWarnings("Duplicates")

public class Main {
    FastScanner in;
    PrintWriter out;
    boolean systemIO = true, multitests = false;
    int INF = Integer.MAX_VALUE / 2;
    long mod = (long) 1e9 + 7;

    void solve() {
        int n = in.nextInt();
        long[] arr = new long[n];
        int[] V = new int[64];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextLong();
            String x = reverseString(Long.toBinaryString(arr[i]));
            for (int j = 0; j < x.length(); j++) {
                V[j] += x.charAt(j) - '0';
            }
        }
        long ans = 0;
        for (int i = 0; i < n; i++) {
            String x = reverseString(Long.toBinaryString(arr[i]));
            for (int j = 0; j < 64; j++) {
                if (j < x.length()) {
                    if (x.charAt(j) == '1') {
                        ans = (ans + (n - V[j]) * ((1L << j) % mod) % mod) % mod;
                    } else {
                        ans = (ans + V[j] * ((1L << j) % mod) % mod) % mod;
                    }
                } else {
                    ans = (ans + V[j] * ((1L << j) % mod) % mod) % mod;
                }
            }
        }
        System.out.println(ans / 2);
    }

    String reverseString(String x) {
        StringBuilder l = new StringBuilder(x);
        l.reverse();
        return l.toString();
    }

    class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(File f) {
            try {
                br = new BufferedReader(new FileReader(f));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        FastScanner(InputStream f) {
            br = new BufferedReader(new InputStreamReader(f));
        }

        String nextLine() {
            try {
                return br.readLine();
            } catch (IOException e) {
                return null;
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
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

    }

    //String.format("%8.3f", ans1).replace(',', '.')
    private void run() throws IOException {
        if (systemIO) {
            in = new Main.FastScanner(System.in);
            out = new PrintWriter(System.out);
        } else {
            in = new Main.FastScanner(new File("INPUT.txt"));
            out = new PrintWriter(new File("OUTPUT.txt"));
        }
        for (int t = multitests ? in.nextInt() : 1; t-- > 0; )
            solve();

        out.close();
    }

    public static void main(String[] arg) throws IOException {
        new Main().run();
    }

}
