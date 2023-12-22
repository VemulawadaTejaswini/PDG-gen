import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner(System.in);
		Map<Integer,Integer> map = new HashMap<>();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < 9; i++) {
			map.put(sc.nextInt(),i);
		}
		int n = sc.nextInt();
		
		while(n>0) {
			int e = sc.nextInt();
			if(map.containsKey(e)) {
				list.add(map.get(e));
			}
			n--;
		}

		if(checklist(list)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}
	
	

	static boolean checklist(List<Integer> map) {
		if((map.contains(0) && map.contains(1) && map.contains(2))
				||(map.contains(3) && map.contains(4) && map.contains(5))
				||(map.contains(6) && map.contains(7) && map.contains(8))
				||(map.contains(0) && map.contains(3) && map.contains(6))
				||(map.contains(4) && map.contains(7) && map.contains(1))
				||(map.contains(2) && map.contains(5) && map.contains(8))
				||(map.contains(0) && map.contains(4) && map.contains(8))
				||(map.contains(6) && map.contains(4) && map.contains(2))) {
			return true;
		}else {
			return false;
		}

	}

	static class FastScanner {
		private BufferedReader reader = null;
	    private StringTokenizer tokenizer = null;
	    private final InputStream in = System.in;
	    public FastScanner(InputStream in) {
	        reader = new BufferedReader(new InputStreamReader(in));
	        tokenizer = null;
	    }

	    public String next() {
	        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
	            try {
	                tokenizer = new StringTokenizer(reader.readLine());
	            } catch (IOException e) {
	                throw new RuntimeException(e);
	            }
	        }
	        return tokenizer.nextToken();
	    }

	    public String nextLine() {
	        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
	            try {
	                return reader.readLine();
	            } catch (IOException e) {
	                throw new RuntimeException(e);
	            }
	        }

	        return tokenizer.nextToken("\n");
	    }

	    public long nextLong() {
	        return Long.parseLong(next());
	    }

	    public int nextInt() {
	        return Integer.parseInt(next());
	    }

	    public double nextDouble() {
	         return Double.parseDouble(next());
	     }

	    public int[] nextIntArray(int n) {
	        int[] a = new int[n];
	        for (int i = 0; i < n; i++)
	            a[i] = nextInt();
	        return a;
	    }

	    public long[] nextLongArray(int n) {
	        long[] a = new long[n];
	        for (int i = 0; i < n; i++)
	            a[i] = nextLong();
	        return a;
	    }

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
	    private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
	    public boolean hasNext() { skipUnprintable(); return hasNextByte();}
	}
}