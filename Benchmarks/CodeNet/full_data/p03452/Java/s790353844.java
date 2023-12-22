import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Random;
public class Main {
	static final long C =  1000000007;
	static final int CY = 1000000000;
	static final int INF = Integer.MAX_VALUE/2;
	StringBuilder sb;
	//セット
	class Set<F,S> {
		F f;
		S s;
		Set(F f, S s) {this.f = f;this.s = s;}
	}
	int[][] G;
	//Map<Integer,List<Integer>> Genb = new HashMap<>();
	int V;
	int E;
	int Venb;
	int Eenb;
	long START_TIME;
	int GenbSize;//Genbグラフの1辺
	Random rand = new Random();
	public void calc() {

		sb = new StringBuilder();


		//入力処理
		IO sc = new IO();
		int n = sc.nextInt();
		int m = sc.nextInt();
		//int[] l = new int[m], r = new int[m], d = new int[m];
		int[][] lrd = new int[m][3];
		for (int i=0; i < m; i++) {
			lrd[i][0] = sc.nextInt();
			lrd[i][1] = sc.nextInt();
			lrd[i][2] = sc.nextInt();
		}
		for (int i=0; i < m; i++) {
			if (lrd[i][0] > lrd[i][1]) {
				int t = lrd[i][0];
				lrd[i][0] = lrd[i][1];
				lrd[i][1] = t;
				lrd[i][2] *= -1;
			}
		}
		boolean ans = true;
		int[][] x = new int[n+1][n+1];
		for (int i=0; i < n+1; i++) {
			Arrays.fill(x[i], -INF);

		}
		for (int i=0; i < n+1; i++) {

			x[i][i] = 0;
		}
		Arrays.sort(lrd, (a,b)->a[0] -b[0]);
		/*for (int i=0; i < m; i++) {
			int l = lrd[i][0], r = lrd[i][1], d = lrd[i][2];
			System.err.println(l + "," + r + "," + d);
		}*/
		for (int i=0; i < m; i++) {
			int l = lrd[i][0], r = lrd[i][1], d = lrd[i][2];

			if (x[l][r] == -INF) {
				x[l][r] = x[l][l] + d;
				x[r][l] = x[r][r] - d;
			}else {
				if (x[l][r] != x[l][l] + d) {
					ans = false;
					break;
				}
			}
		}
		int[] a = new int[n+1];
		Arrays.fill(a, -INF);
		boolean[] b = new boolean[n+1];
		for (int i=1; i <= n; i++) {
			if (b[i]) {
				continue;
			}
			if (!msd(a,b,x,i,n)) {
				ans = false;
				//System.err.println(i);
				break;
			}
		}
		for (int i=1; i <=n; i++) {
			//System.err.println(a[i]);
		}



		System.out.println(ans?"Yes":"No");
	}
	boolean msd (int[] a,boolean[] b, int[][] x,int num,int n) {
		if (b[num]) return true;
		b[num] = true;
		boolean ret = true;
		/*for (int i=1; i <=n; i++) {
			System.err.println(a[i]);
		}*/
		for (int i=1; i <= n; i++) {
			if (x[num][i] != -INF && i != num) {
				if (a[i] == -INF && a[num] == -INF) {
					a[num] = 1;
					a[i] = a[num] + x[num][i];
				}
				else if (a[i] == -INF) {
					a[i] = a[num] + x[num][i];
				}else if (a[num] == -INF){
					a[num] = a[i] +x[i][num];
				}else {
					//System.err.println(a[num]+ "," + a[i] + "," + x[i][num]);
					if (a[num] - a[i] != x[i][num]) {
						ret = false;
						//System.err.println(a[num]+ "," + a[i] + "<" + x[i][num]);
						break;
					}

				}
				boolean r = msd(a,b,x,i,n);
				if (!r){
					ret = false;
					break;
				}

			}
		}
		return ret;
	}

	public static void main(String[] args) {
		Main main = new Main();
		main.calc();

	}
}
class IO extends PrintWriter {
	private final InputStream in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;

	public IO() { this(System.in);}
	public IO(InputStream source) { super(System.out); this.in = source;}
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
	private static boolean isNewLine(int c) { return c == '\n' || c == '\r';}
	public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
	public boolean hasNextLine() { while(hasNextByte() && isNewLine(buffer[ptr])) ptr++; return hasNextByte();}
	public String next() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while(isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	public char[] nextCharArray(int len) {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		char[] s = new char[len];
		int i = 0;
		int b = readByte();
		while(isPrintableChar(b)) {
			if (i == len) {
				throw new InputMismatchException();
			}
			s[i++] = (char) b;
			b = readByte();
		}
		return s;
	}
	public String nextLine() {
		if (!hasNextLine()) {
			throw new NoSuchElementException();
		}
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while(!isNewLine(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	public long nextLong() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
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
	public int nextInt() {
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) {
			throw new NumberFormatException();
		}
		return (int) nl;
	}
	public char nextChar() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		return (char) readByte();
	}
	public double nextDouble() { return Double.parseDouble(next());}
	public int[] nextIntArray(int n) { int[] a = new int[n]; for(int i=0;i<n;i++) a[i] = nextInt(); return a;}
	public long[] nextLongArray(int n) { long[] a = new long[n]; for(int i=0;i<n;i++) a[i] = nextLong(); return a;}
	public double[] nextDoubleArray(int n) { double[] a = new double[n]; for(int i=0;i<n;i++) a[i] = nextDouble(); return a;}
	public void nextIntArrays(int[]... a) { for(int i=0;i<a[0].length;i++) for(int j=0;j<a.length;j++) a[j][i] = nextInt();}
	public int[][] nextIntMatrix(int n,int m) { int[][] a = new int[n][]; for(int i=0;i<n;i++) a[i] = nextIntArray(m); return a;}
	public char[][] nextCharMap(int n,int m) { char[][] a = new char[n][]; for(int i=0;i<n;i++) a[i] = nextCharArray(m); return a;}
	public void close() { super.close(); try {in.close();} catch (IOException e) {}}
}