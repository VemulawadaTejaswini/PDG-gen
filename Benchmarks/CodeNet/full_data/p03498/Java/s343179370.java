import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collection;
import java.io.IOException;
import java.util.stream.Collectors;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.LinkedList;
import java.util.Collections;
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
            long[] A = new long[N];
            Nondecreasing.Entry[] B = new Nondecreasing.Entry[N];
            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
                B[i] = new Nondecreasing.Entry(i, A[i]);
            }

            Arrays.sort(B, (e1, e2) -> Long.compare(e1.val, e2.val));

            Nondecreasing.Entry min = B[0];
            Nondecreasing.Entry max = B[N - 1];

            List<int[]> a1 = computeMin(A.clone(), min);
            List<int[]> a2 = computeMax(A.clone(), max);

            if (a1.size() == 1000 && a2.size() == 1000) {
                out.println(0);
                return;
            }

            List<int[]> ans = a1.size() < a2.size() ? a1 : a2;

            out.println(ans.size());
            out.println(ans.stream().map(a -> a[0] + " " + a[1]).collect(Collectors.joining("\n")));
//        out.println(Arrays.stream(A).mapToObj(Objects::toString).collect(joining(" ")));
        }

        private List<int[]> computeMin(long[] A, Nondecreasing.Entry min) {
            if (min.val >= 0) return new ArrayList<>(Collections.nCopies(1000, new int[0]));
            long minSoFar = min.val;
            int min_idx = min.idx;
            int N = A.length;
            List<int[]> ans = new LinkedList<>();
            int cnt = 0;
            for (int i = N - 2; i >= 0; i--) {
                while (A[i] > A[i + 1]) {
                    ans.add(new int[]{min_idx + 1, i + 1});
                    A[i] += A[min_idx];
                    cnt++;
                    if (minSoFar > A[i]) {
                        minSoFar = A[i];
                        min_idx = i;
                    }

                    if (cnt > 1000) return new ArrayList<>(Collections.nCopies(1000, new int[0]));
                }
            }
            return ans;
        }

        private List<int[]> computeMax(long[] A, Nondecreasing.Entry max) {
            if (max.val <= 0) return new ArrayList<>(Collections.nCopies(1000, new int[0]));
            long maxSoFar = max.val;
            int max_idx = max.idx;
            int N = A.length;
            List<int[]> ans = new LinkedList<>();
            int cnt = 0;
            for (int i = 1; i < N; i++) {
                while (A[i - 1] > A[i]) {
                    ans.add(new int[]{max_idx + 1, i + 1});
                    A[i] += A[max_idx];
                    cnt++;
                    if (maxSoFar < A[i]) {
                        maxSoFar = A[i];
                        max_idx = i;
                    }
                    if (cnt > 1000) return new ArrayList<>(Collections.nCopies(1000, new int[0]));
                }
            }
            return ans;
        }

        static class Entry {
            int idx;
            long val;

            public Entry(int idx, long val) {
                this.idx = idx;
                this.val = val;
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

    }
}

