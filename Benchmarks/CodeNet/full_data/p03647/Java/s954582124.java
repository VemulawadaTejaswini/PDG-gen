
import java.util.*;
import java.util.Map.Entry;

public class Main{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int V=sc.nextInt();
		int E=sc.nextInt();
		Map<Integer, Integer> mp=new HashMap<>();
		for (int i = 0; i <E; i++) {
			int u=sc.nextInt();
			int v=sc.nextInt();
			mp.put(u, v);			
		}
		for (Entry<Integer, Integer> En : mp.entrySet()) {
			int x=En.getValue();
			int y=En.getKey();
			
			int v=mp.get(x)==null?0:mp.get(x);	
		    if(x==V)
		    {
		    	System.out.println("POSSIBLE");
				return;
		    }
			if(v==V&&y==1)
			{	System.out.println("POSSIBLE");
				return;
			}
			
		}
		System.out.println("IMPOSSIBLE");
	}

}
