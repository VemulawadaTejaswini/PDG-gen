import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Main {
	public static void main(String[] args){
		Main main = new Main();
		main.solveC();
	}

	private void solveC() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L = sc.nextInt();
		int T = sc.nextInt();
		int[] array = new int[N];
		Set<Integer> set = new HashSet<Integer>();
		int prev_d = 1;
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			int d = sc.nextInt();
			array[i] = x + T * (3 - d * 2);
			if (prev_d != d) {
				set.add((i - 1 + N) % N);
			}
		}
		while (!set.isEmpty()) {
			Set<Integer> nextSet = new HashSet<Integer>();
			for (int i : set) {
				if (checkAndSwap(array, i, (i + 1) % N, N, L)) {
					nextSet.add((i - 1 + N) % N);
					nextSet.add((i + 1) % N);
				}
			}
			set = nextSet;
		}
		for (int x : array) {
			System.out.println((x + L) % L);
		}
	}

	private boolean checkAndSwap(int[] array, int a, int b, int N, int L) {
		int offset = 0;
		if (a == N - 1 && b == 0) {
			offset = L;
		}
		if (array[a] - offset > array[b]) {
			int swap = array[b];
			array[b] = array[a] - offset;
			array[a] = swap + offset;
			return true;
		}
		return false;
	}
}