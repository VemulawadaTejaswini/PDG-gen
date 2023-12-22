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
		for(int i=p;i<=q;i++)
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
	