import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		long N;
		long K;
		Scanner sc = new Scanner(System.in);
		N = sc.nextLong();
		K = sc.nextLong();
		long mod = N % K;
		System.out.println(Math.min(mod, Math.abs(mod - K)));
		sc.close();
	}
}