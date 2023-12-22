import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
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
		long sum = 0L;
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}
		Arrays.sort(a);
		Map<Integer, Set<Long>> setMap = new HashMap<>();
		for (int i = 0; i < N; i++) {
			Set<Long> init = new HashSet<>();
			init.add(sum);
			setMap.put(i, init);
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i == j) {
					continue;
				}
				Set<Long> targetSet = setMap.get(j);
				Set<Long> newSet = new HashSet<>(targetSet);
				for (long num : targetSet) {
					newSet.add(num - a[i]);
				}
				setMap.put(j, newSet);
			}
		}
		int ans = N;
		for (int i = 0; i < N; i++) {
			Set<Long> set = setMap.get(i);
			for (long num : set) {
				if (num - a[i] < K && num >= K) {
					ans--;
					break;
				}
			}
		}
		System.out.println(ans);
	}
}