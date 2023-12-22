import java.util.*;
import java.io.*;
class Main
{

	static Scanner  s=new Scanner(System.in);
	static int n , queries , left ,right ,dist , flag , sum ,chk  ;
	static HashMap<String,Integer> hmap = new HashMap<>();
	static int[] visit , l , r , d ;
	static Stack<Integer> stk ;
	static Queue<Integer> queue ;
	public static void init()
	{
		sum =0 ;
		visit = new int[n+1];
		stk = new Stack<>();
		queue = new LinkedList<>();
	}


	public static void dfs()
	{
		abc:for(int i =1;i<=n;i++)
		{
			if(visit[i]==0)
			{
				visit[i]=1;
				for(int j=1;j<=n;j++)
				{
					if(hmap.containsKey(i+" "+j) && visit[j]==0)
					queue.add(j);				
				}
			}
			// System.out.println("queue = "+queue);
			while(!queue.isEmpty())
			{
				int q = queue.remove();
				// System.out.println("q = "+q);
				visit[q] =1;
				sum = hmap.get(i+" "+q);
				// System.out.println("sum = "+sum);
				for(int j=1;j<=n;j++)
				{
					if(hmap.containsKey(q+" "+j) && visit[j]==0)
					{
						sum+=hmap.get(q+" "+j);
						if(hmap.containsKey(i+" "+j))
						{
							if( Math.abs(hmap.get(i+" "+j)) != Math.abs(sum))
							{
								chk = 1 ;
								break abc;
							}
						}	
						else
						{
							String line = i+" "+j;
							hmap.put(line,sum);
						}
					}
				}
			}



		}
	}



	public static void main(String[] args)
	{
		n = s.nextInt();
		queries = s.nextInt();
		
		l = new int[queries];
		r = new int[queries];
		d = new int[queries];

		for(int i =0; i<queries	;i++)
		{
			int lval = s.nextInt();
			int rval = s.nextInt();
			int dval = s.nextInt();
			l[i] = lval;
			r[i] = rval;
			d[i] = dval;

			String line1 = lval+" "+rval;
			String line2 = rval+" "+lval;
			if(hmap.containsKey(line1))
			{
				Integer p = hmap.get(line1);
				int chk = Math.abs((int)p);
				if(chk!=dval)
					flag = 1;
			}
			
			if(hmap.containsKey(line2))
			{
				Integer p = hmap.get(line2);
				int chk = Math.abs((int)p);
				if(chk!=dval)
					flag = 1;
			}
			
			if(!hmap.containsKey(line1))
			{
				hmap.put(line1,dval);
			}
			
			if(!hmap.containsKey(line2))
			{
				hmap.put(line2,-dval);
			}
			
		}

		if(flag == 0)
		{
			init();
			dfs();
			if(chk == 0)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
		else
			System.out.println("No");

	}

	
}