import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		while(m-- > 0) {
			int i = sc.nextInt(), j = sc.nextInt();
			
			if(!map.containsKey(i))	map.put(i, 1);
			else	map.put(i, map.get(i)+1);
			
			if(!map.containsKey(j))	map.put(j, 1);
			else	map.put(j, map.get(j)+1);
		}
		
		boolean f = true;
		for(int i : map.keySet())
			if(map.get(i) % 2 != 0) {
				f = false;
				break;
			}
		
		if(f)	System.out.println("YES");
		else	System.out.println("NO");
	}
}
