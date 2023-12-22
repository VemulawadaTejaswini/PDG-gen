import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
class UnionFind{
    int[] par;
    UnionFind(int n){
        par = new int[n];
        for (int i = 0; i < n; i++) {
            par[i] = i;
        }
    }
    int find (int n){
        if(par[n] == n){
            return n;
        }else{
            return find(par[n]);
        }
    }
    boolean union(int a, int b){
        int ra = find(a);
        int rb = find(b);
        if(ra == rb) return false;
        if(ra==0){
            par[b] = a;
            return true;
        }
        if(rb==0){
            par[a] = b;
            return true;
        }
        par[a] = b;
        return true;

    }
    int par(int n){
        if(par[n]==n) return n;
        else return par[n];
    }
}
public class Main {
 
    void solve() throws IOException {
        int n = ni();
        int q = ni();
        int[] parent = new int[n];
        UnionFind uf = new UnionFind(n);
        parent[0] = -1;
        for (int i = 0; i < n-1; i++) {
            int a = ni()-1;
            int b = ni()-1;
            uf.union(a,b);
        }
        // for (int i = 0; i < n; i++) {
        //     System.out.println(uf.par(i));
        // }
        int[] point = new int[n];
        for (int i = 0; i < q; i++) {
            int p = ni()-1;
            int x = ni();
            point[p] += x;
        }
        for (int i = 0; i < n; i++) {
            int ans = 0;
            int c = i;
            ans += point[c];
            while(c!=0){
                c = uf.par(c);
                ans += point[c];
            }
            out.print(ans);
            out.print(" ");
        }
        
    }

 
    String ns() throws IOException {
        while (!tok.hasMoreTokens()) {
            tok = new StringTokenizer(in.readLine(), " ");
        }
        return tok.nextToken();
    }
 
    int ni() throws IOException {
        return Integer.parseInt(ns());
    }
 
    long nl() throws IOException {
        return Long.parseLong(ns());
    }
 
    double nd() throws IOException {
        return Double.parseDouble(ns());
    }
 
    String[] nsa(int n) throws IOException {
        String[] res = new String[n];
        for (int i = 0; i < n; i++) {
            res[i] = ns();
        }
        return res;
    }
 
    int[] nia(int n) throws IOException {
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = ni();
        }
        return res;
    }
 
    long[] nla(int n) throws IOException {
        long[] res = new long[n];
        for (int i = 0; i < n; i++) {
            res[i] = nl();
        }
        return res;
    }
 
    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;
 
    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        tok = new StringTokenizer("");
        Main main = new Main();
        main.solve();
        out.flush();
        out.close();
    }
}