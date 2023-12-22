import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
		}

		int[] b = new int[n + 1];

		for (int i = n; i >= 1; i--) {
			int sum = 0;
			for (int j = i * 2; j <= n; j += i) {
				sum = (sum + b[j]) % 2;
			}
			if (a[i] % 2 == 0) {
				if (sum % 2 == 1) b[i] = 1;
			} else {
				if (sum % 2 == 0) b[i] = 1;
			}
		}

		List<Integer> answer = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			if (b[i] % 2 == 1) {
				answer.add(i);
			}
		}
		System.out.println(answer.size());
		if (answer.size() == 0) return;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < answer.size(); i++) {
			sb.append(answer.get(i));
			sb.append(" ");
		}

		System.out.println(sb.toString());
	}
}
