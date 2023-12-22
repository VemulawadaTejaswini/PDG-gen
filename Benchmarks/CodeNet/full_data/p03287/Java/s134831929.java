import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.BigInteger;

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
                int n = cin.nextInt();
                int m = cin.nextInt();
                long[] arr = new long[n];
                Arrays.fill(arr, 0);
                for (int i = 0; i < n; ++i) {
                    arr[i] = cin.nextLong();
                }
                for (int i = 0; i < n; ++i) {
                    if (i != 0) {
                        arr[i] += arr[i - 1];
                    }
                }
                for (int i = 0; i < n; ++i) {
                    arr[i] = arr[i] % m;
                }
                Map<Long, Integer> times = new TreeMap<>();
                times.clear();
                long result = 0;
                for (int i = 0; i < n; ++i) {
                    if (arr[i] == 0) {
                        result += 1;
                    }
                    if (times.containsKey(arr[i])) {
                        result += times.get(arr[i]);
                        times.replace(arr[i], times.get(arr[i]) + 1);
                    } else {
                        times.put(arr[i], 1);
                    }
                }
                cout.println(result);
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