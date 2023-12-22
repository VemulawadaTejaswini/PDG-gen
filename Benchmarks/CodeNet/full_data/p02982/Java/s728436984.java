import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int d=in.nextInt();
		int [][] a=new int [n][d];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<d;j++)
			{
				a[i][j]=in.nextInt();
			}
		}
		int ans=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				double temp=0;
				for(int k=0;k<d;k++)
				{
					temp=temp+Math.pow((a[i][k]-a[j][k]),2);
				}
				double q=(double)(int)Math.pow(temp,0.5);
				if(Math.pow(temp,0.5)-q<0.0000001)
				{
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}
	