import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int min = Integer.MAX_VALUE;
		int result = 0;
		for (int i = 0; i < n; i++) {
			int p = sc.nextInt();
			if (p < min) {
				result++;
				min = p;
			}
		}
		sc.close();

		System.out.println(result);
	}
}
