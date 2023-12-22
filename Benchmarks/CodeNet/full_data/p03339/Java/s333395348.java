import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		sc.close();

		int cnt = 0;
		for (int i = 1; i < n; i++) {
			if (s.charAt(i) == 'E') {
				cnt++;
			}
		}

		int ans = cnt;
		for (int i = 1; i < n; i++) {
			if (s.charAt(i - 1) == 'W') {
				cnt++;
			}
			if (s.charAt(i) == 'E') {
				cnt--;
			}
			ans = Math.min(ans, cnt);
		}
		System.out.println(ans);
	}
}
