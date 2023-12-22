import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
 
 
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
	int N = 0;
	int H = 0;
	int[] a = null;
	int[] b = null;
	ArrayList<Long> ab = null;
	long ans = 0;
	
	public void input() throws IOException {
		/*
		S = br.readLine().toCharArray();
		/*/
		N = in.nextInt();
		H = in.nextInt();
		a = new int[N];
		b = new int[N];
		ab = new ArrayList<>();
		for(int i=0; i<N; i++){
			a[i] = in.nextInt();
			b[i] = in.nextInt();
			setAB(a[i],i,2);
			if(a[i] < b[i]) {
				setAB(b[i],i,1);
			}
		}
		//*/
		
	}
	
	private void setAB(int attackPt, int katanaNo, int attackKind) {
		long tmp  = attackKind;
		tmp = attackPt-1;
		tmp *= 1000000;
		tmp += attackKind * 100000 + katanaNo;
		ab.add(tmp);
	}

	private int getAttackPtFromAB(int i) {
		return (int)(ab.get(i)/1000000 + 1);
	}
	private int getKatanaNoFromAB(int i) {
		return (int)(ab.get(i)%100000) ;
	}
	private int getAttackKindFromAB(int i) {
		return (int)(ab.get(i)%1000000/100000);
	}
	
	public void solve() throws IOException {
		Collections.sort(ab);
		for(int i=ab.size()-1; i>=0 && H > 0; i--) {
			int atk = getAttackPtFromAB(i);
			//int ktnNo = getKatanaNoFromAB(i);
			int aorb = getAttackKindFromAB(i);
			if(aorb == 2){
				ans += (long)(H/atk) + ((H%atk==0)?0:1);
				break;
			} else {
				H -= atk;
				ans ++;
			}
		}
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