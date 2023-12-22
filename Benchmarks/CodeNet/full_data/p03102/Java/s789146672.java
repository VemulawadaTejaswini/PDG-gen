import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int r = sc.nextInt();
		int max = -sc.nextInt();
		int ans = 0;
		int[] row = new int[r];
		for (int i = 0; i < r; i++) {
			row[i] = sc.nextInt();
		}
		for (int i = 0; i < h; i++) {
			int sum = 0;
			for (int j = 0; j < r; j++) {
				sum = sum + sc.nextInt() * row[j];
			}
			if (sum > max) {
				ans++;
			}
		}
		System.out.println(ans);
		sc.close();
	}
}