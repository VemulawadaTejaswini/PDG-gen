import java.util.HashMap;
import java.util.Scanner;

public class Main 
{
	static long mod(long l)
	{
		long an = l%m;
		while(an<0)an+=m;
		return an;
	}
	static int mod(int l)
	{
		int an = (int)(l%m);
		while(an<0)an+=m;
		return an;
	}
	static long m;

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		m = sc.nextLong();
		
		HashMap<Long, Integer> inv = new HashMap<>();
		
		
		long score = 0;
		long conback = 0;
		for(int i = 0; i < n; i++)
		{
			long cur = sc.nextLong()%m;
			
			long cura = (0 + conback);
			
			if(inv.containsKey(cura)) inv.put(cura, inv.get(cura)+1);
			else inv.put(cura, 1);
			
			if(i>0)
				conback = mod(conback-cur);
			
			if(inv.containsKey(conback))
				score += inv.get(conback);
		}
		System.out.println(score);

	}

}
