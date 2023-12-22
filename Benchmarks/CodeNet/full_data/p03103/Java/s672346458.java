import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
 	public static void main(String[] args){
 		Scanner sc = new Scanner(System.in);
 		int N = sc.nextInt();
 		int M = sc.nextInt();

 		TreeMap<Long, Long> map = new TreeMap<>();

 		for (int i = 0; i < N; i++) {
 			long a = sc.nextLong();
 			long b = sc.nextLong();
 			map.put(a,b);
 		}
 		long ans = 0;
 		long rem = M;

		ArrayList<Entry<Long, Long>> list = new ArrayList<Entry<Long,Long>>(map.entrySet());

		for(Entry e: list) {

			if (rem <= 0) {
				break;
			}

			if(	rem >= (long) e.getValue()) {
				rem -= (long) e.getValue();
				ans += (long) e.getKey()*(long) e.getValue();
			} else {
				ans += rem*(long) e.getKey();
				rem = 0;
				break;
			}
		}

		System.out.println(ans);
 	}
}
