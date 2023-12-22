import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int a[] = new int[N];
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		Arrays.sort(a);
		int m = a[a.length - 1];
		int b[] = new int[m];
		int Maxc = 0, Minc = 0;
		for (int i = 0; i < N; i++) {
			if (a[i] == m) {
				Maxc++;
			}
			if (a[i] == a[0]) {
				Minc++;
			}
			b[a[i] - 1]++;
		}
		if (Maxc != N - m + 1) {
			System.out.println("Impossible");
			return;
		}
		for (int i = a[a.length - 1]; i < b.length; i++) {
			
			if (b[i] < 2) {
				System.out.println("Impossible");
				return;
			}
		}

		System.out.println("Possible");
	}
}
