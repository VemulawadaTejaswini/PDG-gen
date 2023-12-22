import java.math.*;
import java.util.*;
import java.io.*;

public class Main {
class Node implements Comparable<Node>{
    int id;
    long val;
    public Node(int id,long val){
        this.id=id;
        this.val=val;
    }
    public int compareTo(Node c){
        int t=Long.compare(c.val,this.val);
        if(t!=0) return t;
        t=Integer.compare(this.id,c.id);
        return t;
    }
}
    void solve() {
        int n=ni();
        long a[]=new long[1<<n];
        for(int i=0;i<(1<<n);i++) a[i]=nl();
        long dp[][]=new long[1<<n][2];
        int index[][]=new int[1<<n][2];
        for(int i=0;i<(1<<n);i++) Arrays.fill(index[i],-1);
        TreeSet<Node> ts=new TreeSet<Node>();
        ts.add(new Node(1,1));
        ts.add(new Node(1,1));

        for(int mask=0;mask<(1<<n);mask++){

            dp[mask][0]=a[mask];
            index[mask][0]=mask;
             for(int j=0;j<n;j++){
                 if((mask&(1<<j))>0){
                     int nmask=mask^(1<<j);
                     ts.clear();
                     ts.add(new Node(index[mask][0],dp[mask][0]));
                     ts.add(new Node(index[mask][1],dp[mask][1]));
                     ts.add(new Node(index[nmask][0],dp[nmask][0]));
                     ts.add(new Node(index[nmask][1],dp[nmask][1]));

                     Node p1=ts.pollFirst(),p2=ts.pollFirst();
                     dp[mask][0]=p1.val; index[mask][0]=p1.id;
                     dp[mask][1]=p2.val; index[mask][1]=p2.id;


                 }

             }

        }
        long ans[]=new long[1<<n];
        ans[0]=0;
        for(int i=1;i<(1<<n);i++){
            ans[i]=Math.max(ans[i-1],dp[i][0]+dp[i][1]);

        }
        for(int i=1;i<(1<<n);i++) pw.println(ans[i]);

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