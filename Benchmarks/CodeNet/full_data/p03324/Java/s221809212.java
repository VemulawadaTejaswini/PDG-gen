import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int d = sc.nextInt();
		int n = sc.nextInt();
		int ans = 0;
		if (n == 100) {
			ans = (int) Math.pow(100, d) * (n + 1);
		} else {
			ans = (int) Math.pow(100, d) * n;
		}

		System.out.println(ans);
	}
}
