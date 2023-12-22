import java.io.*;
import java.util.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.stream.Collectors;



class Main {
    InputStream is;

    int __t__ = 1;
    int __f__ = 0;
    int __FILE_DEBUG_FLAG__ = __f__;
    String __DEBUG_FILE_NAME__ = "testcase/1-1-1.txt";

    FastScanner in;
    PrintWriter out;

    public void solve() {
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

        final Solver solver = new NaiveSolver();
        final Commands commands = solver.solve(graph, orders);
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
            System.out.println("FILE_INPUT!");
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
                map[i] = in.nextIntArray(m);
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
                map[i] = in.nextLongArray(m);
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
                map[i] = in.nextDoubleArray(m);
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

    // N E S W
    private static String DIRS = "URDL";
    private static int[] vx = {0, 1, 0, -1};
    private static int[] vy = {-1, 0, 1, 0};

    private static final int[] SCORES = {0, 10, 3, 1};
    private static String intMapToString(int[][] a) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                res.append(String.format("%4d", a[i][j]));
            }
            res.append("\n");
        }
        return res.toString();
    }
}



interface Solver {
    Commands solve(Graph graph, Order[] orders);
}




class NaiveSolver implements Solver {
    @Override
    public Commands solve(Graph graph, Order[] orders) {
        final int tspMaxSize = 15;

        final int tmax = orders.length;
        final TspSolver tspSolver = new DpTspSolver();
        final Queue<Integer> nodeQueue = new ArrayDeque<>();
        final Commands result = new Commands(new ArrayList<>());
        final Set<Integer> hash = new HashSet<>();
        for (int t = 0; t < tmax; t++) {
            if (nodeQueue.size() >= tspMaxSize && result.size() == t) {
                int[] nodes = new int[tspMaxSize+1];
                nodes[0] = 0;
                for (int i = 1; i <= tspMaxSize; i++) {
                    nodes[i] = nodeQueue.poll();
                    hash.remove(nodes[i]);
                }
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
        return result.subCommands(0, Math.min(tmax, result.size()));
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



class Graph {
    private final Edge[][] es;
    private final int[][] dist;
    private final int[][] next;

    public Graph(Edge[][] es, int[][] dist, int[][] next) {
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
        int[][] dist = new int[V][V];
        int[][] next = new int[V][V];
        for (int i = 0; i < V; i++) {
            Arrays.fill(dist[i], 1000000);
            dist[i][i] = 0;
            next[i][i] = i;
        }
        for (int i = 0; i < E; i++) {
            es[u[i]][ptr[u[i]]++] = new Edge(u[i], v[i], d[i]);
            es[v[i]][ptr[v[i]]++] = new Edge(v[i], u[i], d[i]);

            dist[u[i]][v[i]] = dist[v[i]][u[i]] = d[i];
            next[u[i]][v[i]] = v[i];
            next[v[i]][u[i]] = u[i];
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

        return new Graph(es, dist, next);
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

    public Edge getEdge(final int u, final int v) {
        for (Edge e : edges(u)) {
            if (e.to == v) {
                return e;
            }
        }
        throw new RuntimeException("Edge not found: " + u + " " + v);
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
}

