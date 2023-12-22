import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static final Watch watch = new Watch();
    static final XorShift rng = new XorShift(System.nanoTime());
    private SAState sa = new SAState();

    private short numVertexes;
    private short numEdges;
    private short Tmax;
    private short[] idToToV;
    private short[] idToStartTime;
    private ArrayList<Node>[][] shortestPaths;
    private short[][][] shortestPathVs;
    private IntSet[][] shortestPathVertexSet;
    private short[][] times;
    private boolean[][] hasV0;
    static long[][] hashes;
    static long[] hashes2;

    private long score;
    private long bestScore;

    private short numIds;

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        read();
        solve();
        write();
    }

    private void read() {
        try (Scanner sc = new Scanner(System.in)) {
            numVertexes = (short) sc.nextInt();
            numEdges = (short) sc.nextInt();
            short[] u = new short[numEdges];
            short[] v = new short[numEdges];
            short[][] d = new short[numVertexes][numVertexes];
            for (int i = 0; i < numEdges; i++) {
                u[i] = (short) (sc.nextInt() - 1);
                v[i] = (short) (sc.nextInt() - 1);
                d[u[i]][v[i]] = (short) sc.nextInt();
                d[v[i]][u[i]] = d[u[i]][v[i]];
            }
            Tmax = (short) sc.nextInt();
            idToToV = new short[Tmax];
            Arrays.fill(idToToV, (short) -1);
            idToStartTime = new short[Tmax];
            Arrays.fill(idToStartTime, (short) -1);
            for (short t = 0; t < Tmax; t++) {
                int Nnew = sc.nextInt();
                if (Nnew == 1) {
                    int new_id = sc.nextInt() - 1;
                    idToToV[new_id] = (short) (sc.nextInt() - 1);
                    idToStartTime[new_id] = t;
                    numIds++;
                }
            }

            ArrayList<Short>[] adjacentVertexes = new ArrayList[numVertexes];
            for (int i = 0; i < numVertexes; i++) {
                adjacentVertexes[i] = new ArrayList<>();
            }
            for (int ei = 0; ei < numEdges; ei++) {
                adjacentVertexes[u[ei]].add(v[ei]);
                adjacentVertexes[v[ei]].add(u[ei]);
            }

            shortestPaths = new ArrayList[numVertexes][numVertexes];
            for (int i = 0; i < numVertexes; i++) {
                dijkstra(i, adjacentVertexes, d);
            }

            times = new short[numVertexes][numVertexes];
            for (int i = 0; i < numVertexes; i++) {
                for (int j = 0; j < numVertexes; j++) {
                    ArrayList<Node> l = shortestPaths[i][j];
                    times[i][j] = l.get(l.size() - 1).time;
                }
            }

            shortestPathVs = new short[numVertexes][numVertexes][];
            for (int i = 0; i < numVertexes; i++) {
                for (int j = 0; j < numVertexes; j++) {
                    ArrayList<Node> l = shortestPaths[i][j];
                    short[] vs = new short[l.size() - 1];
                    for (int k = 1; k < l.size(); k++) {
                        vs[k - 1] = l.get(k).v;
                    }
                    shortestPathVs[i][j] = vs;
                }
            }

            hasV0 = new boolean[numVertexes][numVertexes];
            for (int i = 0; i < numVertexes; i++) {
                for (int j = 0; j < numVertexes; j++) {
                    for (short v2 : shortestPathVs[i][j]) {
                        if (v2 == 0) {
                            hasV0[i][j] = true;
                            break;
                        }
                    }
                }
            }

            shortestPathVertexSet = new IntSet[numVertexes][numVertexes];
            for (int i = 0; i < numVertexes; i++) {
                for (int j = 0; j < numVertexes; j++) {
                    shortestPathVertexSet[i][j] = new IntSet(numVertexes);
                    ArrayList<Node> list = shortestPaths[i][j];
                    for (int k = 0; k < list.size(); k++) {
                        shortestPathVertexSet[i][j].add(list.get(k).v);
                    }
                }
            }
            hashes = new long[Tmax][numVertexes];
            hashes2 = new long[Tmax];
            for (int i = 0; i < Tmax; i++) {
                for (int v2 = 0; v2 < numVertexes; v2++) {
                    hashes[i][v2] = rng.nextLong();
                }
                hashes2[i] = rng.nextLong();
            }

            solveTSP();

            Utils.debug(numVertexes, numEdges);
        }
    }

    private void solveTSP() {
    }

    private int[] ids;

    private void solve() {
        greedy();
    }

    private Node2 best = new Node2(null, (short) 0, -1, null, (short) 0, (short) 0);

    private void greedy() {
        RestrictedHashSetLongHasFalseNegativeAndFalsePositive16x4 usedHashes = new RestrictedHashSetLongHasFalseNegativeAndFalsePositive16x4(16, 1 << 20);
        DoubleEndedPriorityQueue4PQ<Node2>[] pqs = new DoubleEndedPriorityQueue4PQ[Tmax];
        Comparator<Node2> comparator = new Comparator<Node2>() {
            @Override
            public int compare(Node2 o1, Node2 o2) {
                if (o1.score > o2.score) {
                    return -1;
                }
                if (o1.score < o2.score) {
                    return 1;
                }
                return 0;
            }
        };
        for (int i = 0; i < pqs.length; i++) {
            pqs[i] = new DoubleEndedPriorityQueue4PQ<>(comparator);
        }
        short[] ids = new short[numIds];
        {
            pqs[idToStartTime[0]].add(new Node2(null, (short) 0, 0, new short[] { 0 }, (short) 0, (short) idToStartTime[0]));
        }

        short maxWidth = 300;

        MeanHelper helper = new MeanHelper();

        long[] deltaScores = new long[numVertexes];

        double[] timelimits = new double[Tmax];
        double startTime = watch.getSecond();
        double endTime = 29.5;
        for (int i = 0; i < Tmax; i++) {
            timelimits[i] = (endTime - startTime) * (i + 1.0) / Tmax;
        }
        for (short t = 0; t < Tmax; t++) {
            for (short width = 0;; width++) {
                if (width >= maxWidth) {
                    helper.add(width + 1);
                    break;
                }
                if (pqs[t].size() == 0) {
                    helper.add(width + 1);
                    break;
                }
                if (width > 0 && watch.getSecond() > timelimits[t]) {
                    helper.add(width + 1);
                    break;
                }
                Node2 node = pqs[t].pollMin();
                if (node.parent != null) {
                    if (node.parent.v == 0 && node.v == 0) {
                        int size = updateIds(ids, node);
                        size = addIdsAt0(ids, t, node, size);
                        node.ids = Arrays.copyOf(ids, size);
                    } else if (node.parent.v == 0 && node.v != 0) {
                        int size = updateIds(ids, node);
                        node.ids = Arrays.copyOf(ids, size);
                    } else if (node.parent.v != 0 && node.v != 0) {
                        int size = updateIds(ids, node);
                        node.ids = Arrays.copyOf(ids, size);
                    } else if (node.parent.v != 0 && node.v == 0) {
                        int size = updateIds(ids, node);
                        size = addIdsAt0(ids, t, node, size);
                        node.ids = Arrays.copyOf(ids, size);
                    }
                }

                if (comparator.compare(node, best) < 0) {
                    best = node;
                }

                if (node.v == 0) {
                    Arrays.fill(deltaScores, 0);
                    for (short id : node.ids) {
                        short toTime = (short) (t + times[node.v][idToToV[id]]);
                        deltaScores[idToToV[id]] += sq(Tmax) - sq(toTime - idToStartTime[id]);
                    }
                    for (short toV = 1; toV < numVertexes; toV++) {
                        if (deltaScores[toV] == 0) {
                            continue;
                        }
                        if (times[node.v][toV] > 25) {
                            continue;
                        }
                        short toTime = (short) (t + times[node.v][toV]);
                        if (toTime >= pqs.length) {
                            continue;
                        }
                        long hash = hashes[toTime][toV] ^ hashes2[node.idAt0];
                        if (!usedHashes.add(hash)) {
                            continue;
                        }
                        long deltaScore = calculateDeltaScore(deltaScores, node, toV);
                        if (pqs[toTime].size() < maxWidth || node.score + deltaScore > pqs[toTime].max().score) {
                            pqs[toTime].add(new Node2(node, toV, node.score + deltaScore, null, node.idAt0, toTime));
                            if (pqs[toTime].size() >= maxWidth) {
                                pqs[toTime].pollMax();
                            }
                        }
                    }
                    if (node.idAt0 + 1 < numIds) {
                        short time = idToStartTime[node.idAt0 + 1];
                        long hash = hashes[time][node.v] ^ hashes2[node.idAt0 + 1];
                        if (!usedHashes.add(hash)) {
                            continue;
                        }
                        long deltaScore = 0;
                        assert deltaScore == calculateDeltaScore(deltaScores, node, 0);
                        if (pqs[time].size() < maxWidth || node.score + deltaScore > pqs[time].max().score) {
                            pqs[time].add(new Node2(node, (short) node.v, node.score + deltaScore, null, (short) (node.idAt0 + 1), (short) time));
                            if (pqs[time].size() >= maxWidth) {
                                pqs[time].pollMax();
                            }
                        }
                    }

                } else {
                    Arrays.fill(deltaScores, 0);
                    for (short id : node.ids) {
                        short toTime = (short) (t + times[node.v][idToToV[id]]);
                        deltaScores[idToToV[id]] += sq(Tmax) - sq(toTime - idToStartTime[id]);
                    }
                    for (short toV = 1; toV < numVertexes; toV++) {
                        if (deltaScores[toV] == 0) {
                            continue;
                        }
                        if (times[node.v][toV] > 25) {
                            continue;
                        }
                        if (hasV0(node, toV)) {
                            continue;
                        }
                        short toTime = (short) (t + times[node.v][toV]);
                        if (toTime >= pqs.length) {
                            continue;
                        }
                        long hash = hashes[toTime][toV] ^ hashes2[node.idAt0];
                        if (!usedHashes.add(hash)) {
                            continue;
                        }
                        long deltaScore = calculateDeltaScore(deltaScores, node, toV);
                        if (pqs[toTime].size() < maxWidth || node.score + deltaScore > pqs[toTime].max().score) {
                            pqs[toTime].add(new Node2(node, (short) toV, node.score + deltaScore, null, (short) node.idAt0, (short) toTime));
                            if (pqs[toTime].size() >= maxWidth) {
                                pqs[toTime].pollMax();
                            }
                        }
                    }
                    short toTime = (short) (t + times[node.v][0]);
                    if (toTime >= pqs.length) {
                        continue;
                    }
                    short nextIdAt0 = node.idAt0;
                    for (short id = (short) (node.idAt0 + 1); id < numIds; id++) {
                        if (idToStartTime[id] <= toTime) {
                            nextIdAt0 = id;
                        } else {
                            break;
                        }
                    }
                    long hash = hashes[toTime][0] ^ hashes2[nextIdAt0];
                    if (!usedHashes.add(hash)) {
                        continue;
                    }
                    long deltaScore = calculateDeltaScore(deltaScores, node, 0);
                    if (pqs[toTime].size() < maxWidth || node.score + deltaScore > pqs[toTime].max().score) {
                        pqs[toTime].add(new Node2(node, (short) 0, node.score + deltaScore, null, (short) nextIdAt0, (short) toTime));
                        if (pqs[toTime].size() >= maxWidth) {
                            pqs[toTime].pollMax();
                        }
                    }
                }
            }
            pqs[t].clear();
            pqs[t] = null;
            usedHashes.clear();
        }

        Utils.debug("meanWidth", helper.mean(0));

        Utils.debug("greedy", "score", best.score, best.score * 30 / 1e6, "time", watch.getSecondString());
        Utils.debug("score", best.score);

    }

    private boolean hasV0(Node2 node, short toV) {
        return hasV0[node.v][toV];
    }

    private int addIdsAt0(short[] ids, int t, Node2 node, int size) {
        for (short id = (short) (node.parent.idAt0 + 1); id < numIds; id++) {
            if (idToStartTime[id] <= t) {
                ids[size++] = id;
            } else {
                break;
            }
        }
        return size;
    }

    private int updateIds(short[] ids, Node2 node) {
        int size = 0;
        iLoop: for (int i = 0; i < node.parent.ids.length; i++) {
            short id = node.parent.ids[i];
            for (short v : shortestPathVs[node.parent.v][node.v]) {
                if (idToToV[id] == v) {
                    continue iLoop;
                }
            }
            ids[size++] = id;
        }
        return size;
    }

    private long calculateDeltaScore(long[] deltaScores, Node2 node, int toV) {
        long deltaScore = 0;
        for (short v : shortestPathVs[node.v][toV]) {
            deltaScore += deltaScores[v];
        }
        return deltaScore;
    }

    private void write() {
        short[] command = new short[Tmax];
        Arrays.fill(command, (short) -1);
        ArrayList<Node2> list2 = reverse2(toList2(best));
        for (Node2 node : list2) {
            short prevV = node.parent == null ? 0 : node.parent.v;
            if (node.v == prevV) {
                continue;
            }
            short prevTime = node.parent == null ? 0 : node.parent.time;
            ArrayList<Node> list = shortestPaths[prevV][node.v];
            for (int i = 1; i < list.size(); i++) {
                Node n = list.get(i - 1);
                Node n2 = list.get(i);
                for (int t = prevTime + n.time; t < prevTime + n2.time; t++) {
                    if (node.v == prevV) {
                        command[t] = (short) -1;
                    } else {
                        command[t] = n2.v;
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Tmax; i++) {
            int v = command[i];
            sb.append((v == -1 ? -1 : (v + 1)) + "\n");
        }
        System.out.print(sb.toString());
        System.out.flush();
    }

    private long sq(long v) {
        return v * v;
    }

    public void dijkstra(int startVertex, ArrayList<Short>[] adjacentVertexes, short[][] d) {
        int[] time = new int[numVertexes];
        Arrays.fill(time, (int) 1e9);
        PriorityQueue<Node> pq = new PriorityQueue<>(new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                if (o1.time < o2.time) {
                    return -1;
                }
                if (o1.time > o2.time) {
                    return 1;
                }
                return 0;
            }
        });

        {
            pq.add(new Node(null, startVertex, 0));
            time[startVertex] = 0;
        }
        for (; !pq.isEmpty();) {
            Node node = pq.poll();
            if (node.time > time[node.v]) {
                continue;
            }

            shortestPaths[startVertex][node.v] = reverse(toList(node));

            for (short toV : adjacentVertexes[node.v]) {
                if (node.time + d[node.v][toV] >= time[toV]) {
                    continue;
                }
                pq.add(new Node(node, toV, node.time + d[node.v][toV]));
                time[toV] = node.time + d[node.v][toV];
            }

        }
    }

    private ArrayList<Node> reverse(ArrayList<Node> list) {
        for (int l = 0, r = list.size() - 1; l < r; l++, r--) {
            list.set(r, list.set(l, list.get(r)));
        }
        return list;
    }

    private ArrayList<Node> toList(Node node0) {
        ArrayList<Node> res = new ArrayList<>();
        for (Node current = node0; current != null; current = current.parent) {
            res.add(current);
        }
        return res;
    }

    private ArrayList<Node2> reverse2(ArrayList<Node2> list) {
        for (int l = 0, r = list.size() - 1; l < r; l++, r--) {
            list.set(r, list.set(l, list.get(r)));
        }
        return list;
    }

    private ArrayList<Node2> toList2(Node2 node0) {
        ArrayList<Node2> res = new ArrayList<>();
        for (Node2 current = node0; current != null; current = current.parent) {
            res.add(current);
        }
        return res;
    }

    private void saveBest() {
    }

    private void loadBest() {
    }

}

