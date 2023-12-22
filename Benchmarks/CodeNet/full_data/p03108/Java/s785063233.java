import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {
	
    public static void main(String[] args) {
    	FastScanner sc = new FastScanner();
    	
    	int N = sc.nextInt();
    	int M = sc.nextInt();
    	
    	UnionFindTree ki = new UnionFindTree(N);
    	
    	long[] huben = new long[M+1];
    	huben[M+1-1] = N*(N-1)/2;
    	
    	int[] a = new int[M];
    	int[] b = new int[M];
    	
    	for(int i=0;i<M;i++){
    		a[i] = sc.nextInt()-1;
    		b[i] = sc.nextInt()-1;
    	}
    	
    	for(int i=0;i<M;i++){
    		int as = a[M-i-1];
    		int bs = b[M-i-1];
    		
    		if(ki.isEquivalent(as,bs)){
    			huben[M-i-1] = huben[M-i];
    		}
    		else{
        		huben[M-i-1] = huben[M-i] - (ki.nakamanum(as)*ki.nakamanum(bs));
    		}
    		
    		ki.unite(as,bs);
			
    	}
    	
    	for(int i=1;i<M+1;i++){
        	System.out.println(huben[i]);
    	}
    	
    }
    
}

//Union-Find木
class UnionFindTree {
	int[] par;
	int[] rank;
	int[] nakama; //仲間の数
	
	public UnionFindTree(int n){
		par = new int[n];
		rank = new int[n];
		nakama = new int[n];
		
		for(int i=0;i<n;i++){
			par[i] = i;
		}
		
		for(int i=0;i<n;i++){
			nakama[i] = 1;
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
	void unite(int x, int y){
		int px = find(x);
		int py = find(y);
		
		if(px == py){
			return;
		}
		else if(rank[px] < rank[py]){
			nakama[py] += nakama[px];
			par[px] = py;

		}
		else{
			nakama[px] += nakama[py];
			par[py] = px;
			if(rank[px]==rank[py]){
				rank[px]++;
			}
		}
		
	}
	
	//xとyが同じ集合に属するか
	boolean isEquivalent(int x, int y){
		return find(x) == find(y);
	}
	
	//xの仲間の数を求める
	int nakamanum(int x){
		return nakama[find(x)];
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
    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
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
    public double nextDouble() { return Double.parseDouble(next());}
}