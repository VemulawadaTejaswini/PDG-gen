
import java.io.*;
import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main
{
	public static void main(String []args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String []s=br.readLine().split(" ");
		int a[]=new int[n];
		boolean flag=true;;
		int c=0;
		
		for(int i=0;i<n;i++)
			a[i]=Integer.parseInt(s[i]);
		
		
		for(int i=0;i<n;i++)
		{
			flag=true;
			for(int j=0;j<=i;j++)
			{
				if(a[i]>a[j])
				{
					flag=false;
					break;
				}
			}
			if(flag==false)
				continue;
			else
				++c;
		}
				
		out.println(c);
	}
}


