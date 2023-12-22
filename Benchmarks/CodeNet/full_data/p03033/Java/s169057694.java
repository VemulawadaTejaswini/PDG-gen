import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

@SuppressWarnings("unused")
public class Main {
	
	//final boolean isDebug = true;
	final boolean isDebug = false;
	String fileName = "input.txt";
	FastScanner sc;
	PrintWriter out;
	final int MOD = (int)1e9+7;
	//final int INF = Integer.MAX_VALUE / 2;
	final long INF = Long.MAX_VALUE / 2;
	
	/*
	 * i桁分
	 * j:N未満が確定しているか
	 * k:1がこれまでに登場したか
	 */
	void solve() throws Exception{
		int N = sc.nextInt();
		int Q = sc.nextInt();
		ArrayList<Integer> comp = new ArrayList<>();
		Pair[] list = new Pair[N];
		for(int i = 0; i < N; i++){
			int s = sc.nextInt(), t = sc.nextInt()-1;
			int x = sc.nextInt();
			comp.add(s-x); comp.add(t-x);
			list[i] = new Pair(s, t, x);
		}
		int[] D = new int[Q];
		for(int i = 0; i < Q; i++){
			D[i] = sc.nextInt();
			comp.add(D[i]);
		}
		
		comp = compress(comp);
		HashMap<Integer, Integer> uniqueMap = new HashMap<>();
		for(int i = 0; i < comp.size(); i++) uniqueMap.put(comp.get(i), i);
		
		DualSegmentTree seg = new DualSegmentTree(comp.size());
		for(Pair p : list){
			seg.setSegment(uniqueMap.get(p.S - p.X), uniqueMap.get(p.T - p.X)+1, p.X);
		}
		
		for(int i = 0; i < Q; i++){
			long x = seg.getPoint(uniqueMap.get(D[i]));
			if(x != Long.MAX_VALUE) System.out.println(x);
			else System.out.println(-1);
		}
	}
	
	ArrayList<Integer> compress(ArrayList<Integer> dataList){
		ArrayList<Integer> sortedUniqueList = new ArrayList<>(dataList.stream().sorted().distinct().collect(Collectors.toList()));
		return sortedUniqueList;
		//HashMap<Long, Integer> uniqueMap = new HashMap<>();
		//for(int i = 0; i < sortedUniqueList.size(); i++) uniqueMap.put(sortedUniqueList.get(i), i);
	}
    
    class Pair{
		int S, T;
		int X;
		public Pair(int s, int t, int x){
			S = s; T = t; X = x;
		}
	}
		
	/* end solve */
	
	/* main */
	public static void main(String[] args) throws Exception {
		new Main().m();
	}
	
	void m() throws Exception {
		long S = System.currentTimeMillis();
		sc = (isDebug) ? new FastScanner(new FileInputStream(fileName)) : new FastScanner(System.in);
		out = new PrintWriter(System.out);
		solve();
		out.flush();
		long G = System.currentTimeMillis();
		if(isDebug){
			System.out.println("---Debug---");
			System.out.printf("%8d ms\n", (G-S));
		}
	}
	
	
	/* end main */
}
/* end Main */

class DualSegmentTree{
	int n;
	long[] node;
	
	/*作用素で使える単位元*/
	private long e = Long.MAX_VALUE;
	
	/*結合律が成り立ち、更新が可換であるような、各要素への作用素*/
	private long f(long nodeVal, long val){
		return Math.min(nodeVal, val); //区間最小値更新
	}
	
	/* 元配列vをセグメント木で表現する */
	public DualSegmentTree(long[] v){
		n = 1;
		while(n < v.length) n *= 2;
		node = new long[2*n-1];
		Arrays.fill(node, e);
		
		for(int i = 0; i < v.length; i++)
			node[i+n-1] = v[i];
		
		for(int i = n-2; i >= 0; i--)
			node[i] = f(node[2*i+1], node[2*i+2]);
	}
	
	/* 単位元で初期化 */
	public DualSegmentTree(int sz){
		n = 1;
		while(n < sz) n *= 2;
		node = new long[2*n-1];
		Arrays.fill(node, e);
	}
	
	/* 0-indexed:xの要素を取得する */
	public long getPoint(int x){
		x += n - 1;
		long res = node[x];
		while(x > 0){
			x = (x - 1) / 2;
			res = f(res, node[x]);
		}
		return res;
	}
	
	/* 指定した区間[a,b)に含まれるすべての要素に作用素を適用するクエリ */
	public void setSegment(int a, int b, long val){
		setSegment(a, b, val, 0, 0, n);
	}
	
	private void setSegment(int a, int b, long val, int k, int l, int r){
		if(r <= a || b <= l) return;
		if(a <= l && r <= b){
			node[k] = f(node[k], val);
			return;
		}
		setSegment(a, b, val, 2*k+1, l, (l+r)/2);
		setSegment(a, b, val, 2*k+2, (l+r)/2, r);
	}
}

class FastScanner {
    private InputStream in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    public FastScanner(InputStream in) {
		this.in = in;
	}
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }
    private int readByte() {
    	if (hasNextByte()) return buffer[ptr++];
    	else return -1;
    }
    private static boolean isPrintableChar(int c){
    	return 33 <= c && c <= 126;
    }
    public boolean hasNext() {
    	while(hasNextByte() && !isPrintableChar(buffer[ptr]))
    		ptr++; return hasNextByte();
    }
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public String nextLine() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(b != 10) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() {
    	return Double.parseDouble(next());
    }
}
