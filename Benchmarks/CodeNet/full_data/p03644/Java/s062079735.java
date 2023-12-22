import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int max = 0;
		int ans = 0;
		for (int i = 1; i <= n; i++) {
			int count = 0;
			for (int j = i; j % 2 == 0; j /= 2) {
				count++;
			}
			if (max <= count) {
				max = count;
				ans = i;
			}
		}
		
		System.out.println(ans);
	}
}
