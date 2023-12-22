import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		long min = 0;
		
		int n = sc.nextInt();
		long k = sc.nextLong();
		long[] a = new long[n];
		Long[] f = new Long[n];
		
		for(int i = 0; i < n; i++)
			a[i] = sc.nextLong();
		
		for(int i = 0; i < n; i++)
			f[i] = sc.nextLong();
		
		Arrays.sort(a);
		Arrays.sort(f, Collections.reverseOrder());
//		System.out.println(Arrays.toString(a));
//		System.out.println(Arrays.toString(f));
		
		for(int i = 0; i < n; i++)
			min = Math.max(min,a[i]*f[i]);
		long l = 0;
		long r = 100000000000000l;
		
		long mid;
		
		while(l<r)
		{
			long tar = (l + r) / 2;
			{
				//assume tar is decided here
				long price = 0;
				
				for(int i = 0; i < n; i++)
				{
					long m = a[i] * f[i];
					long up = m - tar;
					long lef = (m - tar) / f[i];
					if((m-tar)%f[i]!=0)lef++;
					if(m <= tar)lef = 0;
					price += Math.max(lef,0);
					
//					System.out.println("price " + i + ": " + lef);
				}
//				System.out.println(price);
				if(price <= k)
				{
					min = Math.min(min, tar);
					
					//good enough
					r = tar-1;
				}
				else
				{
					//cant afford this, bigger target now
					l = tar+1;
				}
			}
		}

		System.out.println(min);
	}

}
