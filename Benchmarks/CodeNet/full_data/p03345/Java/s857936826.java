import java.io.*;
import java.util.StringTokenizer;
class A {

	public static void main(String args[])throws IOException
	{
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		String s=BR.readLine();
		
		StringTokenizer st=new StringTokenizer(s);
		long a=Long.parseLong(st.nextToken());
		long b=Long.parseLong(st.nextToken());
		long c=Long.parseLong(st.nextToken());
		long k=Long.parseLong(st.nextToken());
		
		long q=a-b;
		if(q>Math.pow(10, 9))
		{
			System.out.println("Unfair");
		}
		else
			{
			if(k%2==0)
				System.out.println(-(q));
			else
				System.out.println((q));
			}
	}
}
