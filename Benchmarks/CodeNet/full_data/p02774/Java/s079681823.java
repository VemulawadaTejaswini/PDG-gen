import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		List<Long> values = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			values.add(scan.nextLong());
		}
		List<Long> answers = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				answers.add(values.get(i) * values.get(j));
			}
		}
		Collections.sort(answers);
		if (K - 1 >= answers.size()) {
			System.out.print(0);
		}
		else {
			System.out.print(answers.get(K - 1));
		}
	}
}
