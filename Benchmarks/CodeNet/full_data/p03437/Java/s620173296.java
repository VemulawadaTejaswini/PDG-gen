import java.util.*;
/*being john malkovich*/
class Main
{
	public static void main(String[] args)
	{
		long max = (long)(Math.pow(10,18));
		// System.out.println(max);
		Scanner s = new Scanner(System.in);
		long x = s.nextLong();
		long y = s.nextLong();

		/*
		if((x*2)%y!=0)
		{
			System.out.println(x*2);
		}
		else if((x*3)%y!=0)
		{
			System.out.println(x*3);
		}
		else
		{
			System.out.println("-1");
		}
		*/

		/*
		
		// else
		{
			int flag = 0;
			for(long i =1;i*x <= max;i++)
			{
				if((i*x)%y!=0)
				{
					flag = 1;
					System.out.println(i*x);		
					break;
				}
			}
			if(flag == 0)
				System.out.println("-1");
		}
		// */

		if(x!=y)
		System.out.println(x*y - x);
		else
		System.out.println("-1");
	}

}