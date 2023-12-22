import java.math.BigInteger;
import java.util.*;

// Tenakaichi 2017-C
// http://tenka1-2017.contest.atcoder.jp/tasks/tenka1_2017_c	

public class Main {

	static int N;
	static int K;
	static int[] nums;
	static int[] values;
	
	static long answer = 0;
	static HashMap<String, Integer> map;
	
	public static void main (String[] args) throws InterruptedException {
		Scanner in = new Scanner(System.in);

		N = in.nextInt();
		K = in.nextInt();
		nums = new int[N];
		values = new int[N];
		map = new HashMap<String, Integer>();
		
		for (int i = 0; i < N; i++) {
			nums[i] = in.nextInt();
			values[i] = in.nextInt();
		}
		
		solve(0, 0, 0);
		System.out.println(answer);
	}
	
	public static void solve(int index, int currentA, long currentValue) {
		if (currentA > K) {
			return;
		}
		StringBuilder sb = new StringBuilder();
		sb.append(index);
		sb.append(",");
		sb.append(currentA);
		if (map.containsKey(sb.toString())) {
			return;
		}
		answer = Math.max(answer, currentValue);
		if (index == N) {
			return;
		}
		solve(index + 1, currentA | nums[index], currentValue + values[index]);
		solve(index + 1, currentA, currentValue);
		map.put(sb.toString(), 1);
	}
	
}