class SAState {

    public static final boolean useTime = true;

    public double startTime = 0;
    public double endTime = 9.5;
    public double time = startTime;
    public double startTemperature = 100;
    public double endTemperature = 80;
    public double inverseTemperature = 1.0 / startTemperature;
    public double lastAcceptTemperature = startTemperature;

    public double startRange = 0;
    public double endRange = 0;
    public double range = startRange;

    public int numIterations;
    public int validIterations;
    public int acceptIterations;

    private double minAbsDeltaScore;
    private double maxAbsDeltaScore;
    private MeanHelper helper = new MeanHelper();

    private static final double[] log = new double[32768];
    static {
        for (int i = 0; i < log.length; i++) {
            log[i] = Math.log((i + 0.5) / log.length);
        }
    }

    public void init() {
        numIterations = 0;
        validIterations = 0;
        acceptIterations = 0;

        minAbsDeltaScore = 1e99;
        maxAbsDeltaScore = 1e-99;
        helper.clear();

        startTime = useTime ? Main.watch.getSecond() : numIterations;

        update();
        lastAcceptTemperature = inverseTemperature;
    }

    public void update() {
        updateTime();
        updateTemperature();
        updateRange();
    }

    public boolean useMean = true;
    public boolean useMax = !true;
    public double startRate = 0.01;
    public double endRate = 0.01;
    public boolean useExp = !true;

