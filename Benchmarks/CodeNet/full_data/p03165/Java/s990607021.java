import java.io.*;
import java.util.*;
public class Main {
    InputStream is;
    PrintWriter out;
    String INPUT = "";
    
    int MAX = (int) 2e5+5, MOD = (int)1e9 + 7;
    int dp[][];
    void solve(int TC) {
        char s[] = ns().toCharArray();
        char t[] = ns().toCharArray();
        int n = s.length;
        int m = t.length;
        dp = new int[n+1][m+1];
        lcs(s,t,n,m);
        int pt = dp[n][m];
        char ans[] = new char[pt];
        int i=n,j=m,tmp;
        while(i>0 && j>0) {
            tmp = Math.max(dp[i-1][j], dp[i][j-1]);
            if(dp[i][j]>tmp) {
                ans[--pt] = s[i-1];
                --i;--j;
            } else {
                if(dp[i][j]==dp[i-1][j]) --i;
                else --j;
            }
        }
        pn(new String(ans));
        
    }
    
    int lcs(char s[], char t[], int n, int m) {
        if(n==0 || m==0) return 0;
        if(s[n-1]==t[m-1]) return dp[n][m] = lcs(s,t,n-1,m-1) + 1;
        return dp[n][m] = Math.max(lcs(s,t,n-1,m), lcs(s,t,n,m-1));
    }
    
    boolean TestCases = false;
    public static void main(String[] args) throws Exception { new Main().run(); }
    
    long pow(long a, long b) {
        if(b==0 || a==1) return 1;
        long o = 1;
        for(long p = b; p > 0; p>>=1) {
            if((p&1)==1) o = (o*a) % MOD;
            a = (a*a) % MOD;
        } return o;
    }
    
    long inv(long x) {
        long o = 1;
        for(long p = MOD-2; p > 0; p>>=1) {
            if((p&1)==1)o = (o*x)%MOD;
            x = (x*x)%MOD;
        } return o;
    }
    long gcd(long a, long b) { return (b==0) ? a : gcd(b,a%b); }
    int gcd(int a, int b) { return (b==0) ? a : gcd(b,a%b); }
    
    void run() throws Exception {
        is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
        out = new PrintWriter(System.out);
        long s = System.currentTimeMillis();
        int T = TestCases ? ni() : 1;
        for(int t=1;t<=T;t++) solve(t);
        out.flush();
        if(!INPUT.isEmpty())tr(System.currentTimeMillis()-s+"ms");
    }
    
    void p(Object o) { out.print(o); }
    void pn(Object o) { out.println(o); }
    void pni(Object o) { out.println(o);out.flush(); }
    double PI = 3.141592653589793238462643383279502884197169399;
    
    int ni() {
        int num = 0, b;
        boolean minus = false;
        while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
        if(b == '-') {
            minus = true;
            b = readByte();
        }
        while(true) {
            if(b >= '0' && b <= '9'){
                num = num * 10 + (b - '0');
            } else {
                return minus ? -num : num;
            }
            b = readByte();
        }
    }
    
    long nl() {
        long num = 0;
        int b;
        boolean minus = false;
        while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
        if(b == '-') {
            minus = true;
            b = readByte();
        }
        while(true) {
            if(b >= '0' && b <= '9') {
                num = num * 10 + (b - '0');
            } else {
                return minus ? -num : num;
            }
            b = readByte();
        }
    }
    
    double nd() { return Double.parseDouble(ns()); }
    char nc() { return (char)skip(); }
    
    int BUF_SIZE = 1024 * 8;
    byte[] inbuf = new byte[BUF_SIZE];
    int lenbuf = 0, ptrbuf = 0;
    
    int readByte() {
        if(lenbuf == -1)throw new InputMismatchException();
        if(ptrbuf >= lenbuf){
            ptrbuf = 0;
            try { lenbuf = is.read(inbuf); } catch (IOException e) { throw new InputMismatchException(); }
            if(lenbuf <= 0)return -1;
        } return inbuf[ptrbuf++];
    }
    
    boolean isSpaceChar(int c) { return !(c >= 33 && c <= 126); }
    int skip() { int b; while((b = readByte()) != -1 && isSpaceChar(b)); return b; }
    
    String ns() {
        int b = skip();
        StringBuilder sb = new StringBuilder();
        while(!(isSpaceChar(b))) {
            sb.appendCodePoint(b); b = readByte();
        } return sb.toString();
    }
    
    char[] ns(int n) {
        char[] buf = new char[n];
        int b = skip(), p = 0;
        while(p < n && !(isSpaceChar(b))){
            buf[p++] = (char)b;
            b = readByte();
        } return n == p ? buf : Arrays.copyOf(buf, p);
    }
    
    void tr(Object... o) { if(INPUT.length() > 0)System.out.println(Arrays.deepToString(o)); }
}