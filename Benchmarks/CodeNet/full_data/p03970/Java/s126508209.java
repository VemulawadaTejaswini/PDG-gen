import java.io.*;
import java.util.*;
import java.math.BigDecimal; 
 
public class Main {
 
	void submit() {
	    String missString = nextString;	    
	    char[] missChar= missString.toCharArray();

	    String seikaiString = "CODEFESTIVAL2016";
	    char[] seikaiChar = seikaiString.toCharArray();
	    
	    int kaisu = 0;

	    for(int i=0; i<seikaiString.length(); i++){
	        if(missChar[i] != seikaiChar[i]) kaisu++;
	    }
	    out.println(kaisu);
	    
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