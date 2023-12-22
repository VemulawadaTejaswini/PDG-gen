import java.io.*;
import java.util.*;
import java.math.BigDecimal; 
 
public class Main {
 
	void submit() {
	    long a = nextLong();
	    long b = nextLong();
	    long c = nextLong();
	    
	    BigDecimal A = new BigDecimal(Math.sqrt(a));
	    BigDecimal B = new BigDecimal(Math.sqrt(b));
	    BigDecimal C = new BigDecimal(Math.sqrt(c));
	    
	    if((A.add(B).compareTo(C)) == 1){
	        out.println("No");
	    }else{
	        out.println("Yes");
	    }
	}
 
	void preCalc() {
 
	}
 
	void stress() {
 
	}
 
	void test() {
 
	}
 
	Main() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		preCalc();
		submit();
		//stress();
		//test();
		out.close();
	}
 
	static final Random rng = new Random();
 
	static int rand(int l, int r) {
		return l + rng.nextInt(r - l + 1);
	}
 
	public static void main(String[] args) throws IOException {
		new Main();
	}
 
	BufferedReader br;
	PrintWriter out;
	StringTokenizer st;
 
	String nextToken() {
		while (st == null || !st.hasMoreTokens()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return st.nextToken();
	}
 
	String nextString() {
		try {
			return br.readLine();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
 
	int nextInt() {
		return Integer.parseInt(nextToken());
	}
 
	long nextLong() {
		return Long.parseLong(nextToken());
	}
 
	double nextDouble() {
		return Double.parseDouble(nextToken());
	}
}