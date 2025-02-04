import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {

	static int ans=0;
	static int[][] lines;
	static boolean[] path;
	static boolean[][] connected;
	
	public static void main(String[] args) {

		FastScanner sc = new FastScanner();
		int N=sc.nextInt();
		int M=sc.nextInt();
		lines=sc.nextIntsNM(M, 2);
		connected=new boolean[N][N];
		for(int i=0;i<M;i++) {
			connected[lines[i][0]-1][lines[i][1]-1]=true;
			connected[lines[i][1]-1][lines[i][0]-1]=true;
		}
		path=new boolean[N];
		solver(0,path);
		System.out.println(ans);

	}

	public static void solver(int point,boolean[] path) {
		if(path[point]) {
			return;
		}
		path[point]=true;
		for(int i=0;i<path.length;i++) {
			if(!path[i]) {
				break;
			}
			if(i==path.length-1) {
				ans++;
				break;
			}
		}
		for(int i=0;i<path.length;i++) {
			if(connected[point][i]) {
				solver(i, path);
			}
		}
		
		path[point]=false;
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
		if (hasNextByte())
			return buffer[ptr++];
		else
			return -1;
	}

	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}

	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
		return hasNextByte();
	}

	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	public long nextLong() {
		if (!hasNext())
			throw new NoSuchElementException();
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
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
			throw new NumberFormatException();
		return (int) nl;
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}
	
	public char[][] nextCharsHW(int H,int W){
		char[][] chars=new char[H][W];
		for(int i=0;i<H;i++) {
			String str=next();
			for(int j=0;j<W;j++) {
				chars[i][j]=str.charAt(j);
			}
		}
		return chars;
	}
	
	public int[][] nextIntsNM(int N,int M){
		int[][] ints=new int[N][M];
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				ints[i][j]=nextInt();
			}
		}
		return ints;
	}
}
