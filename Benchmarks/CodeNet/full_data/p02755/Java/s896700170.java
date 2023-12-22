import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int q=100*a/8;
		int p=10*b;
		int ans=-1;
		int min=Math.min(p,q);
		int max=Math.max(p,q);
		for(int i=min;i<=max;i++)
		{
			if(8*i/100==a&&i/10==b)
			{
				ans=i;
				break;
			}
		}
		System.out.println(ans);
	}
}
	