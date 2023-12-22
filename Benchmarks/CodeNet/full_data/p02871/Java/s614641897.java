import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Objects;
import java.util.Queue;
import java.util.List;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;




class Main {
    InputStream is;

    int __t__ = 1;
    int __f__ = 0;
    int __FILE_DEBUG_FLAG__ = __f__;
    String __DEBUG_FILE_NAME__ = "testcase/1-1-1.txt";

    FastScanner in;
    PrintWriter out;

    public void solve() {
        final InputUtils.ProblemAInput input = InputUtils.parseProblemA(in);
        final Solver solver = new NaiveSolver();
        final Commands commands = solver.solve(input.graph, input.orders);
        System.out.println(commands.toAnswer());
    }

    public void run() {
        if (__FILE_DEBUG_FLAG__ == __t__) {
            try {
                is = new FileInputStream(__DEBUG_FILE_NAME__);
            } catch (FileNotFoundException e) {
                // TODO 自動生成された catch ブロック
                e.printStackTrace();
            }
            System.err.println("FILE_INPUT!");
        } else {
            is = System.in;
        }
        in = new FastScanner(is);
        out = new PrintWriter(System.out);

        solve();
    }

    public static void main(final String[] args) {
        new Main().run();
    }
}



class MyArrayUtils {
    private MyArrayUtils() {}
    public static boolean contains(int[] a, int v) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == v) {
                return true;
            }
        }
        return false;
    }

    public static boolean match(int[] a, int[] b) {
        final Set<Integer> s1 = Arrays.stream(a).boxed().collect(Collectors.toSet());
        final Set<Integer> s2 = Arrays.stream(b).boxed().collect(Collectors.toSet());
        return s1.equals(s2);
    }

    public static <E> boolean match(E[] a, E[] b) {
        final Set<E> s1 = Arrays.stream(a).collect(Collectors.toSet());
        final Set<E> s2 = Arrays.stream(b).collect(Collectors.toSet());
        return s1.equals(s2);
    }
}



class TimeKeeper {
    public static final int SECTYPE_SEC = 0;
    public static final int SECTYPE_MSEC = 1;

    private final int MAX_LOOP_SIZE = 100;

    private long startTime;
    ArrayList<Long> pushedTime = new ArrayList<Long>();
    private long[] totalLoopTime = new long[MAX_LOOP_SIZE];
    private long[] prevPushedTime = new long[MAX_LOOP_SIZE];

    public TimeKeeper() {
        reset();
    }

    public void reset() {
        startTime = System.currentTimeMillis();
        Arrays.fill(totalLoopTime, 0);
        Arrays.fill(prevPushedTime, 0);
        pushedTime.clear();
        push();
    }

    public void push() {
        pushedTime.add(System.currentTimeMillis());
    }

    public void loopPush(int id) {
        assert prevPushedTime[id] == 0;
        prevPushedTime[id] = System.currentTimeMillis();
    }

    public void loopPop(int id) {
        assert prevPushedTime[id] != 0;
        long current = System.currentTimeMillis();
        totalLoopTime[id] += current - prevPushedTime[id];
        prevPushedTime[id] = 0;
    }
    @Override
    public String toString() {
        String res = "";
        {
            res += "---------- Nomal pushed time -----------------\n";
            double totalTime = 0;
            for (int i = 0; i < pushedTime.size() - 1; i++) {
                double time = (pushedTime.get(i + 1) - pushedTime.get(i)) / 1000.0;
                totalTime += time;
                res += i + " : " + time + "s\n";
            }
            res += "Total Time = " + totalTime + "s\n";
        }

        {
            res += "----------- Loop pushed time -----------------\n";
            double totalTime = 0;
            for (int i = 0; i < MAX_LOOP_SIZE; i++) {
                if (totalLoopTime[i] != 0) {
                    res += "Loop " + i + " : " + (totalLoopTime[i]/1000.0) + "s\n";
                    totalTime += totalLoopTime[i]/1000.0;
                }
            }
            res += "Total Loop Time = " + totalTime + "s\n";
        }
        return res;
    }

    public long getPassedTime() {
        return System.currentTimeMillis() - startTime;
    }

