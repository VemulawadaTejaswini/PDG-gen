import java.util.Arrays;
import java.util.Scanner;

public class Main 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n;
		long sum=0,x;
		n=sc.nextInt();
		x=sc.nextLong();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			sum=sum+arr[i];
		}
		Arrays.sort(arr);
		int k=0;
		int flag=0;
		/*for(int i=0;i<n;i++)
			System.out.println(arr[i]);
		System.out.println(sum);*/
		if(sum==x)
			System.out.println(n);
		else if(sum<x)
		{
			System.out.println(n-1);
		}	
		else
		{
			while(true)
			{
				if(arr[k]<=x)
				{
					x=x-arr[k];
					k++;
					flag=1;
				}
				else
					break;
			}
			if(flag==0)
				System.out.println(0);
			else
				System.out.println(k);
		}
	}
}
