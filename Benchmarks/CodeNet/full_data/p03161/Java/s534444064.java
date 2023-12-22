import java.util.Collections;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) {
		Reader rd = new Reader();
		int n = rd.nextInt();
		int k = rd.nextInt();
		int[] h = new int[n+1];
		h[0] = 0;
		for(int nn=1; nn<n+1; nn++){
			h[nn] = rd.nextInt();
		}
		int[] dp = new int[n+1];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] = 0;
		dp[1] = 0;
		dp[2] = Math.abs(h[2]-h[1]);
		for(int nn=3; nn<=n;nn++){
			int val = 1;
			while(val <= k && nn-val >= 1){
				dp[nn] = Math.min(dp[nn], Math.abs(h[nn]-h[nn-val]) + dp[nn-val]);
				val++;
			//System.out.println(Arrays.toString(dp) + " " + val);
			}
			//System.out.println(Arrays.toString(dp));
		}
		System.out.println(dp[n]);
	}

	static void sort(int[] ar){
		ArrayList<Integer> ls = new ArrayList<>();
		for(int i=0; i<ar.length; i++) ls.add(ar[i]);
		Collections.sort(ls);
		for(int i =0; i<ls.size(); i++) ar[i] = ls.get(i);
	}
}

class Reader { 
	static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer tok = new StringTokenizer("");
	static String next() {
		while(!tok.hasMoreTokens()){
			try{
				tok = new StringTokenizer(bf.readLine());
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		return tok.nextToken();
	} 
	static int nextInt() {
		return Integer.parseInt(next());
	}
}
