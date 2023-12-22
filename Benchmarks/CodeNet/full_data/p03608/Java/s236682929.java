import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Main {
	
	public static void main(String[] args) throws IOException {
		new Main().exec();
	}

	public void exec() throws IOException {
		InputUtil in = new InputUtil();
		PrintWriter out = new PrintWriter(System.out);
		int N = in.nextInt();
		int M = in.nextInt();
		int R = in.nextInt();
		Integer[] r = new Integer[R];
		for(int i=0; i<R; i++){
			r[i] = in.nextInt()-1;
		}
		int[][] dist = new int[N][N];
		for(int i=0; i<N; i++)
			Arrays.fill(dist[i], Integer.MAX_VALUE);
		for(int i=0; i<M; i++) {
			Integer A = in.nextInt()-1;
			Integer B = in.nextInt()-1;
			Integer C = in.nextInt();
			dist[A][B]=dist[B][A]=C;
		}
		
		for(int k=0; k<N; k++) {
			for(int i=0; i<N; i++) {
				for(int j=i+1; j<N; j++) {
					if(i==k || k==j) continue;
					dist[j][i] = dist[i][j] = Math.min(dist[i][j], dist[i][k]+dist[k][j]);
				}
			}
		}
		
		
		
		out.println(calcDist(R,dist,r));
		out.flush();
	}
	
	private int calcDist(int n, int[][] dist, Integer[] r){
		return permutation(n,dist,r,new LinkedHashSet<Integer>());
	}
	
	private int permutation(int n, int[][] dist, Integer[] r, LinkedHashSet<Integer> perm){
		if(n<=perm.size()){
			return calcDistCore(perm,dist,r);
		}else{
			int min = Integer.MAX_VALUE;
			for(int i=0; i<n; i++){
				if(perm.contains(i))
					continue;
				perm.add(i);
				min = Math.min(min, permutation(n,dist,r,perm));
				perm.remove(i);
			}
			return min;
		}
	}
	
	private int calcDistCore(LinkedHashSet<Integer> perm, int[][] dist, Integer[] r){
		int pre = -1;
		int distSum = 0;
		for(int now: perm){
			if(pre != -1){
				distSum += dist[r[pre]][r[now]];
			}
			pre = now;
		}
		return distSum;
	}
	
	
}



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