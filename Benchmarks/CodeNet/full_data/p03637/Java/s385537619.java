import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		long[] a = new long[N];
		int four = 0;
		int two = 0;
		int odd = 0;
		for (int i = 0; i < N; i++) {
			a[i] = in.nextLong();
			if (a[i] % 4 == 0) {
				four++;
			} else if (a[i] % 2 == 0) {
				two++;
			} else {
				odd++;
			}
		}
		if (odd + two % 2 <= four + 1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		in.close();
	}
}