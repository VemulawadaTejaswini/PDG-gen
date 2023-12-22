import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;


public class Main {
	
	static int n;
	static int max = 0;
	static int[] x;
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
	    BufferedReader in = new BufferedReader(reader);
		
		String s = in.readLine();
		n = Integer.parseInt(s);
		
		x = new int[n];
		
		s = in.readLine();
		String[] as = s.split(" ");
		
		for (int i=0; i < n; i++) {
			int input = Integer.parseInt(as[i]);
			if(max<input) max = input;
			x[i] = Integer.parseInt(as[i]);
		}
		solve();
	}
	
	private static void solve() {
		// TODO Auto-generated method stub
		for(int i = 1; i < n+1; i++) {
			System.out.println(solve(i));
		}
	}

	private static int solve(int i) {
		
		int[] hash = new int[max+1];
		for(int j = 0; j < max; j++) {
			hash[j] = 0;
		}
		
		for(int j = 1; j < i; j++) {
			
			hash[x[j-1]]++;
		}
		for(int j = i+1; j < n+1; j++) {
			hash[x[j-1]]++;
		}
		int count = 0;
		int ans = 0;
		for(int j = 1; j < max+1; j++) {
			count += hash[j];
//			System.out.println("count"+count);
			if(count>=n/2) {
				ans = j;
//				System.out.println(ans);
				break;
			}
		}
		
		return ans;
	}

	
	
}