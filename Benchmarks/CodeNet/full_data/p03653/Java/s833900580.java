import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.io.IOException;
import java.util.TreeSet;
import java.util.ArrayList;
import java.io.UncheckedIOException;
import java.util.List;
import java.io.Closeable;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(null, new TaskAdapter(), "", 1 << 27);
        thread.start();
        thread.join();
    }

    static class TaskAdapter implements Runnable {
        @Override
        public void run() {
            InputStream inputStream = System.in;
            OutputStream outputStream = System.out;
            FastInput in = new FastInput(inputStream);
            FastOutput out = new FastOutput(outputStream);
            TaskC solver = new TaskC();
            solver.solve(1, in, out);
            out.close();
        }
    }
    static class TaskC {
        public void solve(int testNumber, FastInput in, FastOutput out) {
            int x = in.readInt();
            int y = in.readInt();
            int z = in.readInt();

            int n = x + y + z;
            Node[] nodes = new Node[n];
            for (int i = 0; i < n; i++) {
                nodes[i] = new Node();
                for (int j = 0; j < 3; j++) {
                    nodes[i].vals[j] = in.readInt();
                }
                nodes[i].id = i;
            }

            List<Node> xlist = Arrays.asList(nodes).subList(0, x);
            List<Node> yList = Arrays.asList(nodes).subList(x, x + y);
            List<Node> zList = Arrays.asList(nodes).subList(x + y, x + y + z);;

            List<Node>[] lists = new List[] {xlist, yList, zList};
            Sets[] sets = new Sets[3];
            for (int i = 0; i < 3; i++) {
                sets[i] = new Sets();
                for (int j = 0; j < 3; j++) {
                    int finalJ = j;
                    int finalI = i;
                    sets[i].sets[j] = new TreeSet<>((a, b) -> {
                        int ans = Long.compare(a.vals[finalJ] - a.vals[finalI], b.vals[finalJ] - b.vals[finalI]);
                        if (ans == 0) {
                            ans = a.id - b.id;
                        }
                        return ans;
                    });
                }
                for (Node node : lists[i]) {
                    sets[i].add(node);
                }
            }

            // optimize
            int[][] allPerms = PermutationUtils.generateAllPermutations(3).toArray(new int[0][]);
            boolean optimize = true;
            Node[] changes = new Node[3];
            while (optimize) {
                optimize = false;

                for (int[] p : allPerms) {
                    long profit = 0;
                    for (int i = 0; i < 3; i++) {
                        Node last = sets[i].sets[p[i]].last();
                        changes[i] = last;
                        profit += last.vals[p[i]] - last.vals[i];

                    }
                    if (profit > 0) {
                        optimize = true;
                        for (int i = 0; i < 3; i++) {
                            sets[i].remove(changes[i]);
                            sets[p[i]].add(changes[i]);
                        }
                    }
                }
            }

            long ans = 0;
            for (int i = 0; i < 3; i++) {
                for (Node node : sets[i].sets[0]) {
                    ans += node.vals[i];
                }
            }

            out.println(ans);
        }

    }
    static class Sets {
        TreeSet<Node>[] sets = new TreeSet[3];

        void remove(Node node) {
            for (TreeSet<Node> set : sets) {
                set.remove(node);
            }
        }

        void add(Node node) {
            for (TreeSet<Node> set : sets) {
                set.add(node);
            }
        }

    }
    static class PermutationUtils {
        private static final long[] PERMUTATION_CNT = new long[21];
        static {
            PERMUTATION_CNT[0] = 1;
            for (int i = 1; i <= 20; i++) {
                PERMUTATION_CNT[i] = PERMUTATION_CNT[i - 1] * i;
            }
        }

        public static List<int[]> generateAllPermutations(int n) {
            List<int[]> list = new ArrayList<>((int) PERMUTATION_CNT[n]);
            traceAllPermutations(new boolean[n], new int[n], list, 0);
            return list;
        }

        private static void traceAllPermutations(boolean[] used, int[] perm, List<int[]> recorders, int i) {
            if (i == perm.length) {
                recorders.add(perm.clone());
                return;
            }
            for (int j = 0; j < used.length; j++) {
                if (used[j]) {
                    continue;
                }
                used[j] = true;
                perm[i] = j;
                traceAllPermutations(used, perm, recorders, i + 1);
                used[j] = false;
            }
        }

    }
    static class FastInput {
        private final InputStream is;
        private byte[] buf = new byte[1 << 13];
        private int bufLen;
        private int bufOffset;
        private int next;

        public FastInput(InputStream is) {
            this.is = is;
        }

        private int read() {
            while (bufLen == bufOffset) {
                bufOffset = 0;
                try {
                    bufLen = is.read(buf);
                } catch (IOException e) {
                    bufLen = -1;
                }
                if (bufLen == -1) {
                    return -1;
                }
            }
            return buf[bufOffset++];
        }

        public void skipBlank() {
            while (next >= 0 && next <= 32) {
                next = read();
            }
        }

        public int readInt() {
            int sign = 1;

            skipBlank();
            if (next == '+' || next == '-') {
                sign = next == '+' ? 1 : -1;
                next = read();
            }

            int val = 0;
            if (sign == 1) {
                while (next >= '0' && next <= '9') {
                    val = val * 10 + next - '0';
                    next = read();
                }
            } else {
                while (next >= '0' && next <= '9') {
                    val = val * 10 - next + '0';
                    next = read();
                }
            }

            return val;
        }

    }
    static class Node {
        long[] vals = new long[3];
        int id;

    }
    static class FastOutput implements AutoCloseable, Closeable {
        private StringBuilder cache = new StringBuilder(10 << 20);
        private final Writer os;

        public FastOutput(Writer os) {
            this.os = os;
        }

        public FastOutput(OutputStream os) {
            this(new OutputStreamWriter(os));
        }

        public FastOutput println(long c) {
            cache.append(c).append('\n');
            return this;
        }

        public FastOutput flush() {
            try {
                os.append(cache);
                os.flush();
                cache.setLength(0);
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
            return this;
        }

        public void close() {
            flush();
            try {
                os.close();
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }

        public String toString() {
            return cache.toString();
        }

    }
}

