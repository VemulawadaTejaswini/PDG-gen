import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long h = sc.nextLong();
		int[] a = new int[n], b = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		int max = Arrays.stream(a).max().getAsInt();
		Arrays.sort(b);
		long ans = 0L;
		for(int i = n-1; i >= 0; i--) {
			if(b[i] >= max) {
				h -= b[i];
				ans++;
				if(h <= 0) {
					System.out.println(ans);
					return;
				}
			} else {
				break;
			}
		}
		System.out.println(ans+(int)Math.ceil((double)h/(double)max));
	}
}