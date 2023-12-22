import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		long H = in.nextLong();
		int[] a = new int[N];
		int[] b = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = Integer.parseInt(in.next());
			b[i] = Integer.parseInt(in.next());
		}
		Arrays.sort(a);
		Arrays.sort(b);
		long ans = 0;
		for (int i = b.length - 1; i >= 0 && H > 0; i--) {
			if (b[i] > a[a.length - 1]) {
				H -= b[i];
				ans++;
			} else {
				break;
			}
		}
		if (H > 0) {
			ans += H / a[a.length - 1] + ((H % a[a.length - 1] != 0) ? 1 : 0);
		}
		System.out.println(ans);
		in.close();
	}
}