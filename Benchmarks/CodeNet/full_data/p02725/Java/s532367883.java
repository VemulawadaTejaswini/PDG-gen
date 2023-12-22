import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
{
	public static void main (String[] args)
	{
			Scanner sc = new Scanner(System.in);
			int K = sc.nextInt();
			int N = sc.nextInt();
			int arr[] = new int[N];
			int halfperimeter = K/2 , f = 0 , d = 0;
			int max = Integer.MIN_VALUE , min = Integer.MAX_VALUE;
			boolean flag = false;
			for(int i = 0; i < N ;i++)
			{
				arr[i] = sc.nextInt();							
			}
			for(int i = 1  ;i <= N-1 ; i++)
			{
				int diff = arr[i] - arr[i-1];
				if(diff >= halfperimeter)
				{
					flag = true;
					f = arr[i-1];
					d = arr[i];
					break;
				}
			}
			if(!flag)
				System.out.println(arr[N-1] -arr[0]);
			else
				System.out.println((K-d)+ f);			
	}
}
