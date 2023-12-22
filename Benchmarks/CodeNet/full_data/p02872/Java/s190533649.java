import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static final Watch watch = new Watch();
    static final XorShift rng = new XorShift(System.nanoTime());
    private int numVertexes;
    private int numEdges;
    private int[] u;
    private int[] v;
    private int[][] d;
    private int Tmax;
    private int[] f;
    private int[] idToToV;
    private int[] idToStartTime;

    private ArrayList<Integer>[] adjacentVertexes;

    private ArrayList<Node>[][] shortestPaths;
    private IntSet[][] shortestPathVertexSet;
    static long[][] hashes;
    static long[] hashes2;

    private int currentTime;
    private IntSet currentIdSet;
    private IntSet nextIdSet;

    private long score;

    private double[] timelimits;

    private int[][] times;

    private State state;
    private int numAchieveIds;
    private int numIds;

    private EuclideanTravellingSalesmanProblem TSP = new EuclideanTravellingSalesmanProblem();

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        try (Scanner sc = new Scanner(System.in)) {
            read(sc);
            for (currentTime = 0; currentTime < Tmax; currentTime++) {
                if (currentTime % 1000 == 999) {
                    Utils.debug(currentTime, "score", score, "numAchieveIds", numAchieveIds, "numIds", numIds, "rest", numIds - numAchieveIds, "time", watch.getSecondString());
                }
                read2(sc);
                solve();
                if (!read3(sc)) {
                    Utils.debug("score", score, "numAchieveIds", numAchieveIds, "numIds", numIds, "time", watch.getSecondString());
                    break;
                }
            }
        }
    }

    private void read(Scanner sc) {
        numVertexes = sc.nextInt();
        numEdges = sc.nextInt();
        Utils.debug(numVertexes, numEdges);
        u = new int[numEdges];
        v = new int[numEdges];
        d = new int[numVertexes][numVertexes];
        for (int i = 0; i < numEdges; i++) {
            u[i] = sc.nextInt() - 1;
            v[i] = sc.nextInt() - 1;
            d[u[i]][v[i]] = sc.nextInt();
            d[v[i]][u[i]] = d[u[i]][v[i]];
        }
        f = new int[numVertexes];
        for (int i = 0; i < numVertexes; i++) {
            f[i] = sc.nextInt();
        }
        Tmax = sc.nextInt();
        idToToV = new int[Tmax];
        idToStartTime = new int[Tmax];
        adjacentVertexes = new ArrayList[numVertexes];
        for (int i = 0; i < numVertexes; i++) {
            adjacentVertexes[i] = new ArrayList<>();
        }
        for (int ei = 0; ei < numEdges; ei++) {
            adjacentVertexes[u[ei]].add(v[ei]);
            adjacentVertexes[v[ei]].add(u[ei]);
        }

        shortestPaths = new ArrayList[numVertexes][numVertexes];
        for (int i = 0; i < numVertexes; i++) {
            dijkstra(i);
        }

        times = new int[numVertexes][numVertexes];
        for (int i = 0; i < numVertexes; i++) {
            for (int j = 0; j < numVertexes; j++) {
                ArrayList<Node> l = shortestPaths[i][j];
                times[i][j] = l.get(l.size() - 1).time;
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
            for (int v = 0; v < numVertexes; v++) {
                hashes[i][v] = rng.nextLong();
            }
            hashes2[i] = rng.nextLong();
        }

        currentIdSet = new IntSet(Tmax);
        nextIdSet = new IntSet(Tmax);

        score = 0;

        timelimits = new double[Tmax];
        double startTime = watch.getSecond();
        double endTime = 29.5;
        for (int i = 0; i < Tmax; i++) {
            timelimits[i] = (endTime - startTime) * (i + 1.0) / Tmax;
        }

        solveTSP();

        state = new State();
        state.setVertex(0);
    }

    private void solve() {
        greedy();
    }

    int[] city;

    private ArrayList<Integer> scheduleV = new ArrayList<>();
    private ArrayList<Integer> scheduleV2 = new ArrayList<>();
    private ArrayList<Integer> scheduleV3 = new ArrayList<>();

    private void greedy() {
        if (state.onEdge) {
            System.out.println(state.toV + 1);
            System.out.flush();

            state.keep();

            return;
        }

        if (scheduleV2.size() > 0) {
            int length = scheduleV2.size() - scheduleV.size();
            int fixLength = 25;
            if (length % fixLength > fixLength - 10) {
                if (scheduleV.size() > 0 && scheduleV.get(0) == scheduleV2.get(length)) {
                    if (scheduleV.size() < 2 * nextIdSet.size()) {
                        int v = state.currentV;
                        int v2 = scheduleV.get(0).intValue();
                        if (times[v][0] + times[0][v2] - times[v][v2] < numVertexes / 4.0) {
                            ArrayList<Node> l = shortestPaths[0][v2];
                            for (int j = 1; j < l.size() - 1; j++) {
                                scheduleV.add(j - 1, (int) l.get(j).v);
                            }
                            l = shortestPaths[v][0];
                            for (int j = 1; j < l.size(); j++) {
                                scheduleV.add(j - 1, (int) l.get(j).v);
                            }
                            scheduleV2.clear();
                            scheduleV3.clear();
                            Utils.debug("middle v0");
                        }
                    }
                }
            }
        }

        if (scheduleV.size() > 0) {
            int nextV = scheduleV.remove(0).intValue();
            System.out.println(nextV + 1);
            System.out.flush();
            state.moveTo(nextV);
            return;
        }

        if (currentIdSet.size() + nextIdSet.size() == 0) {
            if (state.currentV == 0) {
                System.out.println(-1);
                System.out.flush();
                state.setVertex(0);
                return;
            } else {
                ArrayList<Node> l = shortestPaths[state.currentV][0];
                int v2 = l.get(1).v;
                System.out.println(v2 + 1);
                System.out.flush();
                state.moveTo(v2);
                return;
            }
        }

        if (state.currentV == 0 && currentIdSet.size() > 0) {
            city = new int[1 + currentIdSet.size()];
            boolean[] used = new boolean[numVertexes];
            int size = 0;
            for (int i = 0; i < currentIdSet.size(); i++) {
                int id = currentIdSet.get(i);
                int v = idToToV[id];
                if (used[v]) {
                    continue;
                }
                used[v] = true;
                city[size++] = v;
            }
            city[size++] = 0;
            city = Arrays.copyOf(city, size);
            city = TSP.getOrder(city);
            assert city[0] == 0;
            {
                scheduleV.clear();
                scheduleV2.clear();
                scheduleV3.clear();
                int prevV = state.currentV;
                for (int i = 0; i < city.length; i++) {
                    int v = city[i];

                    ArrayList<Node> l = shortestPaths[prevV][v];
                    for (int j = 1; j < l.size(); j++) {
                        scheduleV.add((int) l.get(j).v);
                        scheduleV2.add(v);
                        if (j == l.size() - 1) {
                            scheduleV3.add(v);
                        }
                    }

                    prevV = v;
                }

                if (scheduleV.size() > 0) {
                    int nextV = scheduleV.remove(0).intValue();
                    System.out.println(nextV + 1);
                    System.out.flush();
                    state.moveTo(nextV);
                    return;
                }
            }
        }

        if (Math.random() < 1) {
            if (state.currentV == 0) {
                System.out.println(-1);
                System.out.flush();
                state.setVertex(0);
                return;
            } else {
                ArrayList<Node> l = shortestPaths[state.currentV][0];
                int v2 = l.get(1).v;
                System.out.println(v2 + 1);
                System.out.flush();
                state.moveTo(v2);
                return;
            }
        }

        int min = (int) 1e9;
        int minId = -1;
        for (int i = 0; i < currentIdSet.size(); i++) {
            int id = currentIdSet.get(i);
            int toV = idToToV[id];
            if (times[state.currentV][toV] < min) {
                min = times[state.currentV][toV];
                minId = id;
            }
        }
        for (int i = 0; i < nextIdSet.size(); i++) {
            int id = nextIdSet.get(i);
            int toV = idToToV[id];
            if (times[state.currentV][0] + times[0][toV] < min) {
                min = times[state.currentV][0] + times[0][toV];
                minId = id;
            }
        }
        assert minId != -1;

        if (nextIdSet.contains(minId)) {
            if (state.currentV == 0) {
                System.out.println(-1);
                System.out.flush();
                state.setVertex(0);
            } else {
                ArrayList<Node> l = shortestPaths[state.currentV][0];
                int v2 = l.get(1).v;
                System.out.println(v2 + 1);
                System.out.flush();
                state.moveTo(v2);
            }
        } else {
            ArrayList<Node> l = shortestPaths[state.currentV][idToToV[minId]];
            int v2 = l.get(1).v;
            System.out.println(v2 + 1);
            System.out.flush();
            state.moveTo(v2);
        }

        return;
    }

    public static final void shuffle(int[] a) {
        for (int i = a.length - 1; i >= 0; i--) {
            int j = (int) ((i + 1) * rng.nextDouble());
            swap(a, i, j);
        }
    }

    public static final void swap(int[] a, int i, int j) {
        int swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    private void read2(Scanner sc) {
        int Nnew = sc.nextInt();
        if (Nnew == 1) {
            int id = sc.nextInt();
            numIds++;
            int dst = sc.nextInt();
            idToToV[id] = dst - 1;
            idToStartTime[id] = currentTime;
            nextIdSet.add(id);
        }

        int Nput = sc.nextInt();
        for (int n = 0; n < Nput; n++) {
            int put_id = sc.nextInt();
            currentIdSet.add(put_id);
            nextIdSet.removeValue(put_id);
        }
    }

    private boolean read3(Scanner sc) {
        String verdict = sc.next();
        if (verdict.equals("NG")) {
            return false;
        }
        int Nachieve = sc.nextInt();
        for (int n = 0; n < Nachieve; n++) {
            int achieve_id = sc.nextInt();
            currentIdSet.removeValue(achieve_id);
            score += sq(Tmax) - sq(currentTime - idToStartTime[achieve_id] + 1);
            numAchieveIds++;
        }
        return true;
    }

    private void solveTSP() {
    }

    public void dijkstra(int startVertex) {
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

            for (int toV : adjacentVertexes[node.v]) {
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

    private long sq(long v) {
        return v * v;
    }

    private void reverse2(int[] a) {
        for (int l = 0, r = a.length - 1; l < r; l++, r--) {
            int swap = a[l];
            a[l] = a[r];
            a[r] = swap;
        }
    }

    class State {
        int toV;
        int fromV;
        boolean onEdge;
        int currentV;
        int currentDist;

        public void setVertex(int v) {
            onEdge = false;
            currentV = v;
            fromV = -1;
            toV = -1;
            currentDist = 0;
        }

        public void moveTo(int v) {
            onEdge = true;
            fromV = currentV;
            currentV = -1;
            toV = v;
            currentDist++;

            if (currentDist == times[fromV][toV]) {
                setVertex(toV);
            }
        }

        public void keep() {
            currentDist++;

            if (currentDist == times[fromV][toV]) {
                setVertex(toV);
            }
        }

        public void reverse() {
            int swap = fromV;
            fromV = toV;
            toV = swap;

            currentDist = times[fromV][toV] - currentDist;

            if (currentDist == times[fromV][toV]) {
                setVertex(toV);
            }
        }
    }

    class EuclideanTravellingSalesmanProblem {
        private int N;
        private int[] nodeToCity;
        private double score;

        private int[] bestNodeToCity;
        private double bestScore;

        public int[] getOrder(int[] nodeToCity) {
            init(nodeToCity);
            GLS();

            int index0 = 0;
            for (int i = 0; i < nodeToCity.length; i++) {
                if (nodeToCity[i] == 0) {
                    index0 = i;
                    break;
                }
            }

            for (int i = 0; i < nodeToCity.length; i++) {
                bestNodeToCity[i] = nodeToCity[(index0 + i) % nodeToCity.length];
            }
            System.arraycopy(bestNodeToCity, 0, nodeToCity, 0, nodeToCity.length);

            assert nodeToCity[0] == 0;
            return nodeToCity;
        }

        private void init(int[] nodeToCity) {
            this.N = numVertexes;
            this.nodeToCity = nodeToCity;
            score = calculateScore();
            bestScore = 1e9;
            bestNodeToCity = new int[nodeToCity.length];
        }

        private void GLS() {
            double[][] penalty = new double[N][N];
            int[] maxUtilNodes = new int[N];
            boolean[] isTarget = new boolean[N];
            Arrays.fill(isTarget, true);

            for (int iteration = 0; iteration < 2 * 10000; iteration++) {
                for (int i = 0, node = 0; i < nodeToCity.length; i++, node = (node + 1) % nodeToCity.length) {
                    if (!isTarget[nodeToCity[node]]) {
                        continue;
                    }

                    int B = node;
                    int A = B - 1;
                    if (A < 0) {
                        A = nodeToCity.length - 1;
                    }

                    boolean update = false;
                    for (int node2 = 0; node2 < nodeToCity.length; node2++) {
                        if (node2 == node) {
                            continue;
                        }
                        int C = node2;
                        int D = node2 + 1;
                        if (D == nodeToCity.length) {
                            D = 0;
                        }

                        if (C == A) {
                            continue;
                        }
                        if (D == B) {
                            continue;
                        }

                        double A_BC_D = times[nodeToCity[A]][nodeToCity[B]] + times[nodeToCity[C]][nodeToCity[D]];
                        double A_CB_D = times[nodeToCity[A]][nodeToCity[C]] + times[nodeToCity[B]][nodeToCity[D]];
                        double deltaScore = A_CB_D - A_BC_D;

                        double pA_BC_D = penalty[nodeToCity[A]][nodeToCity[B]] + penalty[nodeToCity[C]][nodeToCity[D]];
                        double pA_CB_D = penalty[nodeToCity[A]][nodeToCity[C]] + penalty[nodeToCity[B]][nodeToCity[D]];
                        double deltaPenalty = (0.3 * bestScore / nodeToCity.length) * (pA_CB_D - pA_BC_D);

                        if (deltaScore + deltaPenalty < 0) {
                            update = true;
                            score += deltaScore;

                            if (B <= C) {
                                for (int l = B, r = C; l < r; l++, r--) {
                                    int swap = nodeToCity[l];
                                    nodeToCity[l] = nodeToCity[r];
                                    nodeToCity[r] = swap;
                                }
                            } else {
                                for (int l = C + 1, r = B - 1; l < r; l++, r--) {
                                    int swap = nodeToCity[r];
                                    nodeToCity[r] = nodeToCity[l];
                                    nodeToCity[l] = swap;
                                }
                            }

                            if (score < bestScore) {
                                bestScore = score;
                                System.arraycopy(nodeToCity, 0, bestNodeToCity, 0, nodeToCity.length);
                            }

                            break;
                        }

                    }

                    if (update) {
                        i = -1;
                    } else {
                        isTarget[nodeToCity[node]] = false;
                    }
                }

                double maxUtil = -1e9;
                int size = 0;
                for (int node = 0; node < nodeToCity.length; node++) {
                    double util = times[nodeToCity[node]][nodeToCity[(node + 1) % nodeToCity.length]] / (penalty[nodeToCity[node]][nodeToCity[(node + 1) % nodeToCity.length]] + 1.0);
                    if (util > maxUtil) {
                        maxUtil = util;
                        size = 0;
                        maxUtilNodes[size++] = node;
                    } else if (Math.abs(util - maxUtil) < 1e-5) {
                        maxUtilNodes[size++] = node;
                    }
                }
                for (int i = 0; i < size; i++) {
                    int node = maxUtilNodes[i];
                    int city1 = nodeToCity[node];
                    int city2 = nodeToCity[(node + 1) % nodeToCity.length];
                    penalty[city1][city2]++;
                    penalty[city2][city1]++;
                    isTarget[city1] = true;
                    isTarget[city2] = true;
                }

            }
            score = bestScore;
            System.arraycopy(bestNodeToCity, 0, nodeToCity, 0, nodeToCity.length);
        }

        private double calculateScore() {
            double score = 0.0;
            for (int i = 0; i < nodeToCity.length; i++) {
                score += times[nodeToCity[i]][nodeToCity[(i + 1) % nodeToCity.length]];
            }
            return score;
        }

    }
}

class SAState {

    public static final boolean useTime = true;

    public double startTime = 0;
    public double endTime = 1 * 2.85;
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
    ArrayList<Item> items;
    short orderIndex;
    short time;

    public Node2(Node2 parent, int v, long score, ArrayList<Item> items, int orderIndex, int time) {
        super();
        this.parent = parent;
        this.v = (short) v;
        this.score = score;
        this.items = items;
        this.orderIndex = (short) orderIndex;
        this.time = (short) time;
    }
}

class Item {
    short toV;
    short startTime;

    public Item(int toV, int startTime) {
        super();
        this.toV = (short) toV;
        this.startTime = (short) startTime;
    }
}

class Order {
    short time;
    short id;
    short toV;

    public Order(int time, int id, int toV) {
        super();
        this.time = (short) time;
        this.id = (short) id;
        this.toV = (short) toV;
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
