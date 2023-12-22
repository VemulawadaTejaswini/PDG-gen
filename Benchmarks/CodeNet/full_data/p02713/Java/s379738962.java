import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    private static FastScanner scanner = new FastScanner(System.in);

    public static void main(String[] args) {
        int k = scanner.nextInt();

        int result = 0;
        for (int a = 1; a <= k; a++) {
            for (int b = 1; b <= k; b++) {
                for (int c = 1; c <= k; c++) {
                    int tmp = gcd(a, b);
                    result += gcd(tmp, c);
                }
            }
        }
        System.out.println(result);
    }

//    private static class Gcd3 {
//
//        Map<Integer, Integer> amap = new HashMap<>();
//        Map<Integer, Integer> bmap = new HashMap<>();
//        Map<Integer, Integer> cmap = new HashMap<>();
//        int aa;
//        int bb;
//        int cc;
//
//        public Gcd3(int a, int b, int c) {
//            yakubuna(a);
//            yakubunb(b);
//            yakubunc(c);
//            aa = a;
//            bb = b;
//            cc = c;
//        }
//
//        private void yakubuna(int a) {
//            int a1 = 0;
//            int a2 = 0;
//            boolean isYakubun = false;
//            for (int i = a - 1; i > 1; i--) {
//                if (a % i == 0) {
//                    a1 = i;
//                    a2 = a / i;
//                    isYakubun = true;
//                    break;
//                }
//            }
//            if (isYakubun) {
//                yakubuna(a1);
//                yakubuna(a2);
//            } else {
//                if (amap.containsKey(a)) {
//                    amap.put(a, amap.get(a) + 1);
//                } else {
//                    amap.put(a, 1);
//                }
//            }
//        }
//        private void yakubunb(int b) {
//            int b1 = 0;
//            int b2 = 0;
//            boolean isYakubun = false;
//            for (int i = b - 1; i > 1; i--) {
//                if (b % i == 0) {
//                    b1 = i;
//                    b2 = b / i;
//                    isYakubun = true;
//                    break;
//                }
//            }
//            if (isYakubun) {
//                yakubunb(b1);
//                yakubunb(b2);
//            } else {
//                if (bmap.containsKey(b)) {
//                    bmap.put(b, bmap.get(b) + 1);
//                } else {
//                    bmap.put(b, 1);
//                }
//            }
//        }
//        private void yakubunc(int c) {
//            int c1 = 0;
//            int c2 = 0;
//            boolean isYakubun = false;
//            for (int i = c - 1; i > 1; i--) {
//                if (c % i == 0) {
//                    c1 = i;
//                    c2 = c / i;
//                    isYakubun = true;
//                    break;
//                }
//            }
//            if (isYakubun) {
//                yakubunc(c1);
//                yakubunc(c2);
//            } else {
//                if (cmap.containsKey(c)) {
//                    cmap.put(c, cmap.get(c) + 1);
//                } else {
//                    cmap.put(c, 1);
//                }
//            }
//        }
//
//        public int gcd() {
//            int result = 1;
//
//            for (Integer i : amap.keySet()) {
//                if (bmap.containsKey(i) && cmap.containsKey(i)) {
//                    result = result * i * Math.min(Math.min(amap.get(i), bmap.get(i)), cmap.get(i));
//                }
//            }
////            System.out.println("("+ aa + "," + bb + "," + cc + ") => " + result);
//            return result;
//        }
//    }

    private static int gcd(int s, int t) {

        int high = 0;
        int low = 0;
        if (s > t) {
            high = s;
            low = t;
        } else {
            high = t;
            low = s;
        }

        int r = high % low;
        if (r == 0) return low;
        return gcd(low, r);
    }

    private static class Graph {
        private Vertex[] vertexes;
        private int size;
        private boolean[] seen;

        public Graph(int n) {
            this.size = n;
            this.vertexes = new Vertex[n];
            for (int i = 0; i < n; i++) {
                this.vertexes[i] = new Vertex();
            }
        }

        public Graph(int[] vertexes) {
            this.size = vertexes.length;
            this. vertexes = new Vertex[vertexes.length];
            for (int i = 0; i < vertexes.length; i++) {
                this.vertexes[i] = new Vertex(vertexes[i]);
            }
        }

        public void addEdge(int from, int to) {
            this.addEdge(from, to, 0);
        }

        public void addEdge(int from, int to, int weight) {
            this.vertexes[from].addEdge(to, weight);
        }

        public void initDfs() {
            this.seen = new boolean[this.size];
        }

        // 深さ優先探索を実施し、到達可能な頂点をすべて辿り閉路かどうかをチェックする
        public boolean dfs(int now, int from) {
            this.seen[now] = true;
            boolean isCycle = false;
            for (Edge e : this.vertexes[now].getEdges()) {
                if (e.getTo() == from) {
                    continue;
                }
                if (seen[e.getTo()]) {
                    isCycle = true;
                } else {
                    isCycle = isCycle || dfs(e.getTo(), now);
                }
            }
            return isCycle;
        }

        public boolean seen(int now) {
            return this.seen[now];
        }

    }

    private static class Vertex {
        private int value;
        private List<Edge> edges = new ArrayList<>();

        public Vertex() {};
        public Vertex(int value) {
            this.value = value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public void addEdge(int to, int weight) {
            edges.add(new Edge(to, weight));
        }

        public List<Edge> getEdges() {
            return this.edges;
        }
    }

    private static class Edge {
        private int to;
        private int weight;

        public Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }

        public int getTo() {
            return this.to;
        }

        public int getWeight() {
            return this.weight;
        }
    }

    private static class FastScanner {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

        public FastScanner(InputStream in) {
            this.reader = new BufferedReader(new InputStreamReader(in));
        }

        public int[] nextLineToIntArray() {
            String[] stringArray = nextLineToStringArray();
            int[] intArray = new int[stringArray.length];
            for (int i = 0; i < stringArray.length; i++) {
                intArray[i] = Integer.parseInt(stringArray[i]);
            }
            return intArray;
        }

        public String[] nextLineToStringArray() {
            return nextLine().split("");
        }

        public String nextLine() {
            try {
                return reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }

        public String next() {
            if (this.tokenizer == null || !this.tokenizer.hasMoreElements()) {
                try {
                    this.tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                    throw new RuntimeException(e);
                }
            }
            return this.tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public String[] nextStringArray(int n) {
            String[] stringArray = new String[n];
            for (int i = 0; i < n; i++) {
                stringArray[i] = next();
            }
            return stringArray;
        }

        public int[] nextIntArray(int n) {
            int[] intArray = new int[n];
            for (int i = 0; i < n; i++) {
                intArray[i] = nextInt();
            }
            return intArray;
        }

        public long[] nextLongArray(int n) {
            long[] longArray = new long[n];
            for (int i = 0; i < n; i++) {
                longArray[i] = nextLong();
            }
            return longArray;
        }

        public double[] nextDoubleArray(int n) {
            double[] doubleArray = new double[n];
            for (int i = 0; i < n; i++) {
                doubleArray[i] = nextDouble();
            }
            return doubleArray;
        }
    }

}
