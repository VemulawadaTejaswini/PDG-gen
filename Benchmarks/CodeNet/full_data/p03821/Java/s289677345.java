
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        InputStream inputStream;
        if (args.length > 0 && args[0].equals("devTesting")) {
            try {
                inputStream = new FileInputStream(args[1]);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        } else {
            inputStream = System.in;
        }
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        int n;
        int[] a, b;

        void solve(int testNumber, InputReader in, PrintWriter out) {
            n = in.nextInt();
            a = new int[n];
            b = new int[n];
            for (int i = 0; i < n; ++i) {
                a[i] = in.nextInt();
                b[i] = in.nextInt();
            }
            long ans = 0, y = 0;
            for (int i = n - 1; i >= 0; --i) {
                if ((a[i] + y) % b[i] > 0) {
                    ans += b[i] - (a[i] + y) % b[i];
                    y += b[i] - (a[i] + y) % b[i];                    
                }
            }
            out.println(ans);
        }

        int i(long x) {
            return (int) x;
        }

        <T> void heapsort(T[] a, int s, int e) {
            Queue<T> queue = new PriorityQueue<>();
            for (int i = s; i <= e; ++i) {
                queue.add(a[i]);
            }
            for (int i = s; i <= e; ++i) {
                a[i] = queue.poll();
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

        public String nextLine() {
            try {
                return reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public boolean hasInput() {
            try {
                if (tokenizer != null && tokenizer.hasMoreTokens()) {
                    return true;
                }
                reader.mark(1);
                int ch = reader.read();
                if (ch != -1) {
                    reader.reset();
                    return true;
                }
                return false;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
