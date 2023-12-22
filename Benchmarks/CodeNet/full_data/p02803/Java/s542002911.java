
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        static long pow(long a , long b , long m){
            long res = 1;
            a%=m;
            while (b>0){
                if ((b&1)==1)res*=a%m;
                a = a*a%m;
                b>>=1;
            }
            return res;
        }

        public void solve(int testNumber, InputReader in, PrintWriter out){
            int h = in.nextInt();
            int w =in.nextInt();
            ArrayList<Integer>[] graph = new ArrayList[h*w];
            for (int i = 0; i <w*h ; i++) {
                graph[i] = new ArrayList();
            }
            char[][] grid = new char[h][w];
            for (int i = 0; i <h ; i++) {
                String s = in.next();
                for (int j = 0; j <w ; j++) {
                    grid[i][j] = s.charAt(j);
                }
            }
            int n = 0;
            for (int i = 0; i <h ; i++) {
                for (int j = 0; j <w ; j++) {
                    if (grid[i][j] == '#') continue;
                    if (j+1 <w && grid[i][j+1] == '.')graph[n].add(n+1);
                    if (j-1 > 0 && grid[i][j-1] == '.') graph[n].add(n-1);
                    if (i+1 <h && grid[i+1][j] == '.')graph[n].add(n+w);
                    if (i-1 > 0 && grid[i-1][j] == '.') graph[n].add(n-w);
                    n++;
                }
            }
            int max = 0;
            Queue<Integer> queue =new LinkedList<>();
            for (int i = 0; i <graph.length; i++) {
                boolean[] used = new boolean[graph.length];
                int[] dis = new int[graph.length];
                used[i]=true;
                dis[i]=0;
                queue.add(i);
                while (!queue.isEmpty()){
                    int s = queue.remove();
                    for (int v : graph[s]) {
                        if (used[v]) continue;
                        used[v]=true;
                        queue.add(v);
                        dis[v]=dis[s]+1;
                        max = Math.max(max , dis[v]);
                    }
                }
            }
            System.out.println(max);














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
