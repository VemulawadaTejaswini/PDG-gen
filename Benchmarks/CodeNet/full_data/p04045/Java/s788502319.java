
import java.util.Scanner;
import java.util.*;

public class Main {
	
	static int a[]=new int[7] ;
	static int flag=0;
	static void zeng(int z)
	{
		a[z]=a[z]+1;
		if(a[z]==10)
		{
			
			a[z]=0;
			
			if(z==1) {flag=1;
			zeng(z-1);}
			else a[z-1]++;
	}
	}
	public static void main(String []args)
	{
		 String str;
		 int num;
		 String temp;
		int[]dis=new int[10];
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext())
		{
			flag=0;
			for(int i=0;i<10;i++)
			{
				dis[i]=0;
			}
			str=sc.next();
			num=sc.nextInt();
			int o;
			for(int i=0;i<num;i++)
			{
				o=sc.nextInt();
				dis[o]=1;
			}
			int emp;
			for(int i=0;i<str.length();i++)
			{
				char []ch=str.toCharArray();
				 emp =/*""+*/(int)ch[i]-48;
				a[i+1]=emp;//Integer.parseInt(emp);
				//System.out.println(i+1+"val"+a[i+1]);
				
			}a[0]=0;
			for(int i=str.length();i>0;i--)
			{
				while(dis[a[i]]==1)
				{
					zeng(i);
				}
				if(flag==1)
				while(dis[a[0]]==1)
				{
					zeng(0);
				}
		    }
			if(flag==0)
			{
				for(int i=1;i<str.length();i++)
				{
					System.out.print(a[i]);
				}
				System.out.println(a[str.length()]);
			}
			else	
			{
				for(int i=0;i<str.length();i++)
				{
					System.out.print(a[i]);
				}
				System.out.println(a[str.length()]);
			}
			
		}
	}
}