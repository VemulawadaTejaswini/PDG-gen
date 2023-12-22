import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
 	public static void main(String[] args){
 		Scanner sc = new Scanner(System.in);
 		int N = sc.nextInt();
 		int M = sc.nextInt();

 		TreeMap<Long, Integer> map = new TreeMap<>();

 		for (int i = 0; i < N; i++) {
 			long a = sc.nextLong();
 			int b = sc.nextInt();
 			map.put(a,b);
 		}
 		long ans = 0;
 		int rem = M;

		ArrayList<Entry<Long, Integer>> list = new ArrayList<Entry<Long,Integer>>(map.entrySet());

		for(Entry e: list) {

			if (rem <= 0) {
				break;
			}

			if(	rem > (int) e.getValue()) {
				rem -= (int) e.getValue();
				ans += (long) e.getKey()*(int) e.getValue();
			} else {
				ans += rem*(long) e.getKey();
				rem = 0;
				break;
			}
		}

		System.out.println(ans);
 	}
}
