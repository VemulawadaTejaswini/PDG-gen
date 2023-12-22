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
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            int min = Integer.MAX_VALUE, min_index = 0;
            int max = Integer.MIN_VALUE, max_index = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] < min) {
                    min = a[i];
                    min_index = i;
                }
                if (a[i] > max) {
                    max = a[i];
                    max_index = i;
                }
            }
            ArrayList<int[]> moves = new ArrayList<>();
            if (min >= 0 || min * -1 < max) {
                if (max_index != n - 1) {
                    for (int i = 0; i < 2; i++)
                        moves.add(new int[]{max_index + 1, n});
                } else {
                    moves.add(new int[]{n, n});
                }
                for (int i = 1; i < n; i++) {
                    moves.add(new int[]{n, i});
                    moves.add(new int[]{n, n});
                }
            } else {
                if (min_index != 0) {
                    for (int i = 0; i < 2; i++)
                        moves.add(new int[]{min_index + 1, 1});
                } else {
                    moves.add(new int[]{1, 1});
                }
                for (int i = n; i > 1; i--) {
                    moves.add(new int[]{1, i});
                    moves.add(new int[]{1, 1});
                }
            }
            out.println(moves.size());
            for (int[] move : moves) {
                out.println("" + move[0] + " " + move[1]);
            }
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
