import java.util.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws Exception
	{
		// your code goes here
		BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(bu.readLine());
		int i;long sum=0;
		for(i=1;i<=n;i++)
		if(i%3==0 || i%5==0) continue;
		else sum=sum+i;
		System.out.print(sum);
	}
}