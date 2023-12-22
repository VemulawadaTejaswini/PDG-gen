import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.TreeSet;
 
 
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
		Random r = new Random();
		int K = r.nextInt(200000);
		out.println("200000 "+K);
		for(int i=0; i<199999; i++){
			out.print(r.nextInt(200000));
			out.print(" ");
		}
		out.println(r.nextInt(200000));
		out.flush();
	}
	
	/*
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	/*/
	InputUtil in = new InputUtil();
	PrintWriter out = new PrintWriter(System.out);
	//*/
	int N = 0;
	int K = 0;
	int[] A = null;
	int[] C = null;
	TreeSet<DataBean> data = new TreeSet<>();
	long ans = 0;
	
	public void input() throws IOException {
		/*
		S = br.readLine();
		/*/
		N = in.nextInt();
		K = in.nextInt();
		A = in.nextInt(new int[N]);
		//*/
	}
 
	public void solve() throws IOException {
		C = new int[200000];
		int maxVal = 0;
		for(int a: A){
			C[a] ++;
			maxVal = Math.max(maxVal, a);
		}
		DataBean tmpData = new DataBean();
		for(int i=0; i<=maxVal; i++){
			if(C[i]>0){
				tmpData.number=i;
				tmpData.count=C[i];
				data.add(tmpData.clone());
			}
		}
		int shurui = 0;
		for(DataBean db: data){
			shurui++;
			if(shurui > K){
				ans += db.count;
			}
		}
	}
	
 
	
	public void output() {
		out.println(ans);
		out.flush();
	}
}

class DataBean implements Comparable<DataBean> {
	int number;
	int count;
	
	public DataBean(){}
	public DataBean(int n, int c){
		number=n;
		count=c;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + count;
		result = prime * result + number;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DataBean other = (DataBean) obj;
		if (count != other.count)
			return false;
		if (number != other.number)
			return false;
		return true;
	}
	@Override
	public int compareTo(DataBean o) {
		int ret = 0;
		ret = Integer.compare(o.count, this.count);
		if(ret == 0)
			ret = Integer.compare(o.number, this.number);
		return ret;
	}
	
	public DataBean clone() {
		return new DataBean(number,count);
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