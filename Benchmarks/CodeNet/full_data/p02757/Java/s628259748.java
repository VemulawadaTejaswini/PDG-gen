import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);
		int mod=0;
		int n=in.nextInt();
		int p=in.nextInt();
		String s=in.next();
		int [] r=new int [p];
		int ans=0;
		for(int i=0;i<n;i++)
		{
			int t=s.charAt(i)-'0';
			mod=(mod*10+t)%p;
			if(mod==0)
				ans++;
			ans=ans+r[mod];
			r[mod]++;
		}
		System.out.println(ans);
	}
}
	