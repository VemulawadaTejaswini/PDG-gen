

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	/*
		int pp=7;
		for (int i=1;i<=10000;i++) {
			String ss = String.valueOf(i);
			long count = 0;
			for (int j=0;j<ss.length();j++) {
				for (int k=j+1;k<=ss.length();k++) {
					if (Integer.parseInt(ss.substring(j,k))%pp==0) {
					count++;
					}
				}
			}
			if (count != ans(ss.length(), pp, ss)) {
				System.out.println(i);
			}
		}
		
		*/
		

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int p = sc.nextInt();
		String s = sc.next();
	
		if (p==2 || p==5) {
			long ans = 0;
			for (int i=0;i<n;i++) {
				if ((s.charAt(i)-'0')%p==0) {
					ans+=(i+1);
				}
			}
			System.out.println(ans);
			
		} else {
			long[] count = new long[p];
			int rem = 0;
			count[0]=1;
			int digit = 1;
			for (int i=n-1; i>=0; i--) {
				rem=(rem+digit*(s.charAt(i)-'0'))%p;
				count[rem]++;
				digit=(digit*10)%p;
			}
			
			long ans = 0;
			for(int i=0;i<p;i++) {
				ans += (count[i]*(count[i]-1)/2);
			}
			System.out.println(ans);
		}

		
	}
	
	static long ans(int n, int p, String s) {
		if (p==2 || p==5) {
			long ans = 0;
			for (int i=0;i<n;i++) {
				if ((s.charAt(i)-'0')%p==0) {
					ans+=(i+1);
				}
			}
			return ans;
			
		} else {
			long[] count = new long[p];
			int rem = 0;
			count[0]=1;
			int digit = 1;
			for (int i=n-1; i>=0; i--) {
				rem=(rem+digit*(s.charAt(i)-'0'))%p;
				count[rem]++;
				digit=(digit*10)%p;
			}
			
			long ans = 0;
			for(int i=0;i<p;i++) {
				ans += (count[i]*(count[i]-1)/2);
			}
			return ans;
		}
	}
	
}


