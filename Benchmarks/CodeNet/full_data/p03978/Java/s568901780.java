import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.NoSuchElementException;

public class Main {
	static FastScanner sc = new FastScanner();
	static PrintStream out = System.out;

	public static void main(String args[]) {
		int N = ni();
		int flg[] = new int[N*2+1];
		int l = N-1, r = N;

		while(true) {
			boolean isCheck = false;
			for (int i=0;i<4;i++) {
				flg[r] = i;
				output(flg, l+1, r+1);

				String ret = next();
				if (ret.equals("T")) {
					isCheck = true;
					r++;
					break;
				} else if (ret.equals("end")) {
					return;
				}
			}

			if (isCheck == false) break;
		}


		while(true) {
			boolean isCheck = false;
			for (int i=0;i<4;i++) {
				flg[l] = i;
				output(flg, l, r);

				String ret = next();
				if (ret.equals("T")) {
					isCheck = true;
					l--;
					break;
				} else if (ret.equals("end")) {
					return;
				}
			}

			if (isCheck == false) break;
		}
}

	public static void output(int flg[], int l, int r) {
		for (int i=l;i<r;i++) {
			int s = flg[i];
			switch(s) {
			case 0: case 2: out.printf("."); break;
			case 1: case 3: out.printf("#"); break;
			}
		}
		out.println();

		for (int i=l;i<r;i++) {
			int s = flg[i];
			switch(s) {
			case 0: case 1: out.printf("."); break;
			case 2: case 3: out.printf("#"); break;
			}
		}
		out.println();
		out.flush();
	}

	private static String next() {
		return sc.next();
	}

	private static int ni() {
		return sc.nextInt();
	}

	private static long nl() {
		return sc.nextLong();
	}

	private static int[] na(int n) {
		int[] a = new int[n];
		for(int i = 0;i < n;i++) a[i] = ni();
		return a;
	}

	private static long[] nal(int n) {
		long[] a = new long[n];
		for(int i = 0;i < n;i++) a[i] = ni();
		return a;
	}

    private static double nd() {
        return Double.parseDouble( next() );
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
    public int nextInt() {
        if (!hasNext()) throw new NoSuchElementException();
        int n = 0;
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
}
