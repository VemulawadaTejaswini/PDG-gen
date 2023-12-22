import java.io.*;
import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main
{
	public static long cyclic(long N, long K)
	{
		long min=Long.MAX_VALUE, X=0;
		
		while(true)
		{
			X=abs(N-K);
			N=X;
			
			if(X<min)
			{
				min=X;
				//out.println(min);
			}
			else
				break;
		}
	
		return min;
	}
	
	public static void main(String []args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String []s=br.readLine().split(" ");
		
		long N=Long.parseLong(s[0]);
		long K=Long.parseLong(s[1]);
		
		if(N>=K && N%K==0)
			out.println(0);
		
		else if(N>=K && N%K!=0)
		{
			out.println(cyclic(N,K));	
		}	
			
		else//figure out, as N<K
		{
			long X=0;
			X=abs(N-K);
			X=abs(X-K); //cyclicity of 2
		
			out.println(X);
		}
			
		
		
	}
	
	
}


