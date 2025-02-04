import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		List<Integer> a = new ArrayList<Integer>();
		for(int i=0; i<M; i++) {
			a.add(Integer.parseInt(br.readLine()));
		}
		
		sc.close();
		
		int[] dp = new int[N+1];
		dp[0] = 1;
		
		if(!a.contains(1)) {
			dp[1] = 1;
		}
		
		for(int i=2; i<N+1; i++) {
			if(!a.contains(i)) {
				dp[i] = (dp[i]+dp[i-1])%1000000007;
				dp[i] = (dp[i]+dp[i-2])%1000000007;
			}
		}

		System.out.println(dp[N]%1000000007);
	}
}