import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException {
		Main main = new Main();
		main.solveD();
	}

	private void solveD() throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		Map<Integer, Set<Integer>> dp = new HashMap<>();
		for (int i = 0; i < N; i++) {
			Set<Integer> set = new HashSet<>();
			set.add(0);
			dp.put(i, set);
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i == j) {
					continue;
				}
				Set<Integer> targetSet = dp.get(j);
				Set<Integer> newSet = new HashSet<>(targetSet);
				for (int num : targetSet) {
					if (num + a[i] < K) {
						newSet.add(num + a[i]);
					}
				}
				dp.put(j, newSet);
			}
		}
		int ans = N;
		for (int i = 0; i < N; i++) {
			if (a[i] > K) {
				ans--;
				break;
			}
			Set<Integer> set = dp.get(i);
			for (int j = K - 1; j >= K - a[i]; j--) {
				if (set.contains(j)) {
					ans--;
					break;
				}
			}
		}
		System.out.println(ans);
	}
}