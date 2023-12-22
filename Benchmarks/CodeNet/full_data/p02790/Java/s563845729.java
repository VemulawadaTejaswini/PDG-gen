import java.io.*;
import java.util.*;
 
public class Main {
 
	void submit() {

        int a = nextInt();
        int b = nextInt();
        
        int sum_a=a;
        int sum_b=b;
        int kaijo = 1;


        for(int i=0; i<b-1; i++){
            kaijo *= 10;
            sum_a += a * kaijo;
        }

        kaijo = 1;

        for(int i=0; i<a-1; i++){
            kaijo *= 10;
            sum_b += b * kaijo;
        }

        if(sum_a>sum_b){
    	    out.println(sum_a);
        }else{
    	    out.println(sum_b);            
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