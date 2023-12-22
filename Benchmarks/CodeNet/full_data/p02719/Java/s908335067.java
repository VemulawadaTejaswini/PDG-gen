import java.util.*;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		long n = scan.nextLong();
		long k = scan.nextLong();
		
		if(n > k)
		{ 
			long c = n%k;
			long d = Math.abs(c - k);
			
			if(c < d)
			{
				System.out.println(c);
			}
			else
			{
				System.out.println(d);
			}
			
			
			System.out.println();
		}
		else
		{
			long a = Math.abs(n - k);
			long b = Math.abs(a - k);
			
			if(a < b)
			{
				System.out.println(a);
			}
			else
			{
				System.out.println(b);
			}
		}
			
		
		scan.close();
	}
}