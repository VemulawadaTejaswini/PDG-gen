import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] counts = new int[9];
		for (int i = 0; i < n; i++) {
			int rate = sc.nextInt();
			int pos = Math.min(8, rate / 400);
			counts[pos]++;
		}

		int min = 0;
		for (int i = 0; i < counts.length - 1; i++) {
			if (counts[i] > 0) {
				min++;
			}
		}

		int max = Math.min(8, min + counts[counts.length-1]);
		min = Math.max(Math.min(8, counts[counts.length-1]), min);
		System.out.println(min + " " + max);
	}
}