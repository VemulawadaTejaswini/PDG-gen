import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		long X = sc.nextLong();
		
		if (N == 1) {
			System.out.println(Math.abs(X - sc.nextLong()));
			return;
		}
		
		List<Long> cityList = new ArrayList<>();
		
		for (int i = 0; i < N; i++) {
			cityList.add(sc.nextLong());
		}
		Collections.sort(cityList, Collections.reverseOrder());

		long lastDiff = Math.abs(cityList.get(0) - cityList.get(1));
		long minNum = Math.abs(cityList.get(cityList.size() - 1));

		for (long k = lastDiff; k >= 1; k--) {
			for (int i = 0; i < N; i++) {
				if (!(Math.abs(cityList.get(i)) % k == minNum % k)) {
					break;
				}
				if (i == N - 1) {
					System.out.println(k);
					return;
				}
			}
		}
	}
}
