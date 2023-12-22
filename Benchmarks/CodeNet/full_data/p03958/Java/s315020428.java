import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int k = sc.nextInt(), t = sc.nextInt();
		int[] a = new int[t];
		int max = 0;
		int sum = 0;
		for (int i = 0; i < t; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
			max = Math.max(max, a[i]);
		}
		System.out.println(Math.max(0, max - (sum - max) - 1));
	}
}