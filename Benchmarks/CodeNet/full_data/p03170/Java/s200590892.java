

import java.util.Scanner;
import java.util.Vector;

public class Main {
	static int a[];
	static int dp[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		dp = new int[k+1];
		dp[0] = 1;
		a = new int[n];
		for (int i=0;i<n;i++) 
			a[i]=sc.nextInt();
		
		for (int i=0;i<=k;i++) {
			f(i);
		}
		System.out.println(dp[k]==2?"First":"Second");
	}
	private static int f(int k) {
		if (dp[k]>0) return dp[k];
		int ans = 1;
		for (int i=0;i<a.length;i++) {
			if (k>=a[i]) {
				int l = 3 - f(k-a[i]);
				if (ans<l) ans = l;
			}
		}
		dp[k] = ans;
		return ans;
	}
}
