import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = sc.nextInt();
		// long[] a = new long[n];
		// for (int i = 0; i < n; i++) {
		// a[i] = sc.nextLong();
		// }
		sc.close();
		long ans = n - b + 1;
		System.out.println(ans);
	}
}
