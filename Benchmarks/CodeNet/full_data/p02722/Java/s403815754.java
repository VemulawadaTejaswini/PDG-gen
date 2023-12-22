import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong()-1;
		long sn = n+1;
		OccurrenceCounter<Long> oc = new OccurrenceCounter<>();
		
		if(n==2)
		{
			System.out.println(1);
			return;
		}
		long an = 1;
		for(long i = 2; i*i<=n; i++)
		{
			while(n%i == 0)
			{
				n /= i;
				oc.add(i);
			}
		}
		if(n>1)oc.add(n);
		
		for(long l : oc.map.keySet())
		{
			an *= oc.get(l)+1;
//			System.out.println(l + " " + oc.get(l));
		}
		an++;
		//bonus
		n=sn;
		oc = new OccurrenceCounter<>();
		for(long i = 2; i*i<=n; i++)
		{
			while(n%i == 0)
			{
				n /= i;
				oc.add(i);
			}
		}
		if(n>1)oc.add(n);
		
//		System.out.println("oldan "+  an);
		int x = oc.map.keySet().size();
		long[] di = new long[x];
		int curdi = 0;
		long mindi = 999999999999l;
		for(long l : oc.map.keySet())
		{
			di[curdi] = oc.get(l);
			mindi = Math.min(mindi, oc.get(l));
			curdi++;
		}
		
//		System.out.println(Arrays.toString(di) + ", mindi " + mindi);
		for(int i = 2; i <= mindi; i++)
		{
//			System.out.println("checkdiv " + i);
			boolean gud = true;
			for(int j = 0; j < x; j++)
			{
				if(di[j]%i!=0)
				{
					gud = false;
					break;
				}
			}
			if(gud)
				an++;
		}
//		if(x==1)an--;
		
		

		
		
		System.out.println(an);
	}

	static class OccurrenceCounter<T>
	{ //Stores and modifies occurrences.
		HashMap<T, Integer> map = new HashMap<>();
		
		int add(T t, int amount)
		{
			if(map.containsKey(t))
				map.put(t, map.get(t)+amount);
			else
				map.put(t, amount);
			return map.get(t);
		}
		
		int add(T t)
		{
			return add(t,1);
		}
		
		int get(T t)
		{
			if(map.containsKey(t))return map.get(t);
			else return 0;
		}
	}
}