    public void updateStartTemperature() {
        if (useMean) {
            double d = helper.mean(maxAbsDeltaScore);
            d = d > 0 ? d : maxAbsDeltaScore;
            startTemperature = (-1.0 * d) / Math.log(startRate);
        } else if (useMax) {
            startTemperature = (-1.0 * maxAbsDeltaScore) / Math.log(startRate);
        } else {
            startTemperature = (-1.0 * minAbsDeltaScore) / Math.log(startRate);
        }
    }

    public void updateEndTemperature() {
        endTemperature = (-1.0 * minAbsDeltaScore) / Math.log(endRate);
    }

    public void updateTemperature() {
        if (useExp) {
            double time0to1 = elapsedPercentage(startTime, endTime, time);
            double startY = startTemperature;
            double endY = endTemperature;
            double startX = Math.log(startY);
            double endX = Math.log(endY);
            double xStartToEnd = interpolate(startX, endX, time0to1);
            double temperature = Math.exp(xStartToEnd);

            inverseTemperature = 1.0 / temperature;
        } else {
            double time0to1 = elapsedPercentage(startTime, endTime, time);
            double startY = startTemperature;
            double endY = endTemperature;
            double temperature = interpolate(startY, endY, time0to1);

            inverseTemperature = 1.0 / temperature;
        }
    }

