
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int x = in.nextInt();
		int count = 0;
		int a[] = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = in.nextInt();
		}
//		Arrays.sort(a);
		for (int i = 0; i < N-1; i++) {
			for (int j = 0; j < N-1; j++) {
				if (a[j] > a[j + 1]) {
					int asc = a[j];
					a[j] = a[j + 1];
					a[j + 1] = asc;
				}
			}
		}
		for (int i = 0; i < N; i++) {
			x = x - a[i];
			if (x >= 0) {
				count++;
			}
		}
		if (x > 0) {
			count--;
		}
		System.out.println(count);

	}
}
