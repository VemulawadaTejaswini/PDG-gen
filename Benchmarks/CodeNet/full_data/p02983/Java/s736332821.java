
import java.util.Scanner;
public class Main {
	static int mod = 1000000007;
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		boolean mod = true;
		if(m-n >= 2019) {
			mod = false;
		}else {
			for(int i = n; i <= m; i++) {
				if(i%2019 == 0) {
					mod = false;
				}
			}
		}
		
		int ans = 1000000;
		if(mod) {
			for(int i = n; i < m; i++) {
				for(int j = 1+i; j <= m; j++) {
					ans = Math.min(ans, i*j%2019);
				}
			}
		}
		System.out.println(ans);
		sc.close();
		
	}
}
