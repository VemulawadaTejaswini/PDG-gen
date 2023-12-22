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
		int Q = sc.nextInt();
		int[][] query = new int[Q][3];
		ArrayList<Long> list = new ArrayList<>();
		for(int i = 0; i < Q; i++){
			if(sc.next().equals("1")){
				int a = sc.nextInt(), b = sc.nextInt();
				query[i][0] = 1; query[i][1] = a; query[i][2] = b;
				list.add((long)a);
			}else{
				query[i][0] = 2;
			}
		}
		
		ArrayList<Long> comp = compress(list);
		HashMap<Long, Integer> map = new HashMap<>();
		
		for(int i = 0; i < comp.size(); i++){
			map.put(comp.get(i), i+1);
		}
		
		SegmentTree seg1 = new SegmentTree(new long[comp.size()+1]);
		SegmentTree seg2 = new SegmentTree(new long[comp.size()+1]);
		
		long sumB = 0;
		int numQ = 0;
		for(int i = 0; i < Q; i++){
			if(query[i][0] == 1){
				sumB += query[i][2];
				numQ++;
				seg1.add(map.get((long)query[i][1]), 1);
				seg2.add(map.get((long)query[i][1]), query[i][1]);
			}else{
				int ng = 0, ok = comp.size();
				while(ok - ng > 1){
					int mid = (ok + ng) / 2;
					if(seg1.query(1, mid+1) >= (numQ+1) / 2) ok = mid;
					else ng = mid;
				}
				
				long ans = sumB;
				ans += comp.get(ok-1) * seg1.query(1, ok) - seg2.query(1, ok);
				ans -= comp.get(ok-1) * seg1.query(ok, comp.size()+1) - seg2.query(ok, comp.size()+1);
				System.out.println(comp.get(ok-1) + " " + ans);
				
			}
		}
 	}
	
	ArrayList<Long> compress(ArrayList<Long> list){
		ArrayList<Long> sortedUniqueList = new ArrayList<>(list.stream().sorted().distinct().collect(Collectors.toList()));
		//long e = uniqueList.get(0);
		//int index = Collections.binarySearch(uniqueList, e);
		//System.out.println(index + " " + e);
		return sortedUniqueList;
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

class SegmentTree{
	int n;
	long[] node;
	
	//単位元
	long e = 0;
	
	//結合律が成り立つ二項演算
	private long func(long e1, long e2){
		return e1 + e2;
	}
	
	/* 元配列vをセグメント木で表現する */
	public SegmentTree(long[] v){
		int sz = v.length;
		n = 1;
		while(n < sz) n *= 2;
		node = new long[2*n-1];
		
		for(int i = 0; i < sz; i++)
			node[i+n-1] = v[i];
		
		for(int i = n-2; i >= 0; i--)
			node[i] = func(node[2*i+1], node[2*i+2]);
	}
	
	/* 0-indexed:xの要素をvalに更新 */
	public void updata(int index, long val){
		int x = index;
		x = x + n - 1;
		//更新
		node[x] = val;
		while(x > 0){
			x = (x - 1) / 2;
			node[x] = func(node[2*x+1], node[2*x+2]);
		}
	}
	
	/* 0-indexed:xの要素にvalを加算 */
	public void add(int index, long val){
		int x = index;
		x = x + n - 1;
		//加算
		node[x] += val;
		while(x > 0){
			x = (x - 1) / 2;
			node[x] = func(node[2*x+1], node[2*x+2]);
		}
	}
	
	/* 指定した区間[a,b)の最小値を求めるクエリ */
	public long query(int a, int b){
		return query(a, b, 0, 0, n);
	}
	
	private long query(int a, int b, int k, int l, int r){
		if(r <= a || b <= l) return e;
		if(a <= l && r <= b) return node[k];
		long vl = query(a, b, 2*k+1, l, (l+r)/2);
		long vr = query(a, b, 2*k+2, (l+r)/2, r);
		return func(vl, vr);
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
