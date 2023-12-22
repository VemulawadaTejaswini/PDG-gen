import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] h = new int[n];
		for (int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}
		Arrays.sort(h);
		System.out.println(calc(h, n, k));	
	}

	private static int calc(int[] h, int n, int k) {
		if (h[0] >= k) {
			return h.length;
		}
		int middleIndex = (n / 2) - 1;
		int middle = h[middleIndex];
		if (middle == k) {
			return n - middleIndex;
		}
		if (middle < k) {
			h = Arrays.copyOfRange(h, middleIndex + 1, n);
		} else {
			h = Arrays.copyOfRange(h, 0, middleIndex - 1);
		}
		return calc(h, n, k);
	}
}