    private double elapsedPercentage(double min, double max, double v) {
        return (v - min) / (max - min);
    }

    private double interpolate(double v0, double v1, double d0to1) {
        return v0 + (v1 - v0) * d0to1;
    }

    public void updateRange() {
        range = endRange + (startRange - endRange) * Math.pow((endTime - time) / (endTime - startTime), 1.0);
    }

    public void updateTime() {
        time = useTime ? Main.watch.getSecond() : numIterations;
    }

    public boolean isTLE() {
        return time >= endTime;
    }

    public boolean accept(double deltaScore) {
        double abs = Math.abs(deltaScore);
        if (abs > 1e-9) {
            helper.add(deltaScore);
            minAbsDeltaScore = Math.min(minAbsDeltaScore, abs);
            maxAbsDeltaScore = Math.max(maxAbsDeltaScore, abs);
        }
        return acceptB(deltaScore);
    }

    public boolean acceptB(double deltaScore) {
        validIterations++;

        if (deltaScore > -1e-9) {
            acceptIterations++;
            return true;
        }

        assert deltaScore < 0 : Utils.toString(deltaScore);
        assert 1.0 / inverseTemperature >= 0;

        if (deltaScore * inverseTemperature < -10) {
            return false;
        }
        if (log[Main.rng.nextInt() & 32767] < deltaScore * inverseTemperature) {
            acceptIterations++;
            lastAcceptTemperature = inverseTemperature;
            return true;
        }
        return false;
    }

