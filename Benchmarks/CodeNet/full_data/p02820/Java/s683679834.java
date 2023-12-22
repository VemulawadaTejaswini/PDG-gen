import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
 
public class Main {
 
    void solve() throws IOException {
        int N = ni();
        int K = ni();
        int R = ni();
        int S = ni();
        int P = ni();
        String T = ns();
        long ans = 0;
        char[] hand = new char[N];
        for (int i = 0; i < N; i++) {
            if(T.charAt(i)=='r') {
                if(i>=K && hand[i-K]=='p'){
                    hand[i] = 'r';
                }
                else{
                    hand[i] = 'p';
                    ans+= P;
                }
            }
            if(T.charAt(i)=='s') {
                if(i>=K && hand[i-K]=='r'){
                    hand[i] = 's';
                }
                else{
                    hand[i] = 'r';
                    ans+= R;
                }
            }
            if(T.charAt(i)=='p') {
                if(i>=K && hand[i-K]=='s'){
                    hand[i] = 'p';
                }
                else{
                    hand[i] = 's';
                    ans+= S;
                }
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