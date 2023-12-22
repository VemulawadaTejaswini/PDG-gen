import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		
		long min = 999999999;
		long max = -999999999;
		int miner = -1;
		int maxer = -1;
		for(int i = 0; i < n; i++)
		{
			a[i] = sc.nextLong();
			
			if(a[i]<min)
			{
				miner=i;
				min=a[i];
			}
			if(a[i]>max)
			{
				maxer=i;
				max=a[i];
			}
		}
		
		boolean allpos = false;
		if(max > 0 && min > 0)allpos = true;
		//mixed case
		if(min < 0 && max > 0 && max >= -min)
		{ //absolute largest is positive
			for(int i = 0; i < n; i++)
			{
				int id = i+1;
				if(i!=maxer)System.out.println((maxer+1) + " " + id);
			}
			allpos = true;
		}
		else if(min < 0 && max > 0 && -min > max)
		{ //absolute largest is neg
			for(int i = 0; i < n; i++)
			{
				int id = i+1;
				if(i!=miner)System.out.println((miner+1) + " " + id);
			}
			allpos = false;
		}
		
		if(allpos)
		{
			for(int i = 0; i < n-1; i++)
			{
				System.out.println((i+1) + " " + (i+2));
			}
		}
		else {
			for(int i = n-1; i>=1; i--)
			{
				System.out.println((i+1) + " " + (i));
			}
		}
	}

}