    public String getPassedTimeSecond(int type) {
        switch (type) {
            case SECTYPE_SEC :
                return (getPassedTime() / 1000.0) + "s";
            case SECTYPE_MSEC :
                return getPassedTime() + "ms";
        }

        throw new RuntimeException();
    }
}



class InputUtils {
    public static ProblemAInput parseProblemA(final FastScanner in) {
        final int V = in.nextInt();
        final int E = in.nextInt();

        int[] u = new int[E];
        int[] v = new int[E];
        int[] d = new int[E];
        for (int i = 0; i < E; i++) {
            u[i] = in.nextInt() - 1;
            v[i] = in.nextInt() - 1;
            d[i] = in.nextInt();
        }

        final Graph graph = Graph.createFrom(V, E, u, v, d);
        final int tmax = in.nextInt();
        final Order[] orders = new Order[tmax];
        for (int i = 0; i < tmax; i++) {
            final int cnt = in.nextInt();
            if (cnt == 1) {
                final int id = in.nextInt();
                final int dst = in.nextInt() - 1;
                orders[i] = new Order(id, dst);
            }
        }
        return new ProblemAInput(graph, orders);
    }

    static class ProblemAInput {
        public final Graph graph;
        public final Order[] orders;

        public ProblemAInput(Graph graph, Order[] orders) {
            this.graph = graph;
            this.orders = orders;
        }
    }
}





class FastScanner {
    private InputStream stream;
    private byte[] buf = new byte[1024];
    private int curChar;
    private int numChars;

    public FastScanner(InputStream stream) {
        this.stream = stream;
        // stream = new FileInputStream(new File("dec.in"));
    }

