import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int[] left = new int[n];
		left[0] = arr[0];
		for (int i = 1; i < n; i++) {
			left[i] = gcd(left[i - 1], arr[i]);
		}
		int[] right = new int[n];
		right[n - 1] = arr[n - 1];
		for(int i = n - 2; i >= 0; i--) {
			right[i] = gcd(right[i + 1], arr[i]);
		}
		int max = 0;
		for (int i = 1; i < n - 1; i++) {
			int g = gcd(left[i - 1], right[i + 1]);
			max = Math.max(max, g);
		}
		max = Math.max(max, right[1]);
		max = Math.max(max, left[n - 2]);
		System.out.println(max);
	}
	
	static int gcd(int a, int b){
		if (a % b == 0) {
			return b;
		}
		return gcd(b, a % b);
	}
}
