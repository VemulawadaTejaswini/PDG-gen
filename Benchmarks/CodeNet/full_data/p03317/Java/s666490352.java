import java.util.*;

public class Main {

	public static int solve(int n, int k, int s, int g) {
		if(s <= 0 && g >= n - 1)return 0;
		if(s <= 0)return 1 + solve(n, k, s, g + k - 1);
		if(g >= n - 1)return 1 + solve(n, k, s - k + 1, g);
		if(s == g) {
			if(s >= k - 1)s -= k + 1;
			else {
				s = 0;
				g += k - 1 - s;
			}
			return 1 + solve(n, k, s, g);
		}
		
		return 2 + solve(n, k, s - k + 1, g + k - 1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		int a[] = new int[n];
		int p = 0;
		for(int i = 0; i < n; ++i) {
			a[i] = sc.nextInt();
			if(a[i] == 1)p = i;
		}
		sc.close();
		int ans = solve(n, k, p, p);
		System.out.println(ans);
	}

}