    public boolean acceptS(double deltaScore) {
        validIterations++;

        if (deltaScore < 1e-9) {
            acceptIterations++;
            return true;
        }

        assert deltaScore > 0;
        assert 1.0 / inverseTemperature >= 0;

        if (-deltaScore * inverseTemperature < -10) {
            return false;
        }
        if (log[Main.rng.nextInt() & 32767] < deltaScore * inverseTemperature) {
            acceptIterations++;
            lastAcceptTemperature = inverseTemperature;
            return true;
        }
        return false;
    }

}

final class Utils {
    private Utils() {
    }

    public static final void debug(Object... o) {
        System.err.println(toString(o));
    }

    public static final String toString(Object... o) {
        return Arrays.deepToString(o);
    }

}

class Watch {
    private long start;

    public Watch() {
        init();
    }

    public double getSecond() {
        return (System.nanoTime() - start) * 1e-9;
    }

    public void init() {
        init(System.nanoTime());
    }

    private void init(long start) {
        this.start = start;
    }

    public String getSecondString() {
        return toString(getSecond());
    }

    public static final String toString(double second) {
        if (second < 60) {
            return String.format("%5.2fs", second);
        } else if (second < 60 * 60) {
            int minute = (int) (second / 60);
            return String.format("%2dm%2ds", minute, (int) (second % 60));
        } else {
            int hour = (int) (second / (60 * 60));
            int minute = (int) (second / 60);
            return String.format("%2dh%2dm%2ds", hour, minute % (60), (int) (second % 60));
        }
    }

}

class XorShift {
    private int w = 88675123;
    private int x = 123456789;
    private int y = 362436069;
    private int z = 521288629;

    public XorShift(long l) {
        x = (int) l;
    }

    public int nextInt() {
        final int t = x ^ (x << 11);
        x = y;
        y = z;
        z = w;
        w = w ^ (w >>> 19) ^ (t ^ (t >>> 8));
        return w;
    }

    public double nextDouble() {
        return (nextInt() >>> 1) * 4.6566128730773926E-10;
    }

    public int nextInt(int n) {
        return (int) (n * nextDouble());
    }

    public long nextLong() {
        long a = nextInt();
        long b = nextInt();
        return (a << 32) ^ b;
    }

}

class Pair<T extends Comparable<T>, S> implements Comparable<Pair<T, S>> {
    public T first;
    public S second;

    public Pair(T t, S s) {
        this.first = t;
        this.second = s;
    }

    private int hash = 0;

    @Override
    public int hashCode() {
        if (hash == 0) {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((first == null) ? 0 : first.hashCode());
            result = prime * result + ((second == null) ? 0 : second.hashCode());
            hash = result;
        }
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pair<T, S> other = (Pair<T, S>) obj;
        if (first == null) {
            if (other.first != null)
                return false;
        } else if (!first.equals(other.first))
            return false;
        if (second == null) {
            if (other.second != null)
                return false;
        } else if (!second.equals(other.second))
            return false;
        return true;
    }

    @Override
    public int compareTo(Pair<T, S> o) {
        return first.compareTo(o.first);
    }
}

class CollectionsUtils {
    private CollectionsUtils() {
    }

    public static final <T> void shuffle(ArrayList<T> list, Random rng) {
        for (int i = list.size() - 1; i >= 0; i--) {
            int j = (int) ((i + 1) * rng.nextDouble());
            CollectionsUtils.swap(list, i, j);
        }
    }

    public static final <T> void shuffle(ArrayList<T> list, XorShift rng) {
        for (int i = list.size() - 1; i >= 0; i--) {
            int j = (int) ((i + 1) * rng.nextDouble());
            CollectionsUtils.swap(list, i, j);
        }
    }

    public static final <T> void select0(ArrayList<T> a, int l, int r, int k, Comparator<T> comparator) {
        while (l < r) {
            int i = CollectionsUtils.partition3(a, l, r, comparator);
            if (i >= k)
                r = i - 1;
            if (i <= k)
                l = i + 1;
        }
    }

    public static final <T extends Comparable<T>> void select(ArrayList<T> a, int startInclusive, int endExclusive, int k, Comparator<T> comparator) {
        select0(a, startInclusive, endExclusive - 1, k, comparator);
    }

    public static final <T extends Comparable<T>> void select0(ArrayList<T> a, int l, int r, int k) {
        while (l < r) {
            int i = CollectionsUtils.partition3(a, l, r);
            if (i >= k)
                r = i - 1;
            if (i <= k)
                l = i + 1;
        }
    }

    public static final <T extends Comparable<T>> void select(ArrayList<T> a, int startInclusive, int endExclusive, int k) {
        select0(a, startInclusive, endExclusive - 1, k);
    }

