import java.io.*;
import java.util.*;
 
public class Main {
 
	void submit() {
	    int N = nextInt();
	    int[] A = new int[N];

	    for(int i=0; i<N; i++){
	        A[i] = nextInt();
	    }
	    
	    int max_count=1;
	    
	    for(int i=0; i<N-1; i++){
            int tmp_minus = 1;
            int tmp_equal = 1;
            int tmp_plus = 1;

	        for(int j=i+1; j<N; j++){
                if((A[i]-1)==(A[j]-1) || (A[i]-1)==A[j] || (A[i]-1)==(A[j]+1)){
                    tmp_minus++;
                }
                if(A[i]==(A[j]-1) || A[i]==A[j] || A[i]==(A[j]+1)){
                    tmp_equal++;
                }
                if((A[i]+1)==(A[j]-1) || (A[i]+1)==A[j] || (A[i]+1)==(A[j]+1)){
                    tmp_plus++;
                }
            }
            if(max_count<tmp_minus){
                max_count = tmp_minus;
            }else if(max_count<tmp_equal){
                max_count = tmp_equal;
            }else if(max_count<tmp_plus){
                max_count = tmp_plus;
            }
	    }
        out.println(max_count);
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