import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 2);map.put(2, 5);map.put(3, 5);map.put(4, 4);map.put(5, 5);
		map.put(6, 6);map.put(7, 3);map.put(8, 7);map.put(9, 6);
		Integer[] A = new Integer[M];
		for (int i=0;i<M;i++) {
			A[i] = Integer.parseInt(sc.next());
		}
		Arrays.sort(A, Comparator.reverseOrder());

		int[] dp = new int[N+1];
		for (int i=1;i<N;i++) {
			dp[i] = -(Integer.MAX_VALUE-200);
		}
		for (int i=1;i<N+1;i++) {
			int tmp_max = -(Integer.MAX_VALUE-200);
			for (int j : A) {
				if (i-map.get(j)<0) {
					continue;
				}
				tmp_max = Math.max(tmp_max, dp[i-map.get(j)]);
			}
			dp[i] = tmp_max + 1;
		}

		int tmp = N;
		String ans = "";
		for (int i=0;i<dp[N];i++) {
			for (int j : A) {
				if (tmp-map.get(j)<0) {
					continue;
				}
				if (dp[tmp-map.get(j)] == dp[tmp] - 1) {
					ans += String.valueOf(j);
					tmp -= map.get(j);
					break;
				}
			}
		}
		System.out.println(ans);
	}
}