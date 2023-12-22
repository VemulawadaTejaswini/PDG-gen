
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		int cnt = 0;
		int n = sc.nextInt();
		long high = sc.nextInt();
		for(int i = 1; i < n; i++) {
			long tmp = sc.nextLong();
			if(high >= tmp) {
				cnt++;
				high = tmp;
			} else {
				ans = Math.max(ans, cnt);
				cnt = 0;
				high = tmp;
			}
		}
		ans = Math.max(ans, cnt);
		System.out.println(ans);
	}

}
