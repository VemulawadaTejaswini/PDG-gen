import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
		    arr[i] = sc.nextInt() - i - 1;
		}
		Arrays.sort(arr);
		long total = 0;
		int base = arr[n / 2];
		for (int i = 0; i < n; i++) {
		    total += Math.abs(arr[i] - base);
		}
		System.out.println(total);
	}
}
