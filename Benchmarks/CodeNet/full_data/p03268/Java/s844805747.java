import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.close();

		if (k % 2 == 0) {
			long k2 = k / 2;
			long v1 = n / k;
			long v2 = n / k2 - v1;
			System.out.println(v1 * v1 * v1 + v2 * v2 * v2);
		} else {
			long v1 = n / k;
			System.out.println(v1 * v1 * v1);
		}
	}
}
