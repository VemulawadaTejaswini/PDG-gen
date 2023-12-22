

import java.util.*;
import java.io.*;
import java.lang.Math.*;


public class Main{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double a=sc.nextInt();
		double b=sc.nextInt(); int ans=0;
		a=Math.floor(a/0.08); b=Math.floor(b/0.1);
		int A=(int) a;int B=(int) b;
		
		
		if(A==B||A+5==B||B+5==A)
		{
			ans=A;

		}
		else
		{
			ans=-1;
		}

		System.out.println(ans);


	}
}







