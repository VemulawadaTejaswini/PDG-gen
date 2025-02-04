import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
 
 
public class Main {
	
	public static void main(String[] args) throws IOException {
		Main m = new Main();
		//*
		m.input();
		m.solve();
		m.output();
		/*/
		m.debug();
		//*/
	}
	
	public void debug() {
	}
	
	/*
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	/*/
	InputUtil in = new InputUtil();
	//*/
	PrintWriter out = new PrintWriter(System.out);
	//char[] S = null;
	int K = 0;
	int[] A = null;
	long maxN = 0;
	long minN = 0;
	
	public void input() throws IOException {
		/*
		S = br.readLine().toCharArray();
		/*/
		K = in.nextInt();
		A = in.nextInt(new int[K]);
		//*/
		
	}

	public void solve() throws IOException {
		if(K==1){
			if(A[0]==2){
				minN=2;
				maxN=3;
			}else{
				minN=-1;
				maxN=-1;
			}
		}else{
			for(int i=K-1; i>0; i--) {
				int Anow = A[i];
				int Apre = A[i-1];
				if(i==K-1) {
					if(Anow != 2) {
						minN = -1;
						maxN = -1;
						return;
					}
					minN = Anow;
					maxN = Anow*2-1;
				}else{
					maxN += Anow-1;
				}
				
				if(Apre > maxN) {
					minN = -1;
					maxN = -1;
					return;
				}
				
//				if(minN%Apre != 0){
//					minN = (minN/Apre)*Apre + Apre;
//				}
				minN = ((minN/Apre)+((minN%Apre==0)?0:1))*Apre;
				maxN = (maxN/Apre)*Apre;
				if(minN>maxN){
					minN = -1;
					maxN = -1;
					return;
				}
			}
			
			maxN += A[0] - 1;
		}
	}
	
	
	
	public void output() {
		if(minN == -1){
			out.println("-1");
		}else{
			out.println(minN + " " + maxN);
		}
		out.flush();
	}
}

//*
class InputUtil {
	//Static Fields
	private static final int BUFSIZ = 100000;
	
	//Fields
	protected InputStream in;
	private byte[] buf = null;
	private int ptr = 0;
	private int max = -1;
	private DataInputStream dis = null;
	//Constructors
	public InputUtil() {this(System.in,BUFSIZ);}
	public InputUtil(InputStream in, int bufsiz) {
		initBuf(bufsiz);
		initIn(in);
	}
	
	//Methods
	//Initializer
	protected void initIn(InputStream in) {dis = new DataInputStream(this.in = in);}
	protected void initBuf(int bufsiz) {buf = new byte[bufsiz];}
	
	//buffer operation
	private void next() throws IOException {ptr++; readBuf();}
	private void readBuf() throws IOException {
		if(ptr >= max && dis.available()>0) {
			if(max>0) Arrays.fill(buf,0,max,(byte)0);
			max = dis.read(buf);
			ptr = 0;
		}
	}
	
	//Number Input Reader/Parser
	private boolean isNum(byte b) {return '0' <= b && b <= '9'; }
	private boolean isMinus(byte b) {return b=='-'; }
 
	private int _nextInt() throws IOException {
		int sign = 1;
		int res = 0;
		byte c;
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
		return sign * res;
	}
	
	public int nextInt() throws IOException {
		readBuf();
		return _nextInt();
	}
 
	public int[] nextInt(int[] result) throws IOException {
		readBuf();
		for(int i=0; i<result.length; i++) {
			result[i] = _nextInt();
		}
		return result;
	}
	
	//Close 
	public void close() throws IOException {
		if(!this.in.equals(System.in)) 
			this.in.close();
	}
}
//*/
