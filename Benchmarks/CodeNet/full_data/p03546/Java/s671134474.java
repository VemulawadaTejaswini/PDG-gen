import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;


public class Main {
	
	public static void main(String[] args) throws IOException {
		Main m = new Main();
		m.input();
		m.solve();
		m.output();
	}
	/*
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	/*/
	InputUtil in = new InputUtil();
	PrintWriter out = new PrintWriter(System.out);
	//*/
	int H = 0;
	int W = 0;
	int[] c = null;
	int[] A = null;
	int ans = 0;
	
	public void input() throws IOException {
		/*
		S = br.readLine();
		/*/
		H = in.nextInt();
		W = in.nextInt();
		c = in.nextInt(new int[100]);
		A = in.nextInt(new int[H*W]);
		//*/
	}

	public void solve() throws IOException {
		int[] min1 = new int[100];
		int[] min2 = new int[100];
		for(int i=0; i<100; i++) {
			min1[i] = c[i];
			min2[i] = 10000;
		}
		Arrays.sort(min1);
		for(int i=0; i<100; i++) {
			if(i>0 && min1[i-1] == min1[i]){
				continue;
			}else if(i==0 || min1[i-1]==0){
				int val = min1[i];
				for(int j=0; j<100; j++) {
					if(c[j] == val){
						min2[j] = val;
					}
				}
			}else if(min1[i-1] < min1[i]){
				int val = min1[i];
				for(int j=0; j<100; j++) {
					int s = j/10;
					int t = j%10;
//					if(s==8 && t==1){
//						System.out.println("aaa");
//					}
					if(c[j] == val){
						min2[j] = solveSub(0,s,t,val,min2,0);
					}
				}
			}
		}
		
		for(int i=0; i<W; i++){
			for(int j=0; j<H; j++){
				int val = A[j*W+i];
				if(val != -1){
					ans += min2[val*10+1];
				}
			}
		}
	}
	
	private int solveSub(int cost, int i, int j, int def, int[] matrix, int check) {
		int ret = def;
		if(i==j){
			ret = cost;
		}else{
			for(int n=0; n<10; n++) {
				if((check & (1<<n)) > 0){
					continue;
				}else if(cost + matrix[i*10+n] < ret){
					ret = Math.min(ret, solveSub(cost + matrix[i*10+n],n,j,ret,matrix,(check|(1<<n))));
				}else{
					continue;
				}
			}
		}
		return ret;
	}
	
	

	public void output() {
		out.println(ans);
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
