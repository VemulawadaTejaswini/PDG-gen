import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String args[]) {
		FastScanner scanner = new FastScanner();
		int n=scanner.nextInt();
		int m=scanner.nextInt();
		int[] a=new int[m];
		int[] b=new int[m];
		int[] c=new int[m];
		dist=new long[n][n];
		long MIN=-10000000000l;
		for(int i=0;i<n;i++) {
			Arrays.fill(dist[i], MIN);
		}
		UnionFind uf=new UnionFind(n);
		for(int i=0;i<m;i++) {
			a[i]=scanner.nextInt()-1;
			b[i]=scanner.nextInt()-1;
			c[i]=scanner.nextInt();
			dist[a[i]][b[i]]=c[i];
			uf.union(a[i], b[i]);
		}
		for(int i=0;i<m;i++) {
			if(dist[b[i]][a[i]]!=MIN) {
				if(uf.root(0)==uf.root(a[i])) {
					System.out.println("inf");
					return;
				}
			}
		}
		warshallFloyd(n);
		System.out.println(dist[0][n-1]);
	}
	static long[][] dist;
	static void warshallFloyd(int n) {
		for (int k = 0; k < n; k++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					dist[i][j] = Math.max(dist[i][j], dist[i][k] + dist[k][j]);
				}
			}
		}
	}
}

class UnionFind {
	int parent[];
	int rank[];

	public UnionFind(int n) {
		parent = new int[n];
		rank = new int[n];
		for (int i = 0; i < n; i++) {
			parent[i] = i;
			rank[i] = 0;
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
			} else {
				parent[x] = y;
				if (rank[x] == rank[y]) {
					rank[y]++;
				}
			}
		}
		return;
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
