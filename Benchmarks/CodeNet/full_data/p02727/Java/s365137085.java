import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		long p[] = new long[a];
		long q[] = new long[b];
		long r[] = new long[c];

		for (int i = 0; i < a; i++) {
			p[i] = sc.nextLong();
		}

		for (int i = 0; i < b; i++) {
			q[i] = sc.nextLong();
		}

		for (int i = 0; i < c; i++) {
			r[i] = sc.nextLong();
		}

		Arrays.sort(p);
		Arrays.sort(q);
		Arrays.sort(r);

		int aCount = a - x;
		int bCount = b - y;
		for (int i = 0; i < c; i++) {
			if (aCount < a && bCount < b) {
				if (p[aCount] < q[bCount]) {
					p[aCount] = Math.max(r[i], p[aCount]);
					aCount++;
				} else {
					q[bCount] = Math.max(r[i], q[bCount]);
					bCount++;
				}
			}

		}

		long answer = 0;
		for (int i = a - 1; a - x <= i; i--) {
			answer += p[i];
		}
		for (int i = b - 1; b - y <= i; i--) {
			answer += q[i];
		}

		System.out.println(answer);
		sc.close();

	}
}