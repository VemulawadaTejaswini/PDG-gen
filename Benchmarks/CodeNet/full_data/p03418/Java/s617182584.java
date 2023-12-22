import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int count = 0;

		for (int i = 0; i <= 100000; i++) {
			for (int l = k; l < n; l++) {
				for (int b = l + 1; b <= n; b++) {
					if ((i * b + l) <= n && (i * b + l) > 0) {
						count++;
					}
				}
			}
		}
		System.out.println(count);

		sc.close();

	}

}