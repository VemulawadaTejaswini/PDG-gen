import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] alpha = new int[26];
		for (int i = 0; i < n; i++) {
			char c = sc.next().charAt(0);
			alpha[c - 'A']++;
		}
		Arrays.sort(alpha);
		for (int i = n / k; i > 0; i--) {
			int count = n - i * k;
			for (int j = 25; j >= 0; j--) {
				int x = alpha[j];
				if (x <= i) {
					break;
				}
				count -= x - i;
				if (count < 0) {
					break;
				}
			}
			if (count >= 0) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(0);
	}
}
