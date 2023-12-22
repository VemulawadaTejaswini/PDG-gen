

import java.util.Scanner;

public class Solution {
	static int M = 1000000007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int l0=2,l1=1;
		long ans=0,pre1=l0,pre2=l1;
		for(int i=2;i<=num;i++) {
			long xy=pre1+pre2;
			pre1= pre2;
			pre2=xy;
			ans=xy;
		}
		System.out.println(ans);
	}
}
