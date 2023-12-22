import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Main {

    private static final long INF = Long.MAX_VALUE / 2;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        int m = sc.nextInt();
        LongStream.Builder V = LongStream.builder();
        LongStream.Builder S = LongStream.builder();
        LongStream.Builder T = LongStream.builder();
        LongStream.Builder W = LongStream.builder();
        for (int i = 0; i < m; i++) {
            int p = sc.nextInt();
            int q = sc.nextInt();
            int c = sc.nextInt();
            S.add(intPairToLong(p, c));
            T.add(intPairToLong(q, c));
            W.add(0);
            S.add(intPairToLong(p, c));
            T.add(intPairToLong(p, 0));
            W.add(0);
            S.add(intPairToLong(p, 0));
            T.add(intPairToLong(p, c));
            W.add(1);
            S.add(intPairToLong(q, c));
            T.add(intPairToLong(q, 0));
            W.add(0);
            S.add(intPairToLong(q, 0));
            T.add(intPairToLong(q, c));
            W.add(1);
            V.add(intPairToLong(p, c));
            V.add(intPairToLong(q, c));
            V.add(intPairToLong(p, 0));
            V.add(intPairToLong(q, 0));
        }


        long ans = dijkstra(V.build().toArray(), S.build().toArray(), T.build().toArray(), W.build().toArray(), intPairToLong(1, 0), intPairToLong(n, 0));
        System.out.println(ans);
    }

    public static long intPairToLong(int fst, int snd) {
        return ((long) (fst) << 32) | (long) snd & 0xffffffffL;
    }

    private static long dijkstra(long[] V, long[] S, long[] T, long[] W, long s, long t) {
        // O(E*logV)
        Graph g = new Graph.Builder(S, T).weighted(W).build();
        Map<Long, Long> d = new HashMap<>();
        for (long v : V) d.put(v, INF);
        d.put(s, 0L);
        PriorityQueue<PriorityPair> q = new PriorityQueue<>(PriorityPair::compareTo);
        q.add(new PriorityPair(s, 0L));

        while (!q.isEmpty()) {
            PriorityPair pair = q.poll();
            long from = pair.element;
            if (d.get(from) < pair.priority) continue;
            if (!g.hasNext(from)) continue;
            g.getNext(from).stream().filter(to -> d.get(to) > d.get(from) + g.getWeight(from, to)).forEach(to -> {
                d.put(to, d.get(from) + g.getWeight(from, to));
                q.add(new PriorityPair(to, d.get(from)));
            });
        }
        return d.getOrDefault(t, -1L);
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
        }else{
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
    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
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
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
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
    public double nextDouble() { return Double.parseDouble(next());}
}

class PriorityPair implements Comparable<PriorityPair> {

    public long element;
    public long priority;

    public PriorityPair(long element, long priority) {
        this.element = element;
        this.priority = priority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PriorityPair that = (PriorityPair) o;

        if (element != that.element) return false;
        return priority == that.priority;

    }

    @Override
    public int hashCode() {
        int result = (int) (element ^ (element >>> 32));
        result = 31 * result + (int) (priority ^ (priority >>> 32));
        return result;
    }

    @Override
    public int compareTo(PriorityPair o) {
        return Long.compare(priority, o.priority);
    }

    @Override
    public String toString() {
        return "(" + element + ", priority=" + priority + ")";
    }
}

class Graph {

    private Map<Long, Set<Long>> assoc;
    private Map<Pair, Long> weight;
    private boolean weighted;
    private boolean directed;

    public Graph(Map<Long, Set<Long>> assoc, Map<Pair, Long> weight, boolean weighted, boolean directed) {
        this.assoc = assoc;
        this.weight = weight;
        this.weighted = weighted;
        this.directed = directed;
    }

    public static class Builder {

        private Map<Long, Set<Long>> assoc;
        private Map<Pair, Long> weight;

        private long[] s;
        private long[] t;
        private long[] w;
        private boolean weighted;
        private boolean directed;

        public Builder(long[] s, long[] t) {
            this.s = s;
            this.t = t;
            this.w = new long[Math.min(s.length, t.length)];
            this.weighted = false;
            this.directed = true;
        }

        public Builder weighted(long[] w) {
            this.weighted = true;
            this.w = w;
            return this;
        }

        public Builder directed() {
            this.directed = true;
            return this;
        }

        public Builder undirected() {
            this.directed = false;
            return this;
        }

        public Graph build() {
            assoc = new HashMap<>();
            weight = new HashMap<>();
            for (int i = 0; i < Math.min(Math.min(s.length, t.length), w.length); i++) {
                assoc.putIfAbsent(s[i], new HashSet<>());
                assoc.get(s[i]).add(t[i]);
                if (weighted) weight.put(new Pair(s[i], t[i]), w[i]);
                if (!directed) {
                    assoc.putIfAbsent(t[i], new HashSet<>());
                    assoc.get(t[i]).add(s[i]);
                    if (weighted) weight.put(new Pair(t[i], s[i]), w[i]);
                }
            }
            return new Graph(assoc, weight, weighted, directed);
        }

    }

    public boolean hasNext(long from) { return assoc.containsKey(from);
    }

    public Set<Long> getNext(long s) {
        return assoc.get(s);
    }

    public long getWeight(long s, long t) {
        return weight.get(new Pair(s, t));
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        Set<Pair> memo = new HashSet<>();
        for (Map.Entry<Long, Set<Long>> entry : assoc.entrySet()) {
            long s = entry.getKey();
            for (Long t : entry.getValue()) {
                if (!directed && memo.contains(new Pair(t, s))) continue;
                b.append(s).append(!directed ? "<-" : "--").append(weighted ? getWeight(s, t) : "").append("->").append(t).append("\n");
                memo.add(new Pair(s, t));
            }
        }
        return b.toString();
    }
}

class Pair {

    public long fst;
    public long snd;

    public Pair(long fst, long snd) {
        this.fst = fst;
        this.snd = snd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pair pair = (Pair) o;

        if (fst != pair.fst) return false;
        return snd == pair.snd;

    }

    @Override
    public int hashCode() {
        int result = (int) (fst ^ (fst >>> 32));
        result = 31 * result + (int) (snd ^ (snd >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "(" + fst + ", " + snd + ")";
    }

    public void swap() {
        long swap = fst;
        fst = snd;
        snd = swap;
    }
}