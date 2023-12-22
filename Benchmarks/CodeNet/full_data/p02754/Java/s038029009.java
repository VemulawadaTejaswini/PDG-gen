

import java.util.*;
import java.io.*;


public class Main{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long b=sc.nextLong();
		long r=sc.nextLong();
		long ans=0;
		long mod =n%(b+r);
		long div=n/(b+r);
		ans=(div*b)+mod;
		if(b==0)
		{
			ans=0;
		}
		System.out.println(ans);
		
		
	}



	}







