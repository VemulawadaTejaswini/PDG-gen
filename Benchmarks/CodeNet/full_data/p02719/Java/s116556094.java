import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long K = sc.nextLong();
		if (N < K) {
			System.out.println(N);
		} else {
			long x = N % K;
			System.out.println(Math.min(x, Math.abs(x - K)));
		}

	}

}
