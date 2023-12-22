import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long N = scanner.nextLong();
		long K = scanner.nextLong();

		double ans = K * Math.pow((double)K-1,(double)N-1);

		System.out.println((long)ans);
		scanner.close();
	}

}
