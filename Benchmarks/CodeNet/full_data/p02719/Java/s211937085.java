

import java.util.*;

public class Main {
	//static boolean f;
	static long min;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		long k = sc.nextLong();
		
		if(n%k == 0) {
			min = 0;
		}else {
			if(n > k)
				calc(n,k);
			else
				calc(k,n);
		}
		
		System.out.println(min);
	}
	
	static void calc(long n, long k) {
		if(n%k == 0){
			min = k;
			return;
		}
		calc(k,n%k);
	}
}