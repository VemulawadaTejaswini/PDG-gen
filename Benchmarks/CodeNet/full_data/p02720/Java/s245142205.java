

import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
	static ArrayList<Long> l = new ArrayList<>();
	
	static void goo(long now, int dig, int curdigs)
	{
		if(curdigs == dig)
		{
//			System.out.println(now);
			l.add(now);
			return;
		}
		
		long lastdig = now%10;
		
		if(curdigs == 0)
		{
			for(int i = 1; i <= 9; i++)
			{
				goo(now*10 + i, dig, curdigs+1);
			}
		}
		else if(lastdig == 0)
		{
			goo(now*10 + 0, dig, curdigs+1);
			goo(now*10 + 1, dig, curdigs+1);
		}
		else if(lastdig == 9)
		{
			goo(now*10 + 8, dig, curdigs+1);
			goo(now*10 + 9, dig, curdigs+1);
		}
		else
		{
			goo(now*10 + lastdig, dig, curdigs+1);
			goo(now*10 + lastdig-1, dig, curdigs+1);
			goo(now*10 + lastdig+1, dig, curdigs+1);
		}
		
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i <= 10; i++) //10
		{
			goo(0, i, 0);
		}
		l.sort(null);
		
//		for(int i = 0; i < 100; i++)
//			System.out.println(l.get(i));
		
		int n = sc.nextInt();
		System.out.println(l.get(n-1));
		
	}

}
