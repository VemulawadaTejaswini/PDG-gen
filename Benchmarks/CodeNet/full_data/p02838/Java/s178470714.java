import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] input = new long[N];
		for (int i = 0; i < N; i++) {
			input[i] = sc.nextLong();
		}
		long res = 0;
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				res += (input[i] ^ input[j]) % 1000000007;
			}
		}
		System.out.print(res % 1000000007);
	}
}
