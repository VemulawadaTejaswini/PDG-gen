import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		ArrayList<Integer> A = new ArrayList<>();
		for (int i = 1; i <= N; i++) {
			int a = sc.nextInt();
			A.add(a - i);
		}

		Collections.sort(A);

		int median = A.get((N - 1) / 2);
		int answer = 0;

		for (int i = 0; i < N; i++) {
			answer += Math.abs(A.get(i) - median);
		}

		System.out.println(answer);
	}
}
