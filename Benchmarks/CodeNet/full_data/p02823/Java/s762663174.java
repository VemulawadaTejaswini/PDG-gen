import java.io.*;
import java.util.*;

class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		double n=s.nextDouble();
		double a=s.nextDouble();
		double b=s.nextDouble();

		double m=(n/2)+1;
		double k=b-a;
		if(k==1 && a>=m && b<=n)
			System.out.println(String.format("%.0f",n-a));
		else if(k==1 && a>=1 && b<=m)
			System.out.println(String.format("%.0f",b-1));
		else if(k%2==1)
			System.out.println(String.format("%.0f",b-1));
		else if(k%2==0)
			System.out.println(String.format("%.0f",k/2));
	}
}