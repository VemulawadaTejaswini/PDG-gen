import javax.smartcardio.CommandAPDU;
import java.io.* ;
import java.lang.reflect.Array;
import java.util.* ;
import java.math.* ;
public class Main
{
    static BufferedReader reader;
    static StringTokenizer tokenizer;

    static void init(InputStream input)
    {
        reader = new BufferedReader(new InputStreamReader(input));
        tokenizer = new StringTokenizer("");
    }

    static String next() throws IOException
    {
        while (!tokenizer.hasMoreTokens())
        {
            tokenizer = new StringTokenizer(reader.readLine());
        }
        return tokenizer.nextToken();
    }

    static long nextInt() throws IOException
    {
        return Long.parseLong(next());
    }

    public static int ri() throws IOException
    {
        return (int) nextInt();
    }

    public static long rl() throws IOException
    {
        return nextInt();
    }

    public static double rd() throws NumberFormatException, IOException
    {
        return Double.parseDouble(next());
    }

    static void print_a(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            print(arr[i] + " ");
        }
        println();
    }

    public static int[] ria(int n) throws IOException
    {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
        {
            a[i] = ri();
        }
        return a;
    }

    public static long[] rla(int n) throws IOException
    {
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
        {
            a[i] = rl();
        }
        return a;
    }

    public static int p(int i)
    {
        return (int) Math.pow(2, i);
    }

    static PrintWriter writer;

    static void outit(OutputStream outputStream)
    {
        writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
    }

    static void print(Object... objects)
    {
        for (int i = 0; i < objects.length; i++)
        {
            if (i != 0)
                writer.print(' ');
            writer.print(objects[i]);
        }
    }

    static void println(Object... objects)
    {
        print(objects);
        writer.println();
        flush();
    }

    static void close()
    {
        writer.close();
    }

    static void flush()
    {
        writer.flush();
    }

    public static void main(String[] args) throws IOException
    {
        init(System.in);
        outit(System.out);
//        int t = (int) nextInt();
//        for (int i = 0; i < t; i++)
        output();
        flush();
        close();
    }
    static long mod = 1000000007;
    static long [] fact ;
    public static void output() throws IOException
    {
        int n = ri() ;
        int [][] x = new int[n][2] ;
        int [][] y = new int[n][2] ;
        for (int i = 0; i <n ; i++)
        {
            x[i][0] = ri() ;
            x[i][1] = i ;
            y[i][0] = ri() ;
            y[i][1] = i ;
        }
        java.util.Arrays.sort(x, new java.util.Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return (a[0] < b[0] ? -1 : (a[0] == b[0] ? 0 : 1));
            }
        });
        java.util.Arrays.sort(y, new java.util.Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return (a[0] < b[0] ? -1 : (a[0] == b[0] ? 0 : 1));
            }
        });
        List<Edge> [] edges = new List[n] ;
        for (int i = 0; i <n ; i++)
        {
            edges[i] = new ArrayList<>() ;
        }
        for (int i = 1; i <n ; i++)
        {
            edges[x[i][1]].add(new Edge(x[i-1][1],Math.abs(x[i][0]-x[i-1][0])));
            edges[x[i-1][1]].add(new Edge(x[i][1],Math.abs(x[i][0]-x[i-1][0])));
        }
        for (int i = 1; i <n ; i++)
        {
            edges[y[i][1]].add(new Edge(y[i-1][1],Math.abs(y[i][0]-y[i-1][0])));
            edges[y[i-1][1]].add(new Edge(y[i][1],Math.abs(y[i][0]-y[i-1][0])));
        }
        println(mst(edges,new int[n])) ;
    }
    public static long mst(List<Edge>[] edges, int[] pred) {
        int n = edges.length;
        Arrays.fill(pred, -1);
        boolean[] used = new boolean[n];
        int[] prio = new int[n];
        Arrays.fill(prio, Integer.MAX_VALUE);
        prio[0] = 0;
        PriorityQueue<Long> q = new PriorityQueue<>();
        q.add(0L);
        long res = 0;

        while (!q.isEmpty()) {
            long cur = q.poll();
            int u = (int) cur;
            if (used[u])
                continue;
            used[u] = true;
            res += cur >>> 32;
            for (Edge e : edges[u]) {
                int v = e.t;
                if (!used[v] && prio[v] > e.cost) {
                    prio[v] = e.cost;
                    pred[v] = u;
                    q.add(((long) prio[v] << 32) + v);
                }
            }
        }
        return res;
    }
    static class Edge {
        int t, cost;

        public Edge(int t, int cost) {
            this.t = t;
            this.cost = cost;
        }
    }
}