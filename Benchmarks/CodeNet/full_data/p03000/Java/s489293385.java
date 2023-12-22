import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] l = new int[n];
		for (int i = 0; i < n; i++) {
			l[i] = sc.nextInt();
		}
		sc.close();

		int ans = 1;
		int now = 0;
		for (int i = 0; i < n; i++) {
			now += l[i];
			if (now <= x) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
