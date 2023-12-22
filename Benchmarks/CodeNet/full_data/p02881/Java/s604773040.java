import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// 整数の入力
			long a = sc.nextLong();
			long r = (long) Math.sqrt(a);
			long factA = 0;
			long factB = 0;
			for (long i = r; i > 0; i--) {
				if (a % i == 0) {
					factA = i;
					factB = a / i;
					break;
				}
			}
			System.out.println(factA + factB - 2);
		}
	}
}
