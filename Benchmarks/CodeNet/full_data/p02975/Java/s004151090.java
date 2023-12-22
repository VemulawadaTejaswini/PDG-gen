import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeSet;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author anand.oza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        AXORCircle solver = new AXORCircle();
        solver.solve(1, in, out);
        out.close();
    }

    static class AXORCircle {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = in.nextInt();

            HashMap<Integer, Integer> count = new HashMap<>();
            for (int x : a) {
                count.put(x, count.getOrDefault(x, 0) + 1);
            }

            boolean answer = true;
            answer &= count.size() <= 3;

            int xor = 0;
            for (int x : a)
                xor ^= x;
            answer &= xor == 0;

            TreeSet<Integer> distinct = new TreeSet<>();
            for (int c : count.values()) {
                distinct.add(c);
            }
            answer &= (count.size() == 3 && distinct.size() == 1) || (count.size() == 2 && distinct.first() * 2 == distinct.last()) || (count.size() == 1);

            out.println(answer ? "Yes" : "No");
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

