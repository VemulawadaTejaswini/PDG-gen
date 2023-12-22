
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] list = new long[n];
		for(int i = 0; i < n; i++) {
			list[i] = sc.nextLong();
		}
		List<Long> m = new ArrayList<>();
		List<Long> mlr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			for(int k = i; k < n; k++) {
				for(int j = i; j < k + 1; j++) {
					mlr.add(list[j]);
				}
				Collections.sort(mlr);
				m.add(mlr.get(mlr.size() / 2));
				mlr.clear();
			}
		}
		Collections.sort(m);
		long ans = m.get(m.size() / 2);
		System.out.println(ans);

	}

}
