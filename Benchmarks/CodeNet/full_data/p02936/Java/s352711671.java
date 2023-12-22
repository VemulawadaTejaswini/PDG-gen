import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int Q = scan.nextInt();
		Map<Integer, Integer> score = new HashMap<>();
		Map<Integer, Set<Integer>> upper = new HashMap<>();
		Map<Integer, Set<Integer>> lower = new HashMap<>();
		for (int i = 0; i < N - 1; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			score.put(a, 0);
			score.put(b, 0);

			// 上位の設定
			setUpper(upper, a, b);
			setLower(lower, upper, a, b);
		}
		// カウンターの値を設定
		for (int i = 0; i < Q; i++) {
			int p = scan.nextInt();
			int x = scan.nextInt();
			Set<Integer> tmpLower = lower.get(p);
			for (int j : tmpLower) {
				int bfScore = score.get(j);
				score.put(j, bfScore + x);
			}
		}

		// 結果の出力
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < N; i++) {
			sb.append(score.get(i + 1) + " ");
		}
		System.out.print(sb);
	}

	public static void setUpper(Map<Integer, Set<Integer>> upper, int a, int b) {
		Set<Integer> tmpUpper = upper.get(a);
		if (tmpUpper == null) {
			tmpUpper = new HashSet<>();
			tmpUpper.add(a);
			upper.put(a, tmpUpper);
		}
		else {
			Set<Integer> tmpUpper2 = new HashSet<>();
			for(int j : tmpUpper) {
				tmpUpper2.add(j);
			}
			for(int j : tmpUpper2) {
				Set<Integer> tmpUpper3 = upper.get(j);
				for(int u : tmpUpper3) {
					tmpUpper.add(u);
				}
			}
		}
		tmpUpper = upper.get(b);
		if (tmpUpper == null) {
			tmpUpper = new HashSet<>();
			tmpUpper.add(a);
			upper.put(b, tmpUpper);
		}
		else {
			tmpUpper.add(a);
		}
	}

	public static void setLower(Map<Integer, Set<Integer>> lower, Map<Integer, Set<Integer>> upper, int a, int b) {
		// 下位の設定
		Set<Integer> tmpLower = lower.get(a);
		if (tmpLower == null) {
			tmpLower = new HashSet<>();
		}
		tmpLower.add(a);
		tmpLower.add(b);
		lower.put(a, tmpLower);

		tmpLower = lower.get(b);
		if (tmpLower == null) {
			tmpLower = new HashSet<>();
		}
		tmpLower.add(b);
		lower.put(b, tmpLower);

		Set<Integer> tmpUpper = upper.get(a);
		for(int j : tmpUpper) {
			tmpLower = lower.get(j);
			if (tmpLower != null) {
				tmpLower.add(b);
			}
		}
	}
}
