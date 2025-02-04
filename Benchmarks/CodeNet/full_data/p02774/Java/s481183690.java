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
		for (int i=0; i<N; i++) {
			long A = scan.nextInt();
			values.add(A);
		}
		List<Long> answers = new ArrayList<>();
		for (int i=0; i<N; i++) {
			for (int j=i+1; j<N; j++) {
				long A1 = values.get(i);
				long A2 = values.get(j);
				answers.add(A1 * A2);
			}
		}
		Collections.sort(answers);
		System.out.print(answers.get(K - 1));
	}
}
