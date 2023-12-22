import java.util.*;
import static java.lang.System.*;
import java.io.*;
import java.math.*;

public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] edge = new int[m][2];
		
		long[] souwa = new long[n + 1];
		for (int i = 2; i <= n; i++) {
			souwa[i] = souwa[i-1] + i - 1;
		}
		
		for(int i = 0; i < m; i++) {
			edge[i][0] = sc.nextInt();
			edge[i][1] = sc.nextInt();
		}
		//n本崩落したとに行き来できる組み合わせの数
		long[] cnt = new long[m + 1];
		
		UnionFind uf = new UnionFind(n);
		cnt[m] = 0;
		for (int i = m - 1; i >= 0; i--) {
			long a = souwa[uf.size(edge[i][0])],  b = souwa[uf.size(edge[i][1])];
			if (uf.connected(edge[i][0], edge[i][1]) ) 
				cnt[i] = cnt[i + 1];
			else {
			uf.unite(edge[i][0], edge[i][1]);
			long c =souwa[uf.size(edge[i][0])];
			cnt[i] = cnt[i+1] + c - a - b;
			}
		}
		
		for(int i = 1; i < cnt.length; i++) {
			out.println(cnt[0] - cnt[i]);
		}
		
		out.close();
	}
	
	  static class UnionFind {
		    int[] parents;
		    int[] size;

		    public UnionFind(int n) {
		      this.parents = new int[n + 1];
		      this.size = new int[n + 1];
		      for (int i = 0; i <= n; i++) {
		        parents[i] = i;
		      }
		      Arrays.fill(size, 1);
		    }

		    public void unite(int x, int y) {
		      int rx = find(x);
		      int ry = find(y);
		      if (rx == ry) {
		        return;
		      }
		      if (size[rx] < size[ry]) {
		        size[ry] += size[rx];
		        parents[rx] = ry;
		      } else {
		        size[rx] += size[ry];
		        parents[ry] = rx;
		      }
		    }

		    public int find(int x) {
		      int root = x;
		      while (root != parents[root]) {
		        root = parents[root];
		      }
		      return root;
		    }

		    public int size(int x) {
		      return size[find(x)];
		    }

		    public boolean connected(int x, int y) {
		      return find(x) == find(y);
		    }
		  }

static class FastScanner {
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
}