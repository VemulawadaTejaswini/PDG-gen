import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	private void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		int[] ball = new int[N];
		for (int i = 0; i < N; i++) {
			ball[i] = sc.nextInt();
		}
		Arrays.sort(ball);

		HashMap<Integer, LinkedList<Integer>> index = new HashMap<>();
		for (int i = 0; i < N; i++) {
			if (!index.containsKey(ball[i])) {
				index.put(ball[i], new LinkedList<Integer>());
			}
			index.get(ball[i]).add(i);
		}
		boolean[] used = new boolean[N];

		int p = 1;
		while (p <= ball[N - 1]) {
			p *= 2;
		}

		int i = N - 1;
		int pairs = 0;
		while (i >= 0 && p > 1) {
			while (i >= 0 && ball[i] >= (p / 2)) {
				int diff = p - ball[i];
				if (used[i] == false && index.containsKey(diff)) {
					LinkedList<Integer> l = index.get(diff);
					used[i] = true;
					if (l.peekLast() == i) {
						l.removeLast();
					}
					if (l.size() > 0) {
						used[l.removeLast()] = true;
						pairs++;
						if (l.isEmpty()) {
							index.remove(diff);
						}
					}
				}
				i--;
			}
			p = p / 2;
		}
		System.out.println(pairs);
		sc.close();
	}

}
