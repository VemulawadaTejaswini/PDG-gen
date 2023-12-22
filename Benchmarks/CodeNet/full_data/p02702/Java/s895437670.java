import java.util.*;

public class Main {

	static final int r = 2019;

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		long ans = 0;
		int n = s.length();
		long mod[] = new long[r];
		int t[] = new int[n + 1];
		int m = 1;
		for(int i = n - 1; i >= 0; --i){
			int tmp = t[i + 1] + m * (int)(s.charAt(i) - '0');
			tmp %= r;
			t[i] = tmp;
			if(tmp == 0)ans++;
			ans += mod[tmp];
			mod[tmp]++;
			m *= 10;
			m %= r;
		}
		System.out.println(ans);
	}
}
