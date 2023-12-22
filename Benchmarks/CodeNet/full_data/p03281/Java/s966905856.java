import java.util.*;
public class Main {

		static void solve() {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int ans = 0;
			sc.close();
			for(int i = 1;i<=n;i+=2) {
				int check = 0;
				for(int j = 1;j<=i;j++) {
					if(i%j==0) {
						check++;
						if(check==8) {
							ans++;
						}
					}
				}
			}
			System.out.println(ans);
			
		}
	public static void main(String[] args) {
		solve();

	}

}