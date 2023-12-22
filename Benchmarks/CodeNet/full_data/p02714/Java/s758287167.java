import java.util.*;
import java.io.*;

public class Main {	

	private static void solve(){
		//Implement solution here.
		int N = ni();
		char[] S = next().toCharArray();
		int[][] map = new int[3][N];
		for(int i = N - 1; i >= 0; i--) {
			if(i < N - 1) for(int j = 0; j < 3; j++)map[j][i] = map[j][i + 1];
			if(S[i] == 'R') {
				map[0][i]++;
			} else if(S[i] == 'G') {
				map[1][i]++;
			} else {
				map[2][i]++;
			}			
		}
		long result = 0;
		for(int i = 0; i < N - 2; i++) {
			for(int j = i + 1; j < N - 1; j++) {
				if(S[i] == S[j]) {
					continue;
				} else {
					if((S[i] == 'R' && S[j] == 'G') || (S[i] == 'G' && S[j] == 'R')){
						//j should be B
						result += map[2][j + 1];
						if(j + j - i < N && S[j + j - i] == 'B')result--;
					} else if((S[i] == 'R' && S[j] == 'B') || (S[i] == 'B' && S[j] == 'R')){
						//j should be G
						result += map[1][j + 1];
						if(j + j - i < N && S[j + j - i] == 'G')result--;
					} else {
						//j should be R
						result += map[0][j + 1];
						if(j + j - i < N && S[j + j - i] == 'R')result--;
					}
				}
			}	
		}
		System.out.println(result);
	}

	//Find greatest common divisor
	static int gcd (int a, int b) {
		return b > 0 ? gcd(b, a%b) : a;
	}
	
	//Switch input source (stdin/file)
	private static BufferedReader br;
	public static void main(String[] args){
		br = new BufferedReader(new InputStreamReader(System.in));
		String debugDataPath = System.getenv("DD_PATH");        
		if(debugDataPath != null){
			try{
				br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(debugDataPath))));
			}catch(Exception e){
				throw new RuntimeException(e);
			}
		}
		boolean hasNext = true;
		while(hasNext){
			solve();	
			try{
				br.mark(1);
				if(br.read() > 0){
					br.reset();			
					System.out.println("---");
				} else {
					hasNext = false;
				}
			}catch(Exception e){
				throw new RuntimeException(e);
			} 
		}
	}

	//Input read utility
	private static StringTokenizer tokenizer = null;
	public static String next() {
		while (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(br.readLine());
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}
	//Get next single int
	private static int ni() {
		return Integer.parseInt(next());
	}
	//Get next single long
	private static long nl() {
		return Long.parseLong(next());
	}
	//Get next single double
	private static double nd() {
		return Double.parseDouble(next());
	}
	//Get next int array from one line
	private static int[] na(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = ni();
		return a;
	}
	//Get next char array from one line
	private static char[] ns() {
		return next().toCharArray();
	}
	//Get next long array from one line
	private static long[] nal(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nl();
		return a;
	}
}