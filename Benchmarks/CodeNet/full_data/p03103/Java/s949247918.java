import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
	
		Map<Long, Long> drinkMap = new TreeMap<>();
		for (int i=0; i<n; i++) {
			drinkMap.put(Long.valueOf(sc.nextLong()), Long.valueOf(sc.nextLong()));
		}
		
		long ans = 0;
		for (Map.Entry<Long, Long> drink : drinkMap.entrySet()) {
			long res = drink.getKey().longValue();
			if (m < res) {
				res = m;
			}
			ans = res * drink.getValue().longValue();
			m -= res;
			if (res == 0) {
				break;
			}
		}
		System.out.println(ans);
	}
}
