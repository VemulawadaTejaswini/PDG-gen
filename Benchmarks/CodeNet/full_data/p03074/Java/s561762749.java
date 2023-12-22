import java.util.*;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		String s = sc.next();
		sc.close();
		int ans = 0;
		char prev = '1';
		int cnt[] = new int[n + 2 * k + 1];
		int j = 0;
		for(int i = 0; i < n; ++i) {
			if(s.charAt(i) == prev)cnt[j]++;
			else {
				prev = s.charAt(i);
				cnt[++j]++;
			}
		}
		int tmp = 0;
		for(int i = 0; i < 2 * k; ++i)
			tmp += cnt[i];
		for(int i = 2 * k; i < cnt.length; ++i) {
			tmp += cnt[i];
			if(i % 2 == 0)ans = Math.max(ans, tmp);
			tmp -= cnt[i - 2 * k];
		}
		System.out.println(ans);
		
	}

}