    int read() {
        if (numChars == -1)
            throw new InputMismatchException();
        if (curChar >= numChars) {
            curChar = 0;
            try {
                numChars = stream.read(buf);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            if (numChars <= 0)
                return -1;
        }
        return buf[curChar++];
    }

    boolean isSpaceChar(int c) {
        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }

    boolean isEndline(int c) {
        return c == '\n' || c == '\r' || c == -1;
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    int[] nextIntArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = nextInt();

        return array;
    }

    int[][] nextIntMap(int n, int m) {
        int[][] map = new int[n][m];
        for (int i = 0; i < n; i++) {
            map[i] = nextIntArray(m);
        }
        return map;
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    long[] nextLongArray(int n) {
        long[] array = new long[n];
        for (int i = 0; i < n; i++)
            array[i] = nextLong();

        return array;
    }

    long[][] nextLongMap(int n, int m) {
        long[][] map = new long[n][m];
        for (int i = 0; i < n; i++) {
            map[i] = nextLongArray(m);
        }
        return map;
    }

    double nextDouble() {
        return Double.parseDouble(next());
    }

    double[] nextDoubleArray(int n) {
        double[] array = new double[n];
        for (int i = 0; i < n; i++)
            array[i] = nextDouble();

        return array;
    }

    double[][] nextDoubleMap(int n, int m) {
        double[][] map = new double[n][m];
        for (int i = 0; i < n; i++) {
            map[i] = nextDoubleArray(m);
        }
        return map;
    }

    String next() {
        int c = read();
        while (isSpaceChar(c))
            c = read();
        StringBuilder res = new StringBuilder();
        do {
            res.appendCodePoint(c);
            c = read();
        } while (!isSpaceChar(c));
        return res.toString();
    }

    String[] nextStringArray(int n) {
        String[] array = new String[n];
        for (int i = 0; i < n; i++)
            array[i] = next();

        return array;
    }

    String nextLine() {
        int c = read();
        while (isEndline(c))
            c = read();
        StringBuilder res = new StringBuilder();
        do {
            res.appendCodePoint(c);
            c = read();
        } while (!isEndline(c));
        return res.toString();
    }
}



class RandomUtils {
    private static final Random random = new Random();

    public static Pair<Integer, Integer> getDistinctInts(final int minimumValue, final int maximumValue) {
        final int MAX_TRIAL_NUM = 1000;
        for (int i = 0; i < MAX_TRIAL_NUM; i++) {
            final int u = minimumValue + random.nextInt(maximumValue - minimumValue);
            final int v = minimumValue + random.nextInt(maximumValue - minimumValue);
            if (u != v) {
                return new Pair<>(Math.min(u, v), Math.max(u, v));
            }
        }
        throw new RuntimeException("Failed to generate distinct random pair after " + MAX_TRIAL_NUM);
    }
}



interface Solver {
    Commands solve(Graph graph, Order[] orders);
}




class NaiveSolver implements Solver {
    @Override
    public Commands solve(Graph graph, Order[] orders) {
        final int tmax = orders.length;
        final Queue<Integer> nodeQueue = new ArrayDeque<>();
        final Commands result = new Commands(new ArrayList<>());
        final Set<Integer> hash = new HashSet<>();
        for (int t = 0; t < tmax; t++) {
            if (result.size() == t && (nodeQueue.size() >= 15 || t >= tmax * 0.95)) {
                int[] nodes = new int[nodeQueue.size()+1];
                nodes[0] = 0;
                for (int i = 1; !nodeQueue.isEmpty(); i++) {
                    nodes[i] = nodeQueue.poll();
                    hash.remove(nodes[i]);
                }
                final TspSolver tspSolver = nodes.length >= 16 ? new SaTspSolver(4, 0.001, 10000, 1200) : new DpTspSolver();
                Commands commands = tspSolver.solve(graph, 0, nodes);
                result.addAll(commands);
            }

            if (orders[t] != null && !hash.contains(orders[t].dst)) {
                nodeQueue.add(orders[t].dst);
                hash.add(orders[t].dst);
            }
            if (result.size() <= t) {
                result.add(new Command(-1));
            }
        }
        System.err.println(nodeQueue.size() + " / " + Arrays.stream(orders).filter(Objects::nonNull).count() + " (" + result.size() + ")");
        return result.subCommands(0, Math.min(tmax, result.size()));
    }
}





class XorShift {
    private static final double toDouble = 1.0 / 2147483648.0;
    private int w = 88675123;
    private int x = 123456789;
    private int y = 362436069;
    private int z = 521288629;
    private int count = 0;

    public XorShift() {
        x = (int) System.nanoTime();
    }

    public XorShift(long l) {
        x = (int) l;
    }

    public int getCount() {
        return count;
    }

    public double nextDouble() {
        return (nextInt() & Integer.MAX_VALUE) * toDouble;
    }

    public int nextInt() {
        count++;
        final int t = x ^ (x << 11);
        x = y;
        y = z;
        z = w;
        w = w ^ (w >>> 19) ^ (t ^ (t >>> 8));
        return w;
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

class SaTspSolver implements TspSolver {
    private static final XorShift rnd = new XorShift(123321);

    private final double startTemperature;
    private final double endTemperature;
    private final int maxTemperature;
    private final long timeLimitMs;

    public SaTspSolver(double startTemperature, double endTemperature, int maxTemperature, long timeLimitMs) {
        this.startTemperature = startTemperature;
        this.endTemperature = endTemperature;
        this.maxTemperature = maxTemperature;
        this.timeLimitMs = timeLimitMs;
    }

    @Override
    public Commands solve(Graph graph, int start, int[] nodes) {
        final TimeKeeper timeKeeper = new TimeKeeper();
        timeKeeper.reset();

        Path bestPath = Path.create(nodes, graph::getDist);
        long bestCost = graph.calcCost(bestPath);

        Path currentPath = bestPath.copy();
        long currentCost = graph.calcCost(currentPath);

        long currentTime = 0;
        int cnt = 0;
        while (true) {
            if (cnt++ % 1000 == 0) {
                currentTime = timeKeeper.getPassedTime();
                if (currentTime >= timeLimitMs) {
                    System.err.println("Trial times: " + cnt);
                    break;
                }
            }

            double temp = startTemperature + ((endTemperature - startTemperature) * currentTime) / timeLimitMs;
            double limit = (double)(rnd.nextInt(maxTemperature) + 1) / maxTemperature;

            final Pair<Integer, Integer> rndPair = RandomUtils.getDistinctInts(1, bestPath.size() - 1);
            currentPath.swap(rndPair);
            final long nextCost = currentPath.getCost();
            final long scoreDiff = currentCost - nextCost;
            double probability = Math.exp(scoreDiff / temp);
            boolean forceNext = probability > limit;

            if (bestCost > nextCost) {
                // System.err.println("Best update " + bestCost + "->" + nextCost + ", " + temp);
                currentCost = nextCost;
                bestCost = nextCost;
                bestPath = currentPath.copy();
            } else if (currentCost > nextCost) {
                currentCost = nextCost;
            } else if (forceNext) {
                currentCost = nextCost;
            } else {
                currentPath.swap(rndPair);
            }
        }
        return graph.pathToCommands(bestPath);
    }
}




class DpTspSolver implements TspSolver {
    private static final int INF = 1000000;
    private static final int NODE_MAX = 18;

    static final int[][] dist = new int[NODE_MAX][1<<NODE_MAX];
    static final int[][] prev = new int[NODE_MAX][1<<NODE_MAX];

    @Override
    public Commands solve(Graph graph, int start, int[] nodes) {
        if (nodes.length > NODE_MAX) {
            throw new RuntimeException("Exceeds the max size:" + Arrays.toString(nodes));
        }
        if (nodes[0] != 0) {
            throw new RuntimeException("nodes[0] must be 0");
        }

        int n = nodes.length;
        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], 0, 1 << n, INF);
        }
        dist[0][0] = 0;
        prev[0][0] = -1;
        for (int i = 0; i < (1 << n); i++) {
            for (int from = 0; from < n; from++) {
                if ((i & (1 << from)) == 0 && !(i == 0 && from == 0)) {
                    continue;
                }
                for (int to = 0; to < n; to++) {
                    if ((i & (1 << to)) != 0) {
                        continue;
                    }
                    int ni = i | (1 << to);
                    if (to == 0 && ni != (1 << n) - 1) {
                        continue;
                    }

                    int ndist = dist[from][i] + graph.getDist(nodes[from], nodes[to]);
                    if (dist[to][ni] > ndist) {
                        dist[to][ni] = ndist;
                        prev[to][ni] = from;
                    }
                }
            }
        }

        int cur = 0, bits = (1 << n) - 1;
        final Command[] commands = new Command[dist[cur][bits]];
        int ptr = commands.length - 1;
        while (prev[cur][bits] != -1) {
            int p = prev[cur][bits];
            int[] routes = graph.findRoute(nodes[p], nodes[cur]);
            for (int i = routes.length - 1; i >= 0; i--) {
                commands[ptr--] = new Command(routes[i]);
            }
            bits ^= (1 << cur);
            cur = p;
        }
        return new Commands(Arrays.asList(commands));
    }
}




interface TspSolver {
    Commands solve(Graph graph, int start, int[] nodes);

