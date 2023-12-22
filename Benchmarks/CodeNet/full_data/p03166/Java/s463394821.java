
import java.util.*;

public class Main {
	static ArrayList[] graph;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=Integer.parseInt(s.next());
		int edges=Integer.parseInt(s.next());
		graph=new ArrayList[size];
		for(int i=0;i<size;i++)
			graph[i]=new ArrayList<Integer>();
		int[] incoming=new int[size];
		for(int i=0;i<edges;i++)
		{
			int source=s.nextInt();
			int dest=s.nextInt();
			graph[source-1].add(dest-1);
			incoming[dest-1]++;
			
		}
		Queue<Integer> Q=new LinkedList<>();
		for(int i=0;i<incoming.length;i++)
			if(incoming[i]==0)
				Q.add(i);
		int len=0;
		while(!Q.isEmpty())
		{
			int length=Q.size();
			for(int i=0;i<length;i++)
			{
				int v = Q.poll();
				for (Integer e : (ArrayList<Integer>) graph[v]) {
					incoming[e]--;
					if (incoming[e] == 0)
						Q.add(e);
				}
			}
			len++;
		}
		System.out.println(len-1);
		s.close();
	}
}
