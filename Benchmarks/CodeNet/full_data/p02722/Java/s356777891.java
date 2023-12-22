import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main 
{
	static long[] divin; //identity
	static int[] divs; //quantity
	static int divkinds; //kinds
	static long orin;
	static long an = 0;
	
	static void go(int prog, int[] divam)
	{
		if(prog < divkinds)
		{
			for(int i = 0; i <= divs[prog]; i++)
			{
				int[] ndivam = divam.clone();
				ndivam[prog] = i;
				go(prog+1, ndivam);
			}
		}
		else
		{
			long k = 1;
			for(int i = 0; i < divkinds; i++)
				for(int j = 0; j < divam[i]; j++)
				{
					k *= divin[i];
				}
			
			if(k!=1)
			{
				long curn = orin;
				while(curn%k == 0)curn/=k;
				long mod = curn%k;
				if(mod == 1)
				{
					an++;
				}
			}
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong()-1;
		long sn = n+1;
		orin = sn;
		OccurrenceCounter<Long> oc = new OccurrenceCounter<>();
		
		if(n==2)
		{
			System.out.println(1);
			return;
		}
		an = 1;
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
		}
		an--; //1 doesn't count
		
		
		
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
		
		divkinds = oc.map.keySet().size();
		divin = new long[divkinds];
		divs = new int[divkinds];
		int curdi = 0;
		long mindi = 999999999999l;
		for(long l : oc.map.keySet())
		{
			divin[curdi] = l;
			divs[curdi] = oc.get(l);
			mindi = Math.min(mindi, oc.get(l));
			curdi++;
		}
		
		go(0,new int[divkinds]);

		
		
		
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
