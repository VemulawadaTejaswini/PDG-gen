import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


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
	int N = 0;
	int C = 0;
	List<ProgramInfo> pgInfoList = new LinkedList<>();
	Map<Integer,ProgramInfo> pgInfoChannelMap = new HashMap<>();
	boolean[] pgInfoRemoved = null;;
	long ans = 0;
	
	public void input() throws IOException {
		/*
		S = br.readLine();
		/*/
		N = in.nextInt();
		C = in.nextInt();
		for(int i=0; i<N; i++) {
			ProgramInfo pgInfo = new ProgramInfo();
			pgInfo.s = in.nextInt();
			pgInfo.t = in.nextInt();
			pgInfo.c = in.nextInt();
			pgInfoList.add(pgInfo);
		}
	}

	public void solve() throws IOException {

		Collections.sort(pgInfoList);
		
		int[] counter = new int[100002];
		for(int i=0; i<pgInfoList.size();i++){
			ProgramInfo p = pgInfoList.get(i);
			boolean merge = false;
			if(pgInfoChannelMap.containsKey(p.c)){
				ProgramInfo pgInfo2 = pgInfoChannelMap.get(p.c);
				if(pgInfo2.t == p.s){
					counter[pgInfo2.t+1]++;
					counter[pgInfo2.t]--;
					pgInfo2.t = p.t;
					merge = true;

				}
			}
			if(!merge)
				pgInfoChannelMap.put(p.c, p);
			counter[p.s] ++;;
			counter[p.t+1] --;
		}
		int count = 0;
		int max = 0;
		for(int i=1; i<100002; i++){
			count += counter[i];
			max = Math.max(max, count);
		}
		ans = max;
	}
	

	
	public void output() {
		out.println(ans);
		out.flush();
	}
}

class ProgramInfo implements Comparable<ProgramInfo>{
	public int s;
	public int t;
	public int c;
	
	@Override
	public String toString() {
		return "s="+s+",t="+t+",c="+c;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + c;
		result = prime * result + s;
		result = prime * result + t;
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
		ProgramInfo other = (ProgramInfo) obj;
		if (c != other.c)
			return false;
		if (s != other.s)
			return false;
		if (t != other.t)
			return false;
		return true;
	}

	@Override
	public int compareTo(ProgramInfo o) {
		int ret = Integer.compare(s, o.s);
		if(ret == 0){
			ret = Integer.compare(t, o.t);
		}
		if(ret == 0){
			ret = Integer.compare(c, o.c);
		}
		return ret;
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
