import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        if (K > ((N-1)*(N-2))/2) {
            System.out.println(-1);
            return;
        }
        ArrayList<Integer>[] graph = new ArrayList[N];
        for(int i = 0 ;i < N; i++) {
            graph[i] = new ArrayList<>();
            for(int j = 0; j < N; j++) {
                if (i == j) continue;
                graph[i].add(j);
            }
        }
        int nedges = ((N-1)*N)/2;
        int curK = 0;
        int curNode = 1;
        while(curK < K) {
            if (graph[curNode].size() == 1) curNode++;
            int nextRem = graph[curNode].get(graph[curNode].size()-1);
            graph[curNode].remove(graph[curNode].size()-1);
            graph[nextRem].remove(Integer.valueOf(curNode));
            nedges--;
            curK++;
        }
        out.println(nedges);
        for(int i = 0; i < N; i++) {
            for(int edge: graph[i]) {
                if (edge > i) out.println((i+1) + " " + (edge+1));
            }
        }
        out.flush();
    }
    
    static class Pair implements Comparable<Pair> {
        int a, b;
        public Pair(int aa, int bb) {
            a = aa; b = bb;
        }
        public int compareTo(Pair o) {
            if (b == o.b) return a - o.a;
            return b - o.b;
        }
    }
    
    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
        
        public FastScanner(Reader in) {
            br = new BufferedReader(in);
        }
        
        public FastScanner() {
            this(new InputStreamReader(System.in));
        }
        
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        
        int nextInt() {
            return Integer.parseInt(next());
        }
        
        long nextLong() {
            return Long.parseLong(next());
        }
        
        double nextDouble() {
            return Double.parseDouble(next());
        }
        
        String readNextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
        
        int[] readIntArray(int n) {
            int[] a = new int[n];
            for (int idx = 0; idx < n; idx++) {
                a[idx] = nextInt();
            }
            return a;
        }
    }
}
