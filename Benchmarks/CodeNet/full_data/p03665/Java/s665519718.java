import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;

/**
 * --------------------------------------------------
 * Main Class
 * --------------------------------------------------
 */
public class Main {
	private CPFUtil cpfUtil = new CPFUtil();

	public void exec() throws IOException {
		InputUtil input = new InputUtil();
		PrintWriter out = new PrintWriter(System.out);

		int n = input.nextInt();
		int p = input.nextInt();
		int[] a = input.nextInt(new int[n]);
		int[] gkn = {0, 0};
		for (int i=0; i<n; i++) {
			gkn[a[i]%2]++;
		}
		long ans= 0;
		for (int k=p; k<=gkn[1]; k+=2) {
			for (int l=0; l<=gkn[0]; l++) {
				ans += cpfUtil.getC(gkn[1], k).longValue() * cpfUtil.getC(gkn[0],l).longValue();
			}
		}

		out.println(ans);
		out.flush();
		input.close();
	}

	public static void main(String[] args) throws IOException {
//		long time = System.currentTimeMillis();
		new Main().exec();
//		System.out.println(System.currentTimeMillis() - time);
	}
}

/**
 * --------------------------------------------------
 * C,P,F Operation Utility
 * --------------------------------------------------
 */
class CPFUtil {
	//Static Fields
	public static final int CAPACITY_F = 50;
	
	//Fields
	protected int capacity = CAPACITY_F;
	private BigInteger[] Farray = null;;

	//Constructors
	public CPFUtil() {
		initF();
	}
	public CPFUtil(int cap) {
		capacity=cap;
		initF();
	}
	
	//Methods
	//Initializer
	protected void initF() {
		if(Farray != null) return;
		Farray = new BigInteger[capacity+1];
		BigInteger bn=BigInteger.ZERO;
		for(int n=0; n<Farray.length; n++) {
			Farray[n] = (n==0) ? BigInteger.ONE : Farray[n-1].multiply(bn);
			bn = bn.add(BigInteger.ONE);
		}
	}

	//Factorial Operation
	public BigInteger getF(long n) {return Farray[(int)n];}

	//Permutation Operation
	protected BigInteger calcP(long n, long r) {
		if (n < 0 || r < 0 || n < r) throw new IllegalArgumentException("n=" +n+ ",r=" +r);
		if (n <= 1 || r == 0) return BigInteger.ONE;
		if (r == 1) return new BigInteger(String.valueOf(n));
		return getF(n).divide(getF(n-r));
		
	}

	public BigInteger getP(long n, long r) {return calcP(n, r);}

	//Combination Operation
	protected BigInteger calcC(long n, long r) {
		if(n < 0 || r < 0 || n < r) throw new IllegalArgumentException("n=" +n+ ",r=" +r);
		if(n == 0 || n == 1) return BigInteger.ONE;
		if(n - r < r) r = n - r;
		return getF(n).divide(getF(r)).divide(getF(n-r));
	}
	
	public BigInteger getC(long n, long r) {
		return calcC(n,r);
	}
	public BigInteger getH(long n, long r) {return calcC(n+r-1, r);}

}
/**
 * --------------------------------------------------
 * Input Utility
 * --------------------------------------------------
 */
class InputUtil {
	//Static Fields
	private static final int BUFSIZ = 50000;
	
	//Fields
	protected InputStream in;
	private char[] buf = null;
	private int ptr = 0;
	private int max = -1;
	private BufferedReader br = null;
	
	//Constructors
	public InputUtil() {this(System.in,BUFSIZ);}
	public InputUtil(int bufsiz) {this(System.in,bufsiz);}
	public InputUtil(InputStream in) {this(in,BUFSIZ);}
	public InputUtil(InputStream in, int bufsiz) {
		initBuf(bufsiz);
		initIn(in);
	}
	
	//Methods
	//Initializer
	protected void initIn(InputStream in) {br = new BufferedReader(new InputStreamReader(this.in = in));}
	protected void initBuf(int bufsiz) {buf = new char[bufsiz];}
	
	//String Input Reader/Parser
	private void readBuf() throws IOException {
		if(ptr >= max && br.ready()) {
			max = br.read(buf);
			ptr = 0;
		}
	}
	
	public BufferedReader getReader() {return br;}
	
	//Number Input Reader/Parser
	private boolean isNum(char b) {return '0' <= b && b <= '9'; }
	private boolean isMinus(char b) {return b=='-'; }
	private boolean isCrLf(char b) {return b == '\r' || b == '\n'; }
	private void next() throws IOException {ptr++; readBuf();}

	private void skipOneCrLf() throws IOException {
		char c = buf[ptr];
		if (isCrLf(c)) {
			ptr++;
			if (c == '\r') {
				readBuf();
				if (ptr < max && buf[ptr] == '\n') {
					ptr++;
				}
			}
		}
	}


	public String nextLine() throws IOException {
		StringBuilder sb = new StringBuilder();
		for(readBuf(); ptr < max ;readBuf()) {
			char c = buf[ptr];
			if(isCrLf(c)) {
				skipOneCrLf();
				break;
			}else{
				int strPtr = ptr++;
				int endPtr = -1;
				for(int i = ptr; i<max; i++) {
					if(isCrLf(buf[i])) {
						endPtr = i;
						break;
					}
				}
				if(endPtr == -1) endPtr = max;
				sb.append(String.valueOf(buf, strPtr, endPtr-strPtr)); 
				ptr = endPtr;
			}
		}
		return sb.toString();
	}
	
	public int nextInt() throws IOException {return nextInt(new int[1])[0];}
	public int[] nextInt(int[] result) throws IOException {
		readBuf();
		for(int i=0; i<result.length; i++) {
			int sign = 1;
			int res = 0;
			char c;
			while (!isNum(c=buf[ptr]) && !isMinus(c)) 
				next();
			if (isMinus(buf[ptr])) {
				sign = -1;
				next();
			}
			while (isNum(c=buf[ptr])) {
				res *= 10;
				res += c - '0' ;
				next();
			}
			next();
			result[i] = sign * res;
		}
		return result;
	}
	
	//Close 
	public void close() throws IOException {
		if(!this.in.equals(System.in)) 
			this.in.close();
	}

}