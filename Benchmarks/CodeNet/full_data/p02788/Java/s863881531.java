import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main 
{
	static class C implements Comparator<Enemy>
	{

		@Override
		public int compare(Enemy o1, Enemy o2) 
		{
			if(o1.x<o2.x)return -1;
			if(o1.x>o2.x)return 1;
			
			//dummies later
			if(!o1.dummy && o2.dummy)
				return -1;
			if(!o2.dummy && o1.dummy)
				return 1;
			
			return 0;
		}
		
	}
	
	static class Enemy
	{
		long hp;
		long x;
		boolean dummy = false;
		
		public Enemy(long h, long x0, boolean dum)
		{
			hp = h;
			x = x0;
			dummy = dum;
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long d = sc.nextLong();
		long dmg = sc.nextLong(); //damage
		
		C c = new C();
		PriorityQueue<Enemy> pq = new PriorityQueue<Enemy>(c);
		
		long sustain = 0;
		for(int i = 0; i < n; i++)
		{
			long x = sc.nextLong();
			long h = sc.nextLong();
			pq.add(new Enemy(h, x, false));
		}
		
		long bomb = 0;
		while(!pq.isEmpty())
		{
			Enemy en = pq.poll();
			
			if(!en.dummy)
			{
				//sustain damage!
				long curhp = en.hp - sustain;
				
				//already dead
				if(curhp <= 0)continue;
				
				long use = curhp/dmg;
				if(curhp%dmg!=0)use++;
				bomb+=use;
				long damage = use*dmg;
				//
				
				sustain += damage;
				pq.add(new Enemy(damage, en.x + (d*2), true));
				
			}
			else
			{
				sustain -= en.hp;
			}
		}

		System.out.println(bomb);
	}

}
