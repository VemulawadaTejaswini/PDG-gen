import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.lang.Math;

public class Main {
	public static void main(String[] args) {
		FS reader = new FS();
		// write reader
		String S = reader.next();
		char[] s = new char[S.length()];
		for (int i=0; i<S.length(); i++) {
		    s[i] = S.charAt(i);
		}
		
		boolean isAllSame = true;
		for (int i=0; i<S.length(); i++) {
		    if (S.charAt(i) != S.charAt(0)) isAllSame = false;
		}
		if (isAllSame) {
		    System.out.println(0);
		    return;
		}
		
		int ans = Integer.MAX_VALUE;
		for (int i=0; i<26; i++) {
		    int tmp = 0;
		    char cur = (char)('a'+i);
    		char[] sbase = s.clone();
    		while (true) {
    		    boolean isValid = true;
    		    char[] snew = new char[sbase.length-1];
    		    for (int j=0; j<snew.length; j++) {
    		        if (sbase[j] == cur || sbase[j+1] == cur) {
    		            snew[j] = cur;
    		        } else {
		                snew[j] = 'A';
		                isValid = false;
    		        }
    		    }
    		    tmp++;
    		    if (isValid) break;
    		    sbase = snew.clone();
    		}
    		ans = Math.min(ans, tmp);
		}
		
		System.out.println(ans);
	}
	
	public static void solver() {
		// write logic
	}
	
	// Read Class
	static class FS {
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
	
		private int readByte() { return hasNextByte() ? buffer[ptr++] : -1;}
		private boolean isPrintableChar(int c) {return 33 <= c && c <= 126;}
		private void skipUnprintable() {while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
	
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
		public int nextInt() {
			return (int)nextLong();
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
			while(true) {
				if ('0' <= b && b <= '9') {
					n *= 10;
					n += b - '0';
				} else if(b == -1 || !isPrintableChar(b)) {
					return minus ? -n : n;
				} else {
					throw new NumberFormatException();
				}
				b = readByte();
			}
		}
	}
}
