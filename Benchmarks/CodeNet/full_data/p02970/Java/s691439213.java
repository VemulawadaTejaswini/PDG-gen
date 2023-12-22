import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, D, a, ans;
		N = sc.nextInt();
		D = sc.nextInt();
		sc.close();
		a = 0;
		ans = 0;
		while (N > a) {
			a += 2 * D + 1;
			ans++;
		}
		System.out.println(ans);
	}
}
