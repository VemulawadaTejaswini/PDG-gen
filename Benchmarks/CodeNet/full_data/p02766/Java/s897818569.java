import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int x = 1;
		int ans = 0;
		while (N >= x) {
			x*= K;
			ans++;
		}
		if (ans == 0) ans = 1;
		if (K == 10) ans = String.valueOf(N).length();
		System.out.println(ans);
	}
}