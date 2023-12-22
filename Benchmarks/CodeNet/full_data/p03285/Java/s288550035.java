import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cake = 4;
		int donut = 7;
		int ans = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				ans = cake * i + donut * j;
				if (ans == n) {
					System.out.println("Yes");
					return;
				}
			}
		}
		System.out.println("No");
	}

}
