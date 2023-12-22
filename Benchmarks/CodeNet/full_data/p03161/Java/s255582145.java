import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		int[]a=new int[scn.nextInt()];
		int k=scn.nextInt();
		for(int i=0;i<a.length;i++)a[i]=scn.nextInt();
		System.out.println(solve(a, k));
		
	}
	
	public static int solve(int[]a, int k) {
		int[]dp=new int[a.length];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0]=0;
		for(int i=1;i<a.length;i++) {
			for(int j=1;j<=k;j++) {
				dp[i]=Math.min(dp[i], i-j>=0?(dp[i-j]+Math.abs(a[i]-a[i-j])):Integer.MAX_VALUE);
			}
		}
		return dp[dp.length-1];
	}
	

}
