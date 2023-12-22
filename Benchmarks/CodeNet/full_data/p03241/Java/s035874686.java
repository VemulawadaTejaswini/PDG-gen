import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		List<Integer> x = new ArrayList<>();
		for (int i = 1; i <= M/2 + 1; i++) {
			if (M % i == 0) {
				x.add(i);
				x.add(M / i);
			}
		}
		Collections.sort(x);
		Set<Integer> t = new HashSet<>(x);
		x = new ArrayList<>(t);

		int ans = 0;
		for (int i = 0; i < x.size(); i++) {
			if(M/x.get(i) >= N && x.get(i) > ans) {
				ans = x.get(i);
			}
		}

		System.out.println(ans);
	}
}