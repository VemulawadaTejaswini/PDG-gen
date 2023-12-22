import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int N;
    static int[] A;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        A = sc.nextIntArray(N*3);

        System.out.println( solve() );
    }

    private static long solve() {
        long[] ls = new long[N+1];
        PriorityQueue<Integer> lq = new PriorityQueue<>(N);
        long curr = 0;
        for (int i = 0; i < N; i++) {
            lq.add(A[i]);
            curr += A[i];
        }
        ls[0] = curr;
        for (int i = 0; i < N; i++) {
            int a = A[N+i];
            lq.add(a);
            int b = lq.poll();
            curr += (a-b);
            ls[i+1] = curr;
        }

        long[] rs = new long[N+1];
        Comparator<Integer> c = Comparator.naturalOrder();
        PriorityQueue<Integer> rq = new PriorityQueue<>(N, c.reversed());
        curr = 0;
        for (int i = 3*N-1; i >= 2*N; i--) {
            int a = A[i];
            rq.add(a);
            curr += a;
        }
        rs[N] = curr;
        for (int i = 0; i < N; i++) {
            int a = A[2*N-1-i];
            rq.add(a);
            int b = rq.poll();
            curr += (a-b);
            rs[N-i-1] = curr;
        }

        long max = Long.MIN_VALUE;
        for (int i = 0; i < N+1; i++) {
            max = Math.max(ls[i] - rs[i], max);
        }
        return max;
    }

    static class FastScanner {

        private BufferedReader reader;
        private StringTokenizer tokenizer;

        FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            return tokenizer.nextToken("\n");
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }
}

