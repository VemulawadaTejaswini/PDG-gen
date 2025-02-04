import java.util.*;

// ABC 27-C
// http://abc027.contest.atcoder.jp/tasks/abc027_c
 
public class Main {
	
	static int n;
	static int w;
	static int[] weights;
	static int[] values;
	static HashMap<String, Long> memo;
	
	public static void main (String[] args) throws java.lang.Exception {
		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();
		w = in.nextInt();
		weights = new int[n];
		values = new int[n];
		
		for (int i = 0; i < n; i++) {
			weights[i] = in.nextInt();
			values[i] = in.nextInt();
		}
		memo = new HashMap<String, Long>();
		
		System.out.println(solve(0, 0, 0));
	}
	
	public static long solve(int index, long weight, long value) {
		String s = index + "," + weight;
		if (w < weight) {
			return 0;
		} else if (index == n) {
			return value;
		} else if (memo.containsKey(s)) {
			return memo.get(s);
		}
		
		long temp = Math.max(
				solve(index + 1, weight, value),
				solve(index + 1, weight + weights[index], value + values[index])
		);
		memo.put(s, temp);
		
		return temp;
	}
}