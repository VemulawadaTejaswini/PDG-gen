import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);
		String s=in.next();
		int n=in.nextInt();
		int rev=0;
		for(int i=0;i<n;i++)
		{
			int t=in.nextInt();
			if(t==1)
			{
				rev=(rev+1)%2;
			}
			else
			{
				int f=in.nextInt();
				char c=in.next().charAt(0);
				if((f==1&&rev==0)||(f==2&&rev==1))
				{
					s=c+s;
				}
				else
				{
					s=s+c;
				}
			}
		}
		if(rev==0)
		{
			System.out.println(s);
		}
		else
		{
			for(int i=s.length()-1;i>=0;i--)
			{
				System.out.print(s.charAt(i));
			}
		}
	}
}
	