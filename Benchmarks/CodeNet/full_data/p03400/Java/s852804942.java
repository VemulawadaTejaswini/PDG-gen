import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), d = sc.nextInt(), x = sc.nextInt();
		int ans = 0;
		for(int i = 0; i < n; ++i) {
			int a = sc.nextInt();
			ans += (d - 1) / a + 1;
		}
		sc.close();
		ans += x;
		System.out.println(ans);
	}

}
