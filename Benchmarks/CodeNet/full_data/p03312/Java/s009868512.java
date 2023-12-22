import java.math.*;
import java.util.*;
import java.io.*;

public class Main {
    void solve() {
        int n=ni();
        long a[]=new long[n+1];
        for(int i=1;i<=n;i++) a[i]=nl();
        long pref[]=new long[n+1];
        long suf[]=new long[n+1];
        for(int i=1;i<=n;i++) pref[i]=pref[i-1]+a[i];
        suf[n]=a[n];
        for(int i=n-1;i>=1;i--) suf[i]=suf[i+1]+a[i];
        long f[][]=new long[4][n+1];

        for(int i=2;i<=n;i++){
            int l=1,r=i-1;
            while(l<=r){
                int mid=(l+r)/2;
                long f1=Math.abs(pref[i]-pref[mid]-pref[mid]);
                long f2=Long.MAX_VALUE;
                if(mid+1<i){
                    f2=Math.abs(pref[i]-pref[mid+1]-pref[mid+1]);
                }
                if(f1<f2){
                    f[0][i]=pref[mid]; f[1][i]=pref[i]-pref[mid];
                    r=mid-1;
                }else l=mid+1;
            }
        }
        for(int i=n-1;i>=1;i--){
            int l=i+1,r=n;
            while(l<=r){
                int mid=(l+r)/2;
                long f3=Math.abs(suf[mid]-(suf[i]-suf[mid]));
                long f4=Long.MAX_VALUE;
                if(mid+1<=n){
                    f4=Math.abs(suf[mid+1]-(suf[i]-suf[mid+1]));
                }
                if(f3<f4){
                    f[2][i]=suf[i]-suf[mid]; f[3][i]=suf[mid];
                    r=mid-1;
                }else l=mid+1;
            }
        }
        long ans=Long.MAX_VALUE;
        for(int i=2;i<n-1;i++){
            long mn=Long.MAX_VALUE,mx=Long.MIN_VALUE;
            mn=Math.min(f[0][i],f[1][i]);
            mx=Math.max(f[0][i],f[1][i]);
            mn=Math.min(mn,Math.min(f[2][i+1],f[3][i+1]));
            mx=Math.max(mx,Math.max(f[2][i+1],f[3][i+1]));

           // if(mx-mn==42) pw.println(i);
            ans=Math.min(ans,mx-mn);
        }
        pw.println(ans);


    }

    long M=(long)1e9+7;
    InputStream is;
    PrintWriter pw;
    String INPUT = "";
    void run() throws Exception {
        is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
        pw = new PrintWriter(System.out);
        long s = System.currentTimeMillis();
        solve();
        pw.flush();
        if(!INPUT.isEmpty())tr(System.currentTimeMillis()-s+"ms");
    }

    public static void main(String[] args) throws Exception { new Main().run(); }

    private byte[] inbuf = new byte[1024];
    public int lenbuf = 0, ptrbuf = 0;

    private int readByte() {
        if(lenbuf == -1)throw new InputMismatchException();
        if(ptrbuf >= lenbuf){
            ptrbuf = 0;
            try { lenbuf = is.read(inbuf); } catch (IOException e) { throw new InputMismatchException(); }
            if(lenbuf <= 0)return -1;
        }
        return inbuf[ptrbuf++];
    }

    private boolean isSpaceChar(int c) { return !(c >= 33 && c <= 126); }
    private int skip() { int b; while((b = readByte()) != -1 && isSpaceChar(b)); return b; }

    private double nd() { return Double.parseDouble(ns()); }
    private char nc() { return (char)skip(); }

    private String ns() {
        int b = skip();
        StringBuilder sb = new StringBuilder();
        while(!(isSpaceChar(b))){ // when nextLine, (isSpaceChar(b) && b != ' ')
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    private char[] ns(int n) {
        char[] buf = new char[n];
        int b = skip(), p = 0;
        while(p < n && !(isSpaceChar(b))){
            buf[p++] = (char)b;
            b = readByte();
        }
        return n == p ? buf : Arrays.copyOf(buf, p);
    }

    private char[][] nm(int n, int m) {
        char[][] map = new char[n][];
        for(int i = 0;i < n;i++)map[i] = ns(m);
        return map;
    }

    private int[] na(int n) {
        int[] a = new int[n];
        for(int i = 0;i < n;i++)a[i] = ni();
        return a;
    }

    private int ni() {
        int num = 0, b;
        boolean minus = false;
        while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
        if(b == '-'){
            minus = true;
            b = readByte();
        }

        while(true){
            if(b >= '0' && b <= '9'){
                num = num * 10 + (b - '0');
            }else{
                return minus ? -num : num;
            }
            b = readByte();
        }
    }

    private long nl() {
        long num = 0;
        int b;
        boolean minus = false;
        while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
        if(b == '-'){
            minus = true;
            b = readByte();
        }

        while(true){
            if(b >= '0' && b <= '9'){
                num = num * 10 + (b - '0');
            }else{
                return minus ? -num : num;
            }
            b = readByte();
        }
    }

    private void tr(Object... o) { if(INPUT.length() > 0)System.out.println(Arrays.deepToString(o)); }
}