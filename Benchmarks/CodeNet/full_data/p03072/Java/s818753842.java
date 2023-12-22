import java.util.*;

// abc124b
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int ts = sc.nextInt();

		int ans = 1;

		for (int i = 1; i < n; i++) {
			int tmp = sc.nextInt();
			if (tmp >= ts){
				ans++;
			}
			if (tmp > ts) {
				ts = tmp;
			}
		}
		System.out.println(ans);
	}
}
