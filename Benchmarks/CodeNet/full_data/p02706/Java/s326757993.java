import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long sum = 0;
		for (int i = 0; i < m; i++) {
			sum += sc.nextInt();
		}
		sc.close();
		if (n >= sum) {
			System.out.println(sum - n);
		} else {
			System.out.println(-1);
		}
	}
}
