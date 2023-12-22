
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int ans = 0, ans1 = 0;
		n = sc.nextInt();
		for(int i= 1; i <= n; ++i) {
			ans1 += 1;
			ans += ans1;
		}
		
		System.out.println(ans);
		sc.close();
	}

}
