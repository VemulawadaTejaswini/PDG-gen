import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long[] a = new long[n];
		long[] min = new long[n+1];
		long[] max = new long[n+1];
		min[n] = 2;
		max[n] = 2;
		
		for(int i = 0; i < n; i++)
		{
			a[i] = sc.nextLong();
		}
		
		for(int i = n-1; i >= 0; i--)
		{
			//divisor: a[i]
			{
				min[i] = a[i];
				if(min[i] < min[i+1])
				{
					min[i] = (min[i+1]/a[i])*a[i];
					if(min[i]<min[i+1])
						min[i] = (min[i+1]/a[i]+1)*a[i];
				}
				long reser = min[i] - (min[i]%a[i]);
				if(min[i]<min[i+1] || reser < min[i+1] || reser > max[i+1])
				{
					System.out.println(-1);
					return;
				}
			}
			
			max[i] = ((max[i+1]/a[i])*a[i]) + (a[i]-1);
			long reser = max[i] - (max[i]%a[i]);
			if(max[i] < min[i+1] || reser < min[i+1] || reser > max[i+1])
			{
				System.out.println(-1);
				return;
			}
//			System.out.println(min[i] + " " + max[i]);
		}
			
//		System.out.println(Arrays.toString(min));
//		System.out.println(Arrays.toString(max));
		System.out.println(min[0] + " " + max[0]);
	}

}
