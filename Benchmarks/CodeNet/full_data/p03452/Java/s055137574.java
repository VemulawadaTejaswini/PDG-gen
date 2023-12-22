import java.util.*;

public class Main{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		Map<Integer,ArrayList> infoMap = new HashMap();
		Tuple ts = null;
		Tuple td = null;
		for(int i=0;i<m;i++)
		{
			int a,b,c;
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			if(!infoMap.containsKey(a))
				infoMap.put(a,new ArrayList<Tuple>());
			if(!infoMap.containsKey(b))
				infoMap.put(b,new ArrayList<Tuple>());
			ts = new Tuple(a,b,c);
			td = new Tuple(b,a,-c);
			infoMap.get(a).add(ts);
			infoMap.get(b).add(td);
		}
		
		
		Set<Integer> visited = new HashSet<Integer>();
		Deque<Integer> frontier = new LinkedList<Integer>();
		Map<Integer,Integer> distance = new HashMap<>();
		if(ts!=null){
			frontier.addFirst(ts.source);
			distance.put(ts.source,0);
		}
			
		
		while(!frontier.isEmpty())
		{	
			int toVisit = frontier.removeFirst();
			System.out.print(toVisit+",");
			if(!visited.contains(toVisit))
				for(int i=0; i<infoMap.get(toVisit).size();i++)
				{	
					Tuple tmp = (Tuple)infoMap.get(toVisit).get(i);
					frontier.addFirst(tmp.dest);
					if(distance.get(tmp.dest)==null)
					{	
						distance.put(tmp.dest,tmp.cost+distance.get(toVisit));
					}
					else if(distance.get(tmp.dest)!=tmp.cost+distance.get(toVisit))
					{
						System.out.println("No");
						System.exit(1);
					}
					
					
				}
			visited.add(toVisit);
			
		}
		
		System.out.println("Yes");
	}
	
}
class Tuple
{
	public int source;
	public int dest;
	public int cost;
	public Tuple(int s,int d,int c)
	{
		source = s;
		dest = d;
		cost = c;
	}
	public String tString()
	{
		return "("+source+","+dest+","+cost+")";
	}
}