import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        try {
            InputReader in;
            PrintWriter out;
            boolean useOutput = false;
            // if (System.getProperty("ONLINE_JUDGE") == null) useOutput = true;
            if (useOutput) {
                FileInputStream fin = new FileInputStream(new File("src/testdata.in"));
                in = new InputReader(fin);
                FileOutputStream fout = new FileOutputStream(new File("src/testData.out"));
                out = new PrintWriter(fout);
            } else {
                InputStream inputStream = System.in;
                in = new InputReader(inputStream);
                OutputStream outputStream = System.out;
                out = new PrintWriter(outputStream);
            }
            Solver solver = new Solver();
            solver.solve(in, out);
            out.close();
            // fin.close();
            // fout.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static class Solver
    {

        public void solve (InputReader cin, PrintWriter cout)
        {
            try {
                int n;
                long[] arr, xorarr, sumarr;
                long ans = 0;
                n = cin.nextInt(); 
                arr = new long[n + 2]; xorarr = new long[n + 2]; sumarr = new long[n + 2];
                for (int i = 1; i < n + 1; ++i) arr[i] = cin.nextLong();
                xorarr[0] = 0;
                sumarr[0] = 0;
                for (int i = 1; i < n + 1; ++i) {
                    xorarr[i] = xorarr[i - 1] ^ arr[i];
                    sumarr[i] = sumarr[i - 1] + arr[i];
                }
                xorarr[n + 1] = xorarr[n]; sumarr[n + 1] = sumarr[n];
                ans += n; // for all length = 1
                for (int i = 1; i < n; ++i) {
                    int l = i, r = n + 1;
                    while (l < r) {
                        int mid = (l + r) / 2;
                        if ((xorarr[mid] ^ xorarr[i - 1]) == (sumarr[mid] - sumarr[i - 1])) {
                            l = mid + 1;
                        } else {
                            r = mid;
                        }
                    }
                    if (l - 1 > i) ans += l - 1 - i;
                }
                cout.println(ans);
            } catch (RuntimeException e) {
                e.printStackTrace();
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }

        }
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong () {
            return Long.parseLong(next());
        }

        public double nextDouble () {
            return Double.parseDouble(next());
        }

    }

}