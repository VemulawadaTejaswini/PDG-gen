import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int p = scanner.nextInt();
		String s = scanner.next();
		int count;

		if (p == 2 || p == 5) {
			count = 0;
			for (int i = 0; i < n; i++) {
				if (Integer.parseInt(s, i, i + 1, 10) % p == 0) {
					count += i + 1;
				}
			}
		} else {
			r = new int[p];
			place = new int[p - 1];
			place[0] = 1;
			for (int i = 1; i < p - 1; i++) {
				place[i] = place[i - 1] * 10 % p;
			}
			int remain = 0;
			for (int i = 0; i < n; i++) {
				remain += (s.charAt(n - 1 - i) - 48) * place[i % (p - 1)];
				remain %= p;
				r[remain]++;
			}

			count = Arrays.stream(r).parallel().map(i -> i * (i - 1) / 2).sum() + r[0];

		}

		System.out.println(count);

	}

	static int[] r;
	static int[] place;//10^a mod p=10^(a%(p-1)) mod p

}