    default Commands solve(Graph graph, int start, List<Integer> nodeList) {
        int[] nodes = new int[nodeList.size()];
        for (int i = 0; i < nodeList.size(); i++) {
            nodes[i] = nodeList.get(i);
        }
        return solve(graph, start, nodes);
    }
}


class Order {
    public final int id;
    public final int dst;

    public Order(int id, int dst) {
        this.id = id;
        this.dst = dst;
    }
}


class Pair<A, B> {
    public final A a;
    public final B b;

    public Pair(A a, B b) {
        this.a = a;
        this.b = b;
    }
}




class Graph {
    private final int E;
    private final Edge[][] es;
    private final int[][] dist;
    private final int[][] next;

    public Graph(int E, Edge[][] es, int[][] dist, int[][] next) {
        this.E = E;
        this.es = es;
        this.dist = dist;
        this.next = next;
    }

    public static Graph createFrom(final int V, final int E, final int[] u, final int[] v, final int[] d) {
        final Edge[][] es = new Edge[V][];
        int[] size = new int[V];
        for (int i = 0; i < E; i++) {
            size[u[i]]++;
            size[v[i]]++;
        }
        for (int i = 0; i < V; i++) {
            es[i] = new Edge[size[i]];
        }

        int[] ptr = new int[V];
        for (int i = 0; i < E; i++) {
            es[u[i]][ptr[u[i]]++] = new Edge(u[i], v[i], d[i]);
            es[v[i]][ptr[v[i]]++] = new Edge(v[i], u[i], d[i]);
        }

        return createFrom(es);
    }

    private static Graph createFrom(List<Edge>[] el) {
        final int V = el.length;
        Edge[][] es = new Edge[V][];
        for (int i = 0; i < V; i++) {
            es[i] = el[i].toArray(new Edge[0]);
        }
        return createFrom(es);
    }

