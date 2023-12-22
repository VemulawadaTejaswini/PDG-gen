
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] l = new int[n];
			for (int i = 0; i < n; i++) {
				l[i] = sc.nextInt();
			}
			Arrays.sort(l);
			int result = 0;
			for (int i = 0; i < n - 2; i++) {
				for (int j = i + 1; j < n - 1; j++) {
					for (int k = j + 1; k < n; k++) {
						if (check(l[i], l[j], l[k])) {
							result++;
						} else {
							break;
						}
					}
				}
			}
			System.out.println(result);
		}
	}

	private static boolean check(int a, int b, int c) {
		return a + b > c && b + c > a && c + a > b;
	}
}
