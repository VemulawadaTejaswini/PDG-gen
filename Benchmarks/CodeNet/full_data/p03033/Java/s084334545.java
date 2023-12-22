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
		
		Arrays.sort(list, (e1, e2)->Integer.compare(e2.X, e1.X));
		long[] v = new long[comp.size()];
		Arrays.fill(v, Long.MAX_VALUE / 2);
		LazySegmentTree_RMQ_and_RUQ seg = new LazySegmentTree_RMQ_and_RUQ(v);
		for(Pair p : list){
			seg.update(uniqueMap.get(p.S - p.X), uniqueMap.get(p.T - p.X)+1, p.X);
		}
		
		
		for(int i = 0; i < Q; i++){
			long x = seg.getMin(uniqueMap.get(D[i]), uniqueMap.get(D[i])+1);
			if(x != Long.MAX_VALUE / 2) System.out.println(x);
			else System.out.println(-1);
		}
		
		/*
		for(int i = 0; i < comp.size(); i++) System.out.print(comp.get(i) + " ");
		System.out.println();
		for(int i = 0; i < comp.size(); i++) System.out.print(seg.getMin(i, i+1) + " ");
		System.out.println();
		*/
	}
	
	ArrayList<Integer> compress(ArrayList<Integer> dataList){
		ArrayList<Integer> sortedUniqueList = new ArrayList<>(dataList.stream().sorted().distinct().collect(Collectors.toList()));
		return sortedUniqueList;
		//HashMap<Long, Integer> uniqueMap = new HashMap<>();
		//for(int i = 0; i < sortedUniqueList.size(); i++) uniqueMap.put(sortedUniqueList.get(i), i);
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

class Pair{
	int S, T;
	int X;
	public Pair(int s, int t, int x){
		S = s; T = t; X = x;
	}
}

class LazySegmentTree_RMQ_and_RUQ{
	int n;
	long[] node, lazy;
	boolean[] lazyFlag;
	
	//元配列vをセグメント木で表現する
	public LazySegmentTree_RMQ_and_RUQ(long[] v){
		int sz = v.length;
		n = 1;
		while(n < sz) n *= 2;
		node = new long[2*n-1];
		lazy = new long[2*n-1];
		lazyFlag = new boolean[2*n-1];
		
		for(int i = 0; i < sz; i++)
			node[i+n-1] = v[i];
		for(int i = n-2; i >= 0; i--)
			node[i] = Math.min(node[i*2+1], node[i*2+2]);
	}
	
	//k番目のノードについて遅延評価を行う
	public void eval(int k, int l, int r){

	    //遅延評価フラグが立っている場合、自ノード及び子ノードへの
	    //値の伝播が起こる
		if(lazyFlag[k]){
			node[k] = lazy[k];
			
			//最下段かどうかのチェックをしよう
			if(r - l > 1){
				lazy[2*k+1] = lazy[k];
				lazy[2*k+2] = lazy[k];
				lazyFlag[2*k+1] = true;
				lazyFlag[2*k+2] = true;
			}
			
			//伝播が終わったので、自ノードの遅延評価フラグを下す
			lazyFlag[k] = false;
		}
	}
	
	public void update(int a, int b, long x){
		update(a, b, x, 0, 0, -1);
	}
	
	public void update(int a, int b, long x, int k, int l, int r){
		if(r < 0) r = n;
		
		//k番目のノードに対して遅延評価を行う
		eval(k, l, r);
		
		//範囲外なら何もしない
		if(b <= l || r <= a) return;
		
		if(a <= l && r <= b) {
			//完全に被覆しているならば、遅延配列に値を入れた後に評価
			lazy[k] = x;
			lazyFlag[k] = true;
			eval(k, l, r);
		}else{
			//そうでないならば、子ノードの値を再帰的に計算して、
			//計算済みの値をもらってくる
			update(a, b, x, 2*k+1, l, (l+r)/2);
			update(a, b, x, 2*k+2, (l+r)/2, r);
			node[k] = Math.min(node[2*k+1], node[2*k+2]);
		}
	}
	
	long getMin(int a, int b){
		return getMin(a, b, 0, 0, -1);
	}
	
	long getMin(int a, int b, int k, int l, int r) {
		if(r < 0) r = n;
		//関数が呼び出されたら評価！
		eval(k, l, r);
		
		if(b <= l || r <= a) return Long.MAX_VALUE;
		if(a <= l && r <= b) return node[k];
		long vl = getMin(a, b, 2*k+1, l, (l+r)/2);
		long vr = getMin(a, b, 2*k+2, (l+r)/2, r);
		return Math.min(vl, vr);
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