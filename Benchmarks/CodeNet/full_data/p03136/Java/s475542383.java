import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] l = new int[n];
		for (int i = 0; i < n; i++) {
			l[i] = sc.nextInt();
		}
		sc.close();

		int max = 0;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			max = Math.max(max, l[i]);
			sum += l[i];
		}
		if (sum - max > max) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
