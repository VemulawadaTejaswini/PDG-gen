import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Main {
	private static FastScanner sc = new FastScanner();

	public static void main(String[] args) {
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		ArrayList<Set> list = new ArrayList<>();
		for(int i=0; i<N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			K -= b;
			if(K <= 0) {
				System.out.println(a);
				return;
			}
		}
		
		list.sort((x, y)-> x.a - y.a );
		
		for(int i=0; i<N; i++) {
			
		}

	}
	
	static class Set {
		int a;
		int b;
		public Set(int a, int b) {
			this.a = a;
			this.b = b;
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
	    private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
	    public boolean hasNext() { skipUnprintable(); return hasNextByte();}
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
	        return Long.parseLong(next());
	    }
	    public int nextInt(){
	    	return Integer.parseInt(next());
	    }
	}

}