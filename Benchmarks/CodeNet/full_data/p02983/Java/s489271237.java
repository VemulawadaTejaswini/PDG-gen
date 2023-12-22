
import java.util.Scanner;
public class Main {
	static int mod = 1000000007;
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		boolean mod = true;
		for(int i = n; i <= m; i++) {
			if(i%2019 == 0) {
				mod = false;
			}
		}
		int ans = 0;
		if(mod) {
			ans = n*(n+1) % 2019;
		}
		System.out.println(ans);
		sc.close();
		
	}
}
