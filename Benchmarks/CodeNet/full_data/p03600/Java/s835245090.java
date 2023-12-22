import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

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

    void solve() throws IOException {
        int n = in.nextInt();
        long[][] map = new long[n][n];
        long[][] pred = new long[n][n];
        final long inf = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = in.nextInt();
                if (i != j) pred[i][j] = inf;
            }
        }

        Queue<Edge> qu = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                qu.add(new Edge(i, j, map[i][j]));
            }
        }

        long ans = 0;
        boolean[][] edged = new boolean[n][n];
        while (!qu.isEmpty()) {
            Edge e = qu.poll();
            if (pred[e.a][e.b] < e.cost) {
                out.println(-1);
                return;
            }
            if (pred[e.a][e.b] == e.cost) continue;
            // 辺を新規追加
            ans += e.cost;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    final long newCost = Math.min(pred[i][e.a] + pred[e.b][j] + e.cost,
                            pred[i][e.b] + pred[e.a][j] + e.cost);
                    if (edged[i][j] && newCost < pred[i][j]) {
                        out.println(-1);
                        return;
                    }
                    pred[i][j] = pred[j][i] = Math.min(pred[i][j], newCost);
                }
            }
            edged[e.a][e.b] = edged[e.b][e.a] = true;
            pred[e.a][e.b] = pred[e.b][e.a] = e.cost;
        }
        out.println(ans);
    }
}

class Edge implements Comparable<Edge> {
    int a, b;
    long cost;
    Edge(int a, int b, long c) {
        this.a = a;
        this.b = b;
        cost = c;
    }

    @Override
    public int compareTo(Edge o) {
        return Long.compare(cost, o.cost);
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