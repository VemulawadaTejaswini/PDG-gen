import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Comparator;
import java.util.Collections;
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
        DMegalomania solver = new DMegalomania();
        solver.solve(1, in, out);
        out.close();
    }

    static class DMegalomania {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            ArrayList<Pair<Integer, Integer>> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                a.add(new Pair(in.nextInt(), in.nextInt()));
            }
            Collections.sort(a, new Comparator<Pair<Integer, Integer>>() {

                public int compare(Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) {
                    return o1.getValue() - o2.getValue();
                }
            });
            long ans = 0;
            boolean yes = false;
            for (int i = 0; i < n; i++) {
                ans += a.get(i).getKey();
                if (ans > a.get(i).getValue()) {
                    yes = true;
                    break;
                }
            }
            if (yes) out.println("No");
            else out.println("Yes");
        }

    }

    static class Pair implements java.io.Serializable {
        K getKey();

        V getValue();

        Pair<Integer,Integer>;

        String toString();

        int hashCode();

        boolean equals;

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