    public static final <T> void swap(ArrayList<T> a, int i, int j) {
        T swap = a.set(i, a.get(j));
        a.set(j, swap);
    }

    public static final <T> void sort3(ArrayList<T> a, int i, int j, int k, Comparator<T> comparator) {
        if (comparator.compare(a.get(i), a.get(j)) > 0) {
            swap(a, i, j);
        }
        if (comparator.compare(a.get(i), a.get(k)) > 0) {
            swap(a, i, k);
        }
        if (comparator.compare(a.get(j), a.get(k)) > 0) {
            swap(a, j, k);
        }
    }

    public static final <T extends Comparable<T>> void sort3(ArrayList<T> a, int i, int j, int k) {
        if (a.get(i).compareTo(a.get(j)) > 0) {
            swap(a, i, j);
        }
        if (a.get(i).compareTo(a.get(k)) > 0) {
            swap(a, i, k);
        }
        if (a.get(j).compareTo(a.get(k)) > 0) {
            swap(a, j, k);
        }
    }

    public static final <T> int partition3(ArrayList<T> a, int l, int r, Comparator<T> comparator) {
        int center = (l + r) >>> 1;
        sort3(a, l, center, r, comparator);
        swap(a, center, r - 1);
        if (r - l < 3) {
            return l;
        }
        int r1 = r - 1;
        T v = a.get(r1);
        int i = l - 1;
        int j = r1;
        for (;;) {
            for (; comparator.compare(a.get(++i), v) < 0;) {
            }
            for (; comparator.compare(a.get(--j), v) > 0;) {
            }
            if (i >= j) {
                break;
            }
            swap(a, i, j);
        }
        swap(a, i, r1);
        return i;
    }

    public static final <T extends Comparable<T>> int partition3(ArrayList<T> a, int l, int r) {
        int center = (l + r) >>> 1;
        sort3(a, l, center, r);
        swap(a, center, r - 1);
        if (r - l < 3) {
            return l;
        }
        int r1 = r - 1;
        T v = a.get(r1);
        int i = l - 1;
        int j = r1;
        for (;;) {
            for (; a.get(++i).compareTo(v) < 0;) {
            }
            for (; a.get(--j).compareTo(v) > 0;) {
            }
            if (i >= j) {
                break;
            }
            swap(a, i, j);
        }
        swap(a, i, r1);
        return i;
    }

    public static final <T extends Comparable<T>> int partition(ArrayList<T> a, int l, int r) {
        int i = l - 1, j = r;
        T v = a.get(r);
        for (;;) {
            while (a.get(++i).compareTo(v) < 0)
                ;
            while (v.compareTo(a.get(--j)) < 0)
                if (j == l)
                    break;
            if (i >= j)
                break;
            swap(a, i, j);
        }
        swap(a, i, r);
        return i;
    }

    public static final <T> void sort(ArrayList<T> a, int lInclusive, int rInclusive, Comparator<T> comparator) {
        if (lInclusive >= rInclusive) {
            return;
        }
        int k = partition3(a, lInclusive, rInclusive, comparator);
        sort(a, lInclusive, k - 1, comparator);
        sort(a, k + 1, rInclusive, comparator);
    }

    public <T> ArrayList<T> reverse(ArrayList<T> list) {
        for (int l = 0, r = list.size() - 1; l < r; l++, r--) {
            list.set(r, list.set(l, list.get(r)));
        }
        return list;
    }

    public <T> ArrayList<T> newReverse(ArrayList<T> list) {
        ArrayList<T> res = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            res.add(list.get(i));
        }
        return res;
    }

}

class IntSet {
    private static final int EMPTY = -1;
    private int size;
    private int[] indexToValue;
    private int[] valueToIndex;

    public IntSet(int capacity) {
        this.size = 0;
        indexToValue = new int[capacity];
        valueToIndex = new int[capacity];
        Arrays.fill(valueToIndex, EMPTY);
    }

    public boolean add(int value) {
        if (valueToIndex[value] != EMPTY) {
            return false;
        }
        indexToValue[size] = value;
        valueToIndex[indexToValue[size]] = size;
        size++;
        return true;
    }

    public boolean remove(int index) {
        if (size == 0) {
            return false;
        }
        assert index < size;
        swap(index, size - 1);
        valueToIndex[indexToValue[size - 1]] = EMPTY;

        size--;
        return true;
    }

    public boolean removeValue(int value) {
        int index = indexOf(value);
        if (index == EMPTY) {
            return false;
        }
        remove(index);
        return true;
    }

    public void swap(int index, int index2) {
        assert index < size;
        assert index2 < size;

        int swap = indexToValue[index];
        indexToValue[index] = indexToValue[index2];
        indexToValue[index2] = swap;

        valueToIndex[indexToValue[index]] = index;
        valueToIndex[indexToValue[index2]] = index2;

    }

