
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int d = 0;
		int ans = 0;
		while(ans <= n - 1 && d <= x) {
			ans++;
			d += sc.nextInt();
		}
		System.out.println(ans);
	}

}
