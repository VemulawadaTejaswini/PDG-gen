import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		int ans = 1;
		int x = a;
		while (x < b) {
			x += a - 1;
			ans++;
		}
		System.out.println(ans);
	}
}
