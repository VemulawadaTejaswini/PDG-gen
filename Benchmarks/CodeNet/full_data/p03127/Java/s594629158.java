import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		ArrayList<Integer> small = new ArrayList();
		int answer = 1;

		for (int i = 0; i < N; i++) {
			int A = scan.nextInt();
			small.add(A);
		}

		Collections.sort(small);
		int B = small.get(0);
		int S = small.get(1);
		if (B == S) {
			answer = B;
		}

		while(answer > 0 && S != B) {
			answer = Math.abs(S - B);
			S = B;
			B = answer;
		}

		if (answer == small.get(0)) {
			for (int i = 0; i < small.size(); i++) {
				if (small.get(i) % answer != 0) {
					answer = 1;
				}
			}
		}

		System.out.println(answer);
	}
}