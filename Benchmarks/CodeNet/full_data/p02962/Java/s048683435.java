import java.io.*;
import java.util.*;
import java.math.*;
// import java.awt.Point;
 
public class Main {
    InputStream is;
    PrintWriter out;
    String INPUT = "";
 
    static int mod = 1_000_000_007;
    // int mod = 998244353;
    // long inf = Long.MAX_VALUE/2;
    int inf = Integer.MAX_VALUE/2;

    ArrayList<Integer>[] edge;
    boolean[] seen;
    long[] memo;
    boolean loop;
    long ans;

    void solve(){
        String s = ns();
        String t = ns();
        String st = t;
        while(st.length()<=3*t.length()){
            st += s;
        }
        int[] ret = zalgo(st);
        edge = new ArrayList[s.length()];
        for(int i = 0; i < s.length(); i++){
            edge[i] = new ArrayList<>();
        }
        int[] inner = new int[s.length()];
        int[] outer = new int[s.length()];
        for(int i = t.length(); i < st.length(); i++){
            if(ret[i]<t.length()) continue;
            int idx = i - t.length();
            if(idx>=s.length()) break;
            edge[idx].add((idx+t.length())%s.length());
            inner[(idx+t.length())%s.length()]++;
            outer[idx]++;
            // out.println(idx);
        }
        memo = new long[s.length()];
        long ans = 0;
        for(int i = 0; i < s.length(); i++){
            if(inner[i]!=0&&outer[i]!=1) continue;
            seen = new boolean[s.length()];
            long tmp = f(i);
            ans = Math.max(tmp, ans);
            if(loop) break;
        }
        out.println(loop ? -1 : ans);
    }

    long f(int cur){
        if(seen[cur]){
            loop = true;
            return 0;
        }
        if(memo[cur]>0){
            return memo[cur];
        }
        seen[cur] = true;
        long ret = 0;
        for(int e : edge[cur]){
            ret = f(e)+1;
        }
        memo[cur] = ret;
        return ret;
    }

    int[] zalgo(String s) {
		int n = s.length();
		int[] ret = new int[n];
		ret[0] = n;
		int i = 1, j = 0;
		while (i < n) {
			while (i + j < n && s.charAt(j) == s.charAt(i + j))
				++j;
			ret[i] = j;
			if (j == 0) {
				++i;
				continue;
			}
			int k = 1;
			while (i + k < n && k + ret[k] < j) {
				ret[i + k] = ret[k];
				++k;
			}
			i += k;
			j -= k;
		}
		return ret;
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
