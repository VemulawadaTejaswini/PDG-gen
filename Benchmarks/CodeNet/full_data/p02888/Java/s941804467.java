import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] l = new int[n];
		for (int i = 0; i < n; i++) {
			l[i] = sc.nextInt();
		}
		long count = 0L;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				int a = l[i] + l[j];
				for (int k = j + 1; k < n; k++) {
					int b = l[j] + l[k];
					int c = l[i] + l[k];
					if (a > l[k] && b > l[i] && c > l[j]) {
						++count;
					}
				}
			}
		}
		System.out.println(count);
	}
}
