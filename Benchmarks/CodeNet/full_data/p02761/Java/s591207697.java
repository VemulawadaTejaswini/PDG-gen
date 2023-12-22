import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;
 
public class Main {
 
    void solve() throws IOException {
        int N = ni();
        int M = ni();
        ArrayList<ArrayList<Integer>> list= new ArrayList<>();
        for (int i = 0; i < M; i++){
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < M; i++) {
            list.get(i).add(ni()-1);
            list.get(i).add(ni());
        }
        Collections.sort(list, (x,y) -> x.get(0).compareTo(y.get(0)));
        
        int[] ans = new int[N];
        Arrays.fill(ans, -1);
        if(list.get(0).get(0)!=0){
            ans[0] = 1;
        }else if(list.get(0).get(0) == 0 && list.get(0).get(1)==0){
            out.println(-1);
            return;
        }
        for (int i = 0; i <M; i++) {
            int loc = list.get(i).get(0);
            int val = list.get(i).get(1);
            if(ans[i] !=-1 && ans[i] != val){
                out.println(-1);
                return;
            }else{
                ans[loc] = val;
            }
        }
        for (int i = 0; i < ans.length; i++) {
            if(ans[i]==-1)out.print(0);
            else out.print(ans[i]);
        }
        out.println();
    }

    final int mod = 1000000007;
    final BigInteger MOD = BigInteger.valueOf(mod);

    int mul(int x, int y){
        int val = (int)((x * 1L * y) % mod);
        return val>=0 ? val : val+mod;
    }
    int add(int x, int y) {
        x += y;
        if(x < 0) x += mod;
        if(x>=mod) x -= mod;
        return x;
    }
    int sub(int x, int y){
        x = add(x,mod-y);
        if(x < 0) x += mod;
        if(x>=mod) x -= mod;
        return x;
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