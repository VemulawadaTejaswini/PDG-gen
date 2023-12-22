package asd;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int budget=scan.nextInt();
		int n=scan.nextInt();
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		map.put(1,2);
		map.put(2,5);
		map.put(3,5);
		map.put(4,4);
		map.put(5,5);
		map.put(6,6);
		map.put(7,3);
		map.put(8,7);
		map.put(9,6);
	
		int pool[]=new int[n];
		for(int i=0;i<n;i++)
		{
			int x=scan.nextInt();
			pool[i]=x;
			
		}
		String dp[]=new String[budget+1];
		Arrays.fill(dp,"0");
		dp[0]="";
//		Arrays.parallelSort(pool);
		//best possible sum with i
		for(int i=1;i<=budget;i++)
		{
			//best possible sum with i budget
			String  max=dp[i];
			for(int x:pool)
			{
				int price=map.get(x);
				if(i-price>=0)
				{
					if(dp[i-price]=="0")continue;
					
					max=compare(max,dp[i-price]+(char)('0'+x));
				}
			}
			dp[i]=max;
			
		}
		
		System.out.println(dp[budget]);
		
				}
	static String compare(String a,String b)
	{
		
		 if(a.length()<b.length()) {
			return b;
		}
		else if(b.length()<a.length())
		{
			return a;
		}
		else {
			for(int i=0;i<a.length();i++)
			{
				if(a.charAt(i)>b.charAt(i))
				{
					return a;
				}else if(a.charAt(i)<b.charAt(i))
				{
					return b;
				}
				
			}
			return a;
		}
		
	}
}
