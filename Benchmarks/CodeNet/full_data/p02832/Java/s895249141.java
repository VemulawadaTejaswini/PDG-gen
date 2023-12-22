import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int [] arr=new int [n];
		int [] a=new int [n];
		for(int i=0;i<n;i++)
		{
			arr[i]=i+1;
			a[i]=in.nextInt();
		}
		int j=0;
		int ans=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]!=arr[j])
			{
				ans++;
			}
			else
			{
				j++;
			}
		}
		if(ans==n)
		{
			ans=-1;
		}
		System.out.println(ans);
	}
}
	