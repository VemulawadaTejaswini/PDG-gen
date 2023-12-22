import java.util.*;

public class Main {
	
	static final long MOD = 1000000007L;
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int x;
		int y;
		if (n % 2 == 0) {
			x = 0;
			y = 1;
		} else {
			x = 1;
			y = 0;
		}
		Arrays.sort(arr);
		for (int i = 0; i < n; i++) {
			if (arr[i] != ((i + x) / 2) * 2 + y) {
				System.out.println(0);
				return;
			}
		}
		System.out.print(pow2(n / 2));
	}
	
	static long pow2(int times) {
		if (times == 0) {
			return 1;
		} else {
			return (2 * pow2(times - 1)) % MOD;
		}
	}
}
