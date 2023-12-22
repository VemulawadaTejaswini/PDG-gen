import java.io.InputStream;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	public static void main(String args[]) {
		MyInput in = new MyInput();
    int N = in.nextInt();
    int[] lens = new int[N];
    int[] chl = new int[N];
    for(int i = 0; i < N; i++) {
        lens[i] = in.nextInt();
    }
    Arrays.sort(lens);

    int ans = 1;

    int inch = 0;
    int insize = 0;
    boolean chb = false;
    int tmp;

    int len;
    int finc = 0;
    for(int i = N - 1; i >= 0; i--) {
        len = lens[i];
        for(int j = 0; j < insize; j++) {
            if(chl[j] == len) {
                chb=true;
                inch = j;
            }
        }
        if(chb) {
            for(int j = inch; j < insize; j++) {
                tmp = chl[j];
                chl[j] = chl[j+1];
                chl[j+1] = tmp;
            }
            insize--;
            ans *= len;
            finc++;
        }else {
            chl[insize] = len;
            insize++;
        }
        chb = false;
        if(finc >= 2) break;
    }

    if(finc >= 2) {
        System.out.println(ans);
    }else{
        System.out.println("0");
    }
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
