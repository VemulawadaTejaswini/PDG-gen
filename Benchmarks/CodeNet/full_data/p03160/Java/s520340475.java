import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dp = new int[n-1];
		int[] frog = new int[n];
		for(int i=0; i<n; i++) {
			frog[i] = sc.nextInt();
		}
		if(n==2) {
			System.out.println(Math.abs(frog[0]-frog[1]));
		}
		else {
			dp[0] = Math.abs(frog[0]-frog[1]);
			dp[1] = Math.min(Math.abs(frog[1]-frog[2]), Math.abs(frog[0]-frog[2]));
			for(int i=2; i<n-1; i++) {
			dp[i] = Math.min(dp[i-2]+Math.abs(frog[i-1]-frog[i+1]), dp[i-1]+Math.abs(frog[i]-frog[i+1]));
		}
		System.out.println(dp[n-2]);
		}

	}

}
