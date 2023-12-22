import java.io.*;
import java.util.*;
import java.math.*;
// import java.awt.Point;
 
public class Main {
    InputStream is;
    PrintWriter out;
    String INPUT = "";
 
    // static int mod = 1_000_000_007;
    int mod = 998244353;
    long inf = Long.MAX_VALUE/2;
    // int inf = Integer.MAX_VALUE/2;

    void solve(){
        int n = ni();
        int[][] lr = new int[n][2];
        for(int i = 0; i < n; i++){
            lr[i][0] = ni();
            lr[i][1] = ni();
        }
        Arrays.sort(lr, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				if(a[0] != b[0])return (a[0] - b[0]);
				return a[1] - b[1];
			}
		});

        PriorityQueue<Tuple> pq = new PriorityQueue<>();
        Deque<int[]> st = new ArrayDeque<>();
        long ret = 0;
        long[] x = new long[n];
        for(int i = 0; i < n; i++){
            int l = lr[i][0];
            int r = lr[i][1];
            ret = Math.max(ret, r-l+1);
            x[i] = r-l+1;
            pq.add(new Tuple(i,0,l)); // left
            pq.add(new Tuple(i,1,r)); // right
        }
        int limit = n;
        long[] ans = new long[n];
        long[] ans2 = new long[n];
        int ma = 0;
        int low = 0;
        long lowans = 0;
        long left_max = 0;
        int seen = -1;
        int count = 0;
        while(!pq.isEmpty()){
            Tuple t = pq.poll();
            if(t.type==0){
                ma = Math.max(ma, t.idx);
                st.push(new int[]{t.idx, t.val});
                if(t.idx==n-1) left_max = t.val;
                continue;
            }
            while(!st.isEmpty()){
                int[] tmp = st.pop();
                if(tmp[0]>=t.idx){
                    long val = t.val - tmp[1] + 1;
                    int idx = tmp[0];
                    if(idx>limit) continue;
                    limit = tmp[0];
                    ans[idx] = val;
                }
                else{
                    st.push(tmp);
                    break;
                }
            }
            if(ma==n-1){
                // out.println(t.idx+" "+low);
                if(t.idx<low) continue;
                ans2[t.idx] = t.val - left_max + 1;
                if(seen>=t.idx) ans2[t.idx] = Math.min(ans2[t.idx], lowans);
                seen = t.idx;
                lowans = ans2[t.idx];
                // out.println(ans2[t.idx]);
                // if(count++==0) ret += ans2[t.idx];
                continue;
            }
            low = Math.max(low, t.idx);
        }
        for(int i = 0; i < n-1; i++){
            // System.err.println(ans[i]+" "+ans2[i+1]);
            ret = Math.max(ret, ans[i]+ans2[i+1]);
        }
        ret = Math.max(ret, ans2[n-1]);
        out.println(ret);
    }

    public class Tuple implements Comparable<Tuple>{
        int idx;
        int type;
        int val;
        public Tuple(int idx, int type, int val){
            this.idx = idx;
            this.val = val;
            this.type = type;
        }

        @Override
        public int compareTo(Tuple q) {
            if(this.val!=q.val) return Integer.compare(this.val, q.val);
            else return Integer.compare(this.type, q.type);
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
