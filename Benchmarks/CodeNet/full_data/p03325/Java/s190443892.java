import java.util.*;

public class Main {
	
	public static int cnt(int k, int cnt[]) {
		if(k % 2 != 0)return 0;
		if(cnt[k] != 0)return cnt[k];
		int ans = 0;
		ans = 1 + cnt(k / 2, cnt);
		return cnt[k] = ans;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; ++i)
			a[i] = sc.nextInt();
		sc.close();
		Arrays.sort(a);
		int ans = 0;
		int cnt[] = new int[a[n - 1] + 1];
		for(int i = 0; i < n; ++i) {
			cnt[a[i]] = cnt(a[i], cnt);
			ans += cnt[a[i]];
		}
		System.out.println(ans);
	}

}
