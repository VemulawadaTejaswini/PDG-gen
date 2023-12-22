import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Collection;
import java.io.IOException;
import java.util.stream.Collectors;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.LinkedList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Nondecreasing solver = new Nondecreasing();
        solver.solve(1, in, out);
        out.close();
    }

    static class Nondecreasing {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int N = in.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
            }
            List<int[]> ans = new LinkedList<>();
            boolean changed = true;
            while (changed) {
                changed = false;
                for (int i = 1; i < N; i++) {
                    if (A[i - 1] > A[i]) {
                        if (A[i - 1] < 0) {
                            ans.add(new int[]{i + 1, i});
                            A[i - 1] += A[i];
                        } else {
                            ans.add(new int[]{i, i + 1});
                            A[i] += A[i - 1];
                        }
                        changed = true;
                    }
                }
            }
            out.println(ans.size());
            out.println(ans.stream().map(a1 -> a1[0] + " " + a1[1]).collect(Collectors.joining(" ")));
//        out.println(Arrays.stream(A).mapToObj(Objects::toString).collect(joining(" ")));
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

