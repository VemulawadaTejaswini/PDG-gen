import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;
 
public class Main {
 
    void solve() throws IOException {
        int N = ni();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(ni());
        }
        Collections.sort(list,Comparator.reverseOrder());
        long ans = 0;
        long rev = 0;
        if(N==2){
            out.println(list.get(0)-list.get(1));
        }
        else if(N%2==1){
            int p2 = (N-2)/2;
            int m1 = (N-2)/2+2;
            int m2 = N-1;
            for (int i = 0; i < N; i++) {
                if(i<=p2) {
                    ans += 2*list.get(i);
                    rev -= 2*list.get(N-1-i);
                }
                else if(i<=m1) {
                    ans -= list.get(i);
                    rev += list.get(N-1-i);
                }
                else if(i<=m2) {
                    ans -= 2*list.get(i);
                    rev += 2*list.get(N-1-i);
                }
            }
        }else{
            int p2 = (N-2)/2 - 1;
            int p1 = (N-2)/2;
            int m1 = (N-2)/2 + 1;
            int m2 = N-1;
            for (int i = 0; i < N; i++) {
                if(i<=p2) {
                    ans += 2*list.get(i);
                    rev -= 2*list.get(N-1-i);
                }
                else if(i<=p1) {
                    ans += list.get(i);
                    rev -= list.get(N-1-i);
                }
                else if(i<=m1) {
                    ans -= list.get(i);
                    rev += list.get(N-1-i);
                }
                else if(i<=m2) {
                    ans -= 2*list.get(i);
                    rev += 2*list.get(N-1-i);
                }

            }
        }
        out.println(Math.max(ans,rev));
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