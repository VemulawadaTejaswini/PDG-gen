import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int ans[] = {1, 1};
		for (int i = 1; i <= n; i++) {
			int cnt = 0;
			int target = i;
			while(target % 2 == 0) {
				cnt++;
				target /= 2;
			}
			if (ans[0] < cnt && ans[1] < i) {
				ans[0] = cnt;
				ans[1] = i;
			}
		}
		System.out.println(ans[1]);
	}
}
