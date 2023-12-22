import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sn = new Scanner(System.in);
		
		int n = sn.nextInt();
		int[] h = new int[n];
		for (int i = 0; i < n; i++) {
			h[i] = sn.nextInt();
		}
		int [] sorted = Arrays.copyOf(h, n);
		Arrays.sort(sorted);
		
		if (isSorted(h, sorted)) {
			System.out.println("Yes");
			return;
		}
		
		int[] newSorted = Arrays.copyOf(h, n);
		Arrays.sort(newSorted);
		System.out.println((isSorted(h, newSorted)) ? "Yes" : "No");
	}
	
	private static boolean isSorted(int[] h, int[] sorted) {
		for (int i = 0; i < sorted.length; i++) {
			if (sorted[i] != h[i]) {
				h[i] = h[i] - 1;
				return false;
			}
		}
		return true;
	}
}
