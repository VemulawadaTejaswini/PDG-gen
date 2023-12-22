

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    private void solve() {
        String s = in.next();
        int[] counter = new int[256];
        loop: {
            for (int i = 2; i < s.length(); ++i) {
                for (int j = 0; j + i <= s.length(); ++j) {
                    Arrays.fill(counter, 0);
                    for (int k = j; k < j + i; ++k) {
                        counter[s.charAt(k)]++;
                    }
                    for (int k = 0; k < 256; ++k) {
                        if (counter[k] > (i / 2)) {
                            out.println((j + 1) + " " + (j + i));
                            break loop;
                        }
                    }
                }
            }
            out.println("-1 -1");
        }
    }

    private class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
            st = new StringTokenizer("");
        }

        String next() {
            while (!st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
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

    private FastScanner in;
    private PrintWriter out;


    private void run() {
        try {
            in = new FastScanner();
            out = new PrintWriter(new BufferedOutputStream(System.out));
            solve();
        } catch (Exception e) {
            throw e;
        } finally {
            out.close();
        }
    }


    public static void main(String[] arg) {
        new Main().run();
    }
}


