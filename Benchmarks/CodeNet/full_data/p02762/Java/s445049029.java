import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main{
	static FastScanner sc = new FastScanner();
	static PrintWriter out = new PrintWriter(System.out);
	//static String S;
	//static int n;
	//static int m;
	//static int count;
	//static LinkedList <Integer> adj []; 
	//static boolean visited [];
	//static TreeMap <Integer, Integer> map;
	//static PriorityQueue <Integer> q;
	
	public static void main(String[] args) {
		int n = sc.nextInt();
		int m = sc.nextInt();
		long k = sc.nextLong();
		
		unionfind u = new unionfind(n);
		
		int a = 0; int b = 0;
		int friend[] = new int [n+1];
		for (int i=1; i<=m; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			u.unite(a,b);
			friend[a]++;
			friend[b]++;
		}
		
		int ans[] = new int [n+1];
		
		for (int i=1; i<=n; i++) {
			ans[i] = u.getsize(i)-friend[i]-1;
		}
		
		for (int i=1; i<=k; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			if (u.same(a, b)) {
				ans[a]--;
				ans[b]--;
			}
		}
		
		for (int i=1; i<=n; i++) {
			out.print(ans[i]+" ");
		}
		
		out.flush();
	}
	
	static class unionfind{
		int[] parent;
		int[] rank;
		int[] size;
		
		public unionfind(int n){
			this.parent = new int[n+1];
			this.rank = new int[n+1];
			this.size = new int[n+1];
			for(int i = 1; i <= n; i++) set(i);
		}
		
		public void set(int i) {
			parent[i] = i;
			rank[i] = 0;
			size[i] = 1;
		}
		
		public int find(int i) {
			if (i == parent[i])
				return parent[i];
			else
				return parent[i] = find(parent[i]);
			
		}
		
		public boolean same(int x, int y){
			return find(x) == find(y);
		}
		
		public void unite(int x, int y) {
			int xroot = find(x);
			int yroot = find(y);
			if(xroot == yroot)
				return;
			if(rank[xroot] > rank[yroot]) {
				parent[yroot] = xroot;
				size[xroot] += size[yroot];
			}
			else if(rank[xroot] < rank[yroot]) {
				parent[xroot] = yroot;
				size[yroot] += size[xroot];
			}
			else {
				parent[yroot] = xroot;
				size[xroot] += size[yroot];
				rank[xroot]++;
			}
		}
		
		public int getsize(int i) {
			return size[find(i)];
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
		      if (hasNextByte()) return buffer[ptr++];
		      else return -1;
		    }

		    private static boolean isPrintableChar(int c) {
		      return 33 <= c && c <= 126;
		    }

		    private void skipUnprintable() {
		      while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
		    }

		    public boolean hasNext() {
		      skipUnprintable();
		      return hasNextByte();
		    }

		    public String next() {
		      if (!hasNext()) throw new NoSuchElementException();
		      StringBuilder sb = new StringBuilder();
		      int b = readByte();
		      while (isPrintableChar(b)) {
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
		      return (int) nextLong();
		    }
		    
		    public double nextDouble(){
		    	return Double.parseDouble(next());
		    }

		    public int[] nextIntArray(int N, boolean oneBased) {
		      if (oneBased) {
		        int[] array = new int[N + 1];
		        for (int i = 1; i <= N; i++) {
		          array[i] = sc.nextInt();
		        }
		        return array;
		      } else {
		        int[] array = new int[N];
		        for (int i = 0; i < N; i++) {
		          array[i] = sc.nextInt();
		        }
		        return array;
		      }
		    }

		    public long[] nextLongArray(int N, boolean oneBased) {
		      if (oneBased) {
		        long[] array = new long[N + 1];
		        for (int i = 1; i <= N; i++) {
		          array[i] = sc.nextLong();
		        }
		        return array;
		      } else {
		        long[] array = new long[N];
		        for (int i = 0; i < N; i++) {
		          array[i] = sc.nextLong();
		        }
		        return array;
		      }
		    }
		  }

		}	 



