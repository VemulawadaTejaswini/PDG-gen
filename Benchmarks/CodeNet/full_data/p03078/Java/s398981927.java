

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
//		int n=scan.nextInt();
		int x=scan.nextInt();
		int y=scan.nextInt();
		int z=scan.nextInt();
		int k=scan.nextInt();
		ArrayList<Integer> a=new ArrayList<Integer>();
		ArrayList<Integer> b=new ArrayList<Integer>();
		ArrayList<Integer> c=new ArrayList<Integer>();
		for(int i=0;i<x;i++)
		{
			a.add(scan.nextInt());
		}
		for(int i=0;i<y;i++)
		{
			b.add(scan.nextInt());
		}
		for(int i=0;i<z;i++)
		{
			c.add(scan.nextInt());
		}
		Collections.sort(a,Collections.reverseOrder());
		Collections.sort(b,Collections.reverseOrder());
		Collections.sort(c,Collections.reverseOrder());
		ArrayList<Integer> ans=new ArrayList<Integer>();
		for(int i=0;i<x;i++)
		{
			for(int j=0;j<y;j++)
			{
				for(int v=0;v<z;v++)
				{
					if(j*i*v>k)continue;
					ans.add(a.get(i)+b.get(j)+c.get(v));
				}
			}
		}
		Collections.sort(ans,Collections.reverseOrder());
		for(int i=0;i<k;i++)
		{
			System.out.println(ans.get(i));
		}
		
	}
}