    private static Graph createFrom(Edge[][] es) {
        final int V = es.length;
        final int E = Arrays.stream(es).map(e -> e.length).reduce(0, Integer::sum) / 2;

        int[][] dist = new int[V][V];
        int[][] next = new int[V][V];
        for (int i = 0; i < V; i++) {
            Arrays.fill(dist[i], 1000000);
            dist[i][i] = 0;
            next[i][i] = i;
        }
        for (int i = 0; i < V; i++) {
            for (Edge e : es[i]) {
                if (e.from < e.to) {
                    continue;
                }
                final int u = e.from;
                final int v = e.to;
                dist[u][v] = dist[v][u] = e.distance;
                next[u][v] = v;
                next[v][u] = u;
            }
        }

        for (int k = 0; k < V; k++) {
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    if (dist[i][j] > dist[i][k] + dist[k][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                        next[i][j] = next[i][k];
                    }
                }
            }
        }

        return new Graph(E, es, dist, next);
    }


    public Edge[] edges(final int u) {
        return es[u];
    }

    public int getDist(final int start, final int end) {
        return dist[start][end];
    }

    public int getNext(final int start, final int end) {
        return next[start][end];
    }

    public int size() {
        return es.length;
    }

    public int edgeSize() {
        return E;
    }

    public Edge getEdge(final int u, final int v) {
        for (Edge e : edges(u)) {
            if (e.to == v) {
                return e;
            }
        }
        throw new RuntimeException("Edge not found: " + u + " " + v);
    }

    public boolean hasEdge(final int u, final int v) {
        for (Edge e : edges(u)) {
            if (e.to == v) {
                return true;
            }
        }
        return false;
    }

    public int[] findRoute(final int start, final int end) {
        int[] res = new int[dist[start][end]];
        int ptr = 0;

        int u = start;
        while (u != end) {
            int v = next[u][end];
            for (int d = 0; d < getEdge(u, v).distance; d++) {
                res[ptr++] = v;
            }
            u = v;
        }
        return res;
    }

    public Graph mst() {
        List<Edge>[] newEdges = new ArrayList[es.length];
        for (int i = 0; i < es.length; i++) {
            newEdges[i] = new ArrayList<>();
        }
        final PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingInt(e -> e.distance));
        pq.addAll(Arrays.asList(es[0]));

        boolean[] vis = new boolean[es.length];
        vis[0] = true;
        while (!pq.isEmpty()) {
            final Edge e = pq.poll();
            if (vis[e.from] && vis[e.to]) {
                continue;
            }
            if (!vis[e.from] && !vis[e.to]) {
                throw new RuntimeException();
            }
            int v = vis[e.from] ? e.to : e.from;
            vis[e.from] = vis[e.to] = true;
            newEdges[e.from].add(e);
            newEdges[e.to].add(new Edge(e.to, e.from, e.distance));
            for (Edge ne : es[v]) {
                if (vis[ne.to]) {
                    continue;
                }
                pq.add(ne);
            }
        }
        return Graph.createFrom(newEdges);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Graph graph = (Graph) o;
        for (int i = 0; i < es.length; i++) {
            if (!MyArrayUtils.match(es[i], graph.es[i])
                    || !MyArrayUtils.match(dist[i], graph.dist[i])
                    || !MyArrayUtils.match(next[i], graph.next[i])) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(es);
        result = 31 * result + Arrays.hashCode(dist);
        result = 31 * result + Arrays.hashCode(next);
        return result;
    }

    @Override
    public String toString() {
        return "Graph{" +
                "es=" + Arrays.stream(es).map(Arrays::toString).collect(Collectors.joining("\n")) +
                ", dist=" + Arrays.toString(dist) +
                ", next=" + Arrays.toString(next) +
                '}';
    }

    public int[] treeGrouping(final int start) {
        if (size() != edgeSize() + 1) {
            throw new RuntimeException("This is only expected to run in tree");
        }
        int[] res = new int[es.length];

        for (int groupId = 0; groupId < es[start].length; groupId++) {
            Edge e = es[start][groupId];
            List<Integer> nodes = dfs(e.to, start);
            for (int u : nodes) {
                res[u] = groupId;
            }
        }
        return res;
    }

    private List<Integer> dfs(int u, int prev) {
        List<Integer> res = new ArrayList<>();
        res.add(u);
        for (Edge e : es[u]) {
            if (e.to == prev) {
                continue;
            }
            res.addAll(dfs(e.to, u));
        }
        return res;
    }

