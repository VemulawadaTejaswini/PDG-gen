import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.TreeMap;

public class Main{
	static FastScanner sc = new FastScanner();
	static PrintWriter out = new PrintWriter(System.out);
	//static String S;
	//static String T;
	static int n;
	static int m;
	static TreeMap <Integer, Integer> map;
	
	public static void main(String[] args) {
		n = sc.nextInt();
		m = sc.nextInt();
		
		HashMap <Integer, Integer> year = new HashMap <Integer, Integer>();
		HashMap <Integer, Integer> pref = new HashMap <Integer, Integer>();
		map = new TreeMap <Integer, Integer>();
		
		for (int i=1; i<=m; i++) {
			int p = sc.nextInt();
			int y = sc.nextInt();
			//long sum = p*mod+y; 
			year.put(i, y);
			pref.put(i, p);
			map.put(y, i);
		}
		
		HashMap <Integer, Integer> ans = new HashMap <Integer, Integer>();
		HashMap <Integer, Integer> keys = new HashMap <Integer, Integer>();
		
		int num = 1;
		
		for (int i=1; i<=m; i++) {
			int key = map.firstKey();
			int ind = map.get(key);
			int p = pref.get(ind);
			
			if (keys.containsKey(p)) 
				num = keys.get(p)+1;
			
			else 
				num = 1;
			
			keys.put(p, num);
			ans.put(key, num);
			map.pollFirstEntry();
		}
		
		for (int i=1; i<=m; i++) {
			int y = year.get(i);
			int p = pref.get(i);
			num = ans.get(y);
		
			pref(p);
			year(num);
			out.println();
		}
		
		out.flush();
	}
	
	static void pref (int p) {
		int d = 0;
		int copy = p;
		while (p!=0) {
			p/=10;
			d++;
		}
		for (int i=0; i<6-d; i++)
			out.print(0);
		
		out.print(copy);
	}
	
	static void year (int y) {
		int d = 0;
		int copy = y;
		while (y!=0) {
			y/=10;
			d++;
		}
		for (int i=0; i<6-d; i++)
			out.print(0);
		
		out.print(copy);
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



