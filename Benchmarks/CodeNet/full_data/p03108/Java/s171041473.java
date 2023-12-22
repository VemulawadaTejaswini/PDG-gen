import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String args[]) {
		FastScanner scanner = new FastScanner();
		int n=scanner.nextInt();
		int m=scanner.nextInt();
		int[] a=new int[m];
		int[] b=new int[m];
		for(int i=0;i<m;i++) {
			a[i]=scanner.nextInt()-1;
			b[i]=scanner.nextInt()-1;
		}
		long[] ans=new long[m+1];
		UnionFind uf=new UnionFind(n);
		ans[m]=ncr(n,2);
		for(int i=m-1;i>=0;i--) {
			if(!uf.same(a[i], b[i]))
				ans[i]=ans[i+1]-uf.getSize(a[i])*uf.getSize(b[i]);
			else
				ans[i]=ans[i+1];
			uf.union(a[i], b[i]);
		}
		StringBuilder sb=new StringBuilder();
		for(int i=1;i<m+1;i++) {
			sb.append(ans[i]+"\n");
		}
		System.out.println(sb);
	}
	static int ncr(int a, int b) {
		if (b == 0) return 1;
		int res = ncr(a - 1, b - 1);
		res *= a;
		res /= b;
		return res;
	}
}

class UnionFind {
	int parent[];
	int rank[];
	int size[];

	public UnionFind(int n) {
		parent = new int[n];
		rank = new int[n];
		size = new int[n];
		for (int i = 0; i < n; i++) {
			parent[i] = i;
			rank[i] = 0;
			size[i] = 1;
		}
	}

	public boolean same(int x, int y) {
		return root(x) == root(y);
	}

	public int root(int x) {
		if (parent[x] == x) {
			return x;
		} else {
			return parent[x] = root(parent[x]);
		}
	}

	public void union(int x, int y) {
		x = root(x);
		y = root(y);
		if (x != y) {
			if (rank[x] > rank[y]) {
				parent[y] = x;
				size[x] += size[y];
			} else {
				parent[x] = y;
				if (rank[x] == rank[y]) {
					rank[y]++;
				}
				size[y] += size[x];
			}
		}
		return;
	}

	public int getSize(int x) {
		int root = root(x);
		return size[root];
	}

	public int count(int n) {
		int ret = 0;
		for (int i = 0; i < n; i++) {
			if (i == root(i)) {
				ret++;
			}
		}
		return ret;
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
