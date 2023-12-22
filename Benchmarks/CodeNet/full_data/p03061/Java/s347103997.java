import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 3
		// 7 6 8
		int n = sc.nextInt();
		int N = 1000000;
		int[] arr = new int[N];
		for (int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
		}
		int[] left = new int[N];
		int[] right = new int[N];
		for (int i = 1; i <= n; i++) {
			left[i] = gcd(left[i - 1], arr[i]);
		}
		for (int i = n; i >= 1; i--) {
			right[i] = gcd(right[i + 1], arr[i]);
		}
		int ans = 1;
		for (int i = 1; i <= n; i++) {
			int t = gcd(left[i - 1], right[i + 1]);
			ans = Math.max(ans, t);
		}
		System.out.println(ans);
	}

	private static int gcd(int a, int b) {
		if (b <= 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}
}

 
 

 
 
 
 
