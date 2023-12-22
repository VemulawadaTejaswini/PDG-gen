import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

@SuppressWarnings("unused")
public class Main {
	String fileName = "input.txt";
	final boolean isDebug = false;
	//final boolean isDebug = true;
	FastScanner in = new FastScanner(System.in);
	PrintWriter out = new PrintWriter(System.out);
	final int MOD = (int)1e9+7;
	final long INF = Long.MAX_VALUE / 2;
	//final int INF = Integer.MAX_VALUE / 2;
	
	
	void solve() throws Exception{
		int N = in.nextInt();
		int Q = in.nextInt();
		TreeSet<Integer> set = new TreeSet<>();
		
		int[] S = new int[N], T = new int[N], X = new int[N];
		for(int i = 0; i < N; i++){
			S[i] = in.nextInt(); T[i] = in.nextInt()-1;
			X[i] = in.nextInt();
			set.add(S[i]-X[i]); set.add(T[i]-X[i]);
		}
		
		int[] D = new int[Q];
		for(int i = 0; i < Q; i++){
			D[i] = in.nextInt();
			set.add(D[i]);
		}
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; !set.isEmpty(); i++) map.put(set.pollFirst(), i);
		
		DualSegmentTree seg = new DualSegmentTree(map.size());
		for(int i = 0; i < N; i++) seg.setSegment(map.get(S[i] - X[i]), map.get(T[i] - X[i]) + 1, X[i]);
		
		for(int i = 0; i < Q; i++){
			long x = seg.getPoint(map.get(D[i]));
			if(x != Long.MAX_VALUE) out.println(x);
			else out.println(-1);
		}
		out.flush();
		
		/*
		long[] get = seg.get();
		for(int i = 0; i < Q; i++){
			long x = get[map.get(D[i])];
			if(x != Long.MAX_VALUE) io.println(x);
			else io.println(-1);
		}
		io.flush();
		*/
	}
	
	/* end solve */
	
	/* main */
	public static void main(String[] args) throws Exception {
		new Main().m();
	}
	
	void m() throws Exception {
		if(isDebug) in = new FastScanner(new FileInputStream(fileName));
		solve();
		out.flush();
	}
	/* end main */
}
/* end Main */

class DualSegmentTree{
	int sz;
	int n;
	long[] node;
	
	/*作用素で使える単位元*/
	private long e = Long.MAX_VALUE;
	
	/*結合律が成り立ち、更新が可換であるような、各要素への作用素*/
	private long f(long nodeVal, long val){
		return Math.min(nodeVal, val);
	}
	
	/* 単位元で初期化 */
	public DualSegmentTree(int sz){
		this.sz = sz;
		n = 1;
		while(n < sz) n *= 2;
		node = new long[2*n];
		Arrays.fill(node, e);
	}
	
	/* 元配列vでセグメント木を初期化 */
	public DualSegmentTree(long[] v){
		this(v.length);
		for(int i = 0; i < v.length; i++){
			node[i+n] = v[i];
		}
	}
	
	/* 0-indexed:xの要素を取得する */
	public long getPoint(int x){
		x += n;
		long res = node[x];
		while(x > 1){
			x = x / 2;
			res = f(res, node[x]);
		}
		return res;
	}
	
	/* 指定した区間[L,R)に含まれるすべての要素に作用素を適用するクエリ */
	public void setSegment(int L, int R, long val){
		L += n;
		R += n;
		while (L < R) {
			if ((L & 1) != 0){
				node[L] = f(node[L], val);
				L++;
			}
			if ((R & 1) != 0){
				--R;
				node[R] = f(node[R], val);
			}
			L >>= 1;
			R >>= 1;
		}
	}
	
	public long[] get(){
		long[] tmp = new long[2*n];
		tmp[1] = e;
		for(int i = 1; i < n; i++){
			tmp[2*i] = f(tmp[i], node[2*i]);
			tmp[2*i+1] = f(tmp[i], node[2*i+1]);
		}
		long[] res = new long[sz];
		for(int i = 0; i < sz; i++) res[i] = tmp[i+n];
		return res;
	}
}

class FastScanner {
	Reader input;

	FastScanner() {
		this(System.in);
	}

	FastScanner(InputStream stream) {
		this.input = new BufferedReader(new InputStreamReader(stream));
	}

	int nextInt() {
		return (int) nextLong();
	}

	long nextLong() {
		try {
			int sign = 1;
			int b = input.read();
			while ((b < '0' || '9' < b) && b != '-' && b != '+') {
				b = input.read();
			}
			if (b == '-') {
				sign = -1;
				b = input.read();
			} else if (b == '+') {
				b = input.read();
			}
			long ret = b - '0';
			while (true) {
				b = input.read();
				if (b < '0' || '9' < b) return ret * sign;
				ret *= 10;
				ret += b - '0';
			}
		} catch (IOException e) {
			e.printStackTrace();
			return -1;
		}
	}

	double nextDouble() {
		try {
			double sign = 1;
			int b = input.read();
			while ((b < '0' || '9' < b) && b != '-' && b != '+') {
				b = input.read();
			}
			if (b == '-') {
				sign = -1;
				b = input.read();
			} else if (b == '+') {
				b = input.read();
			}
			double ret = b - '0';
			while (true) {
				b = input.read();
				if (b < '0' || '9' < b) break;
				ret *= 10;
				ret += b - '0';
			}
			if (b != '.') return sign * ret;
			double div = 1;
			b = input.read();
			while ('0' <= b && b <= '9') {
				ret *= 10;
				ret += b - '0';
				div *= 10;
				b = input.read();
			}
			return sign * ret / div;
		} catch (IOException e) {
			e.printStackTrace();
			return Double.NaN;
		}
	}

	char nextChar() {
		try {
			int b = input.read();
			while (Character.isWhitespace(b)) {
				b = input.read();
			}
			return (char) b;
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	String nextStr() {
		try {
			StringBuilder sb = new StringBuilder();
			int b = input.read();
			while (Character.isWhitespace(b)) {
				b = input.read();
			}
			while (b != -1 && !Character.isWhitespace(b)) {
				sb.append((char) b);
				b = input.read();
			}
			return sb.toString();
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}

}