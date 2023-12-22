


import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    private void solve() {
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = in.nextInt();
        }
        int pairs = 0;
        for (int i = 0; i < n; ++i) {
            pairs += arr[i] / 2;
            arr[i] = arr[i] % 2;
            if (i != 0 && arr[i] == 1 && arr[i - 1] == 1) {
                pairs++;
                arr[i] = 0;
                arr[i - 1] = 0;
            }
        }
        out.println(pairs);
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



