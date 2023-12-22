

import java.util.Scanner;

public class Main {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		long sum=0;
		int min=Integer.MAX_VALUE;
		int flag=0;
		for(int i=0;i<n;i++)
		{
			int a=scan.nextInt();
			int b=scan.nextInt();
			if(a!=b)flag=1;
			sum+=b;
			if(a>b) {
			min=Math.min(min,b);
			}
		}
		if(flag==0)
		{
			System.out.println(0);
		}else {
			System.out.println(sum-min);
		}
	}

}
