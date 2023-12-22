import java.util.*;

public class Main
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
		int max=0,k=0;
		for(int i=0;i<n-1;i++)
		{
			if(a[i]>=a[i+1])
			{
				k++;
			}
			else
				k=0;
			if(k>max)
				max=k;
		}
		System.out.println(max);
	}
}