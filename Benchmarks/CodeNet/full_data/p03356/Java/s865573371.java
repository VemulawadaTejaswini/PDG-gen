import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public static int n;
        public static int[] flags;
        public static Map<Integer, ArrayList<Integer>> graph;
        public static void flag(int v , int f){
            flags[v] = f;
            for (int i = 0; i <graph.get(v).size() ; i++){
                if (flags[graph.get(v).get(i)] == 0) flag(graph.get(v).get(i) , f );
            }
        }
        public void solve(int testNumber, InputReader in, PrintWriter out) {

            n = in.nextInt();
            int m = in.nextInt();
            flags = new int[n+1];
            int[]ind= new int[n+1];
            graph = new HashMap<>();
            for (int i = 1; i <=n ; i++) {
                ind[in.nextInt()] = i;
            }
            for (int i = 0; i <m ; i++) {
                int v = in.nextInt(),u=in.nextInt();
                if(graph.get(v)== null) graph.put(v, new ArrayList<>());
                if (graph.get(u) == null)graph.put(u , new ArrayList<>());
                graph.get(v).add(u);
                graph.get(u).add(v);
            }
            int f ;
            for (int i = 1; i <=n; i++) {
                f = i;
                if (graph.get(i) == null) continue;
                if (flags[i] == 0){
                    flag(i ,f);
                }
            }
            int ans = 0;
            for (int i = 1; i <=n ; i++) {
                if (i != ind[i]){
                    if (flags[i] == flags[ind[i]]) ans++;
                }
                else ans++;
            }
            out.println(ans);








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

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}
