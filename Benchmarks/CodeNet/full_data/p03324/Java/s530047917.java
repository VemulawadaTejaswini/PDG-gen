import java.util.*;
public class Main {

		static void solve() {
			Scanner sc = new Scanner(System.in);
			int d = sc.nextInt();
			int n = sc.nextInt();
			sc.close();
			if(d == 0) {
				System.out.println(n);
			}
			else if(d == 1) {
				System.out.println(n*100);
			}
			else if(d == 2) {
				System.out.println(n*10000);
			}
		}
	public static void main(String[] args) {
		solve();

	}

}
