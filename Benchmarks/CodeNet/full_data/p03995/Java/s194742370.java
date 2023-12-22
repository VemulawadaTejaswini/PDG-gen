import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {

    private static final long INF = Integer.MAX_VALUE;
    private static final int R = 0;
    private static final int C = 1;
    private Graph g = new Graph();
    private Map<Integer, Long> nodeCost = new HashMap<>();
    private boolean ans = true;

    private void solve() {
        FastScanner sc = new FastScanner();
        int rMax = sc.nextInt();
        int cMax = sc.nextInt();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            g.addEdgeUndirected(R, sc.nextInt(), C, sc.nextInt(), sc.nextInt());
        }
        for (Map.Entry<Long, Integer> e : g.getIdMap().entrySet()) {
            int i = e.getValue();
            if (nodeCost.containsKey(i)) continue;
            int rc = Graph.getFst(e.getKey());
            Pair p = dfs(i, 0, rc);
            ans &= p.fst + p.snd >= 0;
        }
        System.out.println(ans ? "Yes" : "No");
    }

    private Pair dfs(int i, long c, int rc) {
        nodeCost.put(i, c);
        Pair p = new Pair(rc == R ? c : INF, rc == C ? c : INF);
        for (long next : g.getNext(i)) {
            int j = Graph.getFst(next);
            long a = Graph.getSnd(next);
            if (nodeCost.containsKey(j)) {
                long d = nodeCost.get(j);
                ans &= d + c == a;
            } else {
                Pair q = dfs(j, a - c, 1 - rc);
                p.fst = Math.min(p.fst, q.fst);
                p.snd = Math.min(p.snd, q.snd);
            }
        }
        ans &= true;
        return p;
    }

    public static void main(String[] args) {
        new Main().solve();
    }
}

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        } else {
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
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

    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
        return hasNextByte();
    }

    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
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

    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}

class Pair {

    long fst;
    long snd;

    Pair(long fst, long snd) {
        this.fst = fst;
        this.snd = snd;
    }

}

class Graph {

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