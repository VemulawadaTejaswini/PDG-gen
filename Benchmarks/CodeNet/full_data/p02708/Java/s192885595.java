import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = (long)Integer.parseInt(sc.next());
		long K = (long)Integer.parseInt(sc.next());
		sc.close();


		long count = 0;
		long mod = (long) 1e9 + 7;
		for(long i = K; i <= N + 1; i++) {
			long value = i * N - i * (i - 1) + 1;
			count += value;
		}

		long answer = count % mod;
		int ans = (int) answer;
		System.out.println(answer);
	}

}