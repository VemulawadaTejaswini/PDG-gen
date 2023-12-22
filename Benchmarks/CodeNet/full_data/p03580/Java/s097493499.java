import static java.lang.System.out;
import java.lang.Math;
import java.io.InputStream;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Collections;

public class Main {
	public static void main(String args[]) {
		new Main().run();
	}

	MyInput in = new MyInput();
	public void run() {
      int N = in.nextInt();
      String s = in.next();
      boolean[] ts = new boolean[N];
      for(int i = 0; i < N; i++){
          ts[i] = s.charAt(i) == '1' ? true : false;
      }
      int f = 1;
      int l = N - 2;
      int count = 0;
      for(;;){
          if(f == N - 1 || l == 0) break;
          fyou: for(;;) {
              if(f == N - 1) break;
              if(ts[f-1] && !ts[f] && ts[f+1]) {
                  count++;
                  ts[f - 1] = false;
                  ts[f] = true;
                  ts[f + 1] = false;
                  f = 1;
                  break fyou;
              } else {
                  f++;
              }
          }

          lyou: for(;;) {
              if(l == 0) break;
              if(ts[l-1] && !ts[l] && ts[l+1]) {
                  count++;
                  ts[l - 1] = false;
                  ts[l] = true;
                  ts[l + 1] = false;
                  l = N - 2;
                  break lyou;
              }else {
                  l--;
              }
          }
      }
      out.println(count);
	}
}

class MyInput {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr= 0;
	private int buflen = 0;
	private boolean hasNextByte() {
		if(ptr < buflen) {
			return true;
		}else {
			ptr = 0;
			try {
				buflen = in.read(buffer);
			} catch(IOException e) {
				e.printStackTrace();
			}
			if(buflen <= 0) {
				return false;
			}
		}
		return true;
	}

	public int readByte() { 
		if (hasNextByte()) return buffer[ptr++];
		else return -1;
	}

	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <=126;
	}

	private void skipUnprintable() {
		while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
	}

	public boolean hasNext() {
		skipUnprintable();
		return hasNextByte();
	}

	public String next() {
		if(!hasNext()) throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while(isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	public long nextLong() {
		if(!hasNext()) throw new NoSuchElementException();
		long n = 0;
		boolean minus = false;
		int b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if(b < '0' || '9' < b) {
			throw new NumberFormatException();
		}
		while(true) {
			if('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			}else if(b == -1 || !isPrintableChar(b)) {
				return minus ? -n : n;
			}else {
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}

	public int nextInt() {
		long nl = nextLong();
		if(nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
		return (int) nl;
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}
}