import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Collections;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Jaynil
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DPowerfulDiscountTickets solver = new DPowerfulDiscountTickets();
        solver.solve(1, in, out);
        out.close();
    }

    static class DPowerfulDiscountTickets {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            int n = in.nextInt();
            int m = in.nextInt();
            int a[] = new int[n];
            long sum = 0;
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                sum += a[i];
            }
            for (int i = 0; i < n; i++) {
                while (a[i] > 0) {
                    pq.add(a[i] - a[i] / 2);
                    a[i] /= 2;
                }
            }
            long temp = 0;
            for (int i = 0; i < m && pq.size() > 0; i++) temp += pq.poll();
            out.println(sum - temp);
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

    }
}

