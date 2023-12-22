import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<Integer, Set<Integer>> m = new HashMap<Integer, Set<Integer>>();
		for(int i=1; i<=n; i++)	m.put(i, new HashSet<Integer>());
		int[] d = new int[1+n];
		for(int i=0; i<n-1; i++) {
			int x = sc.nextInt(), y = sc.nextInt();
			m.get(x).add(y);
			m.get(y).add(x);
			d[x] ++;
			d[y] ++;
		}
		
		boolean f = false;
		for(int i=1; i<=n ;i++) {
			int t = 0;
			for(int j=1; j<=n; j++) {
				if(m.get(i).contains(j) && d[j] == 1)
					t ++;
			}
			if(t >= 2)	{
				f = true;
				break;
			}
		}
		
		if(f) 	System.out.println("First");
		else	System.out.println("Second");
	}
	
}
