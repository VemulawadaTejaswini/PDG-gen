import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.HashMap;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FasterScanner in = new FasterScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, FasterScanner in, PrintWriter out) {
            final int n = in.nextInt();
            final int m = in.nextInt();

            UnionFindTree uft = new UnionFindTree(n);
            HashMap<Integer, HashSet<Integer>> islands = new HashMap<>();

            for (int i = 0; i < m; i++) {
                int a = in.nextInt() - 1;
                int b = in.nextInt() - 1;
                HashSet<Integer> as = islands.getOrDefault(a, new HashSet<>());
                HashSet<Integer> bs = islands.getOrDefault(b, new HashSet<>());
                as.add(uft.find(b));
                bs.add(uft.find(a));
                islands.put(a, as);
                islands.put(b, bs);
            }

            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    boolean possible = true;
                    for (int k : islands.getOrDefault(j, new HashSet<>())) {
                        if (uft.same(k, i)) {
                            possible = false;
                            break;
                        }
                    }
                    if (possible) {
                        uft.unite(i, j);
                    } else {
                        i = j - 1;
                        break;
                    }
                }
            }

            int ans = 0;
            HashSet<Integer> checked = new HashSet<>();

            for (int i = 0; i < n; i++) {
                int cn = uft.find(i);

                if (!checked.contains(cn)) {
                    ans++;
                    checked.add(cn);
                }
            }

            out.println(ans - 1);
        }

    }

    static class FasterScanner {
        private InputStream in;
        private byte[] buffer;
        private int bufPointer;
        private int bufLength;

        public FasterScanner(InputStream in) {
            this.in = in;
            buffer = new byte[1024];
        }

        private boolean hasNextByte() {
            if (bufPointer < bufLength) return true;
            bufPointer = 0;
            try {
                bufLength = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return (bufLength > 0);
        }

        private int readByte() {
            if (hasNextByte()) return buffer[bufPointer++];
            return -1;
        }

        private static boolean isPrintableChar(int c) {
            return (c >= 33 && c <= 126);
        }

        public boolean hasNext() {
            while (hasNextByte() && !isPrintableChar(buffer[bufPointer])) bufPointer++;
            return hasNextByte();
        }

        public int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
        }

        public long nextLong() {
            if (!hasNext()) throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            if (b < '0' || b > '9') throw new NumberFormatException();

            while (true) {
                if (b >= '0' && b <= '9') {
                    n *= 10;
                    n += b - '0';
                } else if (b == -1 || !isPrintableChar(b)) {
                    return minus ? -n : n;
                } else {
                    throw new NumberFormatException();
                }
                b = readByte();
            }
        }

    }

    static class UnionFindTree {
        private int[] parent;
        private int[] rank;
        private int size;

        public UnionFindTree(int size) {
            this.size = size;
            parent = new int[size];
            rank = new int[size];
            for (int i = 0; i < size; i++) {
                parent[i] = i;
                rank[i] = 0;
            }
        }

        public int find(int index) {
            if (parent[index] == index) return index;
            else {
                parent[index] = find(parent[index]);
                return parent[index];
            }
        }

        public boolean same(int index1, int index2) {
            return find(index1) == find(index2);
        }

        public void unite(int index1, int index2) {
            int parent1 = find(index1);
            int parent2 = find(index2);
            if (parent1 == parent2) return;

            if (rank[parent1] < rank[parent2]) {
                parent[parent1] = parent2;
            } else {
                parent[parent2] = parent1;
                if (rank[parent1] == rank[parent2]) rank[parent1]++;
            }
        }

    }
}

