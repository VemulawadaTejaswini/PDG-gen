import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int t = sc.nextInt();
		int ans = X - t;
		if (ans < 0) {
			ans = 0;
		}
		System.out.println(ans);
	}
}