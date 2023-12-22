
import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class Main {
	static BufferedReader br;
	static int cin() throws Exception
	{
		return Integer.valueOf(br.readLine());
	}
	static int[] split() throws Exception
	{
		String[] cmd=br.readLine().split(" ");
		int[] ans=new int[cmd.length];
		for(int i=0;i<cmd.length;i++)
		{
			ans[i]=Integer.valueOf(cmd[i]);
		}
		return ans;
	}
	static long[] splitL() throws IOException
	{
		String[] cmd=br.readLine().split(" ");
		long[] ans=new long[cmd.length];
		for(int i=0;i<cmd.length;i++)
		{
			ans[i]=Long.valueOf(cmd[i]);
		}
		return ans;
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		br=new BufferedReader(new InputStreamReader(System.in));
		int[]ar=split();
		int n=ar[0];
		int p=ar[1];
		String s=br.readLine();
		if(p==2)
		{
			long ans=0;
			for(int i=0;i<n;i++)
			{
				int x=s.charAt(i)-'0';
				if(x%2==0)
					ans=ans+i+1;
			}
			System.out.println(ans);
		}
		else if(p==5)
		{
			long ans=0;
			for(int i=0;i<n;i++)
			{
				int x=s.charAt(i)-'0';
				if(x%5==0)
					ans=ans+i+1;
			}
			System.out.println(ans);
		}
		else {
		long[] store=new long[p];
		store[0]=(long)1;
		int x=1;
		int sum=0;
		long ans=0;
		for(int i=n-1;i>=0;i--)
		{
			sum=(sum+x*(s.charAt(i)-'0'))%p;
			ans=ans+store[sum];
			x=(x*10)%p;
			store[sum]++;
		}
		System.out.println(ans);}
	}
}
