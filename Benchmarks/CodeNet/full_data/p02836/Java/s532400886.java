import java.util.*;

public class Main {

	public static int solve(String s) {
		int ans = 0;
		int n = s.length();
		for(int i = 0; i < n / 2; ++i){
			char f = s.charAt(i);
			char g = s.charAt(n - i - 1);
			if(f != g)ans++;
		}
		return ans;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int ans = solve(s);
		sc.close();

		System.out.println(ans);
	}
}
