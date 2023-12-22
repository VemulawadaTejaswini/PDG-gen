import java.util.Map;
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

		for(Map.Entry<Long, Long> e : map.entrySet()) {

			if (rem <= 0) {
				break;
			}

			if(	rem >= e.getValue()) {
				rem -= e.getValue();
				ans += e.getKey() * e.getValue();
			} else {
				ans += rem * e.getKey();
				rem = 0;
				break;
			}
		}

		System.out.println(ans);
 	}
}
