import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int answer = 0;
		long a[] = new long[N];
		int oddCount = 0;
		boolean possible = true;
		boolean oddCalc = true;

		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}

		while (possible) {
			oddCount = 0;
			oddCalc = true;
			Arrays.sort(a);
			for (int i = N - 1; 0 <= i; i--) {
				if (a[i] % 2 == 0 && oddCalc) {
					a[i] /= 2;
					oddCount++;
					oddCalc = false;
				} else {
					a[i] *= 3;
				}
			}
			if (oddCount == 0) possible = false;
			answer++;
		}

		System.out.println(answer - 1);
	}
}
