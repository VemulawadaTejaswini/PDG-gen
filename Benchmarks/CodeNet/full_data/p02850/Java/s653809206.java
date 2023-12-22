import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Main implements Runnable{
	static FastScanner sc = new FastScanner();
	static PrintWriter out = new PrintWriter(System.out);
	static int V;
	static LinkedList<Integer> adj[]; 
	static Queue <Integer> Q;
	static boolean used [];
	static int v_color [];
	static int ans [];
	static int Field [][];
	static int k;
	
	public void run() {
		
		Edge();
		bfs();
		
		out.println(k);
		for (int i=1; i<V; i++){
			out.println(ans[i]);
		}
		out.flush();
	}
	
	public static void main(String[] args) {
		new Thread(null, new Main(), "", 16 * 1024 * 1024).start();
	}
	
	static void Edge () {
		V = sc.nextInt();
		Field = new int [V+1][V+1];
		
		adj = new LinkedList[V+1]; 
		
	    for (int i=1; i<=V; ++i)
	    	adj[i] = new LinkedList(); 
	        
		for (int i=1; i<V; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			adj[a].add(b);
			adj[b].add(a);
			Field [a][b] = i;
		}
	}
	
	static void bfs () {
		Q = new ArrayDeque <Integer>();
		Q.add(1);
		
		used = new boolean [V+1];
		v_color = new int [V+1];
		ans = new int [V+1];
		
		used [1] = true;
		
		k = -1;
		
		while (!Q.isEmpty()){
			int cur = Q.poll();
			int color_e = 1;
			
			if (k<adj[cur].size())
				k = adj[cur].size();
			
			for (int i: adj[cur]) {
				if (used[i])
					continue;
				
				if (color_e==v_color[cur])
					color_e++;
				
				v_color[i] = color_e;
				if (cur<i)
					ans[Field[cur][i]] = color_e++;
				else
					ans[Field[i][cur]] = color_e++;
				used [i] = true;
				
				Q.add(i);
			}
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




		
