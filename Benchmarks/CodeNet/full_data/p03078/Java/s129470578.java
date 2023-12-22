import com.sun.org.apache.xpath.internal.operations.Mult;

import javax.swing.plaf.multi.MultiSeparatorUI;
import java.io.*;
import java.util.*;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;

public class Main {

    static int X, Y, Z;
    static int K;
    static long[] A, B, C;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        X = sc.nextInt();
        Y = sc.nextInt();
        Z = sc.nextInt();
        K = sc.nextInt();
        A = sc.nextLongArray(X);
        B = sc.nextLongArray(Y);
        C = sc.nextLongArray(Z);

        writeLines(solve());
    }

    static long[] solve() {
        Arrays.sort(A);
        Arrays.sort(B);
        Arrays.sort(C);
        long[] ans = new long[K];
        MultisetLike q = new MultisetLike();
        q.add( new State(X-1, Y-1, Z-1, A[X-1] + B[Y-1] + C[Z-1]) );
        int k = 0;
        while(k < K) {
            State state = q.poll();
            ans[k++] = state.sum;

            if( state.x != 0 ) {
                q.add( new State(state.x-1, state.y, state.z, A[state.x-1] + B[state.y] + C[state.z]) );
            }
            if( state.y != 0 ) {
                q.add( new State(state.x, state.y-1, state.z, A[state.x] + B[state.y-1] + C[state.z]) );
            }
            if( state.z != 0 ) {
                q.add( new State(state.x, state.y, state.z-1, A[state.x] + B[state.y] + C[state.z-1]) );
            }
        }
        return ans;
    }


    static class MultisetLike {

        private PriorityQueue<Long> q = new PriorityQueue<>(Comparator.reverseOrder());
        private Map<Long, Entry> map = new HashMap<>();
        private int size;

        public void add(State s) {
            if( map.containsKey(s.sum) ) {
                Entry entry = map.get(s.sum);
                boolean b = entry.add(s);
                if( b ) {
                    q.add(s.sum);
                    size++;
                }

            } else {
                Entry entry = new Entry(s.sum);
                entry.add(s);
                map.put(s.sum, entry);
                q.add(s.sum);
                size++;
            }
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public int size() {
            return size;
        }

        public State poll() {
            if (isEmpty()) return null;

            size--;
            Long sum = q.poll();
            Entry entry = map.get(sum);
            return entry.poll();
        }

        private static class Entry {
            long sum;
            Set<State> states = new HashSet<>();
            ArrayDeque<State> q = new ArrayDeque<>();

            public Entry(long sum) {
                this.sum = sum;
            }

            public boolean add(State s) {
                boolean b = states.add(s);
                if( b ) {
                    q.add(s);
                }
                return b;
            }

            public boolean isEmpty() {
                return q.isEmpty();
            }

            public State poll() {
                return q.poll();
            }
        }
    }

    static class State {
        int x, y, z;
        long sum;

        public State(int x, int y, int z, long sum) {
            this.x = x;
            this.y = y;
            this.z = z;
            this.sum = sum;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            State state = (State) o;
            return x == state.x &&
                    y == state.y &&
                    z == state.z &&
                    sum == state.sum;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y, z, sum);
        }
    }

    @SuppressWarnings("unused")
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

        int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        int[] nextIntArray(int n, int delta) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt() + delta;
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }

    static <A> void writeLines(A[] as, Function<A, String> f) {
        PrintWriter pw = new PrintWriter(System.out);
        for (A a : as) {
            pw.println(f.apply(a));
        }
        pw.flush();
    }

    static void writeLines(int[] as) {
        PrintWriter pw = new PrintWriter(System.out);
        for (int a : as) pw.println(a);
        pw.flush();
    }

    static void writeLines(long[] as) {
        PrintWriter pw = new PrintWriter(System.out);
        for (long a : as) pw.println(a);
        pw.flush();
    }

    static int max(int... as) {
        int max = Integer.MIN_VALUE;
        for (int a : as) max = Math.max(a, max);
        return max;
    }

    static int min(int... as) {
        int min = Integer.MAX_VALUE;
        for (int a : as) min = Math.min(a, min);
        return min;
    }

    static void debug(Object... args) {
        StringJoiner j = new StringJoiner(" ");
        for (Object arg : args) {
            if (arg instanceof int[]) j.add(Arrays.toString((int[]) arg));
            else if (arg instanceof long[]) j.add(Arrays.toString((long[]) arg));
            else if (arg instanceof double[]) j.add(Arrays.toString((double[]) arg));
            else if (arg instanceof Object[]) j.add(Arrays.toString((Object[]) arg));
            else j.add(arg.toString());
        }
        System.err.println(j.toString());
    }
}
