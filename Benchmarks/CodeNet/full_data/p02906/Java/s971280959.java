import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out,false);
        int n = scanner.nextInt();
        long m = scanner.nextInt();
        int q = scanner.nextInt();
        ArrayList<Pair> list = new ArrayList<>();
        DSU dsu = new DSU(n);
        boolean[] seen = new boolean[n];
        while(q-->0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            seen[a] = true;
            seen[b] = true;
            int c = scanner.nextInt();
            if (c == 0) list.add(new Pair(a,b));
            else dsu.union(a,b);
        }
        for(Pair p : list) {
            if (dsu.find(p.a) == dsu.find(p.b)) {
                System.out.println("No");
                return;
            }
        }
        long maxPoss = 0;
        long minPoss = 0; 
        long single = 0;
        long maxClique = 0;
        long unused = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++) {
            int pi = dsu.find(i);
            if (set.contains(pi)) continue;
            set.add(pi); 
            long val = dsu.rank[pi];
            if (val == 1 && seen[pi]) single++;
            else if (val == 1) unused++;
            else {
                long max= (val * (val-1)) /2;
                long min= val;
                if(max == 1) {
                    min = 3;
                    max = 3;
                    unused--;
                }
                maxPoss += max;
                minPoss += min;
                maxClique = Math.max(maxClique, dsu.rank[pi]);
            }
        }
        if (unused < 0) out.println("No");
        else if (single + minPoss + unused <= m && single + maxPoss  + (unused * (unused -1))/2  + unused * maxClique >= m) out.println("Yes");
        else out.println("No"); 
        out.flush();
    }
    static class Pair {
        int a, b;
        public Pair(int aa, int bb) {
            a = aa; b =bb;
        }
    }

    static class DSU {
        int[] rank;
        int[] parent;
        public DSU(int ss) {
            rank = new int[ss];
            parent = new int[ss];
            for(int i =0; i < ss; i++) {
                rank[i] = 1;
                parent[i] = i;
            }
        }
        int find(int a) {
            int p = a;
            while(parent[a] != a) a = parent[a];
            while(parent[p] != a) {
                int t = parent[p];
                parent[p] = a;
                p = t;
            }
            return a;
        }
        boolean union(int a, int b) {
            int pa = find(a);
            int pb = find(b);
            if (pa == pb) return false;
            if (rank[pa] <= rank[pb]) {
                parent[pa] = pb;
                rank[pb] += rank[pa];
            }
            else {
                parent[pb] = pa;
                rank[pa] += rank[pb];
            }
            return true;
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
    }
}
