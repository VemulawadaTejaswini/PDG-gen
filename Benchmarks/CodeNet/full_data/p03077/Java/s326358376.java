

import java.util.Scanner;

public class Main {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		long n=scan.nextLong();
		long a=scan.nextLong();
		long b=scan.nextLong();
		long c=scan.nextLong();
		long d=scan.nextLong();
		long e=scan.nextLong();
		a=Math.min(n, a);
		b=Math.min(n, b);
		c=Math.min(n, c);
		d=Math.min(n, d);
		a=Math.min(n, e);
		
		long ans=(long) (Math.ceil(n/a)+Math.ceil(n/d)+Math.ceil(n/b)+Math.ceil(n/c)+Math.ceil(n/d)+Math.ceil(n/e));
		System.out.println(ans);
	}
}
