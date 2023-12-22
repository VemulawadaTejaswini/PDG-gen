import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int p = scanner.nextInt();
		String s = scanner.next();
		long count = 0;

		if (p == 2 || p == 5) {
			for (int i = 0; i < n; i++) {
				if ((s.charAt(i) - 48) % p == 0) {
					count += i + 1;
				}
			}
		} else {
			int[] place = new int[p - 1];//10^a mod p=10^(a%(p-1)) mod p
			place[0] = 1;
			for (int i = 1; i < p - 1; i++) {
				place[i] = place[i - 1] * 10 % p;
			}

			int[] r = new int[p];
			r[0] = 1;
			int remain = 0;
			for (int i = 0; i < n; i++) {
				remain += (s.charAt(n - 1 - i) - 48) * place[i % (p - 1)];
				remain %= p;
				r[remain]++;
			}

			for (int i = 0; i < p; i++)
				count += (long) r[i] * (r[i] - 1) / 2;

		}
		System.out.println(count);
	}

}
