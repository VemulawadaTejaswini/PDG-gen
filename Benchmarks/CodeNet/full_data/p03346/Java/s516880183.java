import java.io.*;
import java.util.StringTokenizer;
class Main {

	public static void main(String args[])throws IOException
	{
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(BR.readLine());
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=Integer.parseInt(BR.readLine());
		}
		int x=n;
		for(int i=n-1;i>=0;i--)
		{
			if(arr[i]==x)
				x--;
		}
		int y=1;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==y)
			{
				y++;
			}
		}
		y=n-y;
		System.out.println(Math.min(x, y));
	}
}
