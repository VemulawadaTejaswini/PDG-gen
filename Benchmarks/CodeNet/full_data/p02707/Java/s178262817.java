import java.math.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws Exception
	{
		BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(bu.readLine()),i,a[]=new int[n];
		String s[]=bu.readLine().split(" ");
		for(i=0;i<n-1;i++)
		{
			int k=Integer.parseInt(s[i]);
			a[k-1]++;
		}
		StringBuilder sb=new StringBuilder();
		for(i=0;i<n;i++)
		sb.append(a[i]+"\n");
		System.out.print(sb);
	}
}