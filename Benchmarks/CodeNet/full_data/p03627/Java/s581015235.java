import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		long a = 0;
		long b = 0;
		HashSet<Integer> set = new HashSet<>();
		for (int i = n - 1; i >= 0; i--) {
			int x = arr[i];
			if (set.contains(x)) {
				if (a == 0) {
					a = x;
					set.remove(x);
				} else {
					b = x;
					break;
				}
			} else {
				set.add(x);
			}
		}
		System.out.println(a * b);
	}
}
