
import java.util.Scanner;
public class Main {
	static int mod = 1000000007;
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long ans = Integer.MAX_VALUE;
		loop:for(int i = n; i <= m; i++) {
			for(int j = i+1; j <= m; j++) {
				ans = Math.min(ans, (i*j)%2019);
				if(ans == 0) {
					break loop;
				}
			}
		}

		System.out.println(ans);
		sc.close();

	}
}
