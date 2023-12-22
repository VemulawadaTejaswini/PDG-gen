import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.math.BigInteger;
 
public class Main implements Runnable {
	
	static int mod = 1000000007;
	
    public static void main(String[] args) {
    	new Thread(null, new Main(), "", 1024 * 1024 * 1024).start();
    }
    
    public void run() {
    	PrintWriter out = new PrintWriter(System.out);
        FastScanner sc = new FastScanner();
        
        int n = sc.nextInt();
        int m = 100001;
        int[] x = new int[n];
        int[] y = new int[n];
        
        for(int i=0;i<n;i++){
        	x[i] = sc.nextInt();
        	y[i] = m + sc.nextInt();
        }
        UnionFindTree uft = new UnionFindTree(2*m);

        for(int i=0;i<n;i++){
        	uft.unite(x[i], y[i]);
        }
        
        boolean[] checked = new boolean[2*m];
        long ans = 0;
        
        for(int i=0;i<2*m;i++){
        	int root = uft.find(i);
        	if(!checked[root]){
        		ans += (long)uft.xpeers[root]*uft.ypeers[root];
        		checked[root] = true;
        	}
        }
        
        ans -= n;
        
        out.println(ans);

        out.flush();
    }
    

}

class UnionFindTree {
	int[] par;
	int[] rank;
	int[] xpeers; //集合の要素数用
	int[] ypeers; //集合の要素数用
	
	public UnionFindTree(int n){
		par = new int[n];
		rank = new int[n];
		xpeers = new int[n];
		ypeers = new int[n];
		
		for(int i=0;i<n/2;i++){
			par[i] = i;
			xpeers[i] = 1;
		}
		for(int i=n/2;i<n;i++){
			par[i] = i;
			ypeers[i] = 1;
		}
	}
	
	//木の根を求める
	int find(int x){
		if(par[x] == x){
			return x;
		}
		else{
			return par[x] = find(par[x]);
		}
	}
	
	//xとyの属する集合を併合
	public void unite(int x, int y){
		int px = find(x);
		int py = find(y);
		
		if(px == py){
			return;
		}
		else if(rank[px] < rank[py]){
			xpeers[py] += xpeers[px];
			ypeers[py] += ypeers[px];
			par[px] = py;

		}
		else{
			xpeers[px] += xpeers[py];
			ypeers[px] += ypeers[py];
			par[py] = px;
			if(rank[px]==rank[py]){
				rank[px]++;
			}
		}
		
	}
	
	//xとyが同じ集合に属するか
	public boolean isSame(int x, int y){
		return find(x) == find(y);
	}

}

class FastScanner {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;
	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		} else {
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
		if (hasNextByte())
			return buffer[ptr++];
		else
			return -1;
	}
	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}
	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
		return hasNextByte();
	}
	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	public long nextLong() {
		if (!hasNext())
			throw new NoSuchElementException();
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
		while (true) {
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			} else if (b == -1 || !isPrintableChar(b)) {
				return minus ? -n : n;
			} else {
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}
	public int nextInt() {
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
			throw new NumberFormatException();
		return (int) nl;
	}
	public int[] nextintArray(int n){
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = nextInt();
		}
		return a;
	}
	public long[] nextlongArray(int n){
		long[] a = new long[n];
		for(int i=0;i<n;i++){
			a[i] = nextLong();
		}
		return a;
	}
	public Integer[] nextIntegerArray(int n){
		Integer[] a = new Integer[n];
		for(int i=0;i<n;i++){
			a[i] = nextInt();
		}
		return a;
	}
	public double nextDouble() {
		return Double.parseDouble(next());
	}
}