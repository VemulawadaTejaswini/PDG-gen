import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int K = sc.nextInt();

		HashMap<Integer, Integer> counter = new HashMap<>();

		for (int i = 0; i < N; i++) {
			int ai = sc.nextInt();
			int count = counter.getOrDefault(ai, 0) + 1;
			counter.put(ai, count);
		}

		ArrayList<Integer> vals = new ArrayList<>(counter.values());
		Collections.sort(vals);

		int upto = counter.size() - K;
		int cnt = 0;
		for (int i = 0; i < upto; i++) {
			cnt += vals.get(i);
		}
		System.out.println(cnt);
		sc.close();
	}

}