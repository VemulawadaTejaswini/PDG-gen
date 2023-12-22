import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	
	public static int[] readInts(String cad) {
		String read[] = cad.split(" ");
		int res[] = new int[read.length];
		for (int i = 0; i < read.length; i++) {
			res[i] = Integer.parseInt(read[i]);
		}
		return res;
	}
	
	public static void main(String[] args) throws IOException {
		StringBuilder out = new StringBuilder();
		BufferedReader in;
		
			in = new BufferedReader(new InputStreamReader(System.in));

		int values[] = readInts(in.readLine());
		int n = values[0];
		int k = values[1];
		int hi[] = readInts(in.readLine());
		int dp[] = new int[n];
		Arrays.fill(dp, Integer.MAX_VALUE/ 2 - 1);
		
		dp[0] = 0;
		for( int i = 0; i < n; i++ ) {
			for( int j = 1; j <= k; j++ ) {
				if( i + j < n ) {
					dp[i + j] = Math.min(dp[i+j], Math.abs(hi[i] - hi[i+j]) + dp[i]);
				}
			}
		}
		
		System.out.print(dp[n-1]);

	}
	
}
