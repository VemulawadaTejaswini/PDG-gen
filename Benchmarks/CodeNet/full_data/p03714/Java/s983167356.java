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
        // LOからは小さいもの、HIからはおおきいものを優先的に取り除きたい
        Comparator<Integer> c = Comparator.naturalOrder();
        PriorityQueue<Integer> left = new PriorityQueue<>(N, c);
        PriorityQueue<Integer> right = new PriorityQueue<>(N, c.reversed());

        for (int i = 0; i < N; i++) {
            left.add(A[i]);
            right.add(A[i+2*N]);
        }

        List<Integer> mid = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            mid.add(A[i+N]);
        }
        int ml = 0;
        int mr = N-1;

        for (int i = 0; i < N; i++) {
            int l = left.peek();
            int r = right.peek();

            int l_kaizen = mid.get(ml) - l;
            int r_kaizen = r - mid.get(mr);

            if( l_kaizen > 0 && r_kaizen > 0) {
                if( l_kaizen >= r_kaizen ) {
                    left.poll();
                    left.add(mid.get(ml));
                    ml++;
                } else {
                    right.poll();
                    right.add(mid.get(mr));
                    mr--;
                }
            } else if( l_kaizen > 0 ) {
                left.poll();
                left.add(mid.get(ml));
                ml++;
            } else if( r_kaizen > 0 ) {
                right.poll();
                right.add(mid.get(mr));
                mr--;

            } else {
                int l_kaizen_ex = l - mid.get(mr);
                int r_kaizen_ex = r - mid.get(ml);

                if( l_kaizen_ex > r_kaizen_ex ) {
                    ml++;
                } else {
                    mr--;
                }
            }
        }

        long lo_sum = 0;
        for (int i : left) {
            lo_sum += i;
        }
        long hi_sum = 0;
        for (int i : right) {
            hi_sum += i;
        }
        return lo_sum - hi_sum;
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

