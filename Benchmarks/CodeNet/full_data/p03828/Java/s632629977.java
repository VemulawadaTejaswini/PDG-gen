import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		scanner.close();

		// 10! = 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1
		// 10! = (2 * 5) * (3^2) * (2*3) * (7)

		HashMap<Long, Long> array = new HashMap<Long, Long>();
		for(long i = 2; i <= n; i++) {
			long k = i;
			for(long j = 2; j * j <= k; j++) {
				if(i % j == 0) {
					if(!array.containsKey(j)) {
						array.put(j, 0L);
					}
					array.put(j, array.get(j) + 1);
					k = i / j;
				}
			}
			if(!array.containsKey(i)) {
				array.put(i, 0L);
			}
			array.put(i, array.get(i) + 1);
		}

		long answer = 1;
		for(Map.Entry<Long, Long> entry : array.entrySet()) {
			answer = answer * (entry.getValue() + 1) % 1000000007;
		}
		System.out.println(answer);
	}
}