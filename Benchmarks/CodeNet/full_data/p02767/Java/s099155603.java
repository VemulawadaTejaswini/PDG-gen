import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] xs = new int[n];
		for (int i = 0; i < n; i++) {
			xs[i] = sc.nextInt();
		}
		int min = Integer.MAX_VALUE;
		for (int p = 0; p < 101; p++) {
			int temp = 0;
			for (int x : xs) {
				int t = (x - p);
				t = t * t;
				temp = temp + t;
			}
			min = Math.min(min, temp);
		}
		System.out.println(min);
	}
}
