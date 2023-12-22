

import java.util.Scanner;

public class Main
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		
		if(a%2==b%2)
		{
			long dis = b-a;
			if(dis<0)dis*=-1;
			System.out.println(dis/2);
		}
		else
		{
			long l = Math.max(a, b)-1;
			long r = n-Math.min(a, b);
			System.out.println(Math.min(l, r));
		}
			

	}

}
