

import java.util.Scanner;

public class Main {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		long n=scan.nextLong();
		long min=Long.MAX_VALUE;
		for(int i=0;i<5;i++) {
			min=Math.min(min,scan.nextLong());
		}
//		System.out.println(min);
//		long ans=(long) (Math.ceil(n/a)+Math.ceil(n/d)+Math.ceil(n/b)+Math.ceil(n/c)+Math.ceil(n/d)+Math.ceil(n/e));
		System.out.println((long)Math.ceil(n/min)+5);
	}
}
