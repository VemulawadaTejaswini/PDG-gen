import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
 
public class Main {
 
    void solve() throws IOException {
        H = ni();
        W = ni();
        grid = new int[H][W];
        for (int i = 0; i < H; i++) {
            var s = ns();
            for (int j = 0; j < W; j++) {
                if(s.charAt(j)=='.') grid[i][j]=0;
                if(s.charAt(j)=='#') grid[i][j]=1;
            }
        }
        ArrayList<Integer> path = new ArrayList<>();
        path.add(grid[0][0]);
        dfs(0,0,path);
 
        int ans = Collections.min(numb);
        out.println(ans);
    }
    int H;
    int W;
    int[][] grid;
    ArrayList<Integer> numb = new ArrayList<>();
    void dfs(int y, int x, ArrayList<Integer> path){
        if(y==H-1 && x==W-1){
            int count = path.get(0)==1? 1 : 0;
            for (int i = 1; i < path.size(); i++) {
                if(path.get(i-1)==0&&path.get(i)==1) count++;
            }
            numb.add(count);
            return;
        }
        if(x<W-1){
            path.add(grid[y][x+1]);
            dfs(y,x+1,path);
            path.remove(path.size()-1);
        }
        if(y<H-1){
            path.add(grid[y+1][x]);
            dfs(y+1,x,path);
            path.remove(path.size()-1);
        }
    }
    final int mod = 1000000007;
    int mul(int x, int y){
        return (int)((x * 1L * y) % mod);
    }
    int add(int x, int y) {
        x += y;
        return x >= mod ? (x - mod) : x;
    }
    int sub(int x, int y){
        x = add(x,mod-y);
        return x >= mod ? (x - mod) : x;
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
        out.close();
    }
}