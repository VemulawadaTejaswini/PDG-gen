import java.io.*;
import java.lang.reflect.Array;
import java.math.*;
import java.text.DecimalFormat;
import java.util.*;




public class Main {
    private static ArrayList<Integer> [] R,B;
    private static int n,dfs_time;
    private static boolean [] special;
    private static int [] depth,dfs_in,dfs_out;
    private static int [] [] parent;

    private static void init(){
        R = new ArrayList[n+1];
        B = new ArrayList[n+1];
        for (int i = 0;i <= n;i++) R[i] = new ArrayList<>();
        for (int i = 0;i <= n;i++) B[i] = new ArrayList<>();
        special = new boolean[n + 1];
        depth = new int[n+1];
        dfs_in = new int[n+1];
        dfs_out = new int[n+1];
        int lg = 0;
        while ((1 << lg) <= n) lg++;
        parent = new int[n+1][lg + 1];
    }


    private static void dfs(int u,int p) {
        depth[u] = depth[p] + 1;
        dfs_in[u] = dfs_time++;
        parent[u][0] = p;
        for (int i = 0;i+1 < parent[u].length;i++)
            parent[u][i + 1] = parent[parent[u][i]][i];

        for (int v : B[u])
            if (v != p)
                dfs(v,u);
        dfs_out[u] = dfs_time - 1;
    }

    private static boolean inSubTree(int a,int b){
        return dfs_in[b] <= dfs_in[a] && dfs_in[a] <= dfs_out[b];
    }

    private static int lca(int a,int b){
        if(depth[a] > depth[b]) {
            int t = a;
            a = b;
            b = t;
        }
        if(inSubTree(b,a)) return a;
        int k = parent[0].length - 1;
        while(a != b){
            if(depth[a] > depth[b]) {
                int t = a;
                a = b;
                b = t;
            }
            while(k>0 && inSubTree(a,parent[b][k])) k--;
            b = parent[b][k];
        }
        return a;
    }

    private static int getDist(int a,int b) {
        return depth[a] + depth[b] - 2*depth[lca(a,b)];
    }

    private static int dfs(int u,int p,int d,int Y) {
        if (getDist(u,Y) <= d) return 0;
        if(special[u]) return Integer.MAX_VALUE;
        int ret = 2*getDist(u,Y);
        for (int v : R[u])
            if (v != p){
               int tmp = dfs(v,u,d+1,Y);
               ret = Math.max(ret,tmp);
            }
        return ret;
    }


    public static void main(String[] args) throws Exception {
        IO io = new IO("in.in", null);
        n = io.getNextInt();
        init();
        int X = io.getNextInt(),Y = io.getNextInt();
        for (int i = 1;i < n;i++){
            int a = io.getNextInt(),b = io.getNextInt();
            R[a].add(b);
            R[b].add(a);
        }
        for (int i = 1;i < n;i++){
            int a = io.getNextInt(),b = io.getNextInt();
            B[a].add(b);
            B[b].add(a);
        }

        dfs(Y,0);
        dfs_out[0] = n-1;

        for (int i = 1;i <= n;i++)
            for (int v : R[i])
                if (getDist(v,i) >= 3)
                    special[v] = special[i] = true;

        int res = dfs(X,0,0,Y);
        if (res == Integer.MAX_VALUE) res = -1;
        io.println(res);
        io.close();
    }
}





class IO{
    private BufferedReader br;
    private StringTokenizer st;
    private PrintWriter writer;
    private String inputFile,outputFile;

    public boolean hasMore() throws IOException{
        if(st != null && st.hasMoreTokens()) return true;
        if(br != null && br.ready()) return true;
        return false;
    }
    public String getNext() throws FileNotFoundException, IOException{
        while(st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }

    public String getNextLine() throws FileNotFoundException, IOException{
        return br.readLine().trim();
    }

    public int getNextInt() throws FileNotFoundException, IOException{
        return Integer.parseInt(getNext());
    }
    public long getNextLong() throws FileNotFoundException, IOException{
        return Long.parseLong(getNext());
    }

    public void print(double x,int num_digits) throws  IOException{
        writer.printf("%." + num_digits + "f" ,x);
    }
    public void println(double x,int num_digits) throws  IOException{
        writer.printf("%." + num_digits + "f\n" ,x);
    }
    public void print(Object o) throws  IOException{
        writer.print(o.toString());
    }

    public void println(Object o) throws  IOException{
        writer.println(o.toString());
    }
    public IO(String x,String y) throws FileNotFoundException, IOException{
        inputFile = x;
        outputFile = y;
        if(x != null) br = new BufferedReader(new FileReader(inputFile));
        else br = new BufferedReader(new InputStreamReader(System.in));
        if(y != null) writer = new PrintWriter(new BufferedWriter(new FileWriter(outputFile)));
        else writer = new PrintWriter(new OutputStreamWriter(System.out));
    }

    protected void close() throws IOException{
        br.close();
        writer.close();
    }
    public void outputArr(Object [] A) throws IOException{
        int L = A.length;
        for (int i = 0;i < L;i++) {
            if(i > 0) writer.print(" ");
            writer.print(A[i]);
        }
        writer.print("\n");
    }
}
