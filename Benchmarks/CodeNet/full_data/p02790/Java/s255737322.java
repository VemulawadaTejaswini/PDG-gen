
import java.io.*;
import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main
{
	public static void main(String []args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String []s=br.readLine().split(" ");
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		
		if(a!=b)
		{
			if(a>b)
			{			
				for(int i=1;i<=a;i++)
					out.print(b);
				out.println();
			}
			else
			{			
				for(int i=1;i<=b;i++)
					out.print(a);
				out.println();
			}
			
		}
		else
			for(int i=1;i<=a;i++)
					out.print(b);
				out.println();
	}
}


