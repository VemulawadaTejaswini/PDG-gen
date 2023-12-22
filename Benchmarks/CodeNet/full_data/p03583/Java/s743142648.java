import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextInt();
		for(long n = 1; n <= 3500; n++) {
			for(long w = 1; w <= 3500; w++) {
				long k1 = N * n * w;
				long k2 = 4 * n * w - N * (n + w);
				if(k2 >= 1 && k1 % k2 == 0) {
					System.out.printf("%d %d %d", k1 / k2, n, w);
					System.exit(0);
				}
			}
		}
		sc.close();
	}
}