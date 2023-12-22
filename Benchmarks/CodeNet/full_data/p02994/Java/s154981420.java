import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L = sc.nextInt();
		List<Integer> azi = new ArrayList<Integer>();
		int answer = 0;

		for (int i = 1; i <= N; i++) {
			azi.add(L + i - 1);
		}

		Collections.sort(azi);

		if (azi.contains(0) && L != 0) {
			for (int i = 0; i < N; i++) {
				answer += azi.get(i);
			}
		} else if (azi.get(azi.size() - 1) < 0) {
			for (int i = 0; i < N - 1; i++) {
				answer += azi.get(i);
			}
		} else {
			for (int i = 1; i < N; i++) {
				answer += azi.get(i);
			}
		}
		System.out.println(answer);
	}
}
