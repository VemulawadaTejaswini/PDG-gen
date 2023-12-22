import java.util.*;
import java.lang.Math;


public class Main
{
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int j,flag;
		double n,k;
		n=sc.nextDouble();
		k=sc.nextDouble();
		double i = (Math.log(n)/Math.log(k));
		j=(int)(Math.floor(i)+1);
		System.out.println(j);
		
		
		
	}
}