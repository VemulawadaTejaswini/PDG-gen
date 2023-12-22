import java.io.*;
import java.util.*;
 
public class Main {
 
	void submit() {
	    
	    int[][] A = new int[3][3];
	    for(int i=0; i<3; i++){
	        for(int j=0; j<3;j++){
	            A[i][j] = nextInt();
	        }
	    }

	    int N = nextInt();
	    int[] b = new int[N];
	    for(int i=0; i<N; i++){
	        b[i] = nextInt();
	    }
	    
	    // あたりよう
	    int[][] C = new int[3][3];
	    for(int i=0; i<3; i++){
	        for(int j=0; j<3;j++){
	            C[i][j] = 0;
	        }
	    }

	    for(int i=0; i<3; i++){
	        for(int j=0; j<3;j++){
	            for(int k=0; k<N; k++){
    	            if(A[i][j] == b[k]) C[i][j] = 1;
	            }
	        }
	    }

	    String flg = "Yes";

	    // 横チェック
	    for(int i=0; i<3; i++){
	        for(int j=0; j<3;j++){
    	        if(C[i][j] == 1) break;
    	        flg = "No";
	        }
	    }
	    // 縦チェック
	    for(int i=0; i<3; i++){
	        for(int j=0; j<3;j++){
    	        if(C[j][i] == 1) break;
        	    flg = "No";
	        }
	    }
	    // 斜めチェック
	    for(int i=0; i<3; i++){
    	    if(C[i][i] == 1) break;
    	    flg = "No";
	    }
	    out.println(flg);
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
