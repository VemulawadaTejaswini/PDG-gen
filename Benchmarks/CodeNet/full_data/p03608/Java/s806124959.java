import java.io.*;
import java.util.*;

public class Main {
    static final boolean ONLINE_JUDGE = System.getProperty("ONLINE_JUDGE") != null;
    static final int[][] STEPS = {{1, 2}, {1, -2}, {-1, 2}, {-1, -2}, {2, 1}, {2, -1}, {-2, 1}, {-2, -1}};
    List<Edge> g[];

    class Edge implements Comparable<Edge> {
        int to;
        int val;
        int me;

        Edge(int val, int to, int me) {
            this.to = to;
            this.me = me;
            this.val = val;
        }

        @Override
        public int compareTo(Edge o) {
            return this.val - o.val;
        }
    }

    class Class implements Comparable<Class> {
        int val;
        int ind;

        Class(int ind, int val) {
            this.ind = ind;
            this.val = val;
        }

        @Override
        public int compareTo(Class o) {
            return this.val - o.val;
        }
    }

    void solve() throws IOException {
        int n = readInt();
        int m = readInt();
        int r = readInt();
        g = new List[n];
        for (int i = 0; i < n; i++) {
            g[i] = new ArrayList<Edge>();
        }
        int[] arr = new int[r];
        for (int i = 0; i < r; i++) arr[i] = readInt() - 1;
        int f, t, val;
        for (int i = 0; i < m; i++) {
            f = readInt() - 1;
            t = readInt() - 1;
            val = readInt();
            g[f].add(new Edge(val, t, f));
            g[t].add(new Edge(val, f, t));
        }
        int matrix[][] = new int[n][250];
        for (int i : arr) {
            matrix[i] = bfs(i);
        }
        int answer = Integer.MAX_VALUE;
        int preAns = 0;
        int itr = 1000;
        HashSet<Integer> set = new HashSet<Integer>();
        int myPos = 0;
        int min = 0;
        HashSet<Integer> cset = new HashSet<Integer> ();
        while (itr-- > 0) {
            set.clear();
            preAns = 0;
            while (set.size() < r) {
                min = Integer.MAX_VALUE;
                myPos = (int) (1000000 * Math.random()) % r;
                while (set.contains(myPos)) myPos = (int) (1000000 * Math.random()) % r;
                for (int i : set) {
                    min = minInt(matrix[arr[i]][arr[myPos]], min);
                }

               if(min<Integer.MAX_VALUE) preAns += min;
                set.add(myPos);
            }
            answer = minInt(answer, preAns);
        }
        out.println(answer);
    }

    int[] bfs(int from) {
        PriorityQueue<Class> q = new PriorityQueue<Class>();
        q.add(new Class(from, 0));
        int[] depth = new int[250];
        Arrays.fill(depth, Integer.MAX_VALUE);
        depth[from]=0;
        while (q.size() > 0) {
            Class next = q.poll();
            for (Edge i : g[next.ind]) {
                if (depth[i.to] > depth[next.ind] + i.val) {
                    depth[i.to] = depth[next.ind] + i.val;
                    q.add(new Class(i.to, depth[i.to]));
                }
            }
        }
        return depth;
    }

    void init() throws FileNotFoundException {
     //   if (ONLINE_JUDGE) {
            in = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
//        } else {
//            in = new BufferedReader(new FileReader("input.txt"));
//            out = new PrintWriter("output.txt");
//        }
        tok = new
                StringTokenizer("");
    }

    int minInt(int... values) {
        int min = Integer.MAX_VALUE;
        for (int value : values) {
            min = Math.min(min, value);
        }
        return min;
    }

    int maxInt(int... values) {
        int max = Integer.MIN_VALUE;
        for (int value : values) {
            max = Math.max(max, value);
        }
        return max;
    }

    long minLong(long... values) {
        long min = Long.MAX_VALUE;
        for (long value : values) {
            min = Math.min(min, value);
        }
        return min;
    }

    long maxLong(long... values) {
        long max = Long.MIN_VALUE;
        for (long value : values) {
            max = Math.max(max, value);
        }
        return max;
    }

    boolean checkIndex(int index, int size) {
        return (0 <= index && index < size);
    }

    int abs(int a) {
        return Math.abs(a);
    }

    int gcd(int a, int b) {
        if (a * b == 0) return maxInt(a, b);
        return gcd(minInt(a, b), maxInt(a, b) % minInt(a, b));
    }

    public static void main(String[] args) {
        new Main().run();
    }

    BufferedReader in;
    PrintWriter out;
    StringTokenizer tok;


    void run() {
        try {
            long timeStart = System.currentTimeMillis();

            init();
            solve();

            out.close();

            long timeEnd = System.currentTimeMillis();
            System.err.println("time = " + (timeEnd - timeStart) + " compiled");
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }


    }

    String readLine() throws IOException {
        return in.readLine();
    }

    String delimiter = " ";

    String readString() throws IOException {
        while (!tok.hasMoreTokens()) {
            String nextLine = readLine();
            if (null == nextLine)
                return null;

            tok = new StringTokenizer(nextLine);
        }

        return tok.nextToken(delimiter);
    }

    int[] readIntArray(int b) {
        int a[] = new int[b];
        for (int i = 0; i < b; i++) {
            try {
                a[i] = readInt();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return a;
    }

    long[] readLongArray(int b) {
        long a[] = new long[b];
        for (int i = 0; i < b; i++) {
            try {
                a[i] = readLong();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return a;
    }

    int readInt() throws IOException {
        return Integer.parseInt(readString());
    }

    long readLong() throws IOException {
        return Long.parseLong(readString());
    }


    void sortArrayInt(int[] a) {
        Integer arr[] = new Integer[a.length];
        for (int i = 0; i < a.length; i++) {
            arr[i] = a[i];
        }
        Arrays.sort(arr);
        for (int i = 0; i < a.length; i++) {
            a[i] = arr[i];
        }
    }

    void sortArrayLong(long[] a) {
        Long arr[] = new Long[a.length];
        for (int i = 0; i < a.length; i++) {
            arr[i] = a[i];
        }
        Arrays.sort(arr);
        for (int i = 0; i < a.length; i++) {
            a[i] = arr[i];
        }
    }


}