    public long calcCost(final Path bestPath) {
        long cost = 0;
        for (int i = 0; i < bestPath.size() - 1; i++) {
            cost += dist[bestPath.at(i)][bestPath.at(i+1)];
        }
        return cost;
    }

    public Commands pathToCommands(Path bestPath) {
        final List<Command> commands = new ArrayList<>();
        for (int i = 0; i < bestPath.size() - 1; i++) {
            for (int next : findRoute(bestPath.at(i), bestPath.at(i + 1))) {
                commands.add(new Command(next));
            }
        }
        return new Commands(commands);
    }
}



class Command {
    final int value;

    public Command(int value) {
        this.value = value;
    }

    public boolean isMove() {
        return value != -1;
    }

    public boolean isStay() {
        return value == -1;
    }

    public String getValue() {
        return String.valueOf(isStay() ? value : value + 1);
    }

    public String toString() {
        return String.valueOf(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Command command = (Command) o;
        return value == command.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}



class Commands implements Iterable<Command> {
    final List<Command> commands;

    public Commands(List<Command> commands) {
        this.commands = commands;
    }

    public void add(Command command) {
        commands.add(command);
    }

    public void addAll(List<Command> appendedCommands) {
        commands.addAll(appendedCommands);
    }

    public void addAll(Commands appendedCommands) {
        commands.addAll(appendedCommands.commands);
    }

    public int size() {
        return commands.size();
    }

    public String toAnswer() {
        return commands.stream()
                .map(Command::getValue)
                .collect(Collectors.joining("\n"));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Commands commands1 = (Commands) o;
        return Objects.equals(commands, commands1.commands);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commands);
    }

    @Override
    public String toString() {
        return "Commands{" +
                "commands=" + commands +
                '}';
    }

    @Override
    public Iterator<Command> iterator() {
        return commands.iterator();
    }

    @Override
    public void forEach(Consumer<? super Command> action) {
        commands.forEach(action);
    }

    @Override
    public Spliterator<Command> spliterator() {
        return commands.spliterator();
    }

    public Commands subCommands(int fromIndex, int toIndex) {
        return new Commands(commands.subList(fromIndex, toIndex));
    }
}



class Edge {
    final int from;
    final int to;
    final int distance;

    public Edge(int from, int to, int distance) {
        this.from = from;
        this.to = to;
        this.distance = distance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edge edge = (Edge) o;
        return from == edge.from &&
                to == edge.to &&
                distance == edge.distance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to, distance);
    }

    @Override
    public String toString() {
        return "(" + from + "," + to + "-" + distance + ")";
    }
}




class Path {
    final int[] path;
    final GetDist getDist;

    int cost;

    public Path(int[] path, GetDist getDist, int initialCost) {
        this.path = path;
        this.getDist = getDist;
        this.cost = initialCost;
    }

    public int size() {
        return path.length;
    }

    public int at(int p) {
        return path[p];
    }

    public int getCost() {
        return cost;
    }

    public static Path create(final int[] nodes, GetDist getDist) {
        final int length = nodes.length;
        int[] path = new int[length + 1];
        System.arraycopy(nodes, 0, path, 0, length);
        path[length] = nodes[0];

        int initialCost = 0;
        for (int i = 0; i < path.length - 1; i++) {
            initialCost += getDist.calc(path[i], path[i+1]);
        }
        return new Path(path, getDist, initialCost);
    }

    @Override
    public String toString() {
        return "Path{" +
                "path=" + Arrays.toString(path) +
                '}';
    }

    public void swap(Pair<Integer, Integer> p) {
        cost -= getDist.calc(path[p.a], path[p.a-1]);
        cost -= getDist.calc(path[p.b], path[p.b+1]);
        cost += getDist.calc(path[p.a], path[p.b+1]);
        cost += getDist.calc(path[p.b], path[p.a-1]);

        for (int l = p.a, r = p.b; l < r; l++, r--) {
            int tmp = path[l];
            path[l] = path[r];
            path[r] = tmp;
        }
    }

    public Path copy() {
        return new Path(Arrays.copyOf(path, path.length), getDist, cost);
    }

    interface GetDist {
        int calc(int start, int end);
    }
}


