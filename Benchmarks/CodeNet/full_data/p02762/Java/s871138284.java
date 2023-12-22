
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }
    static class TaskD {
        static long x ;
        static long y ;
        static long x1;
        static long y1;
        static long gcd(long a , long b){
            if (a==0){
                x1 = 0;
                y1 = 1;
                return b;
            }
            long g = gcd(b%a , a);
            x = y1-(b/a)*x1;
            y = x1;
            x1 = x;
            y1 = y;
            return g;
        }
        static  int[] count;
        static  boolean[] visited;
        static ArrayList<Integer>[] frinds;
        static int[] color ;
        public static void dfs(int v , int val){
            visited[v]=true;
            count[val]++;
            color[v]=val;
            for (int u: frinds[v]) {
                if (!visited[u]) dfs(u , val);
            }
        }
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int k = in.nextInt();
            frinds = new ArrayList[n+1];
            HashSet<Integer> []ch= new HashSet[n+1];
            color = new int[n+1];
            visited = new boolean[n+1];
            int[] ans = new int[n+1];
            count = new int[n+1];
            for (int i = 0; i <m ; i++) {
                int v = in.nextInt();
                int u = in.nextInt();
                if (frinds[v]==null){frinds[v]=new ArrayList<>();ch[v]=new HashSet<>();}
                if (frinds[u]==null) {frinds[u]=new ArrayList<>();ch[u]=new HashSet<>();}
                frinds[u].add(v);
                frinds[v].add(u);
                ch[v].add(u);
            }
            int val = 1;
            for (int i = 1; i <=n; i++) {
                if (!visited[i]){
                    dfs(i,val);
                }
                val++;
            }
            for (int i = 0; i <k ; i++) {
                int v = in.nextInt();
                int u = in.nextInt();
                if ((color[v]==color[u]) && !((ch[v]!=null && ch[v].contains(u))||(ch[u]!=null && ch[u].contains(v)))){
                    ans[v]--;
                    ans[u]--;
                }
            }
            for (int i = 1; i <=n; i++) {
                int value = count[color[i]]-frinds[i].size();
                System.out.print((ans[i]+value-1)+" ");
            }
            System.out.println();
        }
    }
    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
        public int nextInt(){return  Integer.parseInt(next());}
        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}