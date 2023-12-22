import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);		
		int n=in.nextInt();
		int [] d=new int [n];
		for(int i=0;i<n;i++)
		{
			d[i]=in.nextInt();
		}
		int ans=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				ans=ans+d[i]*d[j];
			}
		}
		System.out.println(ans);
	}
}
	