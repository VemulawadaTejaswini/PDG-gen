import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[] as = new boolean[1_000_000_000 + 1];
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if (as[a]) {
				as[a] = false;
			} else {
				as[a] = true;
			}
		}

		int ans = 0;
		for (int i = 0; i < as.length; i++) {
			if (as[i]) {
				ans++;
			}
		}
		System.out.println(ans);
		sc.close();
	}

}
