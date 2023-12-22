import java.io.*;
import java.util.*;
import java.math.*;
// import java.awt.Point;
 
public class Main {
    InputStream is;
    PrintWriter out;
    String INPUT = "";
 
    long mod = 1_000_000_007;
    long inf = Long.MAX_VALUE;

    void solve(){
        int n = ni();
        if(n==3){
            out.println(2+" "+5+" "+63);
            return;
        }
        if(n==4){
            out.println(2+" "+5+" "+20+" "+63);
            return;
        }
        int y = -1;
        int x = -1;
        int z = -1;
        for(int i = 1; i <= 5000; i++){
            for(int j = 1; j <= 2500; j++){
                int tmp = n-i*2-j*2;
                if(tmp>0&&tmp<=5000){
                    x = i;
                    y = j;
                    z = tmp;
                    break;
                }
            }
            if(x>0) break;
        }
        // out.println(x+" "+y+" "+z);
        ArrayList<Integer> list = new ArrayList<>();
        int count = 1;
        for(int i = 1; i <= 2*x; i++){
            if((count*2)%6==0) count++;
            out.print(count*2+" ");
            list.add(count*2);
            count++;
        }
        count = 1;
        for(int i = 1; i <= 2*y; i++){
            if((count*3)%6==0) count++;
            out.print(count*3+" ");
            list.add(count*3);
            count++;
        }
        // out.println(count);
        count = 1;
        for(int i = 1; i <= z; i++){
            out.print(count*6+" ");
            list.add(count*6);
            count++;
        }


        // int count = 0;
        // for(int i = 1; i <= 30000; i++){
        //     if(i%2==0) count++;
        //     if(i%3==0) count++;
        //     if(i%6==0) count--;
        // }
        // out.println(count);
        // debug(list, n);
        return;

    }

    void debug(ArrayList<Integer> list, int n){
        int k = list.size();
        if(k!=n){
            out.println(-1);
            return;
        }
        boolean[] seen = new boolean[30001];
        for(int i : list){
            if(i>30000){
                out.println(-4);
                return;
            }
            if(!seen[i]){
                seen[i] = true;
                continue;
            }
            if(seen[i]){
                out.println(-2);
                return;
            }
        } 
        for(int i = 0; i < k; i++){
            int tmp = list.get(i);
            int tmp2 = 0;
            for(int j = 0; j < k; j++){
                if(i==j) continue;
                tmp2 += list.get(j);
            }
            if(gcd(tmp, tmp2)==1){
                out.println(i+" "+-3);
                return;
            }
        }

    }
    private static long gcd(long m, long n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
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
