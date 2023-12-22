import java.io.*;
import java.util.*;

public class Main implements Runnable {
    static ContestScanner in;
    static Writer out;
    public static void main(String[] args) {
        new Thread(null, new Main(), "", 16 * 1024 * 1024).start();
    }

    public void run() {
        Main main = new Main();
        try {
            in = new ContestScanner();
            out = new Writer();
            main.solve();
            out.close();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    long inf = Long.MAX_VALUE / 2;
    void solve() throws IOException {
        int n = in.nextInt();
        int m = in.nextInt();
        int s = in.nextInt() - 1;
        int t = in.nextInt() - 1;
        List<Edge>[] nodeA = new List[n];
        List<Edge>[] nodeB = new List[n];
        for (int i = 0; i < n; i++) {
            nodeA[i] = new ArrayList<>();
            nodeB[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            int u = in.nextInt() - 1;
            int v = in.nextInt() - 1;
            long a = in.nextLong();
            long b = in.nextLong();
            nodeA[u].add(new Edge(v, a));
            nodeA[v].add(new Edge(u, a));
            nodeB[v].add(new Edge(u, b));
            nodeB[u].add(new Edge(v, b));
        }

        long[] da = dijk(nodeA, s, n);
        long[] db = dijk(nodeB, t, n);

        Pos[] costs = new Pos[n];
        for (int i = 0; i < n; i++) {
            costs[i] = new Pos(i, da[i] + db[i]);
        }
        Arrays.sort(costs);
        int sp = 0;
        long base = 1000000000000000L;
        for (int i = 0; i < n; i++) {
            while(costs[sp].p < i) sp++;
            out.println(base - costs[sp].d);
        }
    }

    long[] dijk(List<Edge>[] node, int s, int n) {
        Queue<Pos> qu = new PriorityQueue<>();
        qu.add(new Pos(s, 0));
        long[] d = new long[n];
        Arrays.fill(d, inf);
        while (!qu.isEmpty()) {
            Pos p = qu.poll();
            if (d[p.p] < inf) continue;
            d[p.p] = p.d;
            for (Edge v: node[p.p]) {
                qu.add(new Pos(v.to, p.d + v.cost));
            }
        }
        return d;
    }
}

class Edge {
    int to;
    long cost;
    Edge(int to, long cost) {
        this.to = to;
        this.cost = cost;
    }
}

class Pos implements Comparable<Pos> {
    int p;
    long d;
    Pos(int p, long d) {
        this.p = p;
        this.d = d;
    }

    @Override
    public int compareTo(Pos o) {
        return Long.compare(d, o.d);
    }

    @Override
    public String toString() {
        return String.format("(%d,%d)", p, d);
    }
}

class Writer extends PrintWriter{
    public Writer(String filename)throws IOException
    {super(new BufferedWriter(new FileWriter(filename)));}
    public Writer()throws IOException {super(System.out);}
}
class ContestScanner implements Closeable {
    private BufferedReader in;private int c=-2;
    public ContestScanner()throws IOException
    {in=new BufferedReader(new InputStreamReader(System.in));}
    public ContestScanner(String filename)throws IOException
    {in=new BufferedReader(new InputStreamReader(new FileInputStream(filename)));}
    public String nextToken()throws IOException {
        StringBuilder sb=new StringBuilder();
        while((c=in.read())!=-1&&Character.isWhitespace(c));
        while(c!=-1&&!Character.isWhitespace(c)){sb.append((char)c);c=in.read();}
        return sb.toString();
    }
    public String readLine()throws IOException{
        StringBuilder sb=new StringBuilder();if(c==-2)c=in.read();
        while(c!=-1&&c!='\n'&&c!='\r'){sb.append((char)c);c=in.read();}
        return sb.toString();
    }
    public long nextLong()throws IOException,NumberFormatException
    {return Long.parseLong(nextToken());}
    public int nextInt()throws NumberFormatException,IOException
    {return(int)nextLong();}
    public double nextDouble()throws NumberFormatException,IOException
    {return Double.parseDouble(nextToken());}
    public void close() throws IOException {in.close();}
}
