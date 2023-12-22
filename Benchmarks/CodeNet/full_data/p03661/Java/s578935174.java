import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int[] a = new int[n];
		long sum = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}
		long sunuke = 0, dif = Long.MAX_VALUE;
		for (int i = 0; i < n - 1; i++) {
			sum = sum - a[i];
			sunuke += a[i];
			dif = Math.min(dif, Math.abs(sum - sunuke));
		}
		System.out.println(dif);
	}
}
