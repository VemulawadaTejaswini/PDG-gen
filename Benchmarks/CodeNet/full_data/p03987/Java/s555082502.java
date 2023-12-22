import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] rev = new int[n+1];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			rev[arr[i]] = i;
		}

		long count = 0;

		TreeSet<Integer> sorted = new TreeSet<>();
		for(int under = 0; under < n; under++) {
			for(int upper = under; upper < n; upper++) {
				int min = n+1;
				for(int i = under; i <= upper; i++) {
					min = Math.min(min, arr[i]);
				}
				count+=min;
			}
		}
		System.out.println(count);
	}
}
