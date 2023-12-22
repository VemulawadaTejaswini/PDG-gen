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

    List<Integer>[] node;
    void solve() throws IOException {
        int n = in.nextInt();
        int m = in.nextInt();
        node = new List[n];
        for (int i = 0; i < n; i++) {
            node[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            int u = in.nextInt() - 1;
            int v = in.nextInt() - 1;
            node[u].add(v);
        }
        int s = in.nextInt() - 1;
        int t = in.nextInt() - 1;
        Queue<Pos> qu = new ArrayDeque<>();
        int[][] used = new int[n][3];
        for (int i = 0; i < n; i++) {
            Arrays.fill(used[i], -1);
        }
        qu.add(new Pos(s, 0));
        used[s][0] = 0;
        while (!qu.isEmpty()) {
            Pos p = qu.poll();
            if (p.p == t && p.mod == 0) {
                System.out.println(used[p.p][p.mod] / 3);
                return;
            }
            for (int np: node[p.p]) {
                int nmod = (p.mod + 1) % 3;
                if (used[np][nmod] != -1) continue;
                used[np][nmod] = used[p.p][p.mod] + 1;
                qu.add(new Pos(np, nmod));
            }
        }
        System.out.println(-1);
    }
}

class Pos {
    int p, mod;
    Pos(int p, int mod) {
        this.p = p;
        this.mod = mod;
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
