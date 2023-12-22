import java.util.*;
public class Main {

		static void solve(){
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int k = sc.nextInt();
			int max = Integer.MIN_VALUE;
			max = Math.max(a, b);
			max = Math.max(max, c);
			int max1 = max*2;
			sc.close();
			for(int i = 0;i<k;i++) {
				max*=2;
			}
			System.out.println(a+b+c+max-max1/2);
		}
	public static void main(String[] args) {
		solve();

	}

}
