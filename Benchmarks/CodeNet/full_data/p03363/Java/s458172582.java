import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	//java11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long[] sum = new long[N+1];
		int max = 0;
		sum[0] = 0;
		Map<Long, Integer> count = new HashMap<>();
		count.put(0L, 1);
		for(int i=1; i<=N; i++) {
			sum[i] = sum[i-1] + sc.nextLong();

			if(count.containsKey(sum[i])) {
				int new_c = count.get(sum[i])+1;
				count.put(sum[i], new_c);
				max = Math.max(max, new_c);
			}
			else {
				count.put(sum[i], 1);
				max = Math.max(max, 1);
			}
		}

		long ans = 0;
		for(int value : count.values()) {
			ans += (long)value * (value-1) / 2;
		}

		System.out.println(ans);
	}
}
