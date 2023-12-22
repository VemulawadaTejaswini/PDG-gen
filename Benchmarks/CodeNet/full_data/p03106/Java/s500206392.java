import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int k = sc.nextInt();

		int count = 0;
		int n = 0;

		for (int i = 1; i <= Math.max(a, b); i++) {
			if (a % i == 0 && b % i == 0) {
				count++;
				n = i;
				if (count >= k) break;
			}
		}

		System.out.println(n);
	}
}
