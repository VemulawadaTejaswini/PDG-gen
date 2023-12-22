import java.util.*;
public class Main {

		static void solve() {
			Scanner sc = new Scanner(System.in);
			int a =sc.nextInt();
			int b =sc.nextInt();
			int res = (b-a)*(b-a+1)/2;
			System.out.println(res -b);
			sc.close();
		}
	public static void main(String[] args) {
		solve();

	}

}