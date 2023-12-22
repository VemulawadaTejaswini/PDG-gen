import java.util.*;

class Main
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int test = s.nextInt();
		long first = 0, sec =0 ;
		for(int i =0;i<test;i++)
		{
			int ele = s.nextInt();
			first+= ele;
		}

		for(int i =0;i<test;i++)
		{
			int ele = s.nextInt();
			sec+= ele;
		}

		boolean val = true;
		while(val)
		{
			
			if(first == sec)
			{
				val = false;
				System.out.println("yes");
			}
			else if(first > sec)
			{
				System.out.println("no");
				val = false;
			}
			first += 2;
			sec +=1;
		}

	}
}