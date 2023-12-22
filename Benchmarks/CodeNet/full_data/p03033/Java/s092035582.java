import java.io.*;
import java.util.*;
import java.util.function.ToIntFunction;

public class Main {

    static int N, Q;
    static int[] S, T, X;
    static int[] D;

    public static void main(String[] args) {
        MoreFastScanner sc = new MoreFastScanner(System.in);
        N = sc.nextInt();
        Q = sc.nextInt();

        S = new int[N];
        T = new int[N];
        X = new int[N];
        for (int i = 0; i < N; i++) {
            S[i] = sc.nextInt();
            T[i] = sc.nextInt();
            X[i] = sc.nextInt();
        }
        D = new int[Q];
        for (int i = 0; i < Q; i++) {
            D[i] = sc.nextInt();
        }

        writeLines(solve());
    }

    static int[] solve() {
        // [time, type, x]
        int[][] events = new int[N*2 + Q][3];
        int idx = 0;
        for (int i = 0; i < N; i++) {
            // start
            events[idx][0] = S[i] - X[i] + 1_000_000_000;
            events[idx][1] = 0;
            events[idx][2] = X[i];
            idx++;

            // end
            events[idx][0] = T[i] - X[i] + 1_000_000_000;
            events[idx][1] = 1;
            events[idx][2] = X[i];
            idx++;
        }
        for (int i = 0; i < Q; i++) {
            events[idx][0] = D[i] + 1_000_000_000;
            events[idx][1] = 2;
            events[idx][2] = i;
            idx++;
        }

        int[][] temp = new int[N*2 + Q][3];
        radixSort(events, temp, ev -> ev[0]);
        // Arrays.sort(events, Comparator.comparingInt(ev -> ev[0]));
        MultiIntSet set = new MultiIntSet();
        int[] ans = new int[Q];
        for (int[] ev : events) {
            int type = ev[1];
            if( type == 0 ) {
                set.add(ev[2]);

            } else if( type == 1 ) {
                set.remove(ev[2]);

            } else {
                if( set.size() == 0 ) {
                    ans[ev[2]] = -1;
                } else {
                    ans[ev[2]] = set.first();
                }
            }
        }
        return ans;
    }

    public static <A> A[] radixSort(A[] as, A[] temp, ToIntFunction<A> toInt) {
        int n = as.length;
        {
            int[] b = new int[65537];
            for(int i = 0;i < n;i++)b[1+(toInt.applyAsInt(as[i])&0xffff)]++;
            for(int i = 1;i <= 65536;i++)b[i]+=b[i-1];
            for(int i = 0;i < n;i++)temp[b[toInt.applyAsInt(as[i])&0xffff]++] = as[i];
            A[] d = as; as = temp; temp = d;
        }
        {
            int[] b = new int[65537];
            for(int i = 0;i < n;i++)b[1+(toInt.applyAsInt(as[i])>>>16)]++;
            for(int i = 1;i <= 65536;i++)b[i]+=b[i-1];
            for(int i = 0;i < n;i++)temp[b[toInt.applyAsInt(as[i])>>>16]++] = as[i];
            A[] d = as; as = temp; temp = d;
        }
        return as;
    }

    static class MultiIntSet {

        private final TreeSet<Node> tree = new TreeSet<>();
        private final Node nodeForQuery = new Node(-1, 1); // queryでobject作ると辛いのでケチる用
        private int size;

        boolean contains(int a) {
            nodeForQuery.a = a;
            return tree.contains(nodeForQuery);
        }

        void add(int a) {
            nodeForQuery.a = a;
            Node found = tree.ceiling(nodeForQuery);
            if( found == null || found.a != a ) {
                tree.add( new Node(a, 1) );
            } else {
                found.cnt++;
            }
            size++;
        }

        boolean remove(int a) {
            nodeForQuery.a = a;
            Node found = tree.ceiling(nodeForQuery);
            if( found == null || found.a != a ) {
                return false;

            } else {
                found.cnt--;
                if( found.cnt == 0 ) {
                    tree.remove(found);
                }
                size--;
                return true;
            }
        }

        int first() {
            return tree.first().a;
        }

        int last() {
            return tree.last().a;
        }

        int size() {
            return size;
        }

        static class Node implements Comparable<Node> {
            int a;
            int cnt;

            public Node(int a, int cnt) {
                this.a = a;
                this.cnt = cnt;
            }

            @Override
            public int compareTo(Node o) {
                return Integer.compare(a, o.a);
            }
        }
    }

    static void debug(Object... args) {
        StringJoiner j = new StringJoiner(" ");
        for (Object arg : args) {
            if (arg == null) j.add("null");
            else if (arg instanceof int[]) j.add(Arrays.toString((int[]) arg));
            else if (arg instanceof long[]) j.add(Arrays.toString((long[]) arg));
            else if (arg instanceof double[]) j.add(Arrays.toString((double[]) arg));
            else if (arg instanceof Object[]) j.add(Arrays.toString((Object[]) arg));
            else j.add(arg.toString());
        }
        System.err.println(j.toString());
    }

    static void writeLines(int[] as) {
        PrintWriter pw = new PrintWriter(System.out);
        for (int a : as) pw.println(a);
        pw.flush();
    }

    static class MoreFastScanner {
        Reader input;

        MoreFastScanner() {
            this(System.in);
        }

        MoreFastScanner(InputStream stream) {
            this.input = new BufferedReader(new InputStreamReader(stream));
        }

        int nextInt() {
            return (int) nextLong();
        }

        long nextLong() {
            try {
                int sign = 1;
                int b = input.read();
                while ((b < '0' || '9' < b) && b != '-' && b != '+') {
                    b = input.read();
                }
                if (b == '-') {
                    sign = -1;
                    b = input.read();
                } else if (b == '+') {
                    b = input.read();
                }
                long ret = b - '0';
                while (true) {
                    b = input.read();
                    if (b < '0' || '9' < b) return ret * sign;
                    ret *= 10;
                    ret += b - '0';
                }
            } catch (IOException e) {
                e.printStackTrace();
                return -1;
            }
        }

        double nextDouble() {
            try {
                double sign = 1;
                int b = input.read();
                while ((b < '0' || '9' < b) && b != '-' && b != '+') {
                    b = input.read();
                }
                if (b == '-') {
                    sign = -1;
                    b = input.read();
                } else if (b == '+') {
                    b = input.read();
                }
                double ret = b - '0';
                while (true) {
                    b = input.read();
                    if (b < '0' || '9' < b) break;
                    ret *= 10;
                    ret += b - '0';
                }
                if (b != '.') return sign * ret;
                double div = 1;
                b = input.read();
                while ('0' <= b && b <= '9') {
                    ret *= 10;
                    ret += b - '0';
                    div *= 10;
                    b = input.read();
                }
                return sign * ret / div;
            } catch (IOException e) {
                e.printStackTrace();
                return Double.NaN;
            }
        }

        char nextChar() {
            try {
                int b = input.read();
                while (Character.isWhitespace(b)) {
                    b = input.read();
                }
                return (char) b;
            } catch (IOException e) {
                e.printStackTrace();
                return 0;
            }
        }

        String nextStr() {
            try {
                StringBuilder sb = new StringBuilder();
                int b = input.read();
                while (Character.isWhitespace(b)) {
                    b = input.read();
                }
                while (b != -1 && !Character.isWhitespace(b)) {
                    sb.append((char) b);
                    b = input.read();
                }
                return sb.toString();
            } catch (IOException e) {
                e.printStackTrace();
                return "";
            }
        }

    }
}
