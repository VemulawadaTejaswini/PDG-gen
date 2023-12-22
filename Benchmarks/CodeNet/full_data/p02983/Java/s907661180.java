
import java.util.Scanner;
public class Main {
	static int mod = 1000000007;
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int ans = 10000000;
		loop:for(int i = n; i <= Math.min(m, n+2019); i++) {
			for(int j = n; j <= Math.min(m, n+2019); j++) {
				if(i != j) {
					ans = Math.min(ans, i*j%2019);
					if(ans == 0) {
						break loop;
					}
				}
			}
		}
	
		System.out.println(ans);
		sc.close();
		
	}
}
