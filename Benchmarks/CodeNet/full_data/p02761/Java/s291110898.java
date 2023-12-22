import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int target[] = new int[N];
		Arrays.fill(target, 0);
		int M = sc.nextInt();

		int s[] = new int[M];
		int c[] = new int[M];

		for (int i = 0; i < M; i++) {
			s[i] = sc.nextInt();
			c[i] = sc.nextInt();
			target[s[i] - 1] = c[i];
		}

		int answer = 0;
		for (int i = N - 1; 0 <= i; i--) {
			answer += target[N - i - 1] * Math.pow(10, i);
		}

		if (String.valueOf(answer).length() == N) {
			System.out.println(answer);
		} else {
			System.out.println("-1");
		}

	}
}