import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		int[] a = new int[N];
		int b = 0;
		int ans = 0;

		for (int i = 0; i < N; i++) {
			a[i] = reader.nextInt() - 1 - i;
		}
		Arrays.sort(a);
		if (N % 2 == 0) {
			b = (a[N/2] + a[N/2 - 1])/2;
		} else {
			b = a[N/2];
		}


		for (int i = 0; i < N; i++) {
			ans += Math.abs(a[i]-b);
		}
		reader.close();
		System.out.print(ans);
	}
}

