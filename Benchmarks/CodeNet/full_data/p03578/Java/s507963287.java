
import java.util.HashMap;

import java.util.Map;
import java.util.Scanner;


public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		int N = sc.nextInt();
		int[] candSet = new int[N];
		for (int i = 0; i < N; i++) {
			candSet[i] = sc.nextInt();
		}
		int M = sc.nextInt();
		int[] MSet = new int[M];
		for (int i = 0; i < M; i++) {
			MSet[i] = sc.nextInt();
		}
		String res = helper(candSet, MSet);
		System.out.println(res);
	}

	private static String helper(int[] candSet, int[] mSet) {
		// TODO Auto-generated method stub
		if (candSet.length < mSet.length)
			return "NO";
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		for (int i : candSet)
			m.put(i, m.getOrDefault(i, 0) + 1);
		for (int i : mSet) {
			if (!m.containsKey(i))
				return "NO";
			int k = m.get(i);
			if (k == 1)
				m.remove(i);
			else
				m.put(i, k - 1);

		}
		return "YES";

	}
}