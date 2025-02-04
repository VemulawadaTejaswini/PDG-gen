import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main
{
	static Set<Integer> xSet = new TreeSet<>(), ySet = new TreeSet<>();
	static int a,b,c,d,e,f;

	public static void main(String[] args)
	{
		try(Scanner sc = new Scanner(System.in))
		{
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			d = sc.nextInt();
			e = sc.nextInt();
			f = sc.nextInt();
		}

		for(int i = 0;;i++)
		{
			boolean flag = false;
			for(int j = 0;; j++)
			{
				int x = 100*a*i + 100*b*j;
				if(x > f) break;
				xSet.add(x);
				flag = true;
			}
			if(!flag) break;
		}

		for(int i = 0;;i++)
		{
			boolean flag = false;
			for(int j = 0;; j++)
			{
				int y = c*i + d*j;
				if(y > f) break;
				ySet.add(y);
				flag = true;
			}
			if(!flag) break;
		}

		float max = 0.0f;
		int maxWater = 0, maxSuger = 0;
		for(int water : xSet)
		{
			for(int suger : ySet)
			{
				if(water + suger > f || suger * 100.0f > e * water) break;
				if(max < (100.0f * suger) / (water + suger))
				{
					max = (100.0f * suger) / (water + suger);
			        maxWater = water;
			        maxSuger = suger;
				}
			}
		}

		System.out.println((maxWater + maxSuger) + " " + maxSuger);
	}

}
