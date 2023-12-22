import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] monsters = new int[n];
		for (int i = 0; i < n; i++) {
			monsters[i] = sc.nextInt();
		}
		Arrays.sort(monsters);
		int left = 0;
		int right = 1000000000;
		while (right - left > 1) {
			int m = left + (right - left) / 2;
			if (check(monsters, a, b, m)) {
				right = m;
			} else {
				left = m;
			}
		}
		System.out.println(right);
	}
	
	static boolean check(int[] arr, long max, long avg, long value) {
		long minus = avg * value;
		long bonus = max - avg;
		for (int i = arr.length - 1; i >= 0 && value >= 0; i--) {
			if (arr[i] - minus > 0) {
				value -= (arr[i] - minus + bonus - 1) / bonus;
			} else {
				break;
			}
		}
		return value >= 0;
	}
}
