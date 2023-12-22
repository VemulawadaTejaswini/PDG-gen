import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) throws IOException
	{
		Scanner c = new Scanner(System.in);
		int N = c.nextInt();
		int[] arr = new int[N];
		String s1 = c.next(), s2 = c.next();
		for(int i=0; i<N; i++)
		{
			if(s1.charAt(i) == s2.charAt(i))
				arr[i] = 1;
			else arr[i] = 0;
		}
//		System.out.println(Arrays.toString(arr));
		long ans = 3; int prev = 1;
		for(int i=0; i<N; i++)
		{ 
			ans%=(1e9+7);
			if(arr[i] == 0) 
			{
				if(prev == 0)
				{
					ans *= 3;
				}
				else ans *= 2;
				if(i==0) ans = 6;
				prev  = 0;
				i++;
			}
			else
			{
				if(prev == 0)
				{
					ans *= 1;
				}
				else ans *= 2;
				if(i==0) ans = 3;
				prev = 1;
			}
		}
		
		System.out.println(ans);
	}
}
