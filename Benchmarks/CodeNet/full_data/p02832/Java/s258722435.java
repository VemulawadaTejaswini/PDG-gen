import java.io.*;
import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main
{
	public static void main(String []args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String []s=br.readLine().split(" ");
		int a[]=new int[N];
		int k=1,c=0;
				
		for(int i=0;i<N;i++)
			a[i]=Integer.parseInt(s[i]);
			
		for(int i=0;i<N;i++)
		{
			if(a[i]==k)
			{
				++k;
				++c;
			}
		}
		
		if(c==0)
			out.println(-1);
		else
			out.println(N-c);
	}
}


