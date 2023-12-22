import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Map.Entry;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] count = new int[n + 1];
            int noneZero = 0;
            for (int i = 0; i < n; i++) {
                int a = in.nextInt();
                count[a]++;
                if (count[a] == 1) {
                    noneZero++;
                }
            }
            Arrays.sort(count);
            int i = 0;
            while (count[i] == 0) i++;
            int sum = 0;
            while (noneZero > k) {
                sum += count[i];
                i++;
                noneZero--;
            }
            out.println(sum);
        }
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
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

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextFloat() {
            return Double.parseDouble(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

    }
}
