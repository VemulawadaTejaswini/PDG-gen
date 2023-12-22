import java.util.*;
import java.io.*;

public class Main {
	private static void solve(){
	//Implement solution here.
			char[] s = next().toCharArray();
			int n = s.length;
			int mod = 1000000007;
			long[][] dp = new long[n + 1][13];
			dp[0][0] = 1;
			
			for(int i = 0; i < n; i++) {
				int dv = -1;
				if(s[i] != '?') dv = Character.getNumericValue(s[i]);
				
				for(int j = 0; j < 10; j++) {// j = next digit number
					if(dv != -1 && dv != j)continue;
					for(int rem = 0; rem < 13; rem++) {
						dp[i + 1][(rem * 10 + j) % 13] += dp[i][rem];
					}
				}
				for(int j = 0; j < 13; j++)dp[i + 1][j] %= mod;
			}			
			
			System.out.println(dp[n][5]);
	}

    //Switch input source (stdin/file)
	private static BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args){
        String debugDataPath = System.getenv("DD_PATH");        
        if(debugDataPath != null){
            try{
            	br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(debugDataPath))));
            }catch(Exception e){
                throw new RuntimeException(e);
            }
        } 
        solve();
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