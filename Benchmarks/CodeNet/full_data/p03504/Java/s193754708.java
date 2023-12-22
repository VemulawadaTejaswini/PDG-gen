import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
 
public class Main {
 
    void solve() throws IOException {
        int N = ni();
        int C = ni();
        ArrayList<ArrayList<Integer>> ps = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            ArrayList<Integer> p = new ArrayList<>();
            p.add(ni());
            p.add(ni());
            p.add(ni()-1);
            ps.add(p);
        }
        Collections.sort(ps, (x,y)->x.get(1).compareTo(y.get(1)));

        int[] rec = new int[C];
        int[] cha = new int[C];
        for (int i = 0; i < C; i++) {
            cha[i] = -1;
        }
        for (int i = 0; i < N; i++) {
            var p = ps.get(i);
            int rid = -1;
            int ret = -1;
            for (int j = 0; j < C; j++) {
                if(cha[j] == p.get(2)){
                    rid = j;
                    break;
                }
                if(rec[j]+1<=p.get(0)){
                    if(ret < rec[j]) {
                        ret = rec[j];
                        rid = j;
                    }
                }
            }
            rec[rid] = p.get(1);
            cha[rid] = p.get(2);
            // System.out.println(Arrays.toString(rec));
            // System.out.println(Arrays.toString(cha));
        }
        
        long ans = 0;
        for (int i = 0; i < C; i++) {
            if(cha[i]!=-1){
                ans = i+1;
            }
        }
        out.println(ans);
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