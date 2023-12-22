import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		long ans = 0;
		sc.nextInt();
		int t, lastt = 0;
		for(int i = 1; i < N; i++) {
			t = sc.nextInt();
			if(lastt+T <= t)
				ans += T;
			else
				ans += t-lastt;
			lastt = t;
		}
		System.out.println(ans+T);
	}

}