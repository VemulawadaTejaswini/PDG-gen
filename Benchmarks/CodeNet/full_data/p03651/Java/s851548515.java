import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
  
public class Main {
    public static void main(String[] args) throws IOException {
        new Main().exec();
    }
    
    public void exec() throws IOException {
    	InputUtil in = new InputUtil();
        PrintWriter out = new PrintWriter(System.out);
    	
        int N = in.nextInt();
        int K = in.nextInt();
    	int[] A = in.nextInt(new int[N]);
    	
    	long gcd = A[0];
    	long max = A[0];
    	boolean existsK = false;
    	for(int i=1; i<N; i++) {
    		if(A[i] == K){
    			existsK = true;
    			break;
    		}
    		if(gcd>1){
    			gcd = getGcd(gcd,A[i]);
    		}
    		max = Math.max(max, A[i]);
    	}
        out.println((existsK || (K%gcd==0 && K<max))?"POSSIBLE":"IMPOSSIBLE");
    	out.flush();
    }
    
    public long getGcd(long a, long b) {
    	long tmp;
    	if(a < b) {
    		tmp=a; a=b;b=tmp;
    	}
    	while (a%b != 0){
    		tmp = a%b;
    		if(tmp > b){
        		a = tmp;
    		} else {
    			a = b;
    			b = tmp;
    		}
    	}
    	return b;
    }
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
	public InputUtil(InputStream in, int bufsiz) {
		initBuf(bufsiz);
		initIn(in);
	}
	
	//Methods
	//Initializer
	protected void initIn(InputStream in) {br = new BufferedReader(new InputStreamReader(this.in = in));}
	protected void initBuf(int bufsiz) {buf = new char[bufsiz];}
	
	//buffer operation
	private void next() throws IOException {ptr++; readBuf();}
	private void readBuf() throws IOException {
		if(ptr >= max && br.ready()) {
			max = br.read(buf);
			ptr = 0;
		}
	}

	//Number Input Reader/Parser
	private boolean isNum(char b) {return '0' <= b && b <= '9'; }
	private boolean isMinus(char b) {return b=='-'; }

	private int _nextInt() throws IOException {
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