    public void swapValue(int index, int index2) {
        assert index < size;
        assert index2 < size;

        int swap = valueToIndex[index];
        valueToIndex[index] = valueToIndex[index2];
        valueToIndex[index2] = swap;

        indexToValue[valueToIndex[index]] = index;
        indexToValue[valueToIndex[index2]] = index2;

    }

    public int get(int index) {
        assert index < size;
        return indexToValue[index];
    }

    public int indexOf(int value) {
        return valueToIndex[value];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size() <= 0;
    }

    public void clear() {
        for (; size() > 0;) {
            remove(0);
        }
    }

    public boolean contains(int value) {
        return indexOf(value) != EMPTY;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(indexToValue, size()));
    }
}

class MeanHelper {
    private double max;
    private double min;
    private double sum;
    private double sumSquared;
    private double sumCubed;
    private double sumFourth;
    private int count;

    public MeanHelper() {
        clear();
    }

    public void add(double value) {
        max = Math.max(max, value);
        min = Math.min(min, value);
        sum += value;
        double valueSquared = value * value;
        sumSquared += valueSquared;
        sumCubed += valueSquared * value;
        sumFourth += valueSquared * valueSquared;
        count++;
    }

    public void add(double value, double number) {
        max = Math.max(max, value);
        min = Math.min(min, value);
        sum += value * number;
        double valueSquared = value * value;
        sumSquared += valueSquared * number;
        sumCubed += valueSquared * value * number;
        sumFourth += valueSquared * valueSquared * number;
        count += number;
    }

    public double kurtosis(double defaultValue) {
        if (isEmpty()) {
            return defaultValue;
        }
        double sigma = standardDeviation(0);
        if (sigma == 0) {
            return 0;
        }
        double mu = mean(0);
        return (sumFourth - 4.0 * mu * sumCubed + 6.0 * mu * mu * sumSquared - 3.0 * mu * mu * mu * sum) / count / (sigma * sigma * sigma * sigma);
    }

    public double skewness(double defaultValue) {
        if (isEmpty()) {
            return defaultValue;
        }
        double sigma = standardDeviation(0);
        if (sigma == 0) {
            return 0;
        }
        double mu = mean(0);
        return (sumCubed - 3.0 * mu * sumSquared + 2.0 * mu * mu * sum) / count / (sigma * sigma * sigma);
    }

    public double mean() {
        if (isEmpty()) {
            throw new AssertionError();
        }
        return sum / count;
    }

    public double mean(double defaultValue) {
        if (isEmpty()) {
            return defaultValue;
        }
        return sum / count;
    }

    public double sumOfSquaredError() {
        if (isEmpty()) {
            throw new AssertionError();
        }
        return sumSquared - sum * sum / count;
    }

    public double sumOfSquaredError(double defaultValue) {
        if (isEmpty()) {
            return defaultValue;
        }
        return sumSquared - sum * sum / count;
    }

    public double variance() {
        if (isEmpty()) {
            throw new AssertionError();
        }
        double E_XX = sumSquared / count;
        double E_X = sum / count;
        return E_XX - E_X * E_X;
    }

    public double variance(double defaultValue) {
        if (isEmpty()) {
            return defaultValue;
        }
        double E_XX = sumSquared / count;
        double E_X = sum / count;
        return E_XX - E_X * E_X;
    }

    public double unbiasedVariance() {
        if (count - 1 == 0) {
            throw new AssertionError();
        }
        return (count * variance()) / (count - 1);
    }

    private double unbiasedVariance(double defaultValue) {
        if (count - 1 == 0) {
            return defaultValue;
        }
        return (count * variance()) / (count - 1);
    }

    public double standardDeviation() {
        return Math.sqrt(variance());
    }

    public double standardDeviation(double defaultValue) {
        return Math.sqrt(variance(defaultValue));
    }

    public double unbiasedStandardDeviation() {
        return Math.sqrt(unbiasedVariance());
    }

    public double unbiasedStandardDeviation(double defaultValue) {
        return Math.sqrt(unbiasedVariance(defaultValue));
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void clear() {
        max = Double.NEGATIVE_INFINITY;
        min = Double.POSITIVE_INFINITY;
        sum = 0;
        sumSquared = 0;
        sumCubed = 0;
        sumFourth = 0;
        count = 0;
    }

    public double max() {
        if (isEmpty()) {
            throw new AssertionError();
        }
        return max;
    }

    public double max(double defaultValue) {
        if (isEmpty()) {
            return defaultValue;
        }
        return max;
    }

    public double min() {
        if (isEmpty()) {
            throw new AssertionError();
        }
        return min;
    }

    public double min(double defaultValue) {
        if (isEmpty()) {
            return defaultValue;
        }
        return min;
    }

    public int count() {
        return count;
    }

    public double sum() {
        return sum;
    }

    public double sumSquared() {
        return sumSquared;
    }
}

class Node {
    Node parent;
    short v;
    short time;

    public Node(Node parent, int v, int time) {
        super();
        this.parent = parent;
        this.v = (short) v;
        this.time = (short) time;
    }

}

class Node2 {
    Node2 parent;
    short v;
    long score;
    short[] ids;
    short idAt0;
    short time;

