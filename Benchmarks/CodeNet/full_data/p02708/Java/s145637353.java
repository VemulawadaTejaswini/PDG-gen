import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();

		long answer = 0;
		for (int i = K; i <= N + 1; i++) {
			long temp = 0;
			temp += ((i * (2 * (N - i + 1) + (i - 1)) / 2) % 1000000007) + 1000000007;
			temp -= ((i * (i - 1) / 2) - 1) % 1000000007;

			answer += temp;
		}

		System.out.println(answer % 1000000007);
	}
}