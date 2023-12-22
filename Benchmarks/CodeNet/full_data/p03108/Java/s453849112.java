// package cc;
import java.util.*;
import java.io.*;

class Main {
    static boolean DEBUG_OUTPUT=false;
    
    static final long MOD=1000000007L;

    public static void main(String[] args) {
        solve();
    }
    
    public static void solve(){
//        int T = _int();
//        while(T-->0){
            int n = _int();
            int m = _int();
            DisjointSet set = new DisjointSet(n);
            ArrayList<Long> ans = new ArrayList<>();
            
            int arr[][] = new int[2][m];
            
            for(int i=0;i<m;i++){
                arr[0][i] = _int()-1;
                arr[1][i] = _int()-1;
            }
            
            for(int i=m-1;i>=0;i--){
                ans.add(set.disPairCount);
                set.union(arr[0][i],arr[1][i]);
            }
            
            for(int ii=ans.size()-1;ii>=0;ii--)
                println(ans.get(ii));
//        }
    }
    
    

    static int max(int a, int b) {
        return a > b ? a : b;
    }
    
    static int min(int a, int b) {
        return a < b ? a : b;
    }

    static void print(Object o) {
        System.out.print(o);
    }

    static void println(Object o) {
        System.out.println(o);
    }
    
    static void debug(String format,Object...args){
        if(DEBUG_OUTPUT)System.out.printf(format, args);
    }

    

    static BufferedReader br;
    static StringTokenizer st;

    static {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    static String _next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    static int _int() {
        return Integer.parseInt(_next());
    }

    static long _long() {
        return Long.parseLong(_next());
    }

    static double _double() {
        return Double.parseDouble(_next());
    }

    static String _line() {
        String str = "";
        try {
            str = br.readLine();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
    
    
    static class DisjointSet {

        long[] rank;
        int[] parent;
        int [] size;
        int n;
        long disPairCount = 0;

        public DisjointSet(int n) {
            rank = new long[n];
            parent = new int[n];
            size = new int[n];
            this.n = n;
            disPairCount = (n*(n-1L))/2;

            //n sets, each element has his own set
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                size[i]=1;
            }
        }

        int find(int x) {
            int i=x;
            while (parent[i] != i) {
//                parent[x] = find(parent[x]);
                parent[i] = parent[parent[i]];
                i = parent[i];
            }
            parent[x] = i;
            return i;
        }

        void union(int x, int y) {
            int xRoot = find(x), yRoot = find(y);
            if (xRoot == yRoot) {
                return;
            }
            
            long oldSize1 = size[xRoot];
            long oldSize2 = size[yRoot];
            
            disPairCount -= 1L * oldSize1 * oldSize2;
            

            if (rank[xRoot] < rank[yRoot]) {
                parent[xRoot] = yRoot;
                size[yRoot]=size[yRoot] + size[xRoot];
//                size.remove(xRoot);
            } else if (rank[yRoot] < rank[xRoot]) {
                parent[yRoot] = xRoot;
                size[xRoot]=size[yRoot] + size[xRoot];
//                size.remove(yRoot);
            } else {
                parent[yRoot] = xRoot;
                rank[xRoot]++;
                size[xRoot]=size[yRoot] + size[xRoot];
//                size.remove(yRoot);
            }
        }
    }
}
