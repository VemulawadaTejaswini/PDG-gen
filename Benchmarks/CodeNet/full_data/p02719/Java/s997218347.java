

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();
		
		int t = 0;
		
		if(n > k)
		{
			t+= n/k;
			n = n%k;
			if(n<0)n+=k;
		}
		
		if(n==0)
		{
			System.out.println(n);
			return;
		}
		
		//n<k
		if(k - n < n)
		{
			n = k-n;
			t++;
		}
		System.out.println(n);
		
	}

}
