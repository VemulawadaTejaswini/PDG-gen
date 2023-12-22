import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		ArrayList<Long> sum = new ArrayList<>();
		long cur = 0;
		for (int i = 0; i < n; ++i) {
			cur += sc.nextLong();
			sum.add(cur);
		}
		long ans = 0;
		sum.add(0L);
		Collections.sort(sum);
		for (int i = 0; i < sum.size(); ++i) {
			int j = i;
			while (j + 1 < sum.size() && sum.get(j) == sum.get(j + 1))
				++j;
			if (i != j) {
				long tot = j - i + 1;
				ans += tot * (tot - 1) / 2;
			}
			i = j;
		}
		System.out.println(ans);
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