    public Node2(Node2 parent, short v, long score, short[] items, short orderIndex, short time) {
        super();
        this.parent = parent;
        this.v = v;
        this.score = score;
        this.ids = items;
        this.idAt0 = orderIndex;
        this.time = time;
    }
}

class DoubleEndedPriorityQueue4PQ<T> {
    private PriorityQueue<T> min;
    private PriorityQueue<T> max;
    private PriorityQueue<T> minDelete;
    private PriorityQueue<T> maxDelete;
    private Comparator<T> comparator;

    public DoubleEndedPriorityQueue4PQ(Comparator<T> comparator) {
        this.comparator = comparator;

        Comparator<T> reverse = new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                return -1 * comparator.compare(o1, o2);
            }
        };

        min = new PriorityQueue<>(comparator);
        max = new PriorityQueue<>(reverse);
        minDelete = new PriorityQueue<>(comparator);
        maxDelete = new PriorityQueue<>(reverse);
    }

    public boolean add(T t) {
        return min.add(t) && max.add(t);
    }

    public T min() {
        pollSame(min, minDelete);
        return min.peek();
    }

    private void pollSame(PriorityQueue<T> min2, PriorityQueue<T> minDelete2) {
        while (isSame(min2, minDelete2)) {
            min2.poll();
            minDelete2.poll();
        }
    }

    private boolean isSame(PriorityQueue<T> min2, PriorityQueue<T> minDelete2) {
        return min2.size() > 0 && minDelete2.size() > 0 && comparator.compare(min2.peek(), minDelete2.peek()) == 0;
    }

    public T max() {
        pollSame(max, maxDelete);
        return max.peek();
    }

    public T pollMin() {
        pollSame(min, minDelete);
        T poll = min.poll();
        maxDelete.add(poll);
        return poll;
    }

    public T pollMax() {
        pollSame(max, maxDelete);
        T poll = max.poll();
        minDelete.add(poll);
        return poll;
    }

    public int size() {
        assert min.size() - minDelete.size() == max.size() - maxDelete.size();
        return min.size() - minDelete.size();
    }

    public void clear() {
        min.clear();
        minDelete.clear();
        max.clear();
        maxDelete.clear();
    }

}

class RestrictedHashSetLongHasFalseNegativeAndFalsePositive16x4 {
    private long mask;
    private long[] used;
    private IntArray indexes;
    private long mask2 = ((1L << 16) - 1L) << 48;

    public RestrictedHashSetLongHasFalseNegativeAndFalsePositive16x4(int numBits, int capacity) {
        mask = (1L << numBits) - 1L;
        used = new long[1 << numBits];
        indexes = new IntArray(capacity);
    }

    public boolean add(long hash) {
        int index = (int) (hash & mask);
        long value = hash & mask2;

        if ((used[index] & mask2) == value) {
            return false;
        }
        if (((used[index] << 16) & mask2) == value) {
            return false;
        }
        if (((used[index] << 32) & mask2) == value) {
            return false;
        }
        if (((used[index] << 48) & mask2) == value) {
            return false;
        }

        used[index] = (used[index] >>> 16) | value;
        indexes.add(index);

        return true;
    }

    public void clear() {
        for (int i = 0; i < indexes.length; i++) {
            used[indexes.values[i]] = 0;
        }
        indexes.clear();
    }
}

class IntArray {
    public int[] values;
    public int length;

    public IntArray() {
        this(new int[4], 0);
    }

    public IntArray(int capacity) {
        this(new int[capacity], 0);
    }

    public IntArray(int[] values) {
        this(values, values.length);
    }

    public IntArray(int[] values, int length) {
        this.values = values;
        this.length = length;
    }

    public void add(int value) {
        if (length == values.length) {
            values = Arrays.copyOf(values, values.length << 1);
        }
        values[length++] = value;
    }

    public int remove() {
        return values[--length];
    }

    public boolean contains(int value) {
        for (int i = 0; i < length; i++) {
            if (values[i] == value) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        length = 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (int i = 0; i < length; i++) {
            sb.append(values[i] + ",");
        }
        sb.append("}");
        return sb.toString();
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int remove(int index) {
        if (index >= length) {
            throw new AssertionError();
        }

        if (index == length - 1) {
            return remove();
        }

        int res = values[index];
        System.arraycopy(values, index + 1, values, index, length - (index + 1));
        length--;

        return res;
    }

    public void set(int index, int value) {
        if (index == length) {
            add(value);
            return;
        }

        if (index >= length) {
            throw new AssertionError();
        }

        if (length >= values.length - 1) {
            values = Arrays.copyOf(values, values.length << 1);
        }
        System.arraycopy(values, index, values, index + 1, length - index);
        length++;

        values[index] = value;
    }

    public IntArray copy() {
        return new IntArray(Arrays.copyOf(values, length), length);
    }

    public int[] toArray() {
        return Arrays.copyOf(values, length);
    }

}
