import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.next();
		long[] dp = new long[2019]; //stores remainder from 0-2018
		int cur = Integer.parseInt(s.substring(s.length()-1,s.length()));
		dp[cur]++;
		long cnt = 0;
		int pow_10 = 10;
		//(2019 does not share any divisors with 10 (the base), 
		//therefore storing remainder trick works.
		for (int i = s.length()-2; i >= 0; i--) {
			int digit = Integer.parseInt(s.substring(i,i+1));
			cur+=digit*pow_10;
			pow_10*=10;
			pow_10%=2019;
			cur%=2019;
			dp[cur]++;
		}
		for (int i = 1; i < 2019; i++) {
			cnt+=(dp[i])*(dp[i]-1)/2;
		}
		System.out.println(cnt+dp[0]);
	}
}