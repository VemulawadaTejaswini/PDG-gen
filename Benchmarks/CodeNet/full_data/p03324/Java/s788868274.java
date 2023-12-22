import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long D = sc.nextLong();
		long N = sc.nextLong();
		long ans = (long)Math.pow(100, D) * N;

		System.out.println(ans);

	}
}
