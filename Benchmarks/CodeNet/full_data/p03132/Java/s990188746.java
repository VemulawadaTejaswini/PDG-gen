

import java.util.Scanner;



public class Main {



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		long dp1 = 0;
		long dp2 = 0;
		long dp3 = 0;
		long dp4 = 0;
		long dp5 = 0;
		long dp6 = 0;
		long dp7 = 0;
		long dp8 = 0;
		long dp9 = 0;
		long dp10 = 0;
		
		for (int i=0;i<l;i++) {
			int a = sc.nextInt();
			dp6 = dp1+a;
			dp7 = Math.min(dp1, dp2)+(a==0? 2: a%2);
			dp8 = Math.min(dp1, Math.min(dp2, dp3))+(a+1)%2;
			dp9 = Math.min(Math.min(dp1, dp2), Math.min(dp3, dp4))+(a==0? 2: a%2);
			dp10 = Math.min(Math.min(dp1, Math.min(dp2, dp3)), Math.min(dp4, dp5))+a;
			
			dp1 = dp6;
			dp2 = dp7;
			dp3 = dp8;
			dp4 = dp9;
			dp5 = dp10;
		}
		System.out.println(Math.min(Math.min(dp1, Math.min(dp2, dp3)), Math.min(dp4, dp5)));
	}


}



