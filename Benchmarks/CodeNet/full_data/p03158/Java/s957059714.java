import java.io.*;
import java.util.*;
import java.math.*;
// import java.awt.Point;

public class Main {
    InputStream is;
    PrintWriter out;
    String INPUT = "";

    static int mod = 1_000_000_007;
    long inf = Long.MAX_VALUE;

    int black = 0;
    int white = 0;
    ArrayList<int[]>[] edge;
    boolean[] seen;
    void solve(){
        int N = ni();
        int Q = ni();
        int[] A = new int[N];
        int[] X = new int[Q];
        for(int i = 0; i < N; i++){
            A[i] = ni();
        }
        for(int i = 0; i < Q; i++){
            X[i] = ni();
        }
        Arrays.sort(A);
        int B=(N+1)/2;
        int border[]=new int[B];
        for(int i=0;i<B;i++){
            border[i]=(A[i]+A[i*2])/2;
        }
        long result[]=new long[B];
        for(int i=0;i<B;i++){
            result[0]+=A[i*2];
        }
        for(int i=1;i<B;i++){
            result[i]=result[i-1]+A[i]-A[2*i];
        }
        PrintWriter out = new PrintWriter(System.out);



        for (int i = 0; i < Q; i++) {
            int x1 = 0;
            int x2 = (N + 1) / 2 - 1;
            while (true) {
                int xm = (x1 + x2) / 2;
                if (border[xm] > X[i]) {
                    x1 = xm;
                } else {
                    x2 = xm;
                }
                if (x2 - x1 == 1) {
                    break;
                }
            }
            if (border[x2] < X[i]) {
                out.println(result[x2 - 1]);
            } else {
                out.println(result[x2]);
            }
        }


           }


    void run() throws Exception
    {
        is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
        out = new PrintWriter(System.out);
        long s = System.currentTimeMillis();
        solve();
        out.flush();
        if(!INPUT.isEmpty())tr(System.currentTimeMillis()-s+"ms");
    }

    public static void main(String[] args) throws Exception { new Main().run(); }

    private byte[] inbuf = new byte[1024];
    private int lenbuf = 0, ptrbuf = 0;

    private int readByte()
    {
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

    private String ns()
    {
        int b = skip();
        StringBuilder sb = new StringBuilder();
        while(!(isSpaceChar(b) && b != ' ')){
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    private char[] ns(int n)
    {
        char[] buf = new char[n];
        int b = skip(), p = 0;
        while(p < n && !(isSpaceChar(b))){
            buf[p++] = (char)b;
            b = readByte();
        }
        return n == p ? buf : Arrays.copyOf(buf, p);
    }

    private char[][] nm(int n, int m)
    {
        char[][] map = new char[n][];
        for(int i = 0;i < n;i++)map[i] = ns(m);
        return map;
    }

    private int[] na(int n)
    {
        int[] a = new int[n];
        for(int i = 0;i < n;i++)a[i] = ni();
        return a;
    }

    private int ni()
    {
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

    private long nl()
    {
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

    private static void tr(Object... o) { System.out.println(Arrays.deepToString(o)); }

}
