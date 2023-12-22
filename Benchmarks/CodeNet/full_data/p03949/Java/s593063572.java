import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {

    private static final int INF = 114514810;

    private void solve(FastScanner sc) {
        int n = sc.nextInt();
        int s = n + 1;
        int e = n - 1;
        int[] a = new int[e];
        int[] b = new int[e];
        for (int i = 0; i < e; i++) {
            a[i] = sc.nextInt() - 1;
            b[i] = sc.nextInt() - 1;
        }
        Graph g = new Graph.BuilderArray(s, a, b).toUndirected().build();
        int k = sc.nextInt();
        int[] c = new int[n];
        Arrays.fill(c, INF);
        for (int i = 0; i < k; i++) {
            int v = sc.nextInt();
            int p = sc.nextInt();
            c[v - 1] = p;
            g.addEdge(s - 1, v - 1, p);
        }
        int[] d = new int[s];
        Arrays.fill(d, INF);
        d[s - 1] = 0;
        PriorityQueue<PriorityPair> q = new PriorityQueue<>(PriorityPair::compareTo);
        q.add(new PriorityPair(s - 1, 0));
        while (!q.isEmpty()) {
            PriorityPair pair = q.poll();
            int from = pair.element;
            if (d[from] < pair.priority) continue;
            for (long edge : g.getNext(from)) {
                int to = Graph.getElem(edge);
                int cost = Graph.getCost(edge);
                if (d[to] > d[from] + cost) {
                    d[to] = d[from] + cost;
                    q.add(new PriorityPair(to, d[to]));
                }
            }
        }
        boolean consistency = true;
        for (int i = 0; i < n; i++) {
            if (c[i] != INF) {
                if (c[i] != d[i]) consistency = false;
            }
        }
        if (consistency) {
            System.out.println("Yes");
            for (int i = 0; i < n; i++) {
                System.out.println(d[i]);
            }
        } else {
            System.out.println("No");
        }
    }

    /*
     * template
     */

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        new Main().solve(sc);
    }

    private static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int bufLen = 0;

        private boolean hasNextByte() {
            if (ptr < bufLen) {
                return true;
            } else {
                ptr = 0;
                try {
                    bufLen = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (bufLen <= 0) {
                    return false;
                }
            }
            return true;
        }

        private int readByte() {
            if (hasNextByte()) return buffer[ptr++];
            else return -1;
        }

        private static boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        boolean hasNext() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
            return hasNextByte();
        }

        String next() {
            if (!hasNext()) throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while (isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

        long nextLong() {
            if (!hasNext()) throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            if (b < '0' || '9' < b) {
                throw new NumberFormatException();
            }
            while (true) {
                if ('0' <= b && b <= '9') {
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

        int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }

    private static class Graph {

        // weighted assoc list
        // (optional) to compress 2 ints into 1 int, use toId

        private Map<Long, Integer> idMap;
        private List<List<Long>> assoc;

        public static class Builder {
            List<List<Long>> assoc;
            List<List<Integer>> edges;
            int v;

            boolean undirected = false;

            public Builder(int v, List<List<Integer>> edges) {
                this.v = v;
                this.edges = edges;
            }

            public Builder toUndirected() {
                undirected = true;
                return this;
            }

            public Graph build() {
                assoc = new ArrayList<>();
                for (int i = 0; i < v; i++) assoc.add(new ArrayList<>());
                for (List<Integer> edge : edges) {
                    assoc.get(edge.get(0)).add(iToL(edge.get(1), edge.get(2)));
                    if (undirected) assoc.get(edge.get(1)).add(iToL(edge.get(0), edge.get(2)));
                }
                return new Graph(assoc, new HashMap<>());
            }

        }

        public static class BuilderArray {
            List<List<Long>> assoc;
            int v;
            int e;
            private int[] s;
            private int[] t;
            private int[] w;

            boolean undirected = false;

            public BuilderArray(int v, int[] s, int[] t) {
                this.v = v;
                this.s = s;
                this.t = t;
                this.e = Math.min(s.length, t.length);
                this.w = new int[e];
                Arrays.fill(w, 1);
            }

            public BuilderArray(int v, int[] s, int[] t, int[] w) {
                this.v = v;
                this.s = s;
                this.t = t;
                this.w = w;
                this.e = Math.min(Math.min(s.length, t.length), w.length);
            }

            public BuilderArray toUndirected() {
                undirected = true;
                return this;
            }

            public Graph build() {
                assoc = new ArrayList<>();
                for (int i = 0; i < v; i++) assoc.add(new ArrayList<>());
                for (int i = 0; i < e; i++) {
                    assoc.get(s[i]).add(iToL(t[i], w[i]));
                    if (undirected) assoc.get(t[i]).add(iToL(s[i], w[i]));
                }
                return new Graph(assoc, new HashMap<>());
            }

        }

        public Graph() {
            idMap = new HashMap<>();
            assoc = new ArrayList<>();
        }

        public Graph(List<List<Long>> assoc, Map<Long, Integer> idMap) {
            this.assoc = assoc;
            this.idMap = idMap;
        }

        public List<Long> getNext(int s) {
            return assoc.get(s);
        }

        public void addEdge(int s, int t, int w) {
            assoc.get(s).add(iToL(t, w));
        }

        public void addEdgeUndirected(int s, int t, int w) {
            assoc.get(s).add(iToL(t, w));
            assoc.get(t).add(iToL(s, w));
        }

        public void addEdge(int s1, int s2, int t1, int t2, int w) {
            assoc.get(toId(s1, s2)).add(iToL(toId(t1, t2), w));
        }

        public void addEdgeUndirected(int s1, int s2, int t1, int t2, int w) {
            int s = toId(s1, s2);
            int t = toId(t1, t2);
            addEdgeUndirected(s, t, w);
        }

        private int toId(int fst, int snd) {
            long lid = iToL(fst, snd);
            Integer id = idMap.get(lid);
            if (id == null) {
                idMap.put(lid, id = idMap.size());
                assoc.add(new ArrayList<>());
            }
            return id;
        }

        public static long iToL(int fst, int snd) {
            return ((long) (fst) << 32) | (long) snd & 0xffffffffL;
        }

        public static int getElem(long edge) {
            return (int) (edge >> 32);
        }

        public static int getCost(long edge) {
            return (int) (edge & 0xffffffffL);
        }

        public static int getFst(long intPair) {
            return (int) (intPair >> 32);
        }

        public static int getSnd(long intPair) {
            return (int) (intPair & 0xffffffffL);
        }

        public Map<Long, Integer> getIdMap() {
            return idMap;
        }

        public List<List<Long>> getAssoc() {
            return assoc;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("assoc: [\n");
            for (int i = 0; i < assoc.size(); i++) {
                sb.append("  ").append(i).append(": [ ");
                for (long e : assoc.get(i)) {
                    sb.append("(").append(getElem(e)).append(", ").append(getCost(e)).append(") ");
                }
                sb.append("]\n");
            }
            sb.append("]");
            return sb.toString();
        }
    }

    static class PriorityPair implements Comparable<PriorityPair> {

        public int element;
        public int priority;

        public PriorityPair(int element, int priority) {
            this.element = element;
            this.priority = priority;
        }

        public PriorityPair(List<Integer> list) {
            this.element = list.get(0);
            this.priority = list.get(1);
        }

        public PriorityPair(int[] array) {
            this.element = array[0];
            this.priority = array[1];
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PriorityPair that = (PriorityPair) o;

            return element == that.element && priority == that.priority;

        }

        @Override
        public int hashCode() {
            int result = element;
            result = 31 * result + priority;
            return result;
        }

        @Override
        public int compareTo(PriorityPair o) {
            return Integer.compare(priority, o.priority);
        }

        @Override
        public String toString() {
            return "(" + element + ", priority=" + priority + ")";
        }
    }
}