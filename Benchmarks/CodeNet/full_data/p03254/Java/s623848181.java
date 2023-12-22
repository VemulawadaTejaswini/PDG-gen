import java.util.Arrays;
import java.util.Scanner;

public class Main 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n,x;
		int sum=0;
		n=sc.nextInt();
		x=sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			sum=sum+arr[i];
		}
		Arrays.sort(arr);
		int k=0;
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
			while(x>0)
			{
				if(arr[k]<=x)
				{
					x=x-arr[k];
					k++;
				}
				else
					break;
			}
			System.out.println(k);
		}
	}
}
