import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		if (N % 2 == 1) {
			System.out.print(0);
		} else {
			long res = 0;
			for (int i = 1; i <= 18; i++) {
				res += N / (long) Math.pow(10, i);
			}
			for (int i = 1; i <= 20; i++) {
				res += N / (long) (Math.pow(10, i) * 5);
				res -= N / (long) Math.pow(10, i + 1);
			}
			System.out.print(res);
		}
	